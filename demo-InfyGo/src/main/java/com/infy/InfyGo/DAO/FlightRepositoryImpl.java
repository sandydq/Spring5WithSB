package com.infy.InfyGo.DAO;


import com.infy.InfyGo.Model.Flight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class FlightRepositoryImpl implements FlightRepository {
    private static Logger logger = LoggerFactory.getLogger(FlightRepositoryImpl.class);
    static List<Flight> flightList = new ArrayList<>();
    private static Long id = 1001L;

    static {
        Flight flight = new Flight();
        flight.setFlightId(id.toString());
        flight.setAirlines("AirIndia");
        flight.setSource("Chennai");
        flight.setDestination("Mumbai");
        flight.setFare(200d);
        LocalDate date = LocalDate.now();
        flight.setJourneyDate(date);
        flight.setSeatCount(100);

        Flight flight2 = new Flight();
        FlightRepositoryImpl.id++;
        flight2.setFlightId(id.toString());
        flight2.setAirlines("SpaceX");
        flight2.setSource("Russia");
        flight2.setDestination("India");
        flight2.setFare(4000d);
        LocalDate date2 = LocalDate.of(2021,12,25);
        flight2.setJourneyDate(date2);
        flight2.setSeatCount(100);

        flightList.add(flight);
        flightList.add(flight2);
    }
    @Override
    public String addFlight(Flight flight) {
        Long flightId = ++FlightRepositoryImpl.id;
        flight.setFlightId(flightId.toString());
        flightList.add(flight);
        logger.info("Flight added successfully with flight id "+ flightId);
        return "Flight added successfully";
    }

    @Override
    public Flight searchFlight(String id) {
        for (Flight i : flightList) {
            logger.info("Flight id "+ i.getFlightId());
            if (i.getFlightId().equals(id)) {
                logger.info("Flight is found for given flight id");
                return i;
            }
        }
        return null;
    }
}
