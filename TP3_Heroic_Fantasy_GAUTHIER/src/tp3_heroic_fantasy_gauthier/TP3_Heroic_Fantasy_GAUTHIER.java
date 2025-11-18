
package tp3_heroic_fantasy_gauthier;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author emeka
 */
public class TP3_Heroic_Fantasy_GAUTHIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Création de 2 épées différentes
        Epee Durandal = new Epee(4,7,"Durandal");
        Epee Excalibur = new Epee(7,5,"Excalibur");
        
        //Création de 2 baton différents
        Baton Chêne = new Baton(4,5,"Chêne");
        Baton Charme = new Baton(5,6,"Charme");
        
        // Test pour vérifier que l'objet Durandal est bien crée
        //System.out.println(Chêne);
       
        //Creation d'un tableau dynamique
        ArrayList<Arme> lstArmes = new ArrayList<Arme>();
        lstArmes.add(Durandal);
        lstArmes.add(Excalibur);
        lstArmes.add(Chêne);
        lstArmes.add(Charme);
        // System.out.println(Armes.size());
        for(int i = 0 ; i<lstArmes.size(); i++ ) {
            System.out.println(lstArmes.get(i));
        }
        //Creation de 2 personnage magicien
       Magicien Gandalf = new Magicien (true , "Gandalf", 65);
       
        
        
        
        // TODO code application logic here
    }
    
}
