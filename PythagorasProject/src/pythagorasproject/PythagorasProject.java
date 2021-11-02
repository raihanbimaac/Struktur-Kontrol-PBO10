/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;
/**
 *
 * @author TOSHIBA
 */
public class PythagorasProject {
    public static void main (String[]args) {
        int menu;
        double hipotenusa, sisi;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("+====================== Menu ======================+");
        System.out.println("| 1 | Cek Triple Pythagoras                        |");
        System.out.println("| 2 | Menentukan Sisi Miring Segitiga              |");
        System.out.println("| 3 | Menentukan Sisi Siku - Siku Segitiga                 |");
        System.out.println("| 4 | Exit                                         |");
        System.out.println("+==================================================+\n");
        System.out.print("Piihan anda : ");
        menu = scanner.nextInt();
        
        switch(menu) {
            case (1) :
                System.out.print("Masukkan nilai sisi a : ");
                int sisi1 = scanner.nextInt();
                System.out.print("Masukkan nilai sisi b : ");
                int sisi2 = scanner.nextInt();
                System.out.print("Masukkan nilai sisi miring : ");
                int sisiMiring = scanner.nextInt();
                
                if(Math.pow(sisi1, 2) + Math.pow(sisi2, 2) == Math.pow(sisiMiring, 2)) {
                    System.out.println("Ketiga nilai tersebut membentuk triple pythagoras");
                }
                else {
                    System.out.println("Ketiga nilai tersebut tidak membentuk triple pythagoras");
                }
                
                break;
            
            case(2) :
                System.out.print("Masukkan nilai sisi a : ");
                sisi1 = scanner.nextInt();
                System.out.print("Masukkan nilai sisi b : ");
                sisi2 = scanner.nextInt();
                
                hipotenusa = Math.sqrt(Math.pow(sisi1, 2)+ Math.pow(sisi2, 2));
                
                System.out.println("Nilai sisi c / miring dari segitiga tersebut adalah : " + hipotenusa);
                
                break;
                
            case(3) :
                System.out.print("Masukkan nilai sisi a / b : ");
                sisi1 = scanner.nextInt();
                System.out.print("Masukkan nilai sisi miringnya : ");
                int sisi3 = scanner.nextInt();
                
                sisi = Math.sqrt(Math.pow(sisi3, 2) - Math.pow(sisi1, 2));
                
                System.out.println("Nilai sisi lainnya dari segitiga tersebut yaitu " + sisi);
                
                break;
            
            case(4) :
                System.exit(0);
            
            default :
                System.out.println("Output anda tak terdefinisi, mohon ulangi");
        }
    }    
}
