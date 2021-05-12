import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Main {

	


	    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        int choix = 1;
	        int numero = 0;
	    	Directeur dr = new Directeur();
			avion avion = new avion();
			client client= new client();
			Vol vol = new Vol();
	        Scanner LireClavier = new Scanner(System.in);
	//menu principale
	        do {
	            Menu.Principale();
	  
	                        switch (choix = LireClavier.nextInt()) {
	                            case 1:
	                                do {
	                                  Menu.client();
	                                    switch (choix = LireClavier.nextInt()) {
	                                        case 1: ;break;
	                                        case 2: break;
	                                        case 3:dr.delete("clients");
	                                            break;
	                                        case 4: break;
	                                        case 5:client.Update();; break;
	                                        case 0:
	                                            System.out.println("aurevoir");
	                                            break;
	                                        default:
	                                            System.out.println("choix incorrecte");
	                                    }
	                                } while (choix != 0);
	                                break;

	                //menu de gestion des vols													
	                case 2:
	                    do {
	                        Menu.vols();
	                        switch (choix = LireClavier.nextInt()) {
	                            case 1:break;
	                            case 2 :break;
	                            case 3: System.out.println("donner le numero de cette voyage: ");
	                            dr.display("vol");   
	                            break;
	                            case 4: System.out.println("les voyages disponibles sont: ");
	                            	break;
	                            case 5:vol.Update(); break;
	                            case 0:
	                                System.out.println("aurevoir");
	                                break;
	                            default:
	                                System.out.println("choix incorrecte");
	                        }
	                    } while (choix != 0);
	                    break;
	                	case 3: 			
	                		do {
	                                    Menu.Avion();
	                                    switch (choix = LireClavier.nextInt()) {
	                                    case 1: avion.saisir();  break;//add avion;break;
	                                    case 2:   break;//remove;break;
	                                    case 3: dr.display("Avion");  break;//affich tous;break;
	                                    case 4:   break;//affiche un avio;break;
	                                    case 5:avion.Update();; break;
	                                        case 0:
	                                            System.out.println("aurevoir");
	                                            break;
	                                        default:
	                                            System.out.println("choix incorrecte");
	                                    }
	                                } while (choix != 0);
	                                break;
	                            case 0:
	                                System.out.println("Aurevoir");
	                                break;
	                            default:
	                                System.out.println("choix incorrecte");
	                        }
	   
	                    System.exit(0);
	                    break;
	      
	        } while (choix != 0);
	    

	
	}

}
