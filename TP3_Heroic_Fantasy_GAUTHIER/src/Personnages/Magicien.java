/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author emeka
 */
public class Magicien extends Personnage {
   boolean confirmer ;
   
    public Magicien(boolean confirmer, String nom, int niv_de_vie) {
        super(nom, niv_de_vie);
        this.confirmer = confirmer;
    }

    public void setConfirmer(boolean confirmer) {
        this.confirmer = confirmer;
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
