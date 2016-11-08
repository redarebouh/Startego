package modele;

/**
 * Created by reda on 05/11/2016.
 */
public enum TypePiece {

    MARECHAL("Maréchal",10,true),
    GENERAL("Général",9,true),
    COLONELS("Colonels",8,true),
    COMMANDANTS("Commandants",7,true),
    CAPITAINES("Capitaines",6,true),
    LIEUTENANTS("Lieutenants",5,true),
    SERGENTS("Sergents",4,true),
    DEMINEURS("Démineurs",3,true),
    ECLAIREURS("Éclaireurs",2,true),
    ESPION("Espion",1,true),
    DRAPEAU("Drapeau",0,false),
    BOMBE("Bombe",-1,false);


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