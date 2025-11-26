/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emeka
 */
public class Question {
private String intitule;
private String proposition1;
private String proposition2;
private String proposition3;
private String proposition4;
private int indexBonneReponse;

public Question(String intitule, String p1, String p2, String p3, String p4, int indexBonneReponse) {
    this.intitule = intitule ;
    proposition1 = p1;
    proposition2 = p2;
    proposition3 = p3;
    proposition4 = p4;
    this.indexBonneReponse = indexBonneReponse ;
    
    
    
 // TODO
}
public String getQ1 (){
    return proposition1 ;
}
public String getQ2 (){
    return proposition2 ;
}
public String getQ3 (){
    return proposition3 ;
}
public String getQ4 (){
    return proposition4 ;
}
public String getInti (){
    return intitule  ;
}
public int reponse(){
    return indexBonneReponse  ;
}
/*public String VouF(int choix){
    if (choix == indexBonneReponse){
        return "Bonne reponse" ;
    }
    else {
        return "C'est une mauvaise reponse" ;
        
    }*/
    
    
}




   
