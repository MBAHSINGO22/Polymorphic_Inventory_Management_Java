import java.util.ArrayList;

public class Inventaris implements KelolaBarang {
    private ArrayList<Barang> daftarBarang;

    public Inventaris() {
        this.daftarBarang = new ArrayList<>();
    }

    @Override
    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    @Override
    public void perbaruiBarang(String nama, Barang barangBaru) {
        for (int i = 0; i < daftarBarang.size(); i++) {
            if (daftarBarang.get(i).getNama().equals(nama)) {
                daftarBarang.set(i, barangBaru);
                return;
            }
        }
        System.out.println("Barang dengan nama " + nama + " tidak ditemukan.");
    }

    @Override
    public void hapusBarang(String nama) {
        for (int i = 0; i < daftarBarang.size(); i++) {
            if (daftarBarang.get(i).getNama().equals(nama)) {
                daftarBarang.remove(i);
                return;
            }
        }
        System.out.println("Barang dengan nama " + nama + " tidak ditemukan.");
    }

    @Override
    public Barang cariBarang(String nama) {
        for (Barang barang : daftarBarang) {
            if (barang.getNama().equals(nama)) {
                return barang;
            }
        }
        return null;
    }

    @Override
    public void tampilkanSemuaBarang() {
        System.out.printf("%-4s %-15s %-15s %-15s %-20s %-10s%n", "No", "Nama Barang", "Jumlah Barang", "Lokasi Barang", "Tanggal Kadaluarsa", "Garansi");
        System.out.println("---------------------------------------------------------------------------------------------");
        int count = 1;
        for (Barang barang : daftarBarang) { 
            if (barang instanceof BarangMudahRusak) {
                System.out.printf("%-4d %-15s %-15d %-15s %-20s %-10s%n", count++, barang.getNama(), barang.getJumlah(), barang.getLokasi(), ((BarangMudahRusak) barang).getTanggalKadaluwarsa(), "-");
            } else if (barang instanceof BarangTahanLama) {
                System.out.printf("%-4d %-15s %-15d %-15s %-20s %-10s%n", count++, barang.getNama(), barang.getJumlah(), barang.getLokasi(), "-", ((BarangTahanLama) barang).getMasaGaransi() + " Tahun");
            }
        }
    }

    public ArrayList<Barang> getDaftarBarang() {
        return daftarBarang;
    }
}
