/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_gauthier;

/**
 *
 * @author emeka
 */
public class Baton extends Arme{
    int indice ;

    public Baton(int indice, int niv_att, String nom_arme) {
        super(niv_att, nom_arme);
       if (indice>=100) {
        this.indice = 99;}
       else{
           this.indice= indice;
       }
    }
    
    
}
