package zabawa;

import org.hibernate.Session;
import zabawa.entity.Czapka;
import zabawa.entity.Glowa;

import java.util.ArrayList;
import java.util.List;

public class MainManyToOne {
    public static void main(String[] args) {

        Glowa glowa = new Glowa();
        Czapka czapka1 = new Czapka();
        Czapka czapka2 = new Czapka(glowa);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

//        glowa.getListaCzapek().add(czapka1);
//        glowa.getListaCzapek().add(czapka2);

//        List<Czapka> listaCzapek = new ArrayList<>(2);
//        listaCzapek.add(czapka1);
//        listaCzapek.add(czapka2);

//        glowa.setListaCzapek(listaCzapek);

//        ****************** chyba chodzi o to, żeby w konstruktorze przekazywać
//        "posiadane" obiekty (czapka wie na której jest głowie)
//        i wtedy nie trzeba nawet dodawać do listy ..

        session.persist(czapka1);
        session.persist(glowa);
        session.persist(czapka2);

        session.flush();
        session.close();
    }
}
