package control;

import java.util.Locale;
import view.FenPrincipale;

/**
 *
 * @author Dan-Ghenadie Roman - 1395945
 * @version 1.0 - projet session
 * @date 03/09/2016
 * @420-821-BB gr.000212
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Locale locale = new Locale("fr", "CA");
//        Locale locale = new Locale("en", "CA");

        FenPrincipale fenetre = new FenPrincipale(locale);

    }

}
