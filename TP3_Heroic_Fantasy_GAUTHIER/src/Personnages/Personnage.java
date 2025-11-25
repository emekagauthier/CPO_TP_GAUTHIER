/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;
import tp3_heroic_fantasy_gauthier.EtreVivant;

/**
 *
 * @author emeka
 */
public abstract class Personnage implements EtreVivant {
//Attribut
String nom ;
int niv_de_vie;
static int nb_personnage = 0 ;
static int nb_magiciens = 0 ;
static int nb_guerrier = 0 ;

ArrayList<Personnage> lstPersonnages = new ArrayList<Personnage>();
ArrayList<Arme> inventaire = new ArrayList<Arme>();
Arme Arme_en_Main = null ;


    public Personnage(String nom, int niv_de_vie) {
        this.nom = nom;
        this.niv_de_vie = niv_de_vie;
        nb_personnage+=1 ;
       
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
    public static int   nbperso(){
        return nb_personnage ;
    }
    
    public void finalize(String type ){
        nb_personnage-=1;
        if (type == "Magicien"){
            nb_magiciens-=1 ;
        }
        else {
            nb_guerrier -= 1 ;
        }
    }
        @Override
        public void seFatiguer() {
        niv_de_vie -= 10; }
        
        @Override
        public boolean estVivant() {
        return niv_de_vie > 0;
                        }
        @Override
        public void estAttaqué(int points) {
        niv_de_vie -= points;
        }



        
    
    
    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", niv_de_vie=" + niv_de_vie + ", inventaire=" + inventaire + ", Arme_en_Main=" + Arme_en_Main + '}';
    }
    

}
