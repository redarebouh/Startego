package modele;

/**
 * Created by reda on 05/11/2016.
 */
public enum Puissance {

    Maréchal("Maréchal"),
    Général("Général"),
    Commandants("Commandants"),
    Colonels("Colonels "),
    Capitaines("Capitaines"),
    Lieutenants("Lieutenants"),
    Démineurs("Démineurs"),
    Éclaireurs("Éclaireurs"),
    Espion("Espion "),
    Drapeau("Drapeau "),
    Sergents("Sergents ");
    private String puissance = "";

    Puissance(String puissance) {
        this.puissance = puissance;
    }

    public String getPuissance() {
        return this.puissance;
    }

    public int toInt() {
        int a = 0;
        if (this.puissance.equals("Maréchal")) a = 10;
        if (this.puissance.equals("Général")) a = 9;
        if (this.puissance.equals("Colonels")) a = 8;
        if (this.puissance.equals("Commandants")) a = 7;
        if (this.puissance.equals("Capitaines")) a = 6;
        if (this.puissance.equals("Lieutenants")) a = 5;
        if (this.puissance.equals("Sergents")) a = 4;
        if (this.puissance.equals("Demineurs")) a = 3;
        if (this.puissance.equals("Éclaireurs")) a = 2;
        if (this.puissance.equals("Espion")) a = 1;
        if (this.puissance.equals("Drapeau")) a = 0;

        return a;
    }
}