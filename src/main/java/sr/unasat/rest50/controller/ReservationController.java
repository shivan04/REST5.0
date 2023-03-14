package sr.unasat.rest50.controller;

import sr.unasat.rest50.entities.Reservation;
import sr.unasat.rest50.services.ReservationService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/reservation")
public class ReservationController {
    private final ReservationService reservationService = new ReservationService();


    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reservation> findReservation() {
        System.out.println(reservationService.findAll());
        return reservationService.findAll();
    }

    @Path("/add")
    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void add(Reservation reservation) {
        reservationService.insertReservation(reservation);
    }


}
