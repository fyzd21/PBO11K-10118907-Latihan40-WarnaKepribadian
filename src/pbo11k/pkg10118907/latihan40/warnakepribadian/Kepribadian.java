/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan40.warnakepribadian;

/**
 *
 * @author programmer
 */
public class Kepribadian {
    private String warna, nama, hasil;
    
    public void setWarnaAndNama(String warna, String nama) {
        this.warna = warna;
        this.nama = nama;
    }
    
    public void cek() {
        if(warna.toLowerCase().equals("biru")) {
            hasil = "1. Menyenangkan,\n2. Bijaksana,\n3. Pembawaan diri tenang saat menghadapi masalah";
        }
        
        System.out.println("Hasil test kepribadian "+nama.toUpperCase());
        System.out.println("Warna favoritmu adalah : "+warna);
        System.out.println(hasil);
        
    }
}
