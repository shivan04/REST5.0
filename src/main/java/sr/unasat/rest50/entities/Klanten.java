package sr.unasat.rest50.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Klanten {
    private int klantId;
    private String achternaam;
    private String voornaam;
    private String idNummer;
    private String adress;
    private String district;
    private Integer telefoonNummer;
    private int klantenNummer;

////    @ManyToOne(cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "klanten_nummer")
//    private Klanten klanten_nummer;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "klant_id")
    public int getKlantId() {
        return klantId;
    }

    public void setKlantId(int klantId) {
        this.klantId = klantId;
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
    @Column(name = "klanten_nummer")
    public  int getKlantenNummer(){return klantenNummer;}

    public  void  setKlantenNummer(int klantenNummer){
        this.klantenNummer = klantenNummer;
    }

//  @OneToMany( mappedBy = "klanten_nummer", cascade = CascadeType.REMOVE,orphanRemoval = true)
//   private List<Klanten>klant;



    @Override
    public String toString() {
        return "KLanten{" +
                "id=" + klantId+
                ", achternaam='" + achternaam + '\'' +
                ", voornaam ='" + voornaam + '\'' +
                ", adress=" + adress +
                ", telefoonnummer =" + telefoonNummer+
             //   ", klantennummer =" + klantenNummer+
                '}';
    }



}
