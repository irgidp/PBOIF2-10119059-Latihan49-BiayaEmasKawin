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
import java.util.Scanner;
public class PBOIF210119059Latihan49BiayaEmasKawin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahar mahar = new Mahar();
        
        System.out.println("=== Menghitung Harga Emas ====");
        System.out.print("Masukkan berat emas = ");
        mahar.setBerat(input.nextDouble());
        System.out.print("Masukkan harga emas bulan ini = ");
        mahar.setHarga(input.nextInt());
        System.out.println("Total Biaya = Rp" +mahar.totalHarga());
        
    }
    
}
