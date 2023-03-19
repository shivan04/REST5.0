package sr.unasat.rest50.dao;

import sr.unasat.rest50.entities.Klanten;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class KlantDao {
    private final EntityManager entityManager;

    public KlantDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Klanten> retrieveKlantenList() {
        entityManager.getTransaction().begin();
        String jpql = "select c  from Klanten c ";
        TypedQuery<Klanten> query = entityManager.createQuery(jpql, Klanten.class);
        List<Klanten> klantens = query.getResultList();
        entityManager.getTransaction().commit();
        return klantens;
    }


    public Klanten insert(Klanten klanten) {
        entityManager.getTransaction().begin();
        entityManager.persist(klanten);
//        entityManager.merge(klanten);
        entityManager.getTransaction().commit();
        return klanten;
    }

    public Klanten findByklantNummer(int klantNummer) {

        entityManager.getTransaction().begin();

        String jpql = "select t from Klanten t  where t.klantenNummer = :klantenNummer";
        TypedQuery<Klanten> query = entityManager.createQuery(jpql, Klanten.class);
        Klanten klanten = query.setParameter("klantenNummer", klantNummer).getSingleResult();
        entityManager.getTransaction().commit();
        return klanten;
    }

    public Klanten findByID(int klantId) {
        entityManager.getTransaction().begin();
        String jpql = "select t from Klanten t  where t.klantId = :klantId";
        TypedQuery<Klanten> query = entityManager.createQuery(jpql, Klanten.class);
        Klanten klanten = query.setParameter("klantId", klantId).getSingleResult();
        entityManager.getTransaction().commit();
        return klanten;
    }


    public int delete(int klantId) {
        entityManager.getTransaction().begin();

        Query query;
        query = entityManager.createQuery("delete from Klanten where klantId = :klantId");
        query.setParameter("klantId", klantId);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }


    //
    public int updateKlanten(Klanten klanten) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Klanten  SET adress = :adress where klantenNummer= :klantenNummer");
        query.setParameter("klantenNummer", klanten.getKlantenNummer());
        query.setParameter("adress", klanten.getAdress());
        int rowsUpdated = query.executeUpdate();
        System.out.println("entities Updated: " + rowsUpdated);
        entityManager.getTransaction().commit();
        return rowsUpdated;
    }

    public int updateKlanten1(Klanten klanten) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Klanten c SET c.achternaam =:achternaam c.adress = :adres where c.achternaam= :familienaam and c.telefoonNummer= :telefoonnummer");
        query.setParameter("achternaam", klanten.getAchternaam());
        query.setParameter("familienaam", klanten.getAdress());
        query.setParameter("telefoonnummer", klanten.getKlantenNummer());
        query.setParameter("adres", klanten.getAdress());
        int rowsUpdated = query.executeUpdate();
        System.out.println("entities Updated: " + rowsUpdated);
        entityManager.getTransaction().commit();
        return rowsUpdated;
    }


    public void update(Klanten patient) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Klanten p SET p.adress = :adress, p.telefoonNummer = :contactnumber," +
                " p.voornaam = :firstname, p.achternaam = :lastname " +
                "where p.id = :id");
        query.setParameter("id", patient.getKlantId());
        query.setParameter("firstname", patient.getVoornaam());
        query.setParameter("lastname", patient.getAchternaam());
//        query.setParameter("adress", patient.getAdress());
//        query.setParameter("contactnumber", patient.getContactnumber());
        query.executeUpdate();
//        Query query2 = entityManager.createQuery("UPDATE Identification i SET i.sex = :sex where i.number = :idNumber");
//        query2.setParameter("idNumber", patient.getIdentification().getNumber());
//        query2.setParameter("sex", patient.getIdentification().getSex());
//        query2.executeUpdate();
        entityManager.getTransaction().commit();
    }


}

