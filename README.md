# Technical Assessment - Back End Developer Intern

Repository ini berisi jawaban dari test yang diberikan untuk posisi Back End Developer Intern.

Assessment ini terdiri dari dua bagian:
1.  **IT Logical Programming Test**
2.  **Backend API Development**

---
## 🧠 IT Logical Test

### 📁 File Soal
Seluruh dokumen soal IT Logical Test dapat dilihat dalam folder '\soal' pada respository ini

### 📄 Jawaban Soal
Jawaban dari IT Logical Test dapat dilihat dalam folder '\Logical_Answer' pada repository ini

---

## 🖥️ Backend API Development

Proyek API ini dibuat untuk menjawab tugas *backend development* . API ini mengambil data dari database dan mengembalikannya dalam format JSON yang telah ditentukan .

### 📖 Deskripsi
Aplikasi ini merupakan sebuah REST API berbasi JAVA yang menyediakan endpoint untuk:
* Mengambil semua data transaksi dari database
* Menampilkan status dari transaksi
* Response dalam format JSON

### 🛠️ Teknologi
* **Java 22+**
* **Spring Boot** (v3.5.7)
* **Spring Data JPA** (v3.5.7)
* **MySQL** (v5.5)
* **Lombok**
* **Maven**                                   

### 🚀 Cara Menjalankan Proyek

1. Pastikan sofware yang diperlukan sudah diinstal
    * JDK 17 atau lebih tinggi
    * Eclipse IDE atau InteliJ
    * Maven
    * MySQL

Bisa verivikasi intalasi dengan
# Cek Java version
java -version

# Cek Maven version
mvn -version

# Cek MySQL (via XAMPP atau service)
mysql --version



1.  **Clone Repository**
    ```bash
    git clone https://github.com/4CeL/API_Test.git
    ```

2.  **Buka Proyek**
    Buka proyek sebagai "Existing Maven Project" di IDE Anda (Eclipse, IntelliJ).

3.  **Cek `data.sql` (Penting)**
    Proyek ini menyertakan file `src/main/resources/data.sql`. File ini akan **secara otomatis** dijalankan oleh Spring Boot untuk membuat skema tabel dan mengisi semua data transaksi saat aplikasi pertama kali berjalan.

4.  **Jalankan Aplikasi**
    Cari file `DemoApplication.java` (atau file utama Spring Boot Anda) dan jalankan sebagai "Java Application".

5.  **Aplikasi Siap**
    Aplikasi akan berjalan di `http://localhost:8080`.

### 🧪 Cara Menguji API

Gunakan Postman atau browser Anda untuk menguji *endpoint* berikut:

* **Method:** `GET` 
* **URL:** `http://localhost:8080/api/transactions`

**Hasil yang Diharapkan:**
Anda akan melihat respons JSON yang datanya sudah terisi lengkap, sesuai dengan file `viewData.json` yang diberikan.

### 🗂️ File Soal Asli

Semua file soal asli yang diberikan (`.docx`, `.json`, `.txt`) dapat ditemukan di dalam folder `/Soal` di repository ini.
