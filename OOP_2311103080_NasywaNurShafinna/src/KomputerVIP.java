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
class KomputerVIP extends Komputer {
    protected boolean vipCard;
    
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status          : " + (vipCard ? "Member VIP" : "Non VIP"));
        
        System.out.print("\nBenefit Member VIP: ");
        if (vipCard) {
            System.out.println();
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming");
        } else {
            System.out.println("Maaf, Anda tidak bisa mendapatkan benefit");
        }
    }
    
    public void login(String username) {
        System.out.println("\nLogin dengan username: " + username);
    }
    
    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
    }
    
    public void bermain(int jam, int menitTambahan) {
        System.out.println("Nambah billing selama " + jam + " jam " + menitTambahan + " menit");
    }
}