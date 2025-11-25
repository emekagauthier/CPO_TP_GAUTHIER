/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author emeka
 */
public class Guerrier extends Personnage{
    boolean cheval ;

    public Guerrier(boolean cheval, String nom, int niv_de_vie) {
        super(nom, niv_de_vie);
        this.cheval = cheval;
        nb_guerrier+=1 ;
    }

    

    public void setConfirmer(boolean cheval) {
        this.cheval = cheval;
    }
    
    public static int nbguerriers(){
        return nb_guerrier;
    }
    
    @Override
    public String toString() {
        String r = super.toString();
        if ( this.cheval == true ){
           return r + "Guerrier{" + "Cheval : " + "OUI" + '}'; 
        }
        else{
            return r+" Guerrier{" + "Cheval : " + "NON" + '}'; 
        }
        
    }
    
}
