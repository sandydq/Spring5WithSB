package com.infy.InfyGo.Service;

import com.infy.InfyGo.Model.Flight;

public interface FlightService {

    public String addFlight(Flight flight);

    public Flight searchFlight(String id) throws Exception;
}
