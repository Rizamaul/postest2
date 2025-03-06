import java.util.Scanner;

public class ManajemenKeuangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama:");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan usia:");
        int usiaInt = scanner.nextInt();
        double usia = (double) usiaInt; 
        
        System.out.print("Masukkan jumlah uang yang dimiliki:");
        double uangDouble = scanner.nextDouble();
        int uang = (int) uangDouble; 
        
        System.out.print("Masukkan rata-rata pengeluaran harian:");
        double pengeluaranHarian = scanner.nextDouble();
        
        double sisaUang30Hari = uang - (pengeluaranHarian * 30);
        double bulanBertahan = uang / (pengeluaranHarian * 30);
        
        String statusKeuangan;
        if (bulanBertahan < 1) {
            statusKeuangan = "PERINGATAN: Keuangan Anda kurang stabil!";
        } else if (bulanBertahan > 6) {
            statusKeuangan = "Keuangan Anda dalam kondisi aman.";
        } else {
            statusKeuangan = "Keuangan Anda dalam kondisi cukup.";
        }
        
        boolean lebihDari30 = usia > 30;
        boolean lebihDari30DanUangBanyak = (usia > 30) && (uang > 10_000_000);
        boolean kurangDari30AtauUangBanyak = (usia < 30) || (uang > 5_000_000);
        
        System.out.println("Apakah usia lebih dari 30?" + lebihDari30);
        System.out.println("Apakah usia > 30 dan uang > 10 juta?" + lebihDari30DanUangBanyak);
        System.out.println("Apakah usia < 30 atau uang > 5 juta?" + kurangDari30AtauUangBanyak);
        
        System.out.print("Masukkan jumlah hutang: ");
        double hutang = scanner.nextDouble();
        
        double hutangAbsolut = Math.abs(hutang);
        double pengeluaranDibulatkan = Math.ceil(pengeluaranHarian);
        
        System.out.println("\nLAPORAN KEUANGAN PRIBADI");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usiaInt + " tahun");
        System.out.println("Uang yang dimiliki: Rp" + uang);
        System.out.println("Pengeluaran harian rata-rata: Rp" + (int) pengeluaranHarian);
        System.out.println("Sisa uang dalam 30 hari: Rp" + (int) sisaUang30Hari);
        System.out.println("Estimasi bulan bertahan: " + String.format("%.1f", bulanBertahan) + " bulan");
        System.out.println("Status Keuangan: " + statusKeuangan);
        System.out.println("Nilai absolut dari hutang: Rp" + (int) hutangAbsolut);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp" + (int) pengeluaranDibulatkan);
        
        scanner.close();
    }
}
