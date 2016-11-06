package modele;

import modele.exceptions.ExceptionPieceNonMobile;

/**
 * Created by Remy on 04/11/2016.
 */
public class Piece {

    private int identifiant;
    private Puissance puissance;
    private TypePiece typePiece;

    public Piece(int unIdentifiant,Puissance unePuissance) throws ExceptionPieceNonMobile {
        this.identifiant = unIdentifiant;
        this.puissance = unePuissance;

        if(estMobile(unePuissance))
            this.typePiece = TypePiece.MOBILE;
        else
            this.typePiece = TypePiece.NONMOBILE;
    }

    public boolean estMobile(Puissance unePuissance) throws ExceptionPieceNonMobile
    {
        boolean vReturn;

        /* TODO : Rejouter une exception */
        if(unePuissance.toInt() == 0 || unePuissance.toInt() == 11){
            vReturn = false;
            throw new ExceptionPieceNonMobile();
        }
        else{
            vReturn = true;
        }

        return vReturn;
    }
    public TypePiece getTypePiece(){
        return typePiece;
    }
    public int getIdentifiant(){
        return identifiant;
    }
}
