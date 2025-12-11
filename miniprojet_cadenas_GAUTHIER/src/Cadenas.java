/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emeka
 */
public class Cadenas {
    int[] tab = new int[4];
    int[] tab_soluce = new int [4];
    int nb_tentative;
    

    public Cadenas(int val_case1, int val_case2, int val_case3, int val_case4) {
       tab[0] = val_case1;
       tab[1] = val_case2;
       tab[2] = val_case3;
       tab[3] = val_case4;
       /*for (int i = 0; i<4 ; i++){
           tab_soluce[i]= (int) (Math.random() * 10);
       }*/
       tab_soluce[0] = 1;
       tab_soluce[1] = 2;
       tab_soluce[2] = 3;
       tab_soluce[3] = 4;
       
       
    }
    public int getval_case(int nb){
        return tab[nb];
    }
    public void upval_case(int nb){
        if (tab[nb]==9){
            tab[nb]=9;}
    else{
            tab[nb]+=1;
    } }
    public void downval_case(int nb){
        if (tab[nb]==0){
            tab[nb]=0;}
    else{
            tab[nb]-=1;
    } }
    public int getval_soluce(int nb){
        return tab_soluce[nb];
    }
     public int nb_tentative(){
        return nb_tentative+=1;
    }
    
    public int[] tester(){
        int[] resultat_test = new int [4];
        for(int i =0 ; i<4 ; i++){
            if (tab[i]==tab_soluce[i]){
                resultat_test[0]+=1;
            }
            if (tab[i]>tab_soluce[i]){
                resultat_test[1]+=1;
            }
            if (tab[i]<tab_soluce[i]){
                resultat_test[2]+=1;
            }
            
        }
        resultat_test[3]=nb_tentative();
        return resultat_test ;  
    }
                
      
    }
    

