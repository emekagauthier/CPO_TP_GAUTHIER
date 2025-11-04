/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_gauthier;

/**
 *
 * @author emeka
 */
public class Personne {
String nom ;
String prenom ;
int nbVoitures ;
Voiture [] liste_voitures ;


public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        nbVoitures = 0 ;
        liste_voitures = new Voiture [3] ;

    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
    if (voiture_a_ajouter.Proprietaire != null){
        return false;
    }
    else if (this.nbVoitures == 3){
        return false;
    }
    else {
        this.liste_voitures[this.nbVoitures] = voiture_a_ajouter ;
        voiture_a_ajouter.Proprietaire = this ;
        return true ;
        
    }
}

}
