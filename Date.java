import java.util.*;

public class Date {

    private int jour;
    private int mois;
    private int annee;

    public void saisir_date() {
        Scanner LireClavier = new Scanner(System.in);
        System.out.println("donner le jour : ");
        jour = LireClavier.nextInt();
        System.out.println("donner le mois : ");
        mois = LireClavier.nextInt();
        System.out.println("donner l'annee: ");
        annee = LireClavier.nextInt();
        try {
            this.date_valide();
        } catch (DateException de) {
            System.out.println(de);
        } finally {
            this.date_aleatoire();
        }
    }

    public void date_aleatoire() {
        int j[] = new int[4];
        j[0] = 04;
        j[1] = 06;
        j[2] = 13;
        j[3] = 23;
        int m[] = new int[4];
        m[0] = 12;
        m[1] = 7;
        m[2] = 9;
        m[3] = 5;
        int a[] = new int[4];
        a[0] = 1985;
        a[1] = 1988;
        a[2] = 1977;
        a[3] = 1978;
        Random r = new Random();
        int i = Math.abs(r.nextInt() % 4);
        jour = j[i];
        mois = m[i];
        annee = a[i];
    }

    public void infos_date() {
        System.out.println("le jour est: " + jour);
        System.out.println("le mois est : " + mois);
        System.out.println("l'annee est : " + annee);
    }

    public boolean Bissextile() {
        if (((annee % 100 == 0) && (annee % 400 == 0)) || ((annee % 100 != 0) && (annee % 4 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    public int NbJour() {
        switch (mois) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (this.Bissextile()) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }

    public void date_valide() throws DateException {
        if (annee <= 0) {
            throw new DateException(3);
        }
        if ((mois <= 0) || (mois > 12)) {
            throw new DateException(2);
        }
        if ((jour <= 0) || (jour > this.NbJour())) {
            throw new DateException(1);
        }
    }}