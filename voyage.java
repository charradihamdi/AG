

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

import com.sun.jdi.connect.spi.Connection;

public class voyage {

    protected int id ;
    protected String destination;
    protected Date datedep;
    protected Date dateret;
    protected Double heuredep;
    protected Double heureret;
    protected int nbnuit;
    protected int nbjours;
    protected int numvol;
    protected String avion;
    protected String description ;
    protected boolean prix;
    protected String type;


    public void saisir() throws ClassNotFoundException, SQLException {
        Scanner LireClavier = new Scanner(System.in);
        try {
            System.out.println("donner l'id: ");
            id= LireClavier.nextInt();
            System.out.println("veuillez saisir la date de depart");
            datedep = new Date();
            System.out.println("veuillez saisir la date de retour");
            dateret = new Date();
            System.out.println("veuillez saisir l'heure de depart");
            heuredep = LireClavier.nextDouble();
            System.out.println("veuillez saisir l'heure de retour");
            heureret = LireClavier.nextDouble();
            System.out.println("donner le nombre de nuit ");
            nbnuit= LireClavier.nextInt();
            System.out.println("donner le nombre de jours ");
            nbjours= LireClavier.nextInt();
            System.out.println("donner le numeros de vol ");
            numvol= LireClavier.nextInt();
            System.out.println("donner le nom de l'avion  ");
            avion = LireClavier.next();
            System.out.println("donner la description  ");
            description = LireClavier.next();
            System.out.println("donner le prix  ");
            prix = LireClavier.hasNextDouble();
            System.out.println("donner le type  ");
            type = LireClavier.next();
           
            Connection cn =null;
    		Statement st =null;
    		
            String url = "jdbc:mysql://localhost/agence de voiture";
    		String login = "root";
    		String passwd = "";
    		Class.forName("com.mysql.cj.jdbc.Driver");
			cn = (Connection) DriverManager.getConnection(url, login, passwd);
			st = (Statement) ((java.sql.Connection) cn).createStatement();
			Object rs = ((java.sql.Statement) st).executeQuery("INSERT INTO voyage (Destination,Date_depart,Date_retour,Heure_depart,Heure_retour,Nombre_nuits,Nombre_jours,Numeros_vol,Avion_voy,Description,Prix,Type_voy) VALUES (\"jerba\",'2000-01-14','2001-02-15','18:36:14','10:34:14',15,14,201,450,\"meci agence\",4500,\"allez et retour\")");
        } catch (InputMismatchException LE) {
            System.out.println("entree detectee est invalide");

        }}  //*******update
    public void Update() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/agence de vouyage";
    	String login = "root";
    	String passwd = "";
    	java.sql.Connection cn =null;
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

    }}
    
