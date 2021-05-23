package com.infy.InfyGo.DAO;

import com.infy.InfyGo.Model.Flight;

public interface FlightRepository {
    public String addFlight(Flight flight);

    public Flight searchFlight(String id);
}
