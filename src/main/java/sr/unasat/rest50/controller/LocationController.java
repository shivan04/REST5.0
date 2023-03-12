package sr.unasat.rest50.controller;


import sr.unasat.rest50.entities.Location;
import sr.unasat.rest50.services.LocationService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/location")
public class LocationController {
    private final LocationService locationService = new LocationService();

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Location> findlocation() {
        System.out.println(locationService.findAll());
        return locationService.findAll();
    }

}
