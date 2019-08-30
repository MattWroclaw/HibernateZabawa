package zabawa;

import org.hibernate.Session;
import zabawa.entity.Koszula;
import zabawa.entity.Krawat;

import java.util.ArrayList;
import java.util.List;

public class MainMany2Many {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Koszula koszula10 = new Koszula();
        Koszula koszula20 = new Koszula();
        Koszula koszula30 = new Koszula();

        Krawat krawat1 = new Krawat();
        Krawat krawat2 = new Krawat();
        Krawat krawat3 = new Krawat();

        krawat1.getListaKoszula().add(koszula10);
        krawat1.getListaKoszula().add(koszula20);
        krawat1.getListaKoszula().add(koszula30);

        krawat2.getListaKoszula().add(koszula20);
        krawat2.getListaKoszula().add(koszula30);

        krawat3.getListaKoszula().add(koszula30);

        session.persist(krawat1);
        session.persist(krawat2);
        session.persist(krawat3);

        session.persist(koszula10);
        session.persist(koszula20);
        session.persist(koszula30);

        session.flush();
        session.close();
    }
}
