package zabawa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "koszula", schema = "zabawa")
public class Koszula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "koszula_id")
    private Long id;

//    @ManyToMany
//    @JoinTable(name = "koszula2krawat",
//    joinColumns = @JoinColumn(name = "id_koszuli"),
//            inverseJoinColumns = @JoinColumn(name = "id_krawatu") )
    @ManyToMany(mappedBy = "listaKoszula")
    private List <Krawat> listaKrawat =new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Krawat> getListaKrawat() {
        return listaKrawat;
    }

    public void setListaKrawat(List<Krawat> listaKrawat) {
        this.listaKrawat = listaKrawat;
    }

    public Koszula(){}

    public Koszula(List<Krawat> listaKrawat) {
        this.listaKrawat = listaKrawat;
    }
}
