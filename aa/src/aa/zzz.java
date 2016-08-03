package aa;
import javax.swing.*;
/**
 * Class JPanel qui contient un tableau qui affiche
 * l'id, le nom et prenom des visteurs
 * @author Zoubert hanem
 */
public class zzz extends JPanel {

	 private Object[][] donnees;
	 private JTable tableau;
	 private JScrollPane scroll;
	 private JLabel listeVisiteur;
	/**
	 * Constructeur du panel
	 */
	public zzz(){
			
		//entï¿½te du tableau
		String[] entetes = { "Id", "Nom", "Prenom"};

		//                              [Lignes]            [Colonnes]
		this.donnees = new Object[Nombre de visiteur(s)][nombre d'entete(s)];
		
		//			     []       []
		this.tableau = new JTable(donnees, entetes);
		
		//Ajout du tableau dans un JscrollPane
		this.scroll = new JScrollPane(tableau);
		
		//Taille du scroll
		this.scroll.setPreferredSize(new Dimension(450, 200));
		
		/**
		 * Pour que cette boucle fonctionne il faut tout d'abord créer une classe Visiteur que tu vas créer dans le package Modele qui aura 
		 * comme variable (id,nom,prenom) et qui prendra en parametre ces 3 variables dans son constructeur et créer une fonction 
		 * ( function Arraylist<Visiteur> lesVisiteurs(){} ) dans la classe Modele.java qui va renvoyer tous les visiteurs qui sont dans la BDD sous forme d'un Arraylist.
		 * Ensuite il te faut dans la classe Visiteur pour chaque variable l'accesseur get().
		 * getId(), getNom(), getPrenom(), les accesseurs set() tu en auras pas besoin pour cette exemple.
		*/
		
		for (int i = 0; i < Modele.lesVisiteurs().size(); i++) {
		
			Visiteur visiteur = Modele.lesVisiteurs().get(i);

			this.donnees[i][0] = visiteur.getId();
			this.donnees[i][1] = visiteur.getNom();
			this.donnees[i][2] = visiteur.getPrenom();
			
		}
			//ajout du scroll dans le panel
			this.add(this.scroll);
	}
}
