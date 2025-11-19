
package tp3_heroic_fantasy_gauthier;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
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
        Epee Morgan = new Epee(9,8,"Morgan");
        
        
        
        //Création de 2 baton différents
        Baton Chêne = new Baton(4,5,"Chêne");
        Baton Charme = new Baton(5,6,"Charme");
        Baton Noir = new Baton(6,7,"Noir");
        
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
       //"Garcimore",44,novice. 
       Magicien Garcimore = new Magicien (false , "Garcimore", 44);
       //creation de 2 guerrier : "Conan", 78, à pied et "Lannister", 45, à cheval. 
       Guerrier Conan =  new Guerrier( false, "Conan",78);
       Guerrier Lannister =  new Guerrier( true , "Lannister",45);
       
       // Tableau dynamique contenant les personnages
       ArrayList<Personnage> lstpersos = new ArrayList<Personnage>();
        lstpersos.add(Gandalf);
        lstpersos.add(Garcimore);
        lstpersos.add(Conan);
        lstpersos.add(Lannister);
        
        for(int i = 0 ; i<lstpersos.size(); i++ ) {
            System.out.println(lstpersos.get(i));
        }
        // Ajouter 1 baton et 2  épée dans l'inventaire d'un guerrier
        Conan.getArmes(Chêne);
        Conan.getArmes(Excalibur);
        Conan.getArmes(Durandal);
        Conan.chooseArme(Excalibur);
       // System.out.println(Conan);
        
        //Pour le magicien
        Gandalf.getArmes(Charme);
        Gandalf.getArmes(Noir);
        Gandalf.getArmes(Morgan);
        int nbarmesprefbaton = 0 ;
        for (int i = 0 ; i< 5 ; i++){
            if ( Gandalf.recuparmeinventaire(i) instanceof Baton ){
                nbarmesprefbaton+=1 ;
        }
        System.out.println("le nombre de baton dans l'aventaire du magicien est de " + nbarmesprefbaton ) ;
        
        
        // TODO code application logic here
    }
    
}
}
