package zabawa.entity;


import javax.persistence.*;

@Entity
@Table(schema = "zabawa", name = "PrawaNoga")
public class PrawaNoga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String opisPrawej;

    @OneToOne
    @JoinColumn (name = "id_lewej", unique = true)
    private LewaNoga lewaNozka;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpisPrawej() {
        return opisPrawej;
    }

    public void setOpisPrawej(String opisPrawej) {
        this.opisPrawej = opisPrawej;
    }

    public LewaNoga getLewaNozka() {
        return lewaNozka;
    }

    public void setLewaNozka(LewaNoga lewaNozka) {
        this.lewaNozka = lewaNozka;
    }
}
