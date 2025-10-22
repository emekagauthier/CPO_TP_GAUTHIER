/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_gauthier;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author emeka
 */
public class TP1_manipNombresInt_GAUTHIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables 
        int nb1=0;
        int nb2=0 ;
        double som=0;
        double multi=0;
        double soust=0;
        double divis=0.0;
        double rest=0 ;
        
       //Interraction avec utilisateur
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuiller entrer un premier nombre ");
        nb1=sc.nextInt();
        System.out.println("Veuiller entrer un deuxieme nombre ");
        nb2=sc.nextInt();
        
        // Calcul Somme de nb1 et nb2
        som=nb1 + nb2 ;
        System.out.println("La somme de "+ nb1 +" et "+nb2+" est de "+som);        
        multi= nb1 * nb2 ;
        // Calcul produit entre nb1 et nb2
        System.out.println("Le produit entre "+ nb1 +" et "+nb2+" est de "+multi);
        // Calcul soustration entre nb1 et nb2
        soust= nb1 - nb2;
        System.out.println("La difference de "+ nb1 +" et "+nb2+" est de "+soust);
        
        //Afficher le quotient entier
        divis=nb1/nb2;
        System.out.println("Le quotient enter est "+divis);
        
        //Afficher le reste
        rest= nb1 % nb2 ;
        System.out.println("Le reste de la division euclidienne est "+rest);
               
    }
    
}
