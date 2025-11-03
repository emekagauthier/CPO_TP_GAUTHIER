/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_gauthier;

/**
 *
 * @author emeka
 */
public class TP2_Bieres_GAUTHIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson") ;
    uneBiere.ouverte = false;
    uneBiere.Décapsuler();
    System.out.println(uneBiere);
    
    BouteilleBiere secondBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe " );
    secondBiere.ouverte = false;
    secondBiere.Décapsuler();
    System.out.println(secondBiere);
    
    BouteilleBiere troisBiere = new BouteilleBiere("Sa frappe", 12 ,"Macon " );
    troisBiere.ouverte = true;
    troisBiere.Décapsuler();
    System.out.println(troisBiere);
    
    BouteilleBiere quatreBiere = new BouteilleBiere("cherie", 20 ," Dijon " );
    quatreBiere.ouverte = true;
    quatreBiere.Décapsuler();
    System.out.println(quatreBiere);
    
    BouteilleBiere cinqBiere = new BouteilleBiere("Fruit rouge", 20 ," Russie" );
    cinqBiere.ouverte = false;
    cinqBiere.Décapsuler();
    System.out.println(cinqBiere);
    
    }
    
}
