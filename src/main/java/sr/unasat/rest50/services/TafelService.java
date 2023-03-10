package sr.unasat.rest50.services;

import sr.unasat.rest50.config.JPAConfiguration;
import sr.unasat.rest50.dao.TafelsDao;
import sr.unasat.rest50.entities.Klanten;
import sr.unasat.rest50.entities.Tafels;

import java.util.List;

public class TafelService {
    private List<Tafels> tafelsList;
    private TafelsDao tafelsDao;

    public TafelService(){
        this.tafelsDao = new TafelsDao(JPAConfiguration.getEntityManager());
    }

    public List<Tafels> findAll() {
        return tafelsDao.retrieveTafelList();
    }
    public void insertTafel(Tafels tafels){ //post
        tafelsDao.insertTafel(tafels);
    }

}
