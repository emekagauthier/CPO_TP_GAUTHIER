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
public class Baton extends Arme{
    int age ;

    public Baton(int age, int niv_att, String nom_arme) {
        super(niv_att, nom_arme);
       if (age>=100) {
        this.age = 99;}
       else{
           this.age= age;
       }
    }
    public int getage(){
        return age ;
    }
    
    
}
