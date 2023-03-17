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

//    @Path("/remove")
//    @DELETE
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public void remove(int klanten){
//        klantService.deleteKlanten(klanten);
//    }



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

    @GET
//    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get/{klantId}")
    public GetKlant getKlantId(@PathParam("klantId") int klantId) {
        klantService.findKlantById(klantId);
        System.out.println(klantId);
//       return klantService.findKlantById(klantId);
    }
}
