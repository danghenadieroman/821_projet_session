package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import model.Vacance;
import org.hibernate.Session;
import org.hibernate.Transaction;
import persistence.HibernateUtil;

/**
 *
 * @author Administrateur
 */
public class FenPrincipale extends JFrame {

    //attributes
    //LO
    private final int LONGEUR = 5;
    private final int ESPACE_DROITE = 50;

    //labels fenetre
    private JLabel lblTitreCalculateur;
    private JLabel lblTitreVoyageAvion;
    private JLabel lblCodePostale;
    private JLabel lblAvionBilletAvion;
    private JLabel lblAvionStationnementAerogare;
    private JLabel lblTitreTransport;
    private JLabel lblTransportLocationVoiture;
    private JLabel lblTransportCarburant;
    private JLabel lblTransportBilletTrain;
    private JLabel lblTransportTaxi;
    private JLabel lblTitreHebergement;
    private JLabel lblHebergementMotel;
    private JLabel lblHebergementNourriture;
    private JLabel lblTitreActivites;
    private JLabel lblActiviteToursOrganises;
    private JLabel lblActiviteVieNocturne;
    private JLabel lblActiviteShopping;
    private JLabel lblActiviteAutresActivites;
    private JLabel lblTitreCroisiere;
    private JLabel lblCroisierePrixCroisiere;
    private JLabel lblCroisiereNourriture;
    private JLabel lblCroisiereBreuvage;
    private JLabel lblTitreAutres;
    private JLabel lblAutreAssurance;
    private JLabel lblAutreDocuments;
    private JLabel lblAutreImmunisation;
    private JLabel lblAutreInternet;
    private JLabel lblAutreBagages;
    private JLabel lblAutreFraisDivers;
    private JLabel lblResultatCalcule;

    //champs texte
    private JTextField txtCodePostale;
    private JTextField txtAvionBilletAvion;
    private JTextField txtAvionStationnementAerogare;
    private JTextField txtTransportLocationVoiture;
    private JTextField txtTransportCarburant;
    private JTextField txtTransportBilletTrain;
    private JTextField txtTransportTaxi;
    private JTextField txtHebergementMotel;
    private JTextField txtHebergementNourriture;
    private JTextField txtActiviteToursOrganises;
    private JTextField txtActiviteVieNocturne;
    private JTextField txtActiviteShopping;
    private JTextField txtActiviteAutresActivites;
    private JTextField txtCroisierePrixCroisiere;
    private JTextField txtCroisiereNourriture;
    private JTextField txtCroisiereBreuvage;
    private JTextField txtAutreAssurance;
    private JTextField txtAutreDocuments;
    private JTextField txtAutreImmunisation;
    private JTextField txtAutreInternet;
    private JTextField txtAutreBagages;
    private JTextField txtAutreFraisDivers;
    private JTextField txtResultatCalcule;

    private JButton btnCalculer;
    private JButton btnEffacer;
    private JButton btnQuitter;
    private JButton btnRemplir;//pour les tests

    private JPanel jpPanel;
    private JPanel jpFormulaire;

