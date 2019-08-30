package zabawa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "zabawa", name = "glowka_lysa")
public class Glowa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_glowy")
    private Long id;

    @OneToMany (mappedBy = "glowa")
    private List<Czapka> listaCzapek;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Czapka> getListaCzapek() {
        if(listaCzapek == null){
            listaCzapek = new ArrayList<Czapka>();
        }
        return listaCzapek;
    }

    public void setListaCzapek(List<Czapka> listaCzapek) {
        if(listaCzapek == null){
            listaCzapek = new ArrayList<Czapka>();
        }
        this.listaCzapek = listaCzapek;
    }
}
