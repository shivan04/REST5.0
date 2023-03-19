package sr.unasat.rest50.controller;

import sr.unasat.rest50.entities.Klanten;
import sr.unasat.rest50.services.KlantService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
    public List<Klanten> findKlant() {
        System.out.println(klantService.findAll());
        return klantService.findAll();
    }


    @Path("/add")
    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void add(Klanten klanten) {
        klantService.insertKlanten(klanten);
    }


    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/remove/{klantId}")
    public Response getAll(@PathParam("klantId") int klantId) {
        klantService.deleteKlanten(klantId);
        if (klantId == klantId) {
            return Response.status(200)
                    .entity("klant has been deleted").build();
        } else {
            return Response.status(204)
                    .entity("klant has not been deleted").build();
        }

    }

    @Path("/update/{klantId}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateKlant(@PathParam("klantId") int klantId, Klanten updatedKlant) {
        updatedKlant.setKlantId(klantId);
        Klanten klanten = klantService.updateKlant(updatedKlant);
        if (klanten == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        } else {
            return Response.ok(klanten).build();
        }
    }

    @Path("/getklant/{klantId}")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Klanten getKlant(@PathParam("klantId") int klantId) {
        return klantService.updateKlantInfo(klantId);
    }
}


