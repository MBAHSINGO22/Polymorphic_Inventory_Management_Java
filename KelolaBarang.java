public interface KelolaBarang {
    void tambahBarang(Barang barang);
    void perbaruiBarang(String nama, Barang barangBaru);
    void hapusBarang(String nama);
    Barang cariBarang(String nama);
    void tampilkanSemuaBarang();
}
