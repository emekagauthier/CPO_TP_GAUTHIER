//GAUTHIER 22 /10/2025 TP1  Un convertisseur de températures
 
package tp1_convertisseur_gauthier;

import java.util.Scanner;

/**
 *
 * @author emeka
 */
public class TP1_convertisseur_GAUTHIER {

    /**
     * @param args the command line arguments
     */
public static double CelciusVersKelvin (double tCelcius) {
tCelcius+=273.15;
    return tCelcius;
}
public static double KelvinVersCelcius (double tKelvin) {
tKelvin-=273.15;
    return tKelvin;
}
public static double FarenheitVersCelcius (double tFarenheit) {
tFarenheit=((tFarenheit-32)*5)/9;
    return tFarenheit;
}
public static double CelciusVersFarenheit(double tCelcius) {
tCelcius=((tCelcius*9)/5)+32;
    return tCelcius;
}

public static double KelvinVersFarenheit(double tKelvin) {
tKelvin=KelvinVersCelcius(tKelvin);
tKelvin=CelciusVersFarenheit(tKelvin);
    return tKelvin;
}
public static double FarenheitVersKelvin(double tFarenheit) {
tFarenheit=FarenheitVersCelcius(tFarenheit);
tFarenheit=CelciusVersKelvin(tFarenheit);
    return tFarenheit;
}



    public static void main(String[] args) {
        //Variables
        double var1=0.0; // Degrée celsus
        int conv=0; // conversion choisie
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        //Interraction 
        System.out.println("Veuiller saisir une valeur :");
        var1= sc.nextDouble();
        
        //Proposition des Types de Convertions
        System.out.println("Saisisser la conversion que vous souhaiter effectuer :"+"\n 1) De Celcius vers Kelvin"+"\n 2) De Kelvin vers Celcius"+"\n 3) De Farenheit vers Celcius"+"\n 4) De Celcius vers Farenheit"+"\n 5) De Kelvin vers Farenheit"+"\n 6) De Farenheit vers Kelvin");
        conv=sc.nextInt();
        if (conv==1){
            System.out.println("La valeur est Kelvin est de "+CelciusVersKelvin (var1)+" Kelvin");
        }
        if (conv==2){
            System.out.println("La valeur est Celcius est de "+ KelvinVersCelcius(var1)+" Celcius");
        }
        if (conv==3){
            System.out.println("La valeur est Celcius est de "+ FarenheitVersCelcius(var1)+" Celcius");
        }
        if (conv==4){
            System.out.println("La valeur est Farenheit est de "+ CelciusVersFarenheit(var1)+" Farenheit");
        }
        if (conv==5){
            System.out.println("La valeur est Farenheit est de "+ KelvinVersFarenheit(var1)+" Farenheit");
        }
        if (conv==6){
            System.out.println("La valeur est Kelvin est de "+ FarenheitVersKelvin(var1)+" Kelvin");
        }
        if (conv>=7){
            System.out.println("Ce type de Convertion n'est pas proposé");
        }
            
    }
    
    
}
