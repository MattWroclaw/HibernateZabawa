package zabawa.entity;

import javax.persistence.*;

@Entity
@Table(name = "Lewa_noga", schema = "zabawa")
public class LewaNoga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String opisLewej;

    @OneToOne (mappedBy = "lewaNozka", cascade = CascadeType.PERSIST)
    private PrawaNoga prawaNozka;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpisLewej() {
        return opisLewej;
    }

    public void setOpisLewej(String opisLewej) {
        this.opisLewej = opisLewej;
    }

    public PrawaNoga getPrawaNozka() {
        return prawaNozka;
    }

    public void setPrawaNozka(PrawaNoga prawaNozka) {
        this.prawaNozka = prawaNozka;
    }
}
