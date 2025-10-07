//package CB2; //Ini hapus aja klo kalian error, soalnya aku bikin di folder CB2
import java.util.Scanner;

public class BuahCB{
    static Scanner in = new Scanner(System.in);

    static String daftar[] = {"Salak","Mangga","Apel","Jambu","Kecubung"};
    static  int[][] data = {
            {12, 10000},  
            {13, 12000},  
            {14, 15000},  
            {15, 16000},
            {99, 50000}   
        };
    public static void main(String[] args) {
        String lanjut = "Y";

        while (lanjut.equalsIgnoreCase("Y")) {
            System.out.println("------------------------------------------");
            System.out.println("============ TOKO BUAHAHAHAHA ============");
            System.out.println("------------------------------------------");
            System.out.println("1. Daftar Buah");
            System.out.println("2. Update Stok Setelah Pembelian");
            System.out.println("3. Stok Minimum");
            System.out.println("------------------------------------------");
            System.out.print("Pilihan : ");
            int pilih = in.nextInt();

            if (pilih == 1) {
                System.out.println("-------------- Daftar Buah ---------------");
                System.out.printf("%-10s %-12s %s\n", "Jenis", "Sisa(kg)", "Per Kilo");
                tampilkanDaftar();
                System.out.println("------------------------------------------");

            } else if (pilih == 2){
                System.out.println("-------------- Update Stok ---------------");
                kurangiStok(); 
                System.out.println("------------------------------------------");

            } else if (pilih == 3) {
                System.out.println("-------------- Darurat Stok --------------");
                cariTerkecil();
                System.out.println("------------------------------------------");

            } else {
                System.out.println("Pilihan tidak valid");

            }

            in.nextLine();
            System.out.print("Ada lagi (Y/N): ");
            lanjut = in.nextLine();
        }
        System.out.println("-------------- Toko Tutup ----------------");
    }

    static void tampilkanDaftar(){
       for (int i = 0; i < daftar.length; i++) {
            System.out.printf("%-10s %-12d Rp. %,d\n", daftar[i], data[i][0], data[i][1]);
        }
    }

    static void kurangiStok(){ // "Ini bebas mau dibuat cuma void atau mau mengembalikan nilai"
        in.nextLine();
        System.out.print("Nama Buah : ");
        String buah = in.nextLine();
        System.out.print("Jumlah Perubahan Stok : ");
        int ubah = in.nextInt();
        boolean ditemukan = false;
        System.out.println("------------------------------------------");

        for (int i=0; i < daftar.length; i++){
            if (buah.equalsIgnoreCase(daftar[i])){
                data[i][0] += ubah;
                ditemukan = true;
                System.out.println("UPDATE STOK BERHASIL!!!!!!!");
                System.out.printf("Stok buah %s menjadi %d\n", daftar[i], data[i][0]);
            }
            
        }
        
        if (ditemukan == false) System.out.printf("Buah %s Tidak Ditemukan!!!\n", buah);
            
        
    }

    static void cariTerkecil(){ // "Ini bebas mau dibuat cuma void atau mau mengembalikan nilai"

        // ISI LOGIKA CARI TERKECIL
    }
}
