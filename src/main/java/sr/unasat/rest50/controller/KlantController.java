package sr.unasat.rest50.controller;

import sr.unasat.rest50.entities.Klanten;
import sr.unasat.rest50.services.KlantService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/klant")
public class KlantController {

    private final KlantService klantService = new KlantService();


   /*@Path("/list")
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public List<Klanten> findKlant() {
        return klantenService.findAll();*/

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Klanten> findKlant(){
        System.out.println(klantService.findAll());
        return klantService.findAll();
    }


}
