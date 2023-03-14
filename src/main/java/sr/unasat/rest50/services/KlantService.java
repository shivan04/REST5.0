package sr.unasat.rest50.services;

import sr.unasat.rest50.config.JPAConfiguration;
import sr.unasat.rest50.dao.KlantDao;
import sr.unasat.rest50.entities.Klanten;

import java.util.List;

public class KlantService {

    private  List<Klanten> klantenList;
    private  int klantenListId;
    private final KlantDao klantenDao;


    public KlantService() {
        this.klantenDao = new KlantDao(JPAConfiguration.getEntityManager());
    }


    public List<Klanten> findAll(){ //get
        return klantenDao.retrieveKlantenList();
    }
//
    public void insertKlanten(Klanten klanten){ //post
        klantenDao.insert(klanten);
    }


//   public Klanten updateKlanten(int klantenUpdate){ //put
//       return klantenDao.findByKlantId(klantenUpdate);
//   }
//
//   public void deleteKlanten(int klantenDelete){ //delete
//       klantenDao.delete(klantenDelete);
//   }
}
