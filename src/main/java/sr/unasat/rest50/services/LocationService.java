package sr.unasat.rest50.services;

import sr.unasat.rest50.config.JPAConfiguration;
import sr.unasat.rest50.dao.LocationDao;
import sr.unasat.rest50.dao.ReservationDao;
import sr.unasat.rest50.entities.Location;
import sr.unasat.rest50.entities.Reservation;

import java.util.List;

public class LocationService {
    private LocationDao locationDao;

    public LocationService() {
        this.locationDao = new LocationDao(JPAConfiguration.getEntityManager());
    }

    public List<Location> findAll() { //get
        return locationDao.retrieveLocationList();
    }

    //
    public void insertLocation(Location location) { //post
        locationDao.insert(location);
    }
}


