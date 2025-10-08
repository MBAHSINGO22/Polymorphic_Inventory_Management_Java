
# 🧰 Polymorphic Inventory Management Java

![Java](https://img.shields.io/badge/Java-17+-red?logo=java)
![OOP](https://img.shields.io/badge/Object--Oriented-Programming-blue)

> 💡 Demonstrasi **Polimorfisme**, **Abstraksi**, **Pewarisan**, dan **Interface** untuk pengelolaan inventaris barang di Java.

---

## 📖 Deskripsi Proyek

Proyek yang menunjukkan bagaimana menerapkan konsep **kelas abstrak**, **pewarisan**, **polimorfisme**, dan **interface** untuk mengelola inventaris barang.  
Program ini memungkinkan pengguna untuk:
- ✅ Menambah barang baru
- ✏️ Mengedit informasi barang
- ❌ Menghapus barang
- 🔎 Mencari barang
- 📜 Menampilkan semua barang
- 🍃 Menampilkan barang mudah rusak

Barang terbagi menjadi dua jenis:
- **BarangMudahRusak** (memiliki tanggal kadaluarsa)
- **BarangTahanLama** (memiliki masa garansi)

---

## 🧠 Teknologi yang Digunakan

- ☕ Java 17+
- 🧱 Konsep OOP (Abstraksi, Pewarisan, Polimorfisme)
- 📦 ArrayList & Scanner

---

## 📁 Struktur Proyek

```
Polymorphic_Inventory_Management_Java/
├── src/
├── Main.java
├── Barang.java
├── BarangMudahRusak.java
├── BarangTahanLama.java
├── KelolaBarang.java
├── Inventaris.java
```
---

## 📈 Contoh Output

```plaintext
Menu:
1. Tambah Barang
2. Edit Barang
3. Hapus Barang
4. Cari Barang
5. Lihat Daftar Barang
6. Tampilkan Barang Mudah Rusak
7. Keluar

Pilih opsi: 1
Masukkan jumlah barang yang akan ditambahkan: 2

Tambah Barang ke-1:
Masukkan nama barang: STIK
Masukkan jumlah barang: 5
Masukkan lokasi barang: RAK 1
Apakah barang mudah rusak? (Ya/Tidak): YA
Masukkan tanggal kadaluwarsa: -

Tambah Barang ke-2:
Masukkan nama barang: SAYUR
Masukkan jumlah barang: 10
Masukkan lokasi barang: RAK 2
Apakah barang mudah rusak? (Ya/Tidak): YA
Masukkan tanggal kadaluwarsa: 2027
```

**📤 Hasil Pencarian Barang**
```plaintext
Masukkan nama barang yang akan dicari: STIK
Nama: STIK
Jumlah: 5
Lokasi: RAK 1
Tanggal Kadaluwarsa: -
```

**📋 Daftar Barang**
```plaintext
No   Nama Barang     Jumlah Barang   Lokasi Barang   Tanggal Kadaluarsa   Garansi
---------------------------------------------------------------------------------
1    STIK            5               RAK 1           -                    -
2    SAYUR           10              RAK 2           2027                 -
```

**🍃 Barang Mudah Rusak**
```plaintext
Daftar Barang Mudah Rusak:
1. STIK (Kadaluarsa: -)
2. SAYUR (Kadaluarsa: 2027)
```

---

## 👨‍💻 Pengembang

- 🧑‍💻 **MBAHSINGO22**  
- 🌐 GitHub: [https://github.com/MBAHSINGO22](https://github.com/MBAHSINGO22)
