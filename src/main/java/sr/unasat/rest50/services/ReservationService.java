package sr.unasat.rest50.services;

import sr.unasat.rest50.config.JPAConfiguration;
import sr.unasat.rest50.dao.ReservationDao;
import sr.unasat.rest50.entities.Reservation;

import java.util.List;

public class ReservationService {
    private List<Reservation> reservationList;
    private ReservationDao reservationDao;


    public ReservationService() {
        this.reservationDao = new ReservationDao(JPAConfiguration.getEntityManager());
    }

    public List<Reservation> findAll() { //get
        return reservationDao.retrieveReservationList();
    }

    //
    public void insertReservation(Reservation reservation) { //post
        reservationDao.insertReservation(reservation);
    }
}
