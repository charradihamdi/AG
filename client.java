import java.beans.Statement;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

import com.sun.jdi.connect.spi.Connection;

public class client {

    protected int id ;
    protected String nomprenom;
    protected String datenaiss;
    protected String adresse;
    protected int numtel;
    protected int cin;
    protected int numpass;
    protected String nationalite;
    protected String mail;
    protected int idvoy;

    

    public void saisir() throws ClassNotFoundException, SQLException, IOException {
        Scanner LireClavier = new Scanner(System.in);
        try {
        	
            System.out.println("donner l'id: ");
            id= LireClavier.nextInt();
            System.out.println("donner le nom et le prenom: ");
            nomprenom = LireClavier.next();
            System.out.println("veuillez saisir la date de naissance");
            datenaiss = LireClavier.next();
            System.out.println("veuillez saisir l'adresse ");
            adresse = LireClavier.next();
            System.out.println("donner le num de telephone");
            numtel = LireClavier.nextInt();  
             System.out.println("veuillez le num cin");
            cin = LireClavier.nextInt();
            System.out.println("donner le num passport  ");
            numpass = LireClavier.nextInt();
            System.out.println("donner la nationalite  ");
            nationalite = LireClavier.next();
            System.out.println("donner le mail  ");
            mail = LireClavier.next();
            System.out.println("tester l'id voyage  ");
            idvoy = LireClavier.nextInt();
            
            Connection cn =null;
    		Statement st =null;
    		int rs ;
            String url = "jdbc:mysql://localhost/agence de voiture";
    		String login = "root";
    		String passwd = "";
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
			// Etape 2 : recuperation de la connexion
			cn = (Connection) DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Creation d'un statement
			st = (Statement) ((java.sql.Connection) cn).createStatement();
			
			//requette pour ramener la fonction de l'emplyee :directeur ou agent
			
			// Etape 4 : execution requete
			String sql =  "INSERT INTO clients (Nom_prenom,Date_naissance,Adresse,Num_telephone,Num_cin,Num_passeport,Nationalite) VALUES (\"rjab mfatresh\",'2045-12-30',\"tunisia tunis manouba\",99999999,11111111,55555555,\"tunisien\")";
		//	rs = st.executeUpdate(sql);
			String select = "Select * from Accounts";


			
                }
                catch(SQLException e){
                   System.out.println("Cannot execute query");
                   e.printStackTrace();
                   System.exit(1);
                      }


    	
    }  //*******update
    public void Update() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/agence de vouyage";
    	String login = "root";
    	String passwd = "";
    	Connection cn =null;
    	java.sql.Statement st =null;
    	Class.forName("com.mysql.jdbc.Driver");
    	cn = (Connection) DriverManager.getConnection(url, login, passwd);
    	st = ((java.sql.Connection) cn).createStatement();
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