public class BarangTahanLama extends Barang {
    private int masaGaransi;

    public BarangTahanLama(String nama, int jumlah, String lokasi, int masaGaransi) {
        super(nama, jumlah, lokasi);
        this.masaGaransi = masaGaransi;
    }

    @Override
    void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Masa Garansi: " + masaGaransi + " tahun");
    }

    public int getMasaGaransi() {
        return masaGaransi;
    }

    public void setMasaGaransi(int masaGaransi) {
        this.masaGaransi = masaGaransi;
    }
}
