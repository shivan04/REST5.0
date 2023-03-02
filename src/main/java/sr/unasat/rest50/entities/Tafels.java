package sr.unasat.rest50.entities;

import javax.persistence.*;


@Entity

public class Tafels {
    private static long tafelId;
    private static int aantalPersonen;
    private static String category;

    @Id
    @Column(name = "tafel_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


    public static int getTafelId() {
        return (int) tafelId;
    }

    public void setTafelId(int tafelId) {
        this.tafelId = tafelId;
    }

    @Basic
    @Column(name = "aantal_personen")
    public int getAantalPersonen() {
        return aantalPersonen;
    }

    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }

    @Basic
    @Column(name = "category")
    public static String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tafels tafels = (Tafels) o;

        if (tafelId != tafels.tafelId) return false;
        if (aantalPersonen != tafels.aantalPersonen) return false;
        if (category != null ? !category.equals(tafels.category) : tafels.category != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) tafelId;
        result = 31 * result + aantalPersonen;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Tafel{" +

                " tafelid =' " + tafelId + '\'' +
                ", aantalpersonen' " + aantalPersonen + '\'' +
                ", category  " + category +'\''+
                "}";
    }
}
