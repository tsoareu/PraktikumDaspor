package Praktikum05;

import java.util.Scanner;

public class PemilihanHariDenganIf08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nomor; 
        String namaHari;

        System.out.println("Input number: ");
        nomor = sc.nextInt();

        switch (nomor) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                namaHari = "Weekday";
            break;
            case 6 :
            case 7 :
                namaHari = "Weekend";
                break;
            default:
                namaHari = "invalid number";
        }
    
        System.out.println(nomor + " is a " + namaHari);
        sc.close();
    
    
    }
    
}

