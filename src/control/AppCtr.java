package control;

import java.util.logging.Level;
import model.Vacance;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import persistence.HibernateUtil;

/**
 *
 * @author Administrateur
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Session session = HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();

        Vacance o1 = new Vacance();

        o1.setCodePostale("nnnnnn");
        o1.setAvionBilletAvion(100);
        o1.setAvionStationnementAerogare(55);
        o1.setTransportLocationVoiture(300);
        
        session.save(o1);

        tx.commit();
        HibernateUtil.closeSession();
        HibernateUtil.sessionFactory.close();

    }

}
