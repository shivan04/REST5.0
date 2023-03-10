package sr.unasat.rest50.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int reservation_id;
    @Column
    private Date reservation_date;
    @Column
    private Time reservation_time;
    @Column
    private int location_id;
    @Column
    private int number_of_guest;
    @Column
    private String special_requests;
    @Column
    private int klant_id;
    @Column
    private int tafel_id;



//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "klant_id", referencedColumnName = "klantId")
//    @JsonIgnoreProperties(value = "reservation", allowSetters = true)
//    private Klanten klanten;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "tafel_id", referencedColumnName = "tafel_id")
//    @JsonIgnoreProperties(value = "reservation", allowSetters = true)
//    private Tafels tafels;

//    public Tafels getTafels() {
//        return tafels;
//    }
//
//    public void setTafels(Tafels tafels) {
//        this.tafels = tafels;
//    }
//
//    public Klanten getKlanten() {
//        return klanten;
//    }
//
//    public void setKlanten(Klanten klanten) {
//        this.klanten = klanten;
//    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public Date getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(Date reservation_date) {
        this.reservation_date = reservation_date;
    }

    public Time getReservation_time() {
        return reservation_time;
    }

    public void setReservation_time(Time reservation_time) {
        this.reservation_time = reservation_time;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public int getNumber_of_guest() {
        return number_of_guest;
    }

    public void setNumber_of_guest(int number_of_guest) {
        this.number_of_guest = number_of_guest;
    }

    public String getSpecial_requests() {
        return special_requests;
    }

    public void setSpecial_requests(String special_requests) {
        this.special_requests = special_requests;
    }

    public int getKlant_id() {
        return klant_id;
    }

    public void setKlant_id(int klant_id) {
        this.klant_id = klant_id;
    }

    public int getTafel_id() {
        return tafel_id;
    }

    public void setTafel_id(int tafel_id) {
        this.tafel_id = tafel_id;
    }

    /*
    @ManyToOne
    @JoinColumn(name = "klanten_nummer",referencedColumnName = "klanten_nummer")
    public Klanten getKlantenByKlantenNummer(){
        return klantenByKlantenNummer;
    }
    public void setKlantenByKlantenNummer(Klanten klantenByKlantenNummer){
        this.klantenByKlantenNummer=klantenByKlantenNummer;
    }

 */


//    @ManyToOne
//    @JoinColumn(name = "location_id", referencedColumnName = "Location_id")
//    public Location getLocationByLocationId() {
//        return locationByLocationId;
//    }
//    public void setLocationByLocationId(Location locationByLocationId) {
//        this.locationByLocationId = locationByLocationId;
//    }


}
