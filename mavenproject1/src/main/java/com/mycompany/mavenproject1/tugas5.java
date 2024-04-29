/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author A-24
 */
public class tugas5 {
    public static void main(String[] args) {
        char huruf;
        boolean isMasihBelajar;
        int nilaiUjian;
        double hargaBarang;
        float diskon;
        byte umur;
        short kodePos;
        long populasiNegara;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan huruf: ");
        huruf = scanner.next().charAt(0);
        System.out.println("Apakah Anda masih belajar (true/false): ");
        isMasihBelajar = scanner.nextBoolean();
        System.out.println("Masukkan nilai ujian (int): ");
        nilaiUjian = scanner.nextInt();
        System.out.println("Masukkan harga barang (double): ");
        hargaBarang = scanner.nextDouble();
        System.out.println("Masukkan diskon (float): ");
        diskon = scanner.nextFloat();
        System.out.println("Masukkan umur (byte): ");
        umur = scanner.nextByte();
        System.out.println("Masukkan kode pos (short): ");
        kodePos = scanner.nextShort();
        System.out.println("Masukkan populasi negara (long): ");
        populasiNegara = scanner.nextLong();
        System.out.println("\nData yang Anda masukkan:");
        System.out.println("Huruf: " + huruf);
        System.out.println("Masih belajar: " + isMasihBelajar);
        System.out.println("Nilai ujian: " + nilaiUjian);
        System.out.println("Harga barang: " + hargaBarang);
        System.out.println("Diskon: " + diskon);
        System.out.println("Umur: " + umur);
        System.out.println("Kode pos: " + kodePos);
        System.out.println("Populasi negara: " + populasiNegara);
    }
}
