import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class entretient {
	protected int Id_avion;

	protected Date date;
	protected double Heure;
	protected boolean Entretient ; 
	entretient() throws SQLException{ 
	try {
	    Scanner LireClavier = new Scanner(System.in);
	    date = new Date();
	    System.out.println("donner la Id_avion: ");
	    Id_avion = LireClavier.nextInt();
	    System.out.println(" donner la Date");
	    date.saisir_date();
	    System.out.println("donner l'Heure: ");
	    Heure = LireClavier.nextDouble();
	    System.out.println("Entretient: ");
	    Entretient = LireClavier.nextBoolean();   
        ///***requette de saisie
    	String login = null;
		String passwd = null;
		String url = null;
		// Etape 2 : recuperation de la connexion
		Connection cn = DriverManager.getConnection(url, login, passwd);

		// Etape 3 : Creation d'un statement
		Statement st = (Statement) cn.createStatement();
		
		// Etape 4 : execution requete
		Object rs = ((java.sql.Statement) st).executeQuery("INSERT INTO entretient (Entretient_,Id_avion,Date_Entretient,Heure)\r\n"
				+ "VALUES (\"jerba\",245,'2222-02-15','18:36:14')\r\n"
				+ "");
		// Si recup donnees alors etapes 5 (parcours Resultset)
      
	} catch (InputMismatchException LE) {
	    System.out.println("entree detectee est invalide");  
	}}}
