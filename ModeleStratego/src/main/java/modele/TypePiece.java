package modele;

/**
 * Created by Remy on 04/11/2016.
 */
public enum TypePiece {

    MOBILE("mobile"),
    NONMOBILE("non mobile");

    private String name = "";

    TypePiece(String unNom){
        this.name = unNom;
    }

    public String getName(){
        return this.name;
    }
}
