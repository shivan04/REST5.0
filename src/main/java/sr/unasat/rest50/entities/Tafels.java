package sr.unasat.rest50.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;


@Entity

public class Tafels {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int tafel_id;
    @Column
    private int tafel_nummer;
    @Column
    private int aantal_zitplaatsen;
    @Column
    private int location;

//    @OneToMany(mappedBy = "tafels")
//    @JsonIgnoreProperties(value = "tafels", allowSetters = true)
//    private Set<Reservation> reservation;
//
//    public int getTafel_id() {
//        return tafel_id;
//    }
//
//    public Set<Reservation> getReservation() {
//        return reservation;
//    }

//    public void setReservation(Set<Reservation> reservation) {
//        this.reservation = reservation;
//    }

    public void setTafel_id(int tafel_id) {
        this.tafel_id = tafel_id;
    }

    public int getTafel_nummer() {
        return tafel_nummer;
    }

    public void setTafel_nummer(int tafel_nummer) {
        this.tafel_nummer = tafel_nummer;
    }

    public int getAantal_zitplaatsen() {
        return aantal_zitplaatsen;
    }

    public void setAantal_zitplaatsen(int aantal_zitplaatsen) {
        this.aantal_zitplaatsen = aantal_zitplaatsen;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}