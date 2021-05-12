import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class meteo {
	protected Date date;
	protected String Description;

	meteo() throws SQLException{ 
	try {
		date = new Date();
	    Scanner LireClavier = new Scanner(System.in);
	    System.out.println("veuillez saisir la date de départ"); 
	    System.out.println("donner la Date: ");
	    date.saisir_date();
	    System.out.println(" donner la Description");
	    Description = LireClavier.next(); 
        ///***requette de saisie
    	String login = null;
		String passwd = null;
		String url = null;
		// Etape 2 : recuperation de la connexion
		Connection cn = DriverManager.getConnection(url, login, passwd);

		// Etape 3 : Creation d'un statement
		Statement st = (Statement) cn.createStatement();
		
		// Etape 4 : execution requete
		Object rs = ((java.sql.Statement) st).executeQuery("INSERT INTO meteo (Date_meteo,Description) VALUES ('2011-09-12',\"vent\")");
		// Si recup donnees alors etapes 5 (parcours Resultset)
      
	} catch (InputMismatchException LE) {
	    System.out.println("entree detectee est invalide");
	  
	}
	}  //*******update
	public void Update() throws SQLException, ClassNotFoundException {
	    String url = "jdbc:mysql://localhost:3306/agence de vouyage";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		java.sql.Statement st =null;
		Class.forName("com.mysql.jdbc.Driver");
		cn = DriverManager.getConnection(url, login, passwd);
		st = cn.createStatement();
		int rs;
	    try {
	    	 Scanner LireClavier = new Scanner(System.in);
	    	Menu mn= new Menu();
	    	mn.update();
	        int choix ;
	        System.out.println("donnee le champ a modifier  ");
	        choix= LireClavier.nextInt();
	        switch(choix) {
	        case 1 : rs = ((java.sql.Statement) st).executeUpdate("") ;
	        	;break;
	        case 2 :rs = ((java.sql.Statement) st).executeUpdate("")  ;break;
	        case 3 :rs = ((java.sql.Statement) st).executeUpdate("") ; ;break;
	        case 4 :rs = ((java.sql.Statement) st).executeUpdate("") ; ;break;
	        case 5 :rs = ((java.sql.Statement) st).executeUpdate("") ; ;break;
	        case 0 :   System.out.println("Aurevoir");
	        break;
	        default:
	        System.out.println("choix incorrecte");
	        }
		
	    } catch (InputMismatchException LE) {
	        System.out.println("entree detectee est invalide");
	    
	    }

	}
}
