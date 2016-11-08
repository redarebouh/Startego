package modele;

import modele.exceptions.ExceptionLoginDejaPris;

/**
 * Created by Remy on 04/11/2016.
 */
public interface GestionStrategoInterface {
    /**
     * Permet de savoir si la connexion est possible pour un objet Joueur
     * @param unJoueur
     * @throws ExceptionLoginDejaPris si la connexion n'est pas possible
     */
    public void connexion(Joueur unJoueur) throws ExceptionLoginDejaPris;


    /**
     * Supprime le l'objet Joueur des joueurs connectés
     * @param unJoueur : Joueur souhaitant une déconnexion
     */
    void deconnexion(Joueur unJoueur);

    /**
     * Permet d'obtenir le plateau du joueur pseudo
     * @return
     */
    Partie getPartie(String pseudo);

}
