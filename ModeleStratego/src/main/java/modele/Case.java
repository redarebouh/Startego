package modele;

/**
 * Created by Axel on 04/11/2016.
 */
public class Case {
    private int x;
    private int y;
    private Piece unePiece;

    /*constructeur*/
    public Case(int x, int y, Piece unePiece) {
        this.x = x;
        this.y = y;
        this.unePiece = unePiece;
    }

    public Case(int x, int y) {
        this.x = x;
        this.y = y;
        this.unePiece = null;
    }

    /*getters&setters*/
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Piece getUnePiece() {
        return unePiece;
    }

    public void setUnePiece(Piece unePiece) {
        this.unePiece = unePiece;
    }

    /*méthode*/
    public boolean estOccupe(){
        if(this.unePiece != null)
            return true;
        else
            return false;
    }


}

