/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nasywa Nur Shafinna
 * 2311103080
 * S1SI-07-B
 */
public class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;
    
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status          : " + (ruangPrivat ? "Ruangan Premium" : "Ruangan Standar"));
        
        if (ruangPrivat) {
            System.out.println("\nFasilitas Ruang Premium:");
            System.out.println("- Ruangan AC pribadi");
            System.out.println("- Sofa gaming exclusive");
            System.out.println("- Komputer spesifikasi tinggi");
            System.out.println("- Koneksi internet kuat hingga 100Mbps");
        } else {
            System.out.println("\nFasilitas Ruang Standar:");
            System.out.println("- Ruangan Tidak aada AC");
            System.out.println("- Kursi Standar");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet hanya 10Mbps");
        }
    }
    
    public void pesan(int nomorKomputer) {
        System.out.println("\nMemesan komputer nomor    : " + nomorKomputer);
    }
    
    public void tambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan  : " + makanan);
    }
    
    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan  : " + makanan + " dan minuman: " + minuman);
    }
}

