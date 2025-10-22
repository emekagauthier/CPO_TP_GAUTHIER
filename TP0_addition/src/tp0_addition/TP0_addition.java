// 20/10/2025 tpo addition Emeka
package tp0_addition;

import java.util.Scanner;

/**
 *
 * @author emeka
 */
public class TP0_addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int nb; // nombre d'entiers à additionner
int result; // resultat
int ind; //indice
Scanner sc = new Scanner(System.in);
// initialisation
System.out.println("Quel est le nombre d'entiers a additionner :");
nb=sc.nextInt();
result=0;
// addition des nb premiers entiers
ind=1;
while (ind< nb) {
 result=result+ind;
 ind++;
}
// affichage du resultat
System.out.println("la somme des "+ nb + "entiers est:"+result); 
    }
    
}
