package sis;

import java.util.Scanner;

public class sistemParkir08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String jenis;
        int harga, durasi, totalDurasi, mobil, motor;
    
        mobil = 5000;
        motor = 3000;
        durasi = 60;

        System.out.print("Masukkan jenis kendaraan anda: ");
        jenis = sc.nextLine();
        mobil = 5000 * durasi;
        motor = 3000 * durasi;
        System.out.print("Masukkan durasi parkir anda: " + totalDurasi);
        totalDurasi = sc.nextInt() * durasi;
        System.out.print("Berikut total biaya yang harus dibayar: ");
        harga = totalDurasi;

        sc.close();


    }

}

