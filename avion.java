import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class avion {
	
    protected int choix ;
    protected String nomav;
    protected int nbrc;
    protected int nbrcl;
    protected String description;
    protected Date datefab;
    protected int nbvl;
    protected int nbve;
    protected boolean active;
    protected boolean carburent;
    protected Date date_acquisition ;

    Scanner LireClavier = new Scanner(System.in);
    String url = "jdbc:mysql://localhost:3306/agence de vouyage";
	String login = "root";
	String passwd = "";
	Connection cn =null;
	java.sql.Statement st =null;

    public void saisir() throws SQLException, ClassNotFoundException {
  
    	int rs;
        try {
        	date_acquisition = new Date();
        	
         
            System.out.println("donner le nom d'avion: ");
            nomav = LireClavier.next();
            System.out.println("veuillez saisir le nombre de place commerciale");
            nbrc = LireClavier.nextInt();
            System.out.println("veuillez saisir le nombre de 1 er classe");
            nbrcl = LireClavier.nextInt();
            System.out.println("donner la description  ");
            description = LireClavier.next();  
             System.out.println("veuillez saisir la date de fabrication");
            datefab = new Date();
            System.out.println("donner le nombre de voyage limites   ");
            nbvl = LireClavier.nextInt();
            System.out.println("donner le nombre de voyage effectue  ");
            nbve = LireClavier.nextInt();
            System.out.println("donner l'active  ");
            active = LireClavier.nextBoolean();
            System.out.println("tester le carburant  ");
            carburent = LireClavier.nextBoolean();
        	// Etape 1 : Chargement du driver
        	Class.forName("com.mysql.jdbc.Driver");

        	// Etape 2 : recuperation de la connexion
        	cn = DriverManager.getConnection(url, login, passwd);

        	// Etape 3 : Creation d'un statement
        	st = cn.createStatement();
        	
    		 rs = ((java.sql.Statement) st).executeUpdate("INSERT INTO avion (Nom_avion,Nbre_comerc,Nbre1_clas,Description,Date_fabrication,Nbre_limites,Nbre_voyeffectue,Active,Carburent) VALUES (\"tunisiaire\",2000,1200,\"allerz amuser\",'2018-05-03',9,5,1,0)") ;
        } catch (InputMismatchException LE) {
            System.out.println("entree detectee est invalide");
        
        }}
      //*******update
        public void Update() throws SQLException, ClassNotFoundException {
        	 
        	Class.forName("com.mysql.jdbc.Driver");

        	// Etape 2 : recuperation de la connexion
        	cn = DriverManager.getConnection(url, login, passwd);

        	// Etape 3 : Creation d'un statement
        	st = cn.createStatement();
        
        	int rs;
            try {
            	date_acquisition = new Date();
            	Menu mn= new Menu();
            	mn.update();
            	
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
    
    }}
