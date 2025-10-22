// 20/10/2025 tpo calculette Emeka
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author emeka
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Please enter the operator:"+"\n1) add"+"\n2) substract"+"\n3) multiply"+"\n4) divide"+"\n5) modulo");
    int operateur;
    Scanner sc = new Scanner(System.in);
    operateur = sc.nextInt();
    if (operateur>5 || operateur<1){
        System.out.println("Erreur");
    }
    else { 
    System.out.println("Donner moi une premier valeur");
    int operande1;
    operande1 = sc.nextInt();
    
    System.out.println("Donner moi une deuxieme valeur");
    int operande2;
    operande2 = sc.nextInt();
    
// calcul pour afficher le resultat    
    if (operateur==1) {
        int result;
        result=operande1 + operande2 ;
        System.out.println("Le resultat est"+result);
    }
    if (operateur==2) {
        int result;
        result=operande1 - operande2 ;
        System.out.println("Le resultat est"+result);
    }
    if (operateur==3) {
        int result;
        result=operande1 * operande2 ;
        System.out.println("Le resultat est"+result);
    }
    if (operateur==4) {
        int result;
        //Attention prendre le cas ou operande2 est egale a 0
        if (operande2==0){
            System.out.println("On ne peut pas diviser par 0");
        }
        else {
        result=operande1 / operande2 ;
        System.out.println("Le resultat est"+result);
        }
    }
            
    if (operateur==5) {
        double result;
        result=operande1 % operande2 ;
        System.out.println("Le resultat est"+result);
    }
        }
    
    }
    
}
