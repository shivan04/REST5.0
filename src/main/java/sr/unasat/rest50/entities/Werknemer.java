package sr.unasat.rest50.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Werknemer {
    private int werkenmerId;
    private String achternaam;
    private String voornaam;
    private String adress;
    private String district;
    private Integer telefoonNummer;
    private String idNummer;
    private Location locationByLocationId;
    private int werknemerNummer;

    @Id
    @Column(name = "werkenmer_id")
    public int getWerkenmerId() {
        return werkenmerId;
    }

    public void setWerkenmerId(int werkenmerId) {
        this.werkenmerId = werkenmerId;
    }

    @Basic
    @Column(name = "Achternaam")
    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    @Basic
    @Column(name = "Voornaam")
    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
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

    @Basic
    @Column(name = "telefoon_nummer")
    public Integer getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setTelefoonNummer(Integer telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }

    @Basic
    @Column(name = "id_nummer")
    public String getIdNummer() {
        return idNummer;
    }

    public void setIdNummer(String idNummer) {
        this.idNummer = idNummer;
    }

    @Basic
    @Column (name = "werknemer_nummer")
    public int getWerknemerNummer (){return werknemerNummer;}
    public void setWerknemerNummer(int werknemerNummer){this.werknemerNummer= werknemerNummer;}

    @Override
    public String toString() {
        return "Werknemer{" +
                "id=" + werkenmerId+
                ", achternaam='" + achternaam + '\'' +
                ", voornaam ='" + voornaam + '\'' +
                ", Idnummer='" + idNummer + '\'' +
                ", adress=" + adress +
                ", telefoonnummer =" + telefoonNummer+
                '}';
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Werknemer werknemer = (Werknemer) o;

        if (werkenmerId != werknemer.werkenmerId) return false;
        if (achternaam != null ? !achternaam.equals(werknemer.achternaam) : werknemer.achternaam != null) return false;
        if (voornaam != null ? !voornaam.equals(werknemer.voornaam) : werknemer.voornaam != null) return false;
        if (adress != null ? !adress.equals(werknemer.adress) : werknemer.adress != null) return false;
        if (district != null ? !district.equals(werknemer.district) : werknemer.district != null) return false;
        if (telefoonNummer != null ? !telefoonNummer.equals(werknemer.telefoonNummer) : werknemer.telefoonNummer != null)
            return false;
        if (idNummer != null ? !idNummer.equals(werknemer.idNummer) : werknemer.idNummer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = werkenmerId;
        result = 31 * result + (achternaam != null ? achternaam.hashCode() : 0);
        result = 31 * result + (voornaam != null ? voornaam.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (telefoonNummer != null ? telefoonNummer.hashCode() : 0);
        result = 31 * result + (idNummer != null ? idNummer.hashCode() : 0);
        return result;
    }

 */

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "Location_id")
    public Location getLocationByLocationId() {
        return locationByLocationId;
    }

    public void setLocationByLocationId(Location locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }
}
