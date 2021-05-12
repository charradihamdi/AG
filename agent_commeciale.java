
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;
/**
 * @author wwmm
 *
 */
public class agent_commeciale {
    static int Id;
    String Nom;
    String Prenom;
    String Login;
    String Pass;
    String infagent;
    public agent_commeciale(int Id, String Nom, String Prenom, String Login, String Pass, String infagent) {
        this.Id = Id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Login = Login;
        this.Pass = Pass;
        this.infagent = infagent;
        
    }
   



public static String infagent(int id) {
        int id1 = 0;
        String nom = null;
        String prenom="null";
        String login="";
        String pass="";
        agent_commeciale agent_commmeciale = null;
		String infag=agent_commmeciale.infagent(id1);
        StringTokenizer strk = new StringTokenizer(infag, " ");
         while (strk.hasMoreTokens()) { 
             id1 = Integer.parseInt(strk.nextToken());
             String post = strk.nextToken();
         }
 
      // Information d'acces e la base de donnees

         String url = "jdbc:mysql://http://localhost/phpmyadmin/db_structure.php?server=1&db=voyage";
        login = "root";
         String passwd = "";
         Connection cn =null;
         Statement st =null;
         ResultSet rs =null;     
         
         try {//db access
          // Etape 1 : Chargement du driver

             Class.forName("com.mysql.jdbc.Driver");
             // Etape 2 : recuperation de la connexion
             cn = DriverManager.getConnection(url, login, passwd);
             // Etape 3 : Creation d'un statement
             st = cn.createStatement();
             // Etape 4 : execution requete

             rs = st.executeQuery("SELECT * FROM agent commerciale WHERE Id = "+Id);
             String nomp = null;
			// Si recup donnees alors etapes 5 (parcours Resultset)
             while (rs.next()) {
                 nomp= rs.getString("nomPrenom");
                 login= rs.getString("login");
                 pass  = rs.getString("pass");
             }//while
             String formationValid = null;
			System.out.println("L'agent "+nomp+" dont l'id "+id1+" au poste de "+nom+" demande une "
                     + "formation en "+ prenom + " et qui a ete valide :"+formationValid);
         }
         catch (SQLException e) {e.printStackTrace();} //erreur sql
         catch (ClassNotFoundException e) {e.printStackTrace();} //erreur l'or du chargement du driver

         finally {
             try {// Etape 6 : liberer ressources de la memoire.
                 cn.close();
                 st.close();}
             catch (SQLException e) {e.printStackTrace();}
         }
		return passwd;      
     }
 }//class

