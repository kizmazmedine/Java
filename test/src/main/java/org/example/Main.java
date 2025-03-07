package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // System.out.println(diziSiraliKontrol(int []dizi1), 0);
        System.out.println(basamakToplami(1234));


    }
    public static boolean diziSiraliKontrol (int [] p_diziİsmi, int sira) {
        if (sira == p_diziİsmi.length - 1) {
            return true;
        }
         if (p_diziİsmi[sira]>p_diziİsmi[sira+1]) {
             return false;
         }
         return diziSiraliKontrol(p_diziİsmi, sira+1);
    }

    public static int  basamakToplami ( int sayi){
        if (sayi==0) {
            return 0;
        }
        return (sayi %10 + basamakToplami(sayi/10));




          }


}