package modele;

/**
 * Created by reda on 05/11/2016.
 */
public enum TypePiece {

    Maréchal("Maréchal",10,true),
    Général("Général",9,true),
    Colonels("Colonels",8,true),
    Commandants("Commandants",7,true),
    Capitaines("Capitaines",6,true),
    Lieutenants("Lieutenants",5,true),
    Sergents("Sergents",4,true),
    Démineurs("Démineurs",3,true),
    Éclaireurs("Éclaireurs",2,true),
    Espion("Espion",1,true),
    Drapeau("Drapeau",0,false),
    Bombe("Bombe",-1,false);


    private String name = "";
    private int puissance;
    private boolean mobilite;


    TypePiece(String unName, int unePuissance, boolean uneMobilite) {
        this.name = unName;
        this.puissance = unePuissance;
        this.mobilite = uneMobilite;
    }

    public String getName(){ return this.name; }
    public int getPuissance() {
        return this.puissance;
    }
    public boolean mobilite(){ return this.mobilite; }

}