/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author programmer
 */
public class PBO11K10118907Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\033[31mYUK \033[32mCEK \033[33mKEPRIBADIANMU \033[36mDARI \033[35mWARNA \033[34mFAVORITMU");
        System.out.println("\n\u001B[41m\033[37m        MERAH         ");
        System.out.println("\u001B[42m\033[37m        HIJAU         ");
        System.out.println("\u001B[43m\033[37m        KUNING        ");
        System.out.println("\u001B[44m\033[37m        BIRU          ");
        System.out.println("\u001B[45m\033[37m        UNGU          ");
        
        System.out.print("Pilih warna favoritmu : " );
        Scanner scanner = new Scanner(System.in);
        String warna = scanner.next();
        
        System.out.print("Nama kamu : " );
        Scanner scanner2 = new Scanner(System.in);
        String nama = scanner2.next();
        
        Kepribadian k = new Kepribadian();
        
        k.setWarnaAndNama(warna, nama);
        k.cek();
    }
    
}