    //constructeur
    public FenPrincipale() {

        lblTitreCalculateur = new JLabel("Calculateur budget voyage");
        lblCodePostale = new JLabel("Code postale  ");

        lblTitreVoyageAvion = new JLabel("Voyage avion");
        lblAvionBilletAvion = new JLabel("Prix billet avion  ");
        lblAvionStationnementAerogare = new JLabel("Stationnement aérogare  ");

        lblTitreTransport = new JLabel("Transport");
        lblTransportLocationVoiture = new JLabel("Location voiture  ");
        lblTransportCarburant = new JLabel("Carburant  ");
        lblTransportBilletTrain = new JLabel("Billet train  ");
        lblTransportTaxi = new JLabel("Taxi  ");

        lblTitreHebergement = new JLabel("Hébérgement");
        lblHebergementMotel = new JLabel("Motel  ");
        lblHebergementNourriture = new JLabel("Nourriture  ");

        lblTitreActivites = new JLabel("Activités ");
        lblActiviteToursOrganises = new JLabel("Tours organisés  ");
        lblActiviteVieNocturne = new JLabel("Vie nocturne  ");
        lblActiviteShopping = new JLabel("Shopping  ");
        lblActiviteAutresActivites = new JLabel("Autres activités  ");

        lblTitreCroisiere = new JLabel("Croisière");
        lblCroisierePrixCroisiere = new JLabel("Prix croisière  ");
        lblCroisiereNourriture = new JLabel("Nouriture  ");
        lblCroisiereBreuvage = new JLabel("Breuvage  ");

        lblTitreAutres = new JLabel("Autres dépances");
        lblAutreAssurance = new JLabel("Assurance  ");
        lblAutreDocuments = new JLabel("Documents  ");
        lblAutreImmunisation = new JLabel("Immunisation  ");
        lblAutreInternet = new JLabel("Internet  ");
        lblAutreBagages = new JLabel("Bagages  ");
        lblAutreFraisDivers = new JLabel("Frais divers  ");

        lblResultatCalcule = new JLabel("Resultat calcule  ");

        //
        //champs formulaire
        txtCodePostale = new JTextField(LONGEUR);
        txtAvionBilletAvion = new JTextField(LONGEUR);
        txtAvionStationnementAerogare = new JTextField(LONGEUR);
        txtTransportLocationVoiture = new JTextField(LONGEUR);
        txtTransportCarburant = new JTextField(LONGEUR);
        txtTransportBilletTrain = new JTextField(LONGEUR);
        txtTransportTaxi = new JTextField(LONGEUR);
        txtHebergementMotel = new JTextField(LONGEUR);
        txtHebergementNourriture = new JTextField(LONGEUR);
        txtActiviteToursOrganises = new JTextField(LONGEUR);
        txtActiviteVieNocturne = new JTextField(LONGEUR);
        txtActiviteShopping = new JTextField(LONGEUR);
        txtActiviteAutresActivites = new JTextField(LONGEUR);
        txtCroisierePrixCroisiere = new JTextField(LONGEUR);
        txtCroisiereNourriture = new JTextField(LONGEUR);
        txtCroisiereBreuvage = new JTextField(LONGEUR);
        txtAutreAssurance = new JTextField(LONGEUR);
        txtAutreDocuments = new JTextField(LONGEUR);
        txtAutreImmunisation = new JTextField(LONGEUR);
        txtAutreInternet = new JTextField(LONGEUR);
        txtAutreBagages = new JTextField(LONGEUR);
        txtAutreFraisDivers = new JTextField(LONGEUR);
        txtResultatCalcule = new JTextField(LONGEUR);

        //boutons
        btnCalculer = new JButton("Calculer");
        btnEffacer = new JButton("Effacer");
        btnQuitter = new JButton("Quitter");
        btnRemplir = new JButton("Remplir");

        //paneaux 
        jpPanel = new JPanel();
        jpPanel.setLayout(new BorderLayout());

        jpFormulaire = new JPanel(new GridLayout(31, 1));
        jpPanel.add(jpFormulaire, BorderLayout.CENTER);

        //ajout des paneau au panel principal
        //==========TITRE CALCULATEUR=============================
        JPanel jpTitreCalculateur = new JPanel();
        jpFormulaire.add(jpTitreCalculateur);
        jpTitreCalculateur.add(lblTitreCalculateur);
        lblTitreCalculateur.setFont(new Font("Verdana", Font.BOLD, 14));
        lblTitreCalculateur.setVerticalAlignment(SwingConstants.CENTER);
        lblTitreCalculateur.setForeground(Color.WHITE);
        jpTitreCalculateur.setBackground(Color.GRAY);
        jpTitreCalculateur.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        JPanel jpCodePostal = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpCodePostal);
        jpCodePostal.setBackground(Color.WHITE);
        jpCodePostal.add(lblCodePostale);

        lblCodePostale.setHorizontalAlignment(SwingConstants.RIGHT);
        jpCodePostal.add(txtCodePostale);

