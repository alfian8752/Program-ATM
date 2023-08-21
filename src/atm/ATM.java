/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author Alfian
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    static Scanner in = new Scanner(System.in);

    private static void printMenu() {
        System.out.println("1. Cek Saldo"
                + "\n2. Tarik Tunai"
                + "\n3. Setor Tunai"
                + "\n4. Transfer"
                + "\n0. Keluar"
        );
        System.out.print("Pilihan: ");
    }

    public static void main(String[] args) {
        System.out.println("=== Program Simulasi ATM");

        int pilihan, saldo = 50000, nominal = 0;

        while (true) {
            nominal = 0;
            printMenu();
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("\nSaldo Anda: " + saldo + "\n");
                    continue;
                case 2:
                    System.out.print("\nMasukkan jumlah penarikan yang anda inginkan(dalam kelipatan 50rb)  (inputkan 0 untuk batal)\nRp. ");
                    nominal = in.nextInt();
                    if (nominal % 50000 != 0) {
                        System.out.println("\nMaaf nominal bukan kelipatan 50rb");
                        continue;
                    } else if (saldo - nominal <= 50000) {
                        System.out.println("\nMaaf tidak bisa menarik saldo\nHarus menyisakan Rp. 50000 dalam saldo");
                        continue;
                    } else if (saldo == 50000) {
                        System.out.println("\nMaaf tidak bisa menarik\nHarus menyisakan Rp. 50000 dalam saldo");
                        continue;
                    } else if (nominal == 0) {
                        continue;
                    }
                    saldo -= nominal;
                    System.out.println("Rp. " + nominal + " telah ditarik dari saldo anda");
                    continue;
                case 3:
                    System.out.print("\nMasukkan jumlah setor yang anda inginkan(dalam kelipatan 50rb)  (inputkan 0 untuk batal)\nRp. ");
                    nominal = in.nextInt();
                    if (nominal % 50000 != 0) {
                        System.out.println("\nMaaf nominal bukan kelipatan 50rb");
                        continue;
                    }
                    saldo -= nominal;
                    System.out.println("Rp. " + nominal + " telah ditarik dari saldo anda");
                    continue;
                case 4:
                    System.out.print("\nMasukkan jumlah penarikan yang anda inginkan(dalam kelipatan 50rb)  (inputkan 0 untuk batal)\nRp. ");
                    nominal = in.nextInt();
                    if (nominal % 50000 != 0) {
                        System.out.println("\nMaaf nominal bukan kelipatan 50rb");
                        continue;
                    } else if (saldo - nominal <= 50000) {
                        System.out.println("\nMaaf tidak bisa menarik saldo\nHarus menyisakan Rp. 50000 dalam saldo");
                        continue;
                    } else if (saldo == 50000) {
                        System.out.println("\nMaaf tidak bisa menarik\nHarus menyisakan Rp. 50000 dalam saldo");
                        continue;
                    } else if (nominal == 0) {
                        continue;
                    }
                    saldo -= nominal;
                    System.out.println("Rp. " + nominal + " telah ditarik dari saldo anda");
                    continue;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

        }

    }

}
