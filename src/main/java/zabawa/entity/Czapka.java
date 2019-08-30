package zabawa.entity;

import javax.persistence.*;

@Entity
@Table(schema = "zabawa", name = "czapeczka")
public class Czapka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_czapki")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_glowa")
    private Glowa glowa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Glowa getGlowa() {
        return glowa;
    }

    public void setGlowa(Glowa glowa) {
        this.glowa = glowa;
    }

    public Czapka() {
    }

    public Czapka(Glowa glowa) {
        this.glowa = glowa;
    }
}
