package zabawa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "zabawa", name = "krawat")
public class Krawat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "krawat_id")
    private Long id;

//    @ManyToMany (mappedBy = "listaKrawat")
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "krawat_koszula", joinColumns = @JoinColumn(name = "krawat_id", unique = false),
    inverseJoinColumns = @JoinColumn(name = "idKoszuli"))
    private List <Koszula> listaKoszula = new ArrayList<>();

    public Krawat(Koszula koszula1) {
    }
    public Krawat(){}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Koszula> getListaKoszula() {
        return listaKoszula;
    }

    public void setListaKoszula(List<Koszula> listaKoszula) {
        this.listaKoszula = listaKoszula;
    }
}
