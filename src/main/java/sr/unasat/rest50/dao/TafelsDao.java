package sr.unasat.rest50.dao;

import sr.unasat.rest50.entities.Tafels;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class TafelsDao {
    private static EntityManager entityManager;


    public TafelsDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Tafels> retrieveTafelList() {
        entityManager.getTransaction().begin();
        String jpql = "select  c from Tafels c";
        TypedQuery<Tafels> query = entityManager.createQuery(jpql, Tafels.class);
        List<Tafels> tafelsList = query.getResultList();
        entityManager.getTransaction().commit();
        return tafelsList;
    }

    public Tafels insertTafel(Tafels tafels) {
        entityManager.getTransaction().begin();
        entityManager.persist(tafels);
        entityManager.getTransaction().commit();
        return tafels;
    }

//    public static Tafels findBytafelID(int tafelId) {
//        entityManager.getTransaction().begin();
//        String jpql = "select t from Tafels t  where t.tafelId = :tafelId";
//        TypedQuery<Tafels> query = entityManager.createQuery(jpql, Tafels.class);
//        Tafels tafels = query.setParameter("tafelId", tafelId).getSingleResult();
//        entityManager.getTransaction().commit();
//        return tafels;
//    }

//    public int  delete (int tafel_id) {
//        entityManager.getTransaction().begin();
//        Query query;
//        query = entityManager.createQuery("delete from Tafels where tafelId = :Tafel_id ");
//        query.setParameter("Tafel_id", tafel_id);
//        int rowsDeleted = query.executeUpdate();
//        System.out.println("entities deleted: " + rowsDeleted);
//        entityManager.getTransaction().commit();
//        return rowsDeleted;
//
//    }


//    public static int updateTafel(Tafels tafels) {
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("UPDATE Tafels t SET t.category = :category where t.tafelId = :tafel_id");
//        query.setParameter("tafel_id", Tafels.getTafelId());
//        query.setParameter("category", Tafels.getCategory());
//        int rowsUpdated = query.executeUpdate();
//        System.out.println("entities Updated: " + rowsUpdated);
//        entityManager.getTransaction().commit();
//        return rowsUpdated;
//    }
}


