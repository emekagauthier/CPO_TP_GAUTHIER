/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_gauthier;

/**
 *
 * @author emeka
 */
public class Convertisseur {
 int nbConversions  ; 
public Convertisseur () {
 nbConversions = 0 ;
}


//methode de conversion 
public double CelciusVersKelvin (double tCelcius) {
tCelcius+=273.15;
nbConversions +=1;
    return tCelcius;
}
public double KelvinVersCelcius (double tKelvin) {
tKelvin-=273.15;
nbConversions +=1;
    return tKelvin;
}
public double FarenheitVersCelcius (double tFarenheit) {
tFarenheit=((tFarenheit-32)*5)/9;
nbConversions +=1;
    return tFarenheit;
}
public double CelciusVersFarenheit(double tCelcius) {
tCelcius=((tCelcius*9)/5)+32;
nbConversions +=1;
    return tCelcius;
}

public double KelvinVersFarenheit(double tKelvin) {
tKelvin=KelvinVersCelcius(tKelvin);
tKelvin=CelciusVersFarenheit(tKelvin);
    return tKelvin;
}
public double FarenheitVersKelvin(double tFarenheit) {
tFarenheit=FarenheitVersCelcius(tFarenheit);
tFarenheit=CelciusVersKelvin(tFarenheit);
    return tFarenheit;
}
 
@Override
public String toString () {
 return "nb de conversions "+ nbConversions;
}
}
