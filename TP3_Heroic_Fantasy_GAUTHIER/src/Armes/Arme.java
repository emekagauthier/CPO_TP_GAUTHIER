
package Armes;

/**
 *
 * @author emeka
 */
public abstract class Arme {
    int niv_att;
    String nom_arme;

    public Arme(int niv_att, String nom_arme) {
        if (niv_att>100){
        this.niv_att =100;}
        else{
        this.niv_att = niv_att;
        }
        this.nom_arme = nom_arme;
    }
    public int nivattaque(){
        return this.niv_att ;
    }
    

    @Override
    public String toString() {
        return "l'Arme possède un niveau d'attaque " + niv_att + " et l'arme se nomme " + nom_arme ;
    }
  
    
}
