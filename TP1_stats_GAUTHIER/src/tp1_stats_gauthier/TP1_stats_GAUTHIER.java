//TP 1 Statistiques  Emeka GAUTHIER 24 / 10 /2025
package tp1_stats_gauthier;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emeka
 */
public class TP1_stats_GAUTHIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random generateurAleat = new Random();
    double tableint[]= new double[6];   // Crea un tableau de 6 case 
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Veuiller saisir un nombre entier");
    int m = sc.nextInt();
    
    for(int i=0 ; i<m ; i++){ //Complete le tableau de valeur
        int var= generateurAleat.nextInt(5);
        tableint[var]+=1;
        
    }
    for(int j=0 ; j<6 ; j++){ //Transforme les valeur du tableau en pourcentage
        tableint[j]=(tableint[j]/m)*(100);
        
    }
    for(int j=0 ; j<6 ; j++){ //Afficher le tableau Final
        int ligne= j+1;
        System.out.println("La valeur de la cellule "+ ligne +" est "+tableint[j]+" % ");
    }
    }
    
}
