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
	
				ResultSet rs = Modele.getLesVisiteurs();
				int i =0;
		 try{
				while(rs.next()){
					i++;				
					String id = rs.getString("id");
					String nomVisiteur = rs.getString("nom");
					String prenomVisiteur = rs.getString("prenom");
					
					this.donnees[i][0] = id -> colonne 1
					this.donnees[i][1] = nomVisiteur ->	colonne 2
					this.donnees[i][2] = prenomVisiteur -> colonne 3
				}
			 }
				catch(SQLException e){
					System.out.println(e);
				}
		*/
	}
}
