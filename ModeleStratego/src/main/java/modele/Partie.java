package modele;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Axel on 08/11/2016.
 */
public class Partie {
    private int idPartie;
    private boolean publique;
    private Joueur joueurCreateur;
    private Joueur joueur2;
    private Plateau plateau;

    List<Joueur> observateurs = new ArrayList<Joueur>();

    /*constructeurs*/
    public Partie(int idPartie, boolean publique, Joueur unJoueurCreateur) {
        this.idPartie = idPartie;
        this.publique = publique;
        this.joueurCreateur = unJoueurCreateur;
        this.plateau = null;
        this.joueur2 = null;
        this.observateurs = null;
    }

    /*getters&setters*/
    public int getIdPartie() {
        return idPartie;
    }

    public void setIdPartie(int idPartie) {
        this.idPartie = idPartie;
    }

    public boolean isPublique() {
        return publique;
    }

    public void setPublique(boolean publique) {
        this.publique = publique;
    }

    public Joueur getJoueurCreateur() {
        return joueurCreateur;
    }

    public void setJoueurCreateur(Joueur joueurCreateur) {
        this.joueurCreateur = joueurCreateur;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public List<Joueur> getObservateurs() {
        return observateurs;
    }

    public void setObservateurs(List<Joueur> observateurs) {
        this.observateurs = observateurs;
    }

    /*methodes*/

}
