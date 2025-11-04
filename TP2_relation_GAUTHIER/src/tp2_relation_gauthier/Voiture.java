/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_gauthier;

/**
 *
 * @author emeka
 */
public class Voiture {
String modele;
String Marque;
int PuissanceCV ;
Personne Proprietaire;


public Voiture(String LeModele,String LaMarque,int LaPuissanceCV){
    modele = LeModele;
    Marque = LaMarque;
    PuissanceCV = LaPuissanceCV ;
    Proprietaire = null ;
}
@Override
public String toString () {
 return "Le modele du véhicule est "+ modele + " de la marque " + Marque+". Elle possede une puissance de "+ PuissanceCV + " Chevaux";
}
}
