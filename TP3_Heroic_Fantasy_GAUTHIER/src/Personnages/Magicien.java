/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;

/**
 *
 * @author emeka
 */
public class Magicien extends Personnage {
   boolean confirmer ;
   
    public Magicien(boolean confirmer, String nom, int niv_de_vie) {
        super(nom, niv_de_vie);
        this.confirmer = confirmer;
        nb_magiciens +=1 ;
    }

    public void setConfirmer(boolean confirmer) {
        this.confirmer = confirmer;
    }
    
    public static int nbmagiciens(){
        return nb_magiciens ;
    }
    @Override
    public void attaquer(Personnage cible) {
        int nivattque ;
        Arme equipement = cible.getArmeenMain() ;
        nivattque = equipement.nivattaque();
        
        if (equipement instanceof Baton) {
            nivattque *= ((Baton) equipement).getage(); 
        /* Posser des question sur cette notation donnée par chatgpt
            Elle me permet de confirmer equipement en tant qu baton et de d'aller cherché dans la classe fille Baton son age */
        }
        this.seFatiguer();
        if (confirmer) {
            nivattque /= 2;
        }
        
        cible.estAttaqué(nivattque); 
    }


    @Override
    public String toString() {
        String r = super.toString();
        if ( this.confirmer == true ){
           return r + "Magicien{" + "confirmer : " + "OUI" + '}'; 
        }
        else{
            return r + "Magicien{" + "confirmer : " + "NON" + '}'; 
        }
        
    }
    
    
   
}
