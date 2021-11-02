/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
    import java.util.Scanner;
/**
 *
 * @author ASUS t.hidayat
 */
public class PythagorasProject {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int menu;
        double miring, sisi;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("PILIHAN INPUT MENU");
        System.out.println("");
        System.out.println(">> 1 | Cek Triple Pythagoras            |");
        System.out.println(">> 2 | Menentukan Sisi Miring Segitiga  |");
        System.out.println(">> 3 | Menentukan Sisi Siku - Siku      |");
        System.out.println(">> 4 | Exit                             |");
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.print("Pilih nomer sesuai kebutuhan anda : ");
        menu = scanner.nextInt();
        
        switch(menu) {

            case (1) :
                System.out.print("Masukkan nilai sisi a : ");
                int sisiA = scanner.nextInt();
                System.out.print("Masukkan nilai sisi b : ");
                int sisiB = scanner.nextInt();
                System.out.print("Masukkan nilai sisi miring : ");
                int sisiMiring = scanner.nextInt();
                
                if(Math.pow(sisiA, 2) + Math.pow(sisiB, 2) == Math.pow(sisiMiring, 2)) {
                    System.out.println("Ketiga angka tersebut merupakan triple pythagoras");
                }
                else {
                    System.out.println("Ketiga angka tersebut bukan merupakan triple pythagoras");
                }
                break;
            
            case(2) :
                System.out.print("Masukkan nilai sisi a : ");
                sisiA = scanner.nextInt();
                System.out.print("Masukkan nilai sisi b : ");
                sisiB = scanner.nextInt();
                
                miring = Math.sqrt(Math.pow(sisiA, 2)+ Math.pow(sisiB, 2));
                System.out.println("Sisi miring dari segitiga tersebut adalah : " + miring);
                break;
                
            case(3) :
                System.out.print("Masukkan nilai sisi a / b : ");
                sisiA = scanner.nextInt();
                System.out.print("Masukkan nilai sisi miring : ");
                int sisiC = scanner.nextInt();
                
                sisi = Math.sqrt(Math.pow(sisiC, 2) - Math.pow(sisiA, 2));
                System.out.println("Sisi a / b dari segitiga tersebut adalah : " + sisi);
                break;
            
            case(4) :
                System.exit(0);
            
            default :
                System.out.println("Input anda tidak valid, silakan ulangi kembali");
        }
    }
}
