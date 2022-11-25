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
public class Main {
    public static void main(String[] args){
        HewanKu hwn =new HewanKu();
        
        Kucing kc = new Kucing("Kucing");
        Ular ular = new Ular("Ular");
        
        hwn.makanDanGerak(kc);
        hwn.fisikDanSifat(kc);
        System.out.println();
        hwn.makanDanGerak(ular);
        
        //Screenshot pada tugas teori interface dengan yang ada disini sedikit berbeda,
        //perubahan kode program serta tambahan class saya lakukan setelah pengumpulan tugas.
        
    }
}
