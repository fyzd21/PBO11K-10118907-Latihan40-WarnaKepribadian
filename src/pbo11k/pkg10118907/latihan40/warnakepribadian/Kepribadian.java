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
            hasil = "1. Menyenangkan,\n2. Bijaksana,\n3. Pembawaan diri tenang saat menghadapi masalah,\n4. Dinamis,\n5. Senang berbagi,\n6. Bersahabat,\n7. Tidak terlalu suka menjadi sorotan banyak orang,\n8. Menyembunyikan perasaan karena sifatnya yang cenderung mencari jalan damai";
        } else if(warna.toLowerCase().equals("merah")) {
            hasil = "1. Periang,\n2. Pemberani,\n3. Berani mengambil risiko dalam setiap langkah,\n4. Menyukai tantangan, \n5. Kurang sabar,\n6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,\n7. Memiliki energi kehangatan dan cinta";
        } else if(warna.toLowerCase().equals("kuning")) {
            hasil = "1. Optimis,\n2. Suka bergaul,\n3. Periang";
        } else if(warna.toLowerCase().equals("ungu")) {
            hasil = "1. Optimis,\n2. Tidak pernah ragu,\n3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat";
        } else if(warna.toLowerCase().equals("hijau")) {
            hasil = "1. Romantis,\n2. Menyukai hal yang berbau alami dan keindahan,\n3. Teguh pada prinsip";
        } else {
            hasil = "Oops, belum teridentifikasi";
        }
        
        System.out.println("Hasil test kepribadian "+nama.toUpperCase());
        System.out.println("Warna favoritmu adalah : "+warna);
        System.out.println(hasil);
        
    }
}
