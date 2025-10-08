import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventaris inventaris = new Inventaris();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Edit Barang");
            System.out.println("3. Hapus Barang");
            System.out.println("4. Cari Barang");
            System.out.println("5. Lihat Daftar Barang");
            System.out.println("6. Tampilkan Barang Mudah Rusak");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah barang yang akan ditambahkan: ");
                    int jumlahBarang = scanner.nextInt();
                    scanner.nextLine(); 
                    for (int i = 0; i < jumlahBarang; i++) {
                        System.out.println("Tambah Barang ke-" + (i + 1) + ":");
                        tambahBarang(scanner, inventaris);
                    }
                    break;
                case 2:
                    editBarang(scanner, inventaris);
                    break;
                case 3:
                    hapusBarang(scanner, inventaris);
                    break;
                case 4:
                    cariBarang(scanner, inventaris);
                    break;
                case 5:
                    inventaris.tampilkanSemuaBarang();
                    break;
                case 6:
                    tampilkanBarangMudahRusak(inventaris);
                    break;
                case 7:
                    System.out.println("Terima Kasih.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahBarang(Scanner scanner, Inventaris inventaris) {
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah barang: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Masukkan lokasi barang: ");
        String lokasi = scanner.nextLine();
        System.out.print("Apakah barang mudah rusak? (Ya/Tidak): ");
        String mudahRusak = scanner.nextLine();

        if (mudahRusak.equalsIgnoreCase("Ya")) {
            System.out.print("Masukkan tanggal kadaluwarsa: ");
            String tanggalKadaluwarsa = scanner.nextLine();
            BarangMudahRusak barang = new BarangMudahRusak(nama, jumlah, lokasi, tanggalKadaluwarsa);
            inventaris.tambahBarang(barang);
        } else {
            System.out.print("Masukkan masa garansi (dalam tahun): ");
            int masaGaransi = scanner.nextInt();
            scanner.nextLine(); 
            BarangTahanLama barang = new BarangTahanLama(nama, jumlah, lokasi, masaGaransi);
            inventaris.tambahBarang(barang);
        }
    }

    private static void editBarang(Scanner scanner, Inventaris inventaris) {
        System.out.print("Masukkan nama barang yang akan diedit: ");
        String nama = scanner.nextLine().toLowerCase();
        Barang barangLama = inventaris.cariBarang(nama);

        if (barangLama == null) {
            System.out.println("Barang tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan nama baru: ");
        String namaBaru = scanner.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah baru: ");
        int jumlahBaru = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Masukkan lokasi baru: ");
        String lokasiBaru = scanner.nextLine();

        if (barangLama instanceof BarangMudahRusak) {
            System.out.print("Masukkan tanggal kadaluwarsa baru: ");
            String tanggalKadaluwarsaBaru = scanner.nextLine();
            BarangMudahRusak barangBaru = new BarangMudahRusak(namaBaru, jumlahBaru, lokasiBaru, tanggalKadaluwarsaBaru);
            inventaris.perbaruiBarang(nama, barangBaru);
        } else {
            System.out.print("Masukkan masa garansi baru (dalam tahun): ");
            int masaGaransiBaru = scanner.nextInt();
            scanner.nextLine(); 
            BarangTahanLama barangBaru = new BarangTahanLama(namaBaru, jumlahBaru, lokasiBaru, masaGaransiBaru);
            inventaris.perbaruiBarang(nama, barangBaru);
        }
    }

    private static void hapusBarang(Scanner scanner, Inventaris inventaris) {
        System.out.print("Masukkan nama barang yang akan dihapus: ");
        String nama = scanner.nextLine().toLowerCase();
        inventaris.hapusBarang(nama);
    }

    private static void cariBarang(Scanner scanner, Inventaris inventaris) {
        System.out.print("Masukkan nama barang yang akan dicari: ");
        String nama = scanner.nextLine().toLowerCase();
        Barang barang = inventaris.cariBarang(nama);

        if (barang == null) {
            System.out.println("Barang tidak ditemukan.");
        } else {
            barang.tampilkanDetail();
        }
    }

    private static void tampilkanBarangMudahRusak(Inventaris inventaris) {
        System.out.println("Daftar Barang Mudah Rusak:");
        System.out.printf("%-4s %-15s %-15s %-15s %-20s %-10s%n", "No", "Nama Barang", "Jumlah Barang", "Lokasi Barang", "Tanggal Kadaluarsa", "Garansi");
        System.out.println("---------------------------------------------------------------------------------------------");
        int count = 1;
        for (Barang barang : inventaris.getDaftarBarang()) {
            if (barang instanceof BarangMudahRusak) {
                BarangMudahRusak barangMudahRusak = (BarangMudahRusak) barang;
                System.out.printf("%-4d %-15s %-15d %-15s %-20s %-10s%n", count++, barangMudahRusak.getNama(), barangMudahRusak.getJumlah(), barangMudahRusak.getLokasi(), barangMudahRusak.getTanggalKadaluwarsa(), "-");
            }
        }
    }
}
