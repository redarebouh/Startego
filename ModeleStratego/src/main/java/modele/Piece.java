package modele;

/**
 * Created by Remy on 04/11/2016.
 */
public class Piece {

    private int identifiant;
    private int puissance;
    private TypePiece typePiece;

    public Piece(int unIdentifiant,int unePuissance){
        this.identifiant = unIdentifiant;
        this.puissance = unePuissance;

        if(estMobile(unePuissance))
            this.typePiece = TypePiece.MOBILE;
        else
            this.typePiece = TypePiece.NONMOBILE;
    }

    public boolean estMobile(int unePuissance)
    {
        boolean vReturn;

        /* TODO : Rejouter une exception */
        if(unePuissance == 0 || unePuissance == 11){
            vReturn = false;
        }
        else{
            vReturn = true;
        }

        return vReturn;
    }
}
