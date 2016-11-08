package modele;

/**
 * Created by Remy on 04/11/2016.
 */
public class Piece {

    private int identifiant;
    private TypePiece typePiece;
    private Joueur joueur;
    private Case uneCase;

    public Piece(int unIdentifiant, int unePuissance, Joueur unJoueur, Case uneCase){
        this.identifiant = unIdentifiant;
        this.typePiece = this.initTypePieceParPuissance(unePuissance);
        this.joueur = unJoueur;
        this.uneCase = uneCase;
    }

    public int getIdentifiant(){
        return identifiant;
    }
    public TypePiece getTypePiece(){
        return typePiece;
    }

    public TypePiece initTypePieceParPuissance(int unePuissance) {
        TypePiece choix = null;

        switch(unePuissance)
        {
            case 10: choix = TypePiece.MARECHAL; break;
            case 9: choix = TypePiece.GENERAL; break;
            case 8: choix = TypePiece.COLONELS; break;
            case 7: choix = TypePiece.COMMANDANTS; break;
            case 6: choix = TypePiece.CAPITAINES; break;
            case 5: choix = TypePiece.LIEUTENANTS; break;
            case 4: choix = TypePiece.SERGENTS; break;
            case 3: choix = TypePiece.DEMINEURS; break;
            case 2: choix = TypePiece.ECLAIREURS; break;
            case 1: choix = TypePiece.ESPION; break;
            case 0: choix = TypePiece.DRAPEAU; break;
            case -1:  choix = TypePiece.BOMBE; break;
        }

        return choix;
    }

    public void deplacement(int x, int y){
        this.joueur.partie.plateau.getCaseParCoord(x,y,this);
    }

}
