/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js6prakpbo;

/**
 *
 * created by 21343065_PUTI ZAFANIA
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas2b {
     public static void main(String[] args){
        BufferedReader dataIn =new BufferedReader (new InputStreamReader (System.in));

        String angka="";

    System.out.println("Masukkan angka dari 1-10");

try {
    angka = dataIn.readLine();
}
catch
(IOException e){
    System.out.println("invalid number!");
}

    int i = Integer.parseInt(angka);

switch(i){
case 1:
    System.out.println("satu");
break;
case 2:
    System.out.println("dua");
break;
case 3:
    System.out.println("tiga");
break;
case 4:
    System.out.println("empat");
break;
case 5:
    System.out.println("lima");
break;
case 6:
    System.out.println("enam");
break;
case 7:
    System.out.println("tujuh");
break;
case 8:
    System.out.println("delapan");
break;
case 9:
    System.out.println("sembilan");
break;
case 10:
    System.out.println("sepuluh");
break;
default:
    System.out.println("invalid number!");

}

}

}
