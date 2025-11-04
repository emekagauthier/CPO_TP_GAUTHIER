/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_gauthier;

/**
 *
 * @author emeka
 */
public class TP2_manip_GAUTHIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Tartiflette assiette1 = new Tartiflette(500);
    Tartiflette assiette2 = new Tartiflette(600);
    Tartiflette assiette3 = assiette2 ;
    //Constater que assiette 2 et assiette 3 sont les meme
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
    //inverser Tartiflette 1 et 2
    assiette2 = assiette1 ; 
    assiette1 = assiette3 ;
    
    //Aucun des ligne suivant ne sont correcte
    //Moussaka assiette666 = assiette1 ;
    //Moussaka assiette667 = new Tartiflette() ;
    // il n'est pas possible de référencer un type d'objet ci l'objet n'a aucun rapport avec la reférence
    
    Moussaka tab[] = new Moussaka[10];
    for (int i =0 ; i!=10 ; i++){
        tab[i] = new Moussaka(i*100);  // création de 10 objets designer danx chaque case
    }
    
    
   

    }
    
}
