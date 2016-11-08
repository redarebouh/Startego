package modele;

/**
 * Created by Remy on 04/11/2016.
 */
public class Joueur {

    private String pseudo;
    private Piece[] listePieces;
    private Partie partie;

    public Joueur(String pseudo, Partie unePartie){

        this.pseudo = pseudo;
        this.listePieces = new Piece[40];
        this.partie = Partie unePartie;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Piece[] getListePieces() {
        return listePieces;
    }

    public void setListePieces(Piece[] listePieces) {
        this.listePieces = listePieces;
    }
}
