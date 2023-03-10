package sr.unasat.rest50.controller;


import sr.unasat.rest50.entities.Tafels;
import sr.unasat.rest50.services.TafelService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("tafel")
public class TafelController {
    private final TafelService tafelService = new TafelService();

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tafels> findKlant() {
        System.out.println(tafelService.findAll());
        return tafelService.findAll();
    }
    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void add(Tafels tafels){
        tafelService.insertTafel(tafels);
    }
//


}
