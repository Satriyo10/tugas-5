/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author A-24
 */
public class TipeData {

    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 5;

        int hasilJumlah = angka1 + angka2;
        int hasilKurang = angka1 - angka2;
        int hasilKali = angka1 * angka2;
        int hasilBagi = angka1 / angka2;
        int hasilSisa = angka1 % angka2;
        boolean sama = angka1 == angka2;
        boolean tidakSama = angka1 != angka2;
        boolean kurangDari = angka1 < angka2;
        boolean lebihDari = angka1 > angka2;
        boolean kurangDariSama = angka1 <= angka2;
        boolean lebihDariSama = angka1 >= angka2;
        boolean andHasil = (angka1 > 0) && (angka2 > 0);
        boolean orHasil = (angka1 == 0) || (angka2 == 0);
        boolean notHasil = !sama;

        int total = 0;
        total += angka1;
        total -= angka2;
        total *= 2;
        total /= 3;
        total %= 2;
        int counter = 0;
        counter++;
        counter--;
        int nilaiTerbesar = angka1 > angka2 ? angka1 : angka2;
        System.out.println("Hasil jumlah: " + hasilJumlah);
        System.out.println("Hasil kurang: " + hasilKurang);
        System.out.println("Hasil kali: " + hasilKali);
        System.out.println("Hasil bagi: " + hasilBagi);
        System.out.println("Hasil sisa: " + hasilSisa);
        System.out.println("Sama: " + sama);
        System.out.println("Tidak sama: " + tidakSama);
        System.out.println("Kurang dari: " + kurangDari);
        System.out.println("Lebih dari: " + lebihDari);
        System.out.println("Kurang dari sama: " + kurangDariSama);
        System.out.println("Lebih dari sama: " + lebihDariSama);
        System.out.println("AND: " + andHasil);
        System.out.println("OR: " + orHasil);
        System.out.println("NOT: " + notHasil);
        System.out.println("Total: " + total);
        System.out.println("Counter: " + counter);
        System.out.println("Nilai terbesar: " + nilaiTerbesar);
    }
}
