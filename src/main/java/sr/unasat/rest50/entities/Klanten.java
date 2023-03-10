package sr.unasat.rest50.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter

public class Klanten {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int klantId;
    @Column
    private String achternaam;
    @Column
    private String voornaam;
    @Column
    private String idNummer;
    @Column
    private String adress;
    @Column
    private String district;
    @Column
    private Integer telefoonNummer;
    @Column
    private int klantenNummer;

//
//    public Set<Reservation> getReservation() {
//        return reservation;
//    }
//
//    public void setReservation(Set<Reservation> reservation) {
//        this.reservation = reservation;
//    }
//
//    @OneToMany(mappedBy = "klanten")
//    @JsonIgnoreProperties(value = "klanten", allowSetters = true)
//    private Set<Reservation> reservation;


    public int getKlantId() {
        return klantId;
    }

    public void setKlantId(int klantId) {
        this.klantId = klantId;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getIdNummer() {
        return idNummer;
    }

    public void setIdNummer(String idNummer) {
        this.idNummer = idNummer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setTelefoonNummer(Integer telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }

    public int getKlantenNummer() {
        return klantenNummer;
    }

    public void setKlantenNummer(int klantenNummer) {
        this.klantenNummer = klantenNummer;
    }

//    public Klanten getKlanten_nummer() {
//        return klanten_nummer;
//    }
//
//    public void setKlanten_nummer(Klanten klanten_nummer) {
//        this.klanten_nummer = klanten_nummer;
//    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
}
