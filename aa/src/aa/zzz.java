package aa;
import javax.swing.*;
/**
 * @author Zoubert hanem
 *Cette classe est un panel 
 * Test pull
 */
public class zzz extends JPanel {
	
	/**
	 * Ce qu'il te faut pour le tableau
	 * @author Zoubert hanem
	 */
	 private Object[][] donnees;
	 private JTable tableau;
	 private JScrollPane scroll;
	 private JLabel listeVisiteur;
	/**
	 * Constructeur du panel
	 * @author zoubert hanem
	 */
	public zzz(){
		/*	
		entête du tableau
		String[] entetes = { "Id", "Nom", "Prenom"};

		//                              [Lignes]            [Colonnes]
		this.donnees = new Object[Nombre de visiteur(s)][nombre d'entete(s)];
		
									[]       []
		this.tableau = new JTable(donnees, entetes);
		
		Ajout du tableau dans un JscrollPane
		this.scroll = new JScrollPane(tableau);
		
		Taille du scroll
		this.scroll.setPreferredSize(new Dimension(450, 200));
		
		Pour que cette boucle ce fasse il te faut une classe Visiteur qui sera crée dans le package Modéle qui aura 
		comme attribut(id,nom,prenom) et qui prendra en parametre tout ces attributs ,et aussi une fonction
		qui sera crée dans la classe modéle qui renvoie un Arraylist de Visiteur .Cette fonction permettera de recuperer les visiteurs
		dans la base de donnée et les ajoutes dans l'ArrayList.Ensuite il te faut dans la classe Visiteur
		pour chaque attribut l'accesseur get() uniquement l'accesseur get() ,tu n'auras pas besoin du set() ;)
		
		for (int i = 0; i < Modele.lesVisiteurs().size(); i++) {
		
				Visiteur visiteur = Modele.lesVisiteurs().get(i);

			    this.donnees[i][0] = visiteur.getId();
				this.donnees[i][1] = visiteur.getNom();
				this.donnees[i][2] = visiteur.getPrenom();
			
			}
			//ajout du scroll dans le panel
			this.add(this.scroll);
		*/
	}
}
