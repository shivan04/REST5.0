package sr.unasat.rest50.services;

import sr.unasat.rest50.config.JPAConfiguration;
import sr.unasat.rest50.dao.KlantDao;
import sr.unasat.rest50.entities.Klanten;

import java.util.List;

public class KlantService {

    private  List<Klanten> klantenList;
    private  int klantenListId;
    private KlantDao klantenDao;


    public KlantService() {
        this.klantenDao = new KlantDao(JPAConfiguration.getEntityManager());
    }
        /*public KlantenService(){
        if (klantenList == null) {
            klantenListId = 0;
            klantenList = new ArrayList<>();
            klantenList.add(new Klanten(++klantenListId));
        }
    }*/


    public List<Klanten> findAll(){ //get
        return klantenDao.retrieveKlantenList();
    }
//
//    public void insertKlanten(Klanten menuObj){ //post
//        klantenDao.insert(menuObj);
//    }
//
//    public Klanten updateKlanten(int klantenUpdate){ //put
//        return klantenDao.findByKlantId(klantenUpdate);
//    }
//
//    public void deleteKlanten(int klantenDelete){ //delete
//        klantenDao.delete(klantenDelete);
//    }
}
