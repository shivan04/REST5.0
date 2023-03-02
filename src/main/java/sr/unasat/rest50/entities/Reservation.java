package sr.unasat.rest50.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {
    private int reservationId;
    private Date reservationDate;
    private LocalTime beginTijd;
    private LocalTime eindTijd;
   // private Klanten klantenByKlantenNummer;
    private Location locationByLocationId;
   // private Werknemer werknemerNummer;
    private int reservationNumber;
    @Id
    @Column(name = "reservation_id")
    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    @Basic
    @Column(name = "reservation_date")
    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Basic
    @Column(name = "begin_tijd")
    public LocalTime getBeginTijd() {
        return beginTijd;
    }

    public void setBeginTijd(LocalTime beginTijd) {
        this.beginTijd = beginTijd;
    }

    @Basic
    @Column(name = "eind_tijd")
    public LocalTime getEindTijd() {
        return eindTijd;
    }

    public void setEindTijd(LocalTime eindTijd) {
        this.eindTijd = eindTijd;
    }

    @Basic
    @Column (name = "reservation_number")
    public  int getReservationNumber(){return reservationNumber;}
    public void setReservationNumber (int reservationNumber){this.reservationNumber = reservationNumber;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reservation that = (Reservation) o;

        if (reservationId != that.reservationId) return false;
        if (reservationDate != null ? !reservationDate.equals(that.reservationDate) : that.reservationDate != null)
            return false;
        if (beginTijd != null ? !beginTijd.equals(that.beginTijd) : that.beginTijd != null) return false;
        if (eindTijd != null ? !eindTijd.equals(that.eindTijd) : that.eindTijd != null) return false;

        return true;
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






    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "Location_id")
    public Location getLocationByLocationId() {
        return locationByLocationId;
    }
    public void setLocationByLocationId(Location locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + reservationId+
                ", reservationdate='" + reservationDate + '\'' +
                ", begintijd ='" + beginTijd + '\'' +
                ", eindtijd='" + eindTijd + '\'' +
             //   ", klantenNummer=" + klantenByKlantenNummer +
                ", locationId =" + locationByLocationId+
                '}';
    }
}
