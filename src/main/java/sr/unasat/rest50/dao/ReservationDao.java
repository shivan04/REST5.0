package sr.unasat.rest50.dao;

import sr.unasat.rest50.entities.Reservation;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

public class ReservationDao {
    private static EntityManager entityManager;



    public ReservationDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //insert
    public static Reservation insert(Reservation reservation) {
        entityManager.getTransaction().begin();
        entityManager.persist(reservation);
        entityManager.getTransaction().commit();
        return reservation;
    }
    public static Reservation findByReservationNumber(int ReservationNumber) {
        entityManager.getTransaction().begin();
        String jpql = "select t from Reservation t  where t.reservationNumber = :reservationNumber";
        TypedQuery<Reservation> query = entityManager.createQuery(jpql, Reservation.class);
        Reservation reservation = query.setParameter("reservationNumber", ReservationNumber).getSingleResult();
        entityManager.getTransaction().commit();
        return reservation;
    }

    //delete
    public static int  delete(int ReservationNumber) {
        entityManager.getTransaction().begin();
        Query query;
        query = entityManager.createQuery("delete from Reservation  where reservationNumber = :ReservationNumber ");
        query.setParameter("ReservationNumber", ReservationNumber);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;

    }

    public static List<Reservation> getResList(Date startDate, Date endDate) {
        entityManager.getTransaction().begin();
        String jpql = "select c from Reservation c where c.reservationDate between :startDate and :endDate ";
        TypedQuery<Reservation> query = entityManager.createQuery(jpql, Reservation.class);
        query.setParameter("startDate",startDate);
        query.setParameter("endDate",endDate);
        List<Reservation> reslist = query.getResultList();

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %10s %20s %20s", "RESERVATIONnUMBER", "RESERVATION DATE", "START TIME", "END TIME");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for (Reservation reservation : reslist) {
            System.out.format("%5s %20s %20s %20s",
             reservation.getReservationNumber(),reservation.getReservationDate(),reservation.getBeginTijd(),reservation.getEindTijd());
            System.out.println();
        }


        entityManager.getTransaction().commit();

        System.out.println("-----------------------------------------------------------------------------");




        return reslist;
    }



    public int updateReservation(Reservation reservation) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Reservation r SET r.beginTijd = :beginTijd where r.reservationNumber = :reservationNumber");
        query.setParameter("reservationNumber", reservation.getReservationNumber());
      query.setParameter("beginTijd", reservation.getBeginTijd());
        int rowsUpdated = query.executeUpdate();
        System.out.println("entities Updated: " + rowsUpdated);
        entityManager.getTransaction().commit();
        return rowsUpdated;
    }






}
