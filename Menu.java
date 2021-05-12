public class Menu {

    public static void Principale() {
        System.out.println("                     ______Le menu______");
        System.out.println("         (1).gestion du clients. \n \t (2).gestion   des   vols.");
        System.out.println("         (3).gestion des avions. ");
        System.out.println("         0.quitter le programme.");
        System.out.println("____________________________________________________________________________");
    }




    public static void client() {
        System.out.println("____________________________________________________________________________");
        System.out.println("			[le menu:client]");
        System.out.println("1.ajouter un client");
        System.out.println("2.supprimer ");
        System.out.println("3.description sur un client");
        System.out.println("4.afficher les client");
        System.out.println("5.update");
        System.out.println("0.sortie");

        System.out.println("____________________________________________________________________________");
    }

    public static void vols() {
        System.out.println("____________________________________________________________________________");
        System.out.println("     [gestion des vols ]");
        System.out.println("1.declarer et initialiser des voyages");
        System.out.println("2.supprimer une voyage");
        System.out.println("3.afficher le voyage");
        System.out.println("4.disponibilites des places");
        System.out.println("5.update");
        System.out.println("0.quitter");
        System.out.println("*****veuillez saisir votre choix*****    ");
        System.out.println("____________________________________________________________________________");
    }

  

    public static void Avion() {
        System.out.println("____________________________________________________________________________");
        System.out.println("        [Le menu:gestion des avions]");
        System.out.println("1.ajouter un avion ");
        System.out.println("2.supprimer un avion");
        System.out.println("3.afficher les avions");
        System.out.println("4.afficher un avion");
        System.out.println("5.update ");
        System.out.println("0.quitter");
        System.out.println("*****veuillez saisir votre choix*****    ");
        System.out.println("____________________________________________________________________________");
    }
    public static void update() {
        System.out.println("____________________________________________________________________________");
        System.out.println("                 [Le menu:update]");
        System.out.println("1.champs1");
        System.out.println("2.champs2");
        System.out.println("3.champs3");
        System.out.println("4.champs4");
        System.out.println("5.champs5");
        System.out.println("6.champs6");
        System.out.println("7.champs7");
        System.out.println("0.quitter");
        System.out.println("**veuillez saisir votre choix**");
        System.out.println("____________________________________________________________________________");
    }    
}