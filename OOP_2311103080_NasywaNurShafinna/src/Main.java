/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Nasywa Nur Shafinna
 * 2311103080
 * S1SI-07-B
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Komputer komputerInfo = new Komputer(20, "Warnet Gaming Finnawaa", 10000.0f);
        System.out.println("=== INFORMASI WARNET GAMING FINNAWAA ===");
        komputerInfo.informasi();
        
        System.out.println("\n=== INFORMASI KOMPUTER VIP FINNAWAA ===");
        Komputer komputerVIPInfo = new Komputer(15, "Warnet Gaming Finnawaa", 15000.0f);
        komputerVIPInfo.informasi();
        
        System.out.println("\n===============================================");
        System.out.println("=== SELAMAT DATANG DI WARNET GAMING FINNAWAA ===");
        System.out.println("1. Komputer VIP");
        System.out.println("2. Komputer Premium");
        System.out.print("Pilih jenis komputer (1/2): ");
        
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 
        
        if (pilihan == 1) {
            System.out.print("Apakah Anda member VIP? (y/n): ");
            boolean isVIP = scanner.nextLine().equalsIgnoreCase("y");
            
            KomputerVIP vip = new KomputerVIP(15, "Warnet Gaming X", 15000.0f, isVIP);
            System.out.println("\n=== DETAIL LAYANAN VIP ===");
            vip.informasi();
            
            System.out.print("\nMasukkan username Anda: ");
            String username = scanner.nextLine();
            vip.login(username);
            
            System.out.print("Masukkan jumlah jam bermain: ");
            int jam = scanner.nextInt();
            
            System.out.print("Masukkan tambahan menit (0 jika tidak ada): ");
            int menit = scanner.nextInt();
            
            if (menit > 0) {
                vip.bermain(jam, menit);
            } else {
                vip.bermain(jam);
            }
            
        } else if (pilihan == 2) {
            System.out.print("Apakah Anda ingin ruang premium? (y/n): ");
            boolean isPremium = scanner.nextLine().equalsIgnoreCase("y");
            
            KomputerPremium premium = new KomputerPremium(5, "Warnet Gaming X", 25000.0f, isPremium);
            System.out.println("\n=== DETAIL LAYANAN PREMIUM ===");
            premium.informasi();
            
            System.out.print("\nPilih nomor komputer (1-50): ");
            int nomorKomputer = scanner.nextInt();
            scanner.nextLine(); 
            premium.pesan(nomorKomputer);
            
            System.out.print("Apakah Anda ingin pesan makanan? (y/n): ");
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                System.out.print("Masukkan pesanan makanan: ");
                String makanan = scanner.nextLine();
                
                System.out.print("Apakah Anda ingin pesan minuman? (y/n): ");
                if (scanner.nextLine().equalsIgnoreCase("y")) {
                    System.out.print("Masukkan pesanan minuman: ");
                    String minuman = scanner.nextLine();
                    premium.tambahLayanan(makanan, minuman);
                } else {
                    premium.tambahLayanan(makanan);
                }
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }
        
        scanner.close();
       
        System.out.println("\n=====================================");
        System.out.println("Terima kasih telah menggunakan layanan kami!");
        System.out.println("=====================================");
    }
}