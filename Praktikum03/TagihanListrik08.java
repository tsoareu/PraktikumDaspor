package Praktikum03;

import java.util.Scanner;

public class TagihanListrik08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int penggunaanListrik, tarifListrik, totalPenggunaan, batasPenggunaan, totalTarifListrik;

        tarifListrik = 1500;
        batasPenggunaan = 500;
        
        System.out.print("Masukkan jumlah penggunaan listrik anda (kWh): ");
        penggunaanListrik = sc.nextInt();

        totalTarifListrik = tarifListrik * penggunaanListrik;
        System.out.println("Total tarif listrik yang harus anda bayar: " + totalTarifListrik);

        System.out.print("Apakah penggunaan listrik lebih dari 500 kWh?:" + (batasPenggunaan < penggunaanListrik));

        sc.close();

        
        
        

        

        

    }
    
}
