public class DateException extends Exception {

    private int NumMsg;

    public DateException(int a) {
        NumMsg = a;
    }

    public String toString() {
        String msg = "";
        switch (NumMsg) {
            case 1:
                msg = "jour invalide";
                break;
            case 2:
                msg = "mois invalide";
                break;
            case 3:
                msg = "annee invalide";
                break;
        }
        return msg;
    }
}