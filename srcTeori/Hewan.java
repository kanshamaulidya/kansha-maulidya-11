/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcTeori;

/**
 *
 * @author HP
 */
public class Hewan {
    protected String nama;
    
    public Hewan(String nama){
        this.nama=nama;
        
    }
    public void infoHewan(){
        System.out.println("Nama Hewan : " +this.nama);
    }

    void makan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void bergerak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
