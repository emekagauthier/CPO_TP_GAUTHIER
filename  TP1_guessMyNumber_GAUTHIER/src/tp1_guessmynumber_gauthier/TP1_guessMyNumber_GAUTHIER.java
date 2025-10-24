//TP 1 GuessMyNumber Emeka GAUTHIER 24 / 10 /2025
package tp1_guessmynumber_gauthier;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emeka
 */
public class TP1_guessMyNumber_GAUTHIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random generateurAleat = new Random();
       int nb = 0 ;
       System.out.println("""
                          Quel difficulte (taper 1 , 2 ou 3 ): 
                          1)Facile ( nombre entre 0 et 50)
                          2)Normal ( nombre entre 0 et 100)
                          3)Difficile ( 10 tentative maximum et nomnbre entre 0 et 100)
                          """ );
       int diffi = sc.nextInt();
       
       if (diffi == 1){
           nb =generateurAleat.nextInt(50);
       }    
       else {
           nb =generateurAleat.nextInt(100);   
       } 
       
       
       
       
       int k = 1 ; //Compteur de tentative
       
       boolean name = true ;
       while(name == true){ // Debut Boucle
       
       if ( diffi == 3 && k==11){
           System.out.println("Vous avez echoue a deviner en 10 tentatives");
           name = false; 
       }
       else {
       System.out.println("Cela est votre "+ k + " tentatives" );
       System.out.println("Veuiller saisir un nombre ?");
       int var1 = sc.nextInt();
       
       if (var1>nb) {
           System.out.println("Trop Grand");
           k+=1;
           name = true;
       }
       if (var1<nb){
           System.out.println("Trop petit");
           k+=1;
           name = true;
       }
       if (var1==nb){
           System.out.print("Vous avez gagner au bout de "+k+" tentatives");
           name = false;
       } }
        } //FIN boucle
    }
    
}
