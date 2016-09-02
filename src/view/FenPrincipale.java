package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

    private JButton btnCalculer;
    private JButton btnEfacer;
    private JButton btnQuitter;
    private JButton btnRemplir;//pour les tests

    private JPanel jpPanel;
    private JPanel jpFormulaire;

    //constructeur
    public FenPrincipale() {

        lblTitreCalculateur = new JLabel("Calculateur budget voyage");
        lblTitreCalculateur.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblTitreCalculateur.setForeground(Color.BLUE);
        lblCodePostale = new JLabel("Code postale:");

        lblTitreVoyageAvion = new JLabel("Voyage avion");
        lblTitreVoyageAvion.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblAvionBilletAvion = new JLabel("Prix billet avion");
        lblAvionStationnementAerogare = new JLabel("Stationnement aérogare");

        lblTitreTransport = new JLabel("Transport");
        lblTransportLocationVoiture = new JLabel("Location voiture");
        lblTransportCarburant = new JLabel("Carburant");
        lblTransportBilletTrain = new JLabel("Billet train");
        lblTransportTaxi = new JLabel("Taxi");

        lblTitreHebergement = new JLabel("Hébérgement");
        lblHebergementMotel = new JLabel("Motel");
        lblHebergementNourriture = new JLabel("Nourriture");

        lblTitreActivites = new JLabel("Activités");
        lblActiviteToursOrganises = new JLabel("Tours organisés");
        lblActiviteVieNocturne = new JLabel("Vie nocturne");
        lblActiviteShopping = new JLabel("Shopping");
        lblActiviteAutresActivites = new JLabel("Autres activités");

        lblTitreCroisiere = new JLabel("Croisière");
        lblCroisierePrixCroisiere = new JLabel("Prix croisière");
        lblCroisiereNourriture = new JLabel("Nouriture");
        lblCroisiereBreuvage = new JLabel("Breuvage");

        lblTitreAutres = new JLabel("Autres dépances");
        lblAutreAssurance = new JLabel("Assurance");
        lblAutreDocuments = new JLabel("Documents");
        lblAutreImmunisation = new JLabel("Immunisation");
        lblAutreInternet = new JLabel("Internet");
        lblAutreBagages = new JLabel("Bagages");
        lblAutreFraisDivers = new JLabel("Frais divers");
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

        //paneaux 
        jpPanel = new JPanel();
        jpPanel.setLayout(new BorderLayout());

        jpFormulaire = new JPanel(new GridLayout(20, 1));
        jpPanel.add(jpFormulaire, BorderLayout.CENTER);

        //ajout des paneau au panel principal
        JPanel jpTitreCalculateur = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jpFormulaire.add(jpTitreCalculateur);
        jpTitreCalculateur.add(lblTitreCalculateur);

        JPanel jpCodePostal = new JPanel(new FlowLayout(FlowLayout.RIGHT, ESPACE_DROITE, 0));
        jpFormulaire.add(jpCodePostal);
        jpCodePostal.setBackground(Color.yellow);
        jpCodePostal.add(lblCodePostale);
        jpCodePostal.add(txtCodePostale);

        JPanel jpTitreVoyageAvion = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jpFormulaire.add(jpTitreVoyageAvion);
        jpTitreVoyageAvion.add(lblTitreVoyageAvion);

        JPanel jpAvionBilletAvion = new JPanel(new FlowLayout(FlowLayout.RIGHT, ESPACE_DROITE, 0));
        jpFormulaire.add(jpAvionBilletAvion);
        jpAvionBilletAvion.add(lblAvionBilletAvion);
        jpAvionBilletAvion.add(txtAvionBilletAvion);

        JPanel jpTitreTransport = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jpFormulaire.add(jpTitreTransport);
        jpTitreTransport.add(lblTitreTransport);

        JPanel jpTitreHebergement = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jpFormulaire.add(jpTitreHebergement);
        jpTitreHebergement.add(lblTitreHebergement);

        JPanel jpTitreActivites = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jpFormulaire.add(jpTitreActivites);
        jpTitreActivites.add(lblTitreActivites);

        JPanel jpTitreCroisiere = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jpFormulaire.add(jpTitreCroisiere);
        jpTitreCroisiere.add(lblTitreCroisiere);

        JPanel jpTitreAutresDepanses = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jpFormulaire.add(jpTitreAutresDepanses);
        jpTitreAutresDepanses.add(lblTitreAutres);
        jpTitreAutresDepanses.setBackground(Color.GRAY);

        //parametres de la fenetre ========================================
        setTitle("Calculateur budget voyage");
        setContentPane(jpPanel);
        setSize(400, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);

    }

}
