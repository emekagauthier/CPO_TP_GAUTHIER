// 20/10/2025 tpo hello word afficher un message Emeka
package tp0_helloworld;


import java.util.Scanner;


/**
 *
 * @author emeka
 */
public class TP0_helloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour");
        System.out.println("En revoir");
        int i = 20;
        //partie 2

String prenom;
Scanner sc ;
sc = new Scanner (System.in) ;
System.out.println("Quel est votre prenom ?");
prenom = sc.nextLine(); 
System.out.println("Votre prenom est"+prenom);
    }
    
}
