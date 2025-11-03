// TP2 03/11/2025 GAUTHIER Un convertisseur de températures : version classes

package tp2_convertisseurobjet_gauthier;

import java.util.Scanner;

/**
 *
 * @author emeka
 */
public class TP2_convertisseurObjet_GAUTHIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Convertisseur mesure = new Convertisseur() ;
    int conv;
    Scanner sc = new Scanner(System.in);
    
   //Interraction
   double var1 ;
   System.out.println("Veuiller saisir une valeur :");
   var1= sc.nextDouble(); 
   // Choix de conversion 
    System.out.println("Saisisser la conversion que vous souhaiter effectuer :"+"\n 1) De Celcius vers Kelvin"+"\n 2) De Kelvin vers Celcius"+"\n 3) De Farenheit vers Celcius"+"\n 4) De Celcius vers Farenheit"+"\n 5) De Kelvin vers Farenheit"+"\n 6) De Farenheit vers Kelvin");
        conv=sc.nextInt();
        if (conv==1){
            System.out.println("La valeur est Kelvin est de "+ mesure.CelciusVersKelvin(var1)+" Kelvin");
        }
        if (conv==2){
            System.out.println("La valeur est Celcius est de "+ mesure.KelvinVersCelcius(var1)+" Celcius");
        }
        if (conv==3){
            System.out.println("La valeur est Celcius est de "+ mesure.FarenheitVersCelcius(var1)+" Celcius");
        }
        if (conv==4){
            System.out.println("La valeur est Farenheit est de "+ mesure.CelciusVersFarenheit(var1)+" Farenheit");
        }
        if (conv==5){
            System.out.println("La valeur est Farenheit est de "+ mesure.KelvinVersFarenheit(var1)+" Farenheit");
        }
        if (conv==6){
            System.out.println("La valeur est Kelvin est de "+ mesure.FarenheitVersKelvin(var1)+" Kelvin");
        }
        if (conv>=7){
            System.out.println("Ce type de Convertion n'est pas proposé");
        }
    System.out.println(mesure);

    
    
    }
    
}
