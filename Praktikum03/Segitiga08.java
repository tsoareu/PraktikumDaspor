package Praktikum03;

import java.util.Scanner;

public class Segitiga08 {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);

        sc.close();

    }
}
