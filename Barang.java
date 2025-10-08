public abstract class Barang {
    private String nama;
    private int jumlah;
    private String lokasi;

    public Barang(String nama, int jumlah, String lokasi) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.lokasi = lokasi;
    }

    void tampilkanDetail() {
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Lokasi: " + lokasi);
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}
