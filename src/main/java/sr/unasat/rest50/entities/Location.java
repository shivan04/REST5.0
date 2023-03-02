package sr.unasat.rest50.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
    private int locationId;
    private String naam;
    private String adress;
    private String district;

    @Id
    @Column(name = "Location_id")
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "naam")
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Basic
    @Column(name = "adress")
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + locationId+
                ", naam ='" + naam + '\'' +
                ", adress ='" + adress + '\'' +
                ", district='" + district + '\'' +
                ", adress=" + adress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (locationId != location.locationId) return false;
        if (naam != null ? !naam.equals(location.naam) : location.naam != null) return false;
        if (adress != null ? !adress.equals(location.adress) : location.adress != null) return false;
        if (district != null ? !district.equals(location.district) : location.district != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = locationId;
        result = 31 * result + (naam != null ? naam.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        return result;
    }
}
