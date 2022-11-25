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
public class Kucing extends Hewan implements IHewanHidup, IHewanLucu {
    public Kucing(String nama){
        super(nama);
    }
    @Override
    public void makan(){
        System.out.println("Kucing makan ikan pindang");
    }
    @Override
    public void bergerak(){
        System.out.println("Kucing bergerak dengan berjalan");
    }
    @Override
    public void fisik(){
        System.out.println("Fisiknya Berbulu");
    }
    @Override
    public void sifat(){
        System.out.println("Kucing memiliki sifat yang lucu");
    }
}
