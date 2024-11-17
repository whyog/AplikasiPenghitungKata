# 🚀 Aplikasi GUI Penghitung Kata

Selamat datang di proyek ini! 🎉 Proyek ini adalah implementasi GUI berbasis Java untuk menghitung jumlah kata, karakter, kalimat, dan paragraf dalam teks yang dimasukkan pengguna. Aplikasi ini juga menyediakan fitur pencarian kata tertentu dan opsi untuk menyimpan teks serta hasil perhitungan ke file.

---

## 👨‍💻 Tentang Saya

Halo! Nama saya **Nur Yoga Andika** 👋  
- 📚 **NPM:** 2210010652  
- 🎓 **Jurusan:** Teknologi Informasi  
- 🌟 Saya selalu berusaha belajar hal-hal baru dan berbagi apa yang saya pelajari.  

💬 Jangan ragu untuk menghubungi saya untuk berdiskusi lebih lanjut tentang proyek ini atau topik lainnya! 🚀  

---

## 📝 Deskripsi Program

Aplikasi ini memungkinkan pengguna:
1. Memasukkan **teks** melalui `JTextArea` yang terintegrasi dengan `JScrollPane`.
2. Menekan tombol:
   - **Hitung:** Untuk menampilkan jumlah kata, karakter, kalimat, dan paragraf dalam teks.
   - **Cari:** Untuk mencari kata tertentu dalam teks.
   - **Simpan:** Untuk menyimpan teks dan hasil perhitungan ke dalam file.
3. Menampilkan hasil secara **real-time** menggunakan `DocumentListener`.

Aplikasi ini juga menyediakan fitur tambahan seperti:
- Pencarian kata tertentu dalam teks.
- Opsi untuk menyimpan teks dan hasil perhitungan ke file.

---

## 💻 Komponen GUI

Berikut adalah komponen utama yang digunakan dalam aplikasi ini:
- **JFrame:** Sebagai jendela utama aplikasi.
- **JPanel:** Mengatur tata letak komponen GUI.
- **JLabel:** Menampilkan label teks untuk hasil perhitungan.
- **JTextArea:** Untuk memasukkan teks yang akan dihitung.
- **JScrollPane:** Membungkus `JTextArea` untuk memungkinkan scrolling.
- **JButton:** Untuk melakukan tindakan seperti hitung, cari, dan simpan.

---

## 🔍 Logika Program

1. **Perhitungan Kata dan Karakter:**
   - Menggunakan manipulasi string dan ekspresi reguler untuk menghitung jumlah kata dan karakter.
   - Menggunakan pemisah seperti spasi, titik, dan enter untuk menghitung kalimat dan paragraf.
   
2. **Pencarian Kata:**
   - Menggunakan metode pencarian string untuk menemukan kata tertentu dalam teks.

3. **Penyimpanan File:**
   - Menyimpan teks dan hasil perhitungan ke dalam file dengan format yang mudah dibaca.

---

## 🎯 Events yang Diimplementasikan

1. **ActionListener:**  
   - Untuk tombol **Hitung**, memproses perhitungan jumlah kata, karakter, kalimat, dan paragraf.
   - Untuk tombol **Cari**, memproses pencarian kata tertentu dalam teks.
   - Untuk tombol **Simpan**, menyimpan teks dan hasil perhitungan ke file.

2. **DocumentListener:**  
   - Menghitung jumlah kata, karakter, kalimat, dan paragraf secara real-time saat teks diubah.

---

## ✨ Variasi

1. Tambahkan fitur:
   - Menghitung jumlah kalimat dan paragraf.
   - Menyediakan opsi pencarian kata tertentu dalam teks.
2. Opsi penyimpanan:
   - Menyimpan teks dan hasil perhitungan ke file.
3. Validasi input:
   - Menampilkan pesan kesalahan jika teks kosong.

---

## 🔧 Cara Menggunakan Program

1. Masukkan **teks** ke dalam `JTextArea` yang tersedia.
2. Tekan tombol:
   - **Hitung:** Untuk melihat jumlah kata, karakter, kalimat, dan paragraf.
   - **Cari:** Masukkan kata yang ingin dicari dalam dialog pencarian, dan hasil akan ditampilkan.
   - **Simpan:** Simpan teks dan hasil perhitungan ke file.
3. Perubahan pada teks akan memperbarui hasil secara real-time di `JLabel`.

---



