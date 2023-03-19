package sr.unasat.rest50.services;

import sr.unasat.rest50.dao.KlantDao;
import sr.unasat.rest50.entities.Klanten;

import javax.persistence.EntityManager;
import java.util.List;

import static sr.unasat.rest50.config.JPAConfiguration.getEntityManager;

public class KlantService {
    private final KlantDao klantenDao;
    private KlantDao klantDao = new KlantDao(getEntityManager());
    private EntityManager entityManager = getEntityManager();
    private List<Klanten> klantenList;
    private int klantenListId;


    public KlantService() {
        this.klantenDao = new KlantDao(getEntityManager());
    }


    public List<Klanten> findAll() { //get
        return klantenDao.retrieveKlantenList();
    }


    public void insertKlanten(Klanten klanten) { //post
        klantenDao.insert(klanten);
    }

    public void findKlantById(int klanten) {
        klantenDao.findByID(klanten);
    }


//    public Klanten updateKlant(Klanten updatedKlant) {
//        Klanten existingKlant = klantenDao.findByID(updatedKlant.getKlantId());
//        if (existingKlant == null) {
//            return null;
//        }
//        existingKlant.setAchternaam(updatedKlant.getAchternaam());
//        existingKlant.setVoornaam(updatedKlant.getVoornaam());
//        existingKlant.setAdress(updatedKlant.getAdress());
//        existingKlant.setDistrict(updatedKlant.getDistrict());
//        existingKlant.setIdNummer(updatedKlant.getIdNummer());
//        existingKlant.setTelefoonNummer(updatedKlant.setTelefoonNummer());
//        entityManager.getTransaction().begin();
//        entityManager.merge(existingKlant);
//        entityManager.getTransaction().commit();
//        return existingKlant;
//    }

    public void deleteKlanten(int klanten) { //delete
        klantenDao.delete(klanten);
    }

    public Klanten updateKlantInfo(int klantUpdate) { //put
        return klantenDao.findByID(klantUpdate);

    }


    public Klanten updateKlant(Klanten updatedKlant) {
        Klanten existingKlant = klantenDao.findByID(updatedKlant.getKlantId());
        if (existingKlant == null) {
            return null;
        }
        existingKlant.setAchternaam(updatedKlant.getAchternaam());
        existingKlant.setVoornaam(updatedKlant.getVoornaam());
        existingKlant.setAdress(updatedKlant.getAdress());
        existingKlant.setDistrict(updatedKlant.getDistrict());
        existingKlant.setIdNummer(updatedKlant.getIdNummer());
        existingKlant.setTelefoonNummer(updatedKlant.getTelefoonNummer());
        existingKlant.setKlantenNummer(updatedKlant.getKlantenNummer());
        entityManager.getTransaction().begin();
        entityManager.merge(existingKlant);
        entityManager.getTransaction().commit();
        return existingKlant;
    }

}


