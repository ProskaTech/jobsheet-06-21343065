/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js6prakpbo;

/**
 *
 * created by 21343065_PUTI ZAFANIA
 */

import javax.swing.JOptionPane;

public class Tugas1b {
public static void main(String[] args) {
    int angka1;
    int angka2;
    int angka3;

    angka1= Integer.parseInt (JOptionPane.showInputDialog("Masukkan Nilai 1:"));
    angka2= Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai 2:"));
    angka3= Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai 3:"));
    
    double hasil=(angka1+angka2+angka3)/3;
    
  
     if(hasil>=60)
     {
         JOptionPane.showMessageDialog(null,"Rata-Rata Anda Adalah \n"+ hasil +" :-)");
     }
     else
        {
            JOptionPane.showMessageDialog(null,"Rata-Rata Anda Adalah \n"+ hasil +" :-)");
            
            
        }
    }
}
