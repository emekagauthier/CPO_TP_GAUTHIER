/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author emeka
 */
public class Epee extends Arme {
    int finesse ;

    public Epee(int finesse, int niv_att, String nom_arme) {
        super(niv_att, nom_arme);
        if (finesse>=100) {
        this.finesse = 99;}
       else{
           this.finesse= finesse;
       }
       }
    public int getfinesse(){
        return finesse ;
    }
    
}
