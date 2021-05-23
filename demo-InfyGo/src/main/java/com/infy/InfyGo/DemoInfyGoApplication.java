package com.infy.InfyGo;

import com.infy.InfyGo.Exception.NoSuchFlightException;
import com.infy.InfyGo.Model.Flight;
import com.infy.InfyGo.Service.FlightServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@RestController
public class DemoInfyGoApplication implements CommandLineRunner {

	@Autowired
	private FlightServiceImpl flightServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(DemoInfyGoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Flight flight = new Flight();
		//flightServiceImpl.addFlight(flight);
	}

	//http://localhost:8100/addFlight?airlines= && source= && destination= && fare= && date=
	@RequestMapping("/addFlight")
	public String addFlight(@RequestParam("airlines") String airlines, @RequestParam("source") String source,
							@RequestParam("destination") String destination, @RequestParam("fare") double fare,
							@RequestParam("date") String date) {
		Flight flight = new Flight();
		flight.setAirlines(airlines);
		flight.setSource(source);
		flight.setDestination(destination);
		flight.setFare(fare);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.parse(date,dateTimeFormatter);
		flight.setJourneyDate(localDate);
		flight.setSeatCount(200);

		return flightServiceImpl.addFlight(flight);
	}

	//http://localhost:8100/searchFlight?id=1001
	@RequestMapping("/searchFlight")
	public Object searchFlight(@RequestParam("id") String flightId) {
		try {
			return flightServiceImpl.searchFlight(flightId);
		} catch (NoSuchFlightException e) {
			return e.getMessage();
		}
	}
}
