package control;

import java.util.logging.Level;
import model.Vacance;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import persistence.HibernateUtil;
import view.FenPrincipale;

/**
 *
 * @author Administrateur
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FenPrincipale fenetre = new FenPrincipale();
        
        
//        Session session = HibernateUtil.currentSession();
//        Transaction tx = session.beginTransaction();
//
//        Vacance objet = new Vacance();
//
//        session.save(objet);
//
//        tx.commit();
//        HibernateUtil.closeSession();
//        HibernateUtil.sessionFactory.close();

    }

}
