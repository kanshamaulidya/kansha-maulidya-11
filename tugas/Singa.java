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
public class Singa extends Binatang implements IKarnivora{
    private final String suara;
    private final String warnaBulu;
    
    public Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Jenis : Karnivora");
        System.out.println("Makanan : Daging");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Nama Hewan : " +getNama());
        System.out.println("Jumlah Kaki : " +getKaki());
    }
    public void displayData(){
        System.out.println("Suara : "+this.suara);
        System.out.println("Warna Bulu : "+this.warnaBulu);
    }
}
