/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangkaproject;
    import java.util.Scanner;
/**
 *
 * @author ASUS t.hidayat
 */
public class TebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int angkaRandom = 0 + (int)(Math.random() * 100);
        
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        System.out.println("");
        System.out.print("Masukkan Angka tebakan anda : ");
        int angkaTebakan = scanner.nextInt();
        
        while(angkaTebakan != angkaRandom) {
            if(angkaTebakan > angkaRandom) {
                System.out.println("Hehehe maaf mas/mba… Bilangan tebakan anda terlalu besar");
            }
            else{
                System.out.println("Hehehe maaf mas/mba… Bilangan tebakan anda terlalu kecil");
            }
            
            System.out.print("Masukkan Angka tebakan anda : ");
            angkaTebakan = scanner.nextInt();
        }
        System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
    }
}
