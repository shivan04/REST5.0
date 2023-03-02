package sr.unasat.rest50.dao;

import sr.unasat.rest50.entities.Werknemer;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class    WerknemerDao {

    private static EntityManager entityManager;


    public WerknemerDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public static Werknemer insert(Werknemer werknemer) {
        entityManager.getTransaction().begin();
        entityManager.persist(werknemer);
        entityManager.getTransaction().commit();
        return werknemer ;
    }
    public static Werknemer findByWerknemerNummer(int WerknemerNummer) {
        entityManager.getTransaction().begin();
        String jpql = "select t from Werknemer t  where t.werknemerNummer = :werknemerNummer";
        TypedQuery<Werknemer> query = entityManager.createQuery(jpql, Werknemer.class);
        Werknemer werknemer = query.setParameter("werknemerNummer", WerknemerNummer).getSingleResult();
        entityManager.getTransaction().commit();
        return werknemer;
    }
    public static  List<Werknemer> retrieveWerknemerList() {
        entityManager.getTransaction().begin();
        String jpql = "select l from Werknemer l ";
        TypedQuery<Werknemer> query = entityManager.createQuery(jpql, Werknemer.class);
        List<Werknemer> werknemerList = query.getResultList();

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %10s %20s %20s %20S", "WERKNEMER NUMMER", "NAAM", "VOORNAAM", "ADRESS", "TELEFOON NUMMER");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for (Werknemer werknemer : werknemerList) {
            System.out.format("%5s %20s %20s %20s %20S",
                    werknemer.getWerknemerNummer(),werknemer.getAchternaam(),werknemer.getVoornaam(),werknemer.getAdress()
            ,werknemer.getTelefoonNummer());


            System.out.println();
        }


      entityManager.getTransaction().commit();

        System.out.println("-----------------------------------------------------------------------------");



        return werknemerList;
    }
    public static int  delete(int WerknemerNummer) {
        entityManager.getTransaction().begin();
        Query query;
        query = entityManager.createQuery("delete from Werknemer where werknemerNummer = :WerknemerNummer ");
        query.setParameter("WerknemerNummer", WerknemerNummer);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }
    public int updateWerknemer(Werknemer werknemer) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Werknemer c SET c.adress = :adress where c.werknemerNummer = :WerknemerNummer");
        query.setParameter("WerknemerNummer", werknemer.getWerknemerNummer());
       query.setParameter("adress", werknemer.getAdress());
        int rowsUpdated = query.executeUpdate();
        System.out.println("entities Updated: " + rowsUpdated);
        entityManager.getTransaction().commit();
        return rowsUpdated;
    }
}
