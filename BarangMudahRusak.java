public class BarangMudahRusak extends Barang {
    private String tanggalKadaluwarsa;

    public BarangMudahRusak(String nama, int jumlah, String lokasi, String tanggalKadaluwarsa) {
        super(nama, jumlah, lokasi); 
        this.tanggalKadaluwarsa = tanggalKadaluwarsa;
    }

    @Override
    void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Tanggal Kadaluwarsa: " + tanggalKadaluwarsa);
    }

    public String getTanggalKadaluwarsa() {
        return tanggalKadaluwarsa;
    }

    public void setTanggalKadaluwarsa(String tanggalKadaluwarsa) {
        this.tanggalKadaluwarsa = tanggalKadaluwarsa;
    }
}
