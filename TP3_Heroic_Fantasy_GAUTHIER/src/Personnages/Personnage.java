/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author emeka
 */
public abstract class Personnage {
//Attribut
String nom ;
int niv_de_vie;

ArrayList<Arme> inventaire = new ArrayList<Arme>();
Arme Arme_en_Main = null ;


    public Personnage(String nom, int niv_de_vie) {
        this.nom = nom;
        this.niv_de_vie = niv_de_vie;
    }
    public void getArmes(Arme newarme){
        if (inventaire.size()==5){
            
        }else{
            inventaire.add(newarme);
        }  
    }

    public Arme getArmeenMain() {
        return Arme_en_Main;
    }
    
    public String chooseArme(Arme nomarme){
        boolean verif ;
        verif = this.inventaire.contains(nomarme);
        if (verif == true){
            this.Arme_en_Main = nomarme;
            return "L'arme a été trouvé dans l'inventaire et affecter au personnage" ;
        }
        else{
            return "L'arme demandé n'est pas possédepar le personnage";
        }
        
    }
    public Arme recuparmeinventaire(int position){
        return this.inventaire.get(position); 
    }
    public int sizeinventaire(){
        return this.inventaire.size();
    }
    
    /*@Override
    public String toString() {
        if(this.Arme_en_Main != null){
         return "L'aventurier se nomme " + nom + " et il a actuellement: "+ niv_de_vie +" de HP" + ". l'arme que le personnage a dans ses mains est : " + Arme_en_Main;   
        }
        else{
            return "L'aventurier se nomme " + nom + " et il a actuellement: "+ niv_de_vie +" de HP" + ". Le personnage n'a pas d'arme dans ces mains ";
        }
        
    }*/

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", niv_de_vie=" + niv_de_vie + ", inventaire=" + inventaire + ", Arme_en_Main=" + Arme_en_Main + '}';
    }

}
