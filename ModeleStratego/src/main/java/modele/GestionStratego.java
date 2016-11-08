package modele;

import modele.exceptions.ExceptionLoginDejaPris;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Remy on 04/11/2016.
 */
public class GestionStratego implements GestionStrategoInterface {

    private Map<Joueur,Partie> logins;

    public GestionStratego() {
        this.logins = new HashMap<Joueur, Partie>();
    }

    @Override
    public void connexion(Joueur unJoueur) throws ExceptionLoginDejaPris {
        if (this.logins.containsKey(unJoueur)) {
            throw new ExceptionLoginDejaPris();
        }

        this.logins.put(unJoueur,null);
    }

    @Override
    public void deconnexion(Joueur unJoueur) {
        this.logins.remove(unJoueur);
    }
}