        //========================================================
        JPanel jpTitreVoyageAvion = new JPanel();
        jpFormulaire.add(jpTitreVoyageAvion);
        jpTitreVoyageAvion.add(lblTitreVoyageAvion);
        lblTitreVoyageAvion.setForeground(Color.WHITE);
        jpTitreVoyageAvion.setBackground(Color.GRAY);
        jpTitreVoyageAvion.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        JPanel jpAvionBilletAvion = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpAvionBilletAvion);
        jpAvionBilletAvion.add(lblAvionBilletAvion);
        lblAvionBilletAvion.setHorizontalAlignment(SwingConstants.RIGHT);
        jpAvionBilletAvion.add(txtAvionBilletAvion);

        JPanel jpStationnementAerogare = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpStationnementAerogare);
        jpStationnementAerogare.add(lblAvionStationnementAerogare);
        lblAvionStationnementAerogare.setHorizontalAlignment(SwingConstants.RIGHT);
        jpStationnementAerogare.add(txtAvionStationnementAerogare);

        //========================================================
        JPanel jpTitreTransport = new JPanel();
        jpFormulaire.add(jpTitreTransport);
        jpTitreTransport.add(lblTitreTransport);
        lblTitreTransport.setForeground(Color.WHITE);
        jpTitreTransport.setBackground(Color.GRAY);
        jpTitreTransport.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        JPanel jpTransportLocationVoiture = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpTransportLocationVoiture);
        jpTransportLocationVoiture.add(lblTransportLocationVoiture);
        lblTransportLocationVoiture.setHorizontalAlignment(SwingConstants.RIGHT);
        jpTransportLocationVoiture.add(txtTransportLocationVoiture);

        JPanel jpTransportCarburant = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpTransportCarburant);
        jpTransportCarburant.add(lblTransportCarburant);
        lblTransportCarburant.setHorizontalAlignment(SwingConstants.RIGHT);
        jpTransportCarburant.add(txtTransportCarburant);

        JPanel jpTransportBilletTrain = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpTransportBilletTrain);
        jpTransportBilletTrain.add(lblTransportBilletTrain);
        lblTransportBilletTrain.setHorizontalAlignment(SwingConstants.RIGHT);
        jpTransportBilletTrain.add(txtTransportBilletTrain);

        JPanel jpTransportTaxi = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpTransportTaxi);
        jpTransportTaxi.add(lblTransportTaxi);
        lblTransportTaxi.setHorizontalAlignment(SwingConstants.RIGHT);
        jpTransportTaxi.add(txtTransportTaxi);

        //========================================================
        JPanel jpTitreHebergement = new JPanel();
        jpFormulaire.add(jpTitreHebergement);
        jpTitreHebergement.add(lblTitreHebergement);
        lblTitreHebergement.setForeground(Color.WHITE);
        jpTitreHebergement.setBackground(Color.GRAY);
        jpTitreHebergement.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        JPanel jpHebergementMotel = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpHebergementMotel);
        jpHebergementMotel.add(lblHebergementMotel);
        lblHebergementMotel.setHorizontalAlignment(SwingConstants.RIGHT);
        jpHebergementMotel.add(txtHebergementMotel);

        JPanel jpHebergementNourriture = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpHebergementNourriture);
        jpHebergementNourriture.add(lblHebergementNourriture);
        lblHebergementNourriture.setHorizontalAlignment(SwingConstants.RIGHT);
        jpHebergementNourriture.add(txtHebergementNourriture);

        //========================================================
        JPanel jpTitreActivites = new JPanel();
        jpFormulaire.add(jpTitreActivites);
        jpTitreActivites.add(lblTitreActivites);
        lblTitreActivites.setForeground(Color.WHITE);
        jpTitreActivites.setBackground(Color.GRAY);
        jpTitreActivites.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        JPanel jpActivitesToursOrganises = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpActivitesToursOrganises);
        jpActivitesToursOrganises.add(lblActiviteToursOrganises);
        lblActiviteToursOrganises.setHorizontalAlignment(SwingConstants.RIGHT);
        jpActivitesToursOrganises.add(txtActiviteToursOrganises);

        JPanel jpActivitesVieNocturne = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpActivitesVieNocturne);
        jpActivitesVieNocturne.add(lblActiviteVieNocturne);
        lblActiviteVieNocturne.setHorizontalAlignment(SwingConstants.RIGHT);
        jpActivitesVieNocturne.add(txtActiviteVieNocturne);

        JPanel jpActivitesShopping = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpActivitesShopping);
        jpActivitesShopping.add(lblActiviteShopping);
        lblActiviteShopping.setHorizontalAlignment(SwingConstants.RIGHT);
        jpActivitesShopping.add(txtActiviteShopping);

        JPanel jpActivitesAutres = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpActivitesAutres);
        jpActivitesAutres.add(lblActiviteAutresActivites);
        lblActiviteAutresActivites.setHorizontalAlignment(SwingConstants.RIGHT);
        jpActivitesAutres.add(txtActiviteAutresActivites);

        //========================================================
        JPanel jpTitreCroisiere = new JPanel();
        jpFormulaire.add(jpTitreCroisiere);
        jpTitreCroisiere.add(lblTitreCroisiere);
        lblTitreCroisiere.setForeground(Color.WHITE);
        jpTitreCroisiere.setBackground(Color.GRAY);
        jpTitreCroisiere.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        JPanel jpCroisierePrix = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpCroisierePrix);
        jpCroisierePrix.add(lblCroisierePrixCroisiere);
        lblCroisierePrixCroisiere.setHorizontalAlignment(SwingConstants.RIGHT);
        jpCroisierePrix.add(txtCroisierePrixCroisiere);

        JPanel jpCroisiereNourriture = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpCroisiereNourriture);
        jpCroisiereNourriture.add(lblCroisiereNourriture);
        lblCroisiereNourriture.setHorizontalAlignment(SwingConstants.RIGHT);
        jpCroisiereNourriture.add(txtCroisiereNourriture);

        JPanel jpCroisiereBreuvages = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpCroisiereBreuvages);
        jpCroisiereBreuvages.add(lblCroisiereBreuvage);
        lblCroisiereBreuvage.setHorizontalAlignment(SwingConstants.RIGHT);
        jpCroisiereBreuvages.add(txtCroisiereBreuvage);

        //========================================================
        JPanel jpTitreAutresDepanses = new JPanel();
        jpFormulaire.add(jpTitreAutresDepanses);
        jpTitreAutresDepanses.add(lblTitreAutres);
        lblTitreAutres.setForeground(Color.WHITE);
        jpTitreAutresDepanses.setBackground(Color.GRAY);
        jpTitreAutresDepanses.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        JPanel jpAutresDepansesAssurance = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpAutresDepansesAssurance);
        jpAutresDepansesAssurance.add(lblAutreAssurance);
        lblAutreAssurance.setHorizontalAlignment(SwingConstants.RIGHT);
        jpAutresDepansesAssurance.add(txtAutreAssurance);

        JPanel jpAutresDepansesDocuments = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpAutresDepansesDocuments);
        jpAutresDepansesDocuments.add(lblAutreDocuments);
        lblAutreDocuments.setHorizontalAlignment(SwingConstants.RIGHT);
        jpAutresDepansesDocuments.add(txtAutreDocuments);

        JPanel jpAutresDepansesInternet = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpAutresDepansesInternet);
        jpAutresDepansesInternet.add(lblAutreInternet);
        lblAutreInternet.setHorizontalAlignment(SwingConstants.RIGHT);
        jpAutresDepansesInternet.add(txtAutreInternet);

        JPanel jpAutresDepansesImmunisation = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpAutresDepansesImmunisation);
        jpAutresDepansesImmunisation.add(lblAutreImmunisation);
        lblAutreImmunisation.setHorizontalAlignment(SwingConstants.RIGHT);
        jpAutresDepansesImmunisation.add(txtAutreImmunisation);

        JPanel jpAutresDepansesBagages = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpAutresDepansesBagages);
        jpAutresDepansesBagages.add(lblAutreBagages);
        lblAutreBagages.setHorizontalAlignment(SwingConstants.RIGHT);
        jpAutresDepansesBagages.add(txtAutreBagages);

        JPanel jpAutresDepansesFraisDivers = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpAutresDepansesFraisDivers);
        jpAutresDepansesFraisDivers.add(lblAutreFraisDivers);
        lblAutreFraisDivers.setHorizontalAlignment(SwingConstants.RIGHT);
        jpAutresDepansesFraisDivers.add(txtAutreFraisDivers);

        //RESULTAT CALCULE ===============================
        JPanel jpResultatCalcule = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpResultatCalcule);
        jpResultatCalcule.add(lblResultatCalcule);
        lblResultatCalcule.setHorizontalAlignment(SwingConstants.RIGHT);
        jpResultatCalcule.add(txtResultatCalcule);
        lblResultatCalcule.setFont(new Font("Verdana", Font.BOLD, 14));
        lblResultatCalcule.setForeground(Color.BLUE);
        lblResultatCalcule.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        jpResultatCalcule.setBackground(Color.GRAY);

        //BOUTONS ========================================
        JPanel jpBoutons = new JPanel(new GridLayout(1, 3));
        jpFormulaire.add(jpBoutons);
        jpBoutons.add(btnCalculer);
        jpBoutons.add(btnEffacer);
        jpBoutons.add(btnQuitter);
        jpBoutons.add(btnRemplir);

        //parametres de la fenetre ========================================
        setTitle("Calculateur budget voyage");
        setContentPane(jpPanel);
        setSize(400, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);

        //initialiser touts les champs à zéro
        champsAZero();

        //  =================================
        // Listeners boutons =================================
        btnCalculer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                boolean formulaireValide = true;
                double totalBudget = 0;

                Session session = HibernateUtil.currentSession();
                Transaction tx = session.beginTransaction();

                Vacance objet = new Vacance();

                //code postal
                String codePostal = txtCodePostale.getText().trim();
                if (codePostal.length() == 0) {
                    JOptionPane.showMessageDialog(null, "Code postale est obligatoire", "Formulaire invalide!",
                            JOptionPane.ERROR_MESSAGE);
                } else if (codePostal.length() < 6) {
                    JOptionPane.showMessageDialog(null, "Code postale mal remplis", "Formulaire invalide!",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    objet.setCodePostale(codePostal);

                }

                //prix billet avion
                double billetAvion = 0;
                if (isNumeric(txtAvionBilletAvion.getText().trim())) {
                    billetAvion = Double.parseDouble(txtAvionBilletAvion.getText().trim());
                    objet.setAvionBilletAvion(billetAvion);
                    totalBudget += billetAvion;
                    formulaireValide = true;
                } else {
                    txtAvionBilletAvion.setText("0");
                    formulaireValide = false;
                    HibernateUtil.closeSession();
                }

                //stationnement aerogare
                //total budget
                txtResultatCalcule.setText(totalBudget + "");

                //persistance BD si le formulaire est bien remplis
                if (formulaireValide) {
                    session.save(objet);
                    tx.commit();
                } else {
                    JOptionPane.showMessageDialog(null, "SVP entrez en numérique", "Formulaire invalide!",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        btnEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                champsAZero();
            }
        });

        btnRemplir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                txtCodePostale.setText("A1A A1A");
                txtAvionBilletAvion.setText("500");
                txtAvionStationnementAerogare.setText("50");

            }
        });

        btnQuitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                HibernateUtil.closeSession();
                HibernateUtil.sessionFactory.close();
                System.exit(0);
            }
        });
    }//constructeur

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public void champsAZero() {
        txtCodePostale.setText("");
        txtAvionBilletAvion.setText("0");
        txtAvionStationnementAerogare.setText("0");
        txtTransportLocationVoiture.setText("0");
        txtTransportCarburant.setText("0");
        txtTransportBilletTrain.setText("0");
        txtTransportTaxi.setText("0");
        txtHebergementMotel.setText("0");
        txtHebergementNourriture.setText("0");
        txtActiviteToursOrganises.setText("0");
        txtActiviteVieNocturne.setText("0");
        txtActiviteShopping.setText("0");
        txtActiviteAutresActivites.setText("0");
        txtCroisierePrixCroisiere.setText("0");
        txtCroisiereNourriture.setText("0");
        txtCroisiereBreuvage.setText("0");
        txtAutreAssurance.setText("0");
        txtAutreDocuments.setText("0");
        txtAutreInternet.setText("0");
        txtAutreImmunisation.setText("0");
        txtAutreBagages.setText("0");
        txtAutreFraisDivers.setText("0");
        txtResultatCalcule.setText("0");
    }

}
