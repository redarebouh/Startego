package modele;

/**
 * Created by Remy on 04/11/2016.
 */
public class Piece {

    private int identifiant;
    private int puissance;

    public enum TypeMobilite {
        MOBILE,
        NONMOBILE;
    }

    private TypeMobilite unType;

    public Piece(int unIdentifiant,int unePuissance, TypeMobilite unType){
        this.identifiant = unIdentifiant;
        this.puissance = unePuissance;
        this.TypeMobilite = unType
    }
}
