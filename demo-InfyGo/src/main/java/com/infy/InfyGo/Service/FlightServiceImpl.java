package com.infy.InfyGo.Service;

import com.infy.InfyGo.DAO.FlightRepositoryImpl;
import com.infy.InfyGo.Exception.NoSuchFlightException;
import com.infy.InfyGo.Model.Flight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class FlightServiceImpl implements FlightService {

    private static Logger logger = LoggerFactory.getLogger(FlightServiceImpl.class);
    @Autowired
    private FlightRepositoryImpl flightRepositoryImpl;

    @Override
    public String addFlight(Flight flight) {
        flightRepositoryImpl.addFlight(flight);
        return "Flight added successfully";
    }

    @Override
    public Flight searchFlight(String id) throws NoSuchFlightException{
        logger.info("Searching for a flight with id "+id);
        Flight flight = flightRepositoryImpl.searchFlight(id);
        if (flight == null) {
            throw new NoSuchFlightException("No flight is found for given flight id");
        }
        LocalDate date = flight.getJourneyDate();
        if (date.getMonth().equals(Month.DECEMBER) || date.getMonth().equals(Month.JANUARY)) {
            logger.info("Inside fare increasing method "+id);
            Double fare = flight.getFare();
            fare = fare*1.2;
            flight.setFare(fare);
        }
        return flight;
    }
}
