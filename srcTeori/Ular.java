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
public class Ular extends Hewan implements IHewanHidup{
    public Ular(String nama){
        super(nama);
    }
    @Override
    public void makan(){
        System.out.println("Ular makan Daging");
    }
    @Override
    public void bergerak(){
        System.out.println("Ular bergerak dengan merayap");
    }
    
}
