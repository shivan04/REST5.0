package sr.unasat.rest50.dao;

import sr.unasat.rest50.entities.Location;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class LocationDao {

    private static EntityManager entityManager;


    public LocationDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //insert
    public static Location insert(Location Location) {
        entityManager.getTransaction().begin();
        entityManager.persist(Location);
        entityManager.getTransaction().commit();
        return Location ;
    }
    public static Location findBylocationId(int locationId) {
        entityManager.getTransaction().begin();
        String jpql = "select t from Location t  where t.locationId = :locationId";
        TypedQuery<Location> query = entityManager.createQuery(jpql, Location.class);
        Location location = query.setParameter("locationId", locationId).getSingleResult();
        entityManager.getTransaction().commit();
        return location;
    }

    public static List<Location> retrieveLocationList() {
        entityManager.getTransaction().begin();
        String jpql = "select l from Location l ";
        TypedQuery<Location> query = entityManager.createQuery(jpql, Location.class);
        List<Location> LocationList = query.getResultList();
        entityManager.getTransaction().commit();
        return LocationList;
    }

    public int  delete (int location_id) {
        entityManager.getTransaction().begin();
        Query query;
        query = entityManager.createQuery("delete from Location where locationId = :location_id ");
        query.setParameter("location_id", location_id);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }
}
