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
    int âge ;

    public Epee(int âge, int niv_att, String nom_arme) {
        super(niv_att, nom_arme);
        if (âge>=100) {
        this.âge = 99;}
       else{
           this.âge= âge;
       }
       }
    
}
