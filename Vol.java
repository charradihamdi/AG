
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vol {

    private String id_vol;
    private String nom_Avion;
    private String nbplace;
    private Date desc;
    protected Date date_vol ;
    private int nb_Voyage;
    private int nb_voyage_effectue;
    private boolean active;
    private boolean Carb;

    public void saisi_vol() throws SQLException {
        try {
            Scanner LireClavier = new Scanner(System.in);
            System.out.println("veuillez saisir les information a propos cette voyage");
            System.out.println("donner id de vol: ");
            id_vol = LireClavier.next();
            System.out.println("donner nom du vol: ");
            nom_Avion = LireClavier.next();
            System.out.println("donner dates : ");
            desc =  new Date();
            desc.saisir_date();
            System.out.println("veuillez saisir la date de vol");
            date_vol = new Date();
            date_vol.saisir_date();
            System.out.println("nombre de voyage ");
            nb_Voyage = LireClavier.nextInt();
            System.out.println("nombre de voyage a effectue ");
            nb_voyage_effectue = LireClavier.nextInt();
            System.out.println("Active ");
            active = LireClavier.nextBoolean();
            System.out.println("Carburent ");
            Carb = LireClavier.nextBoolean();
 
            ///***requette de saisie
        	String login = null;
			String passwd = null;
			String url = null;
			// Etape 2 : recuperation de la connexion
    		Connection cn = DriverManager.getConnection(url, login, passwd);

    		// Etape 3 : Creation d'un statement
    		Statement st = (Statement) cn.createStatement();
    		
    		// Etape 4 : execution requete
    		// Si recup donnees alors etapes 5 (parcours Resultset)
    		 int rs = ((java.sql.Statement) st).executeUpdate("INSERT INTO vol (Id_avion,Date_depart,Heure_depart,Nombrevoyageurs,Nombrevoy_class1,Decollage,Destination_atteinte,Type_vol)\r\n"
    		 		+ " VALUES (65,'2020-10-12','22:20:40',400,50,1,0,\"bien abihei\")\r\n"
    		 		+ "") ;
        } catch (InputMismatchException LE) {
            System.out.println("entree detectee est invalide");
          
        }
    }
    //*******update
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