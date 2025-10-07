package CB2; //Ini hapus aja klo kalian error, soalnya aku bikin di folder CB2
import java.util.Scanner;

public class BuahCB{
    static Scanner in = new Scanner(System.in);

    static String daftar[] = {"Salak","Mangga","Apel","Jambu"};
    static  int[][] data = {
            {12, 10000},  
            {13, 12000},  
            {14, 15000},  
            {15, 16000}   
        };
    public static void main(String[] args) {
        String lanjut = "Y";

        while (lanjut.equalsIgnoreCase("Y")) {
            System.out.println("===== TOKO BUAH BAHAGIA =====");
            System.out.println("1. Daftar Buah");
            System.out.println("2. Update Stok Setelah Pembelian");
            System.out.println("3. Stok Minimum");
            System.out.println("-----------------------------");
            System.out.print("Pilihan: ");
            int pilih = in.nextInt();

            if (pilih == 1) {
                System.out.println("-------- Daftar Buah --------");
                System.out.println("Jenis \t Sisa(kg) \t Per Kilo");
                tampilkanDaftar();
                System.out.println("-----------------------------");

            } else if (pilih == 2){
                System.out.println("-------- Update Stok --------");
                kurangiStok(); 
                System.out.println("-----------------------------");

            } else if (pilih == 3) {
                System.out.println("------- Darurat Stok -------");
                cariTerkecil();
                System.out.println("-----------------------------");

            } else {
                System.out.println("Pilihan tidak valid");

            }

            in.nextLine();
            System.out.print("Ada lagi (Y/N): ");
            lanjut = in.nextLine();
        }

        System.out.println("----------- Toko Tutup ------------");
    }

    static void tampilkanDaftar(){
       for (int i = 0; i < daftar.length; i++) {
            System.out.println(daftar[i] + "\t " + data[i][0] + " \t\t " + data[i][1]);
        }
    }

    static void kurangiStok(){ // "Ini bebas mau dibuat cuma void atau mau mengembalikan nilai"

        // ISI LOGIKA PENGURANGAN STOK
    }

    static void cariTerkecil(){ // "Ini bebas mau dibuat cuma void atau mau mengembalikan nilai"

        // ISI LOGIKA CARI TERKECIL
    }
}
