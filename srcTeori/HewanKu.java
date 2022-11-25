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
public class HewanKu {
    public void makanDanGerak(Hewan hewan){
        System.out.println("HEWAN YANG SAYA CARI");
        
        hewan.infoHewan();
        hewan.makan();
        hewan.bergerak();
    }
    public void fisikDanSifat(IHewanLucu lucu){
        lucu.fisik();
        lucu.sifat();
    }
}
