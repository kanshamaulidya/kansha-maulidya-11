/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;
import percobaan.ICumlaude;
import percobaan.Mahasiswa;
import percobaan.PascaSarjana;
import percobaan.Rektor;
import percobaan.Sarjana;
/**
 *
 * @author HP
 */
public class InterfaceMain {
    public static void main(String[] args){
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
        sarjanaCumlaude.kuliahDiKampus();
                
    }
}
