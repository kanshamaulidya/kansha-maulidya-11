/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[]args){
        
        Keledai keledai = new Keledai("Kedelai", 4, "Heheheheh", "Abu-Abu");
        keledai.displayMakan();
        keledai.displayBinatang();
        keledai.displayData();
        System.out.println();
        
        Gorila gorila = new Gorila("Gulali",4, "Haumm Haumm", "Hitam Manis");
        gorila.displayMakan();
        gorila.displayBinatang();
        gorila.displayData();
        System.out.println();
        
        Singa singa = new Singa("Cingacing", 4, "Roarrr Roarrr", "Coklat");
        singa.displayMakan();
        singa.displayBinatang();
        singa.displayData();
        
    }
}
