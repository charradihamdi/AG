import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class billet {
protected String Referance;

protected String Nom;
protected String Prenom;
protected int Num_Vol;
protected Date date;
billet() throws SQLException{ 
try {
    Scanner LireClavier = new Scanner(System.in);
    System.out.println("veuillez saisir les information a propos cette voyage");

    System.out.println("donner la Referance: ");
    Referance = LireClavier.next();
    System.out.println(" donner le nom");
    Nom = LireClavier.next();

    System.out.println("donner la prénom: ");
    Prenom = LireClavier.next();

    System.out.println("donner le num de vol: ");
    Num_Vol = LireClavier.nextInt();
    ///***requette de saisie
	String login = null;
	String passwd = null;
	String url = null;
	// Etape 2 : recuperation de la connexion
	Connection cn = DriverManager.getConnection(url, login, passwd);

	// Etape 3 : Creation d'un statement
	Statement st = (Statement) cn.createStatement();
	
	// Etape 4 : execution requete
	Object rs = ((java.sql.Statement) st).executeQuery("\r\n"
			+ "INSERT INTO billet (Referance,Nom,Prenom,Numeros_de_vol,date_billet) VALUES (654,\"omar\",\"ouhhou\",15,'2099-05-12')\r\n"
			+ "");
	// Si recup donnees alors etapes 5 (parcours Resultset)
  
} catch (InputMismatchException LE) {
    System.out.println("entree detectee est invalide");
  
}
}     //*******update
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
