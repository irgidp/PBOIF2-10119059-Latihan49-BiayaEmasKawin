/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Biaya Emas Kawin
 */
package pboif2.pkg10119059.latihan49.biayaemaskawin;
/**
 *
 * @author Corazon
 */
public class Mahar {
    private double berat;
    private double harga;
    
    public double getBerat(){
        return berat;
    }
    
    public void setBerat(double berat){
        this.berat = berat;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public double totalHarga(){
        return getBerat() * getHarga();
    }
}
