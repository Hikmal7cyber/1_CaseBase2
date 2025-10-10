import java.util.Scanner;

public class BuahCB2 {
    static Scanner in = new Scanner(System.in);

    static String daftar[] = {"Salak", "Mangga", "Apel", "Jambu", "Kecubung"};
    static int[][] data = {
        {12, 10000},
        {13, 12000},
        {14, 15000},
        {15, 16000},
        {99, 50000}
    };

    public static void main(String[] args) {
        String lanjut = "Y";

        while (lanjut.equalsIgnoreCase("Y")) {
            tampilkanMenu(); 
            System.out.print("Pilihan : ");
            int pilih = in.nextInt();

            if (pilih == 1) {
                System.out.println("-------------- Daftar Buah ---------------");
                System.out.printf("%-10s %-12s %s\n", "Jenis", "Sisa(kg)", "Per Kilo");
                tampilkanDaftar();
                System.out.println("------------------------------------------");

            } else if (pilih == 2) {
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

    static void tampilkanMenu() {
        System.out.println("------------------------------------------");
        System.out.println("============ TOKO BUAHAHAHAHA ============");
        System.out.println("------------------------------------------");
        System.out.println("1. Daftar Buah");
        System.out.println("2. Update Stok Setelah Pembelian");
        System.out.println("3. Stok Minimum");
        System.out.println("------------------------------------------");
    }

    static void tampilkanDaftar() {
        for (int i = 0; i < daftar.length; i++) {
            System.out.printf("%-10s %-12d Rp. %,d\n", daftar[i], data[i][0], data[i][1]);
        }
    }

    static void kurangiStok() {
        in.nextLine();
        System.out.print("Nama Buah : ");
        String buah = in.nextLine();
        System.out.print("Jumlah Perubahan Stok (+ atau -): ");
        int ubah = in.nextInt();
        System.out.println("------------------------------------------");

  
        int index = cariIndexBuah(buah);
        if (index != -1) {
            data[index][0] += ubah;
            System.out.println("UPDATE STOK BERHASIL!");
            System.out.printf("Stok buah %s sekarang: %d kg\n", daftar[index], data[index][0]);
        } else {
            System.out.printf("Buah %s Tidak Ditemukan!\n", buah);
        }
    }

   
    static int cariIndexBuah(String buah) {
        for (int i = 0; i < daftar.length; i++) {
            if (buah.equalsIgnoreCase(daftar[i])) {
                return i; 
            }
        }
        return -1; 
    }

    static void cariTerkecil() {
        int min = data[0][0];
        String namaBuah = daftar[0];
        for (int i = 1; i < daftar.length; i++) {
            if (data[i][0] < min) {
                min = data[i][0];
                namaBuah = daftar[i];
            }
        }
        System.out.printf("Stok paling sedikit: %s (%d kg)\n", namaBuah, min);
    }
}
