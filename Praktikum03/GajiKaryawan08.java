package Praktikum03;
import java.util.Scanner; 
public class GajiKaryawan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahJamKerja, upahPerJam;
        double gajiSebelumPajak, pajak, bonusDariGaji;
        upahPerJam = 20000;

        System.out.print("Masukkan jumlah waktu kerja anda: ");
        jumlahJamKerja = sc.nextInt();
        gajiSebelumPajak = jumlahJamKerja * upahPerJam;
        System.out.println("Berikut ini total gaji kotor anda: " + gajiSebelumPajak);
        bonusDariGaji = gajiSebelumPajak * 0.1 + gajiSebelumPajak;
        System.out.println("Berikut ini total gaji kotor + bonus: " + bonusDariGaji);
        pajak = bonusDariGaji - 0.5 * bonusDariGaji;
        System.out.println("Berikut ini total gaji bersih anda: " + pajak);

        sc.close();

        
    }
    
}
