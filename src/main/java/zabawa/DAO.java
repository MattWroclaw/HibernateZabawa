package zabawa;

import org.hibernate.Session;

public class DAO {

    public <T>  void   delete(T doUsuniecia){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(doUsuniecia);
        session.flush();
        session.close();
    }


}
