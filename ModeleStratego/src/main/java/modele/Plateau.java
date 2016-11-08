package modele;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Remy on 04/11/2016.
 */
public class Plateau {
    private Partie partie;

    private Case [][] plateauStratego;

    private static final int TAILLE = 10;



    /*constructeur*/
    public Plateau(Partie unePartie){

        this.partie = unePartie;
        plateauStratego = new Case[TAILLE][TAILLE];
    }
    /*getters&setters*/
    public Partie getPartie() {
        return partie;
    }

    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    public void setPlateauStratego(Case[][] plateauStratego) {
        this.plateauStratego = plateauStratego;
    }

    public Case[][] getPlateauStratego(){
        return this.plateauStratego;
    }

    public void getCaseParCoord(int x, int y,Piece unePiece){
        if (this.plateauStratego[x][y].estOccupe()) {

        }
        else {
            this.plateauStratego[x][y].setUnePiece(unePiece);
        }

    }
}