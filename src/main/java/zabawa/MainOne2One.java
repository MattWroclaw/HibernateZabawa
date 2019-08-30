package zabawa;

import org.hibernate.Session;
import zabawa.entity.LewaNoga;
import zabawa.entity.PrawaNoga;

public class MainOne2One {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        LewaNoga lewaNoga = new LewaNoga();
        PrawaNoga prawaNoga = new PrawaNoga();

        lewaNoga.setOpisLewej("to jest opis lewej nóżki");
        prawaNoga.setOpisPrawej("to prawej nóżki opis");
        prawaNoga.setLewaNozka(lewaNoga);

        session.persist(lewaNoga);
        session.persist(prawaNoga);

        session.flush();
        session.close();

    }
}
