# Technical Assessment - Back End Developer Intern

Repository ini berisi jawaban saya untuk *technical assessment* yang diberikan untuk posisi Back End Developer Intern.

Assessment ini terdiri dari dua bagian:
1.  **IT Logical Programming Test** (Jawaban ada di dalam file `.docx`)
2.  **Backend API Development** (Proyek Spring Boot)

---

## 🖥️ Backend API Development

Proyek API ini dibuat untuk memenuhi tugas *backend development* . API ini mengambil data dari database dan mengembalikannya dalam format JSON yang telah ditentukan .

### 🛠️ Technology Stack
* **Java 17+**
* **Spring Boot** (v3.x.x)
* **Spring Data JPA** (Hibernate)
* **H2 Database** (In-Memory, untuk kemudahan testing)
* **Lombok**
* **Maven**

### 🚀 Cara Menjalankan Proyek

Proyek ini dikonfigurasi untuk menggunakan **H2 In-Memory Database**. Perekrut tidak perlu menginstal atau mengkonfigurasi database eksternal.

1.  **Clone Repository**
    ```bash
    git clone [https://github.com/](https://github.com/)[NamaUserAnda]/[NamaRepoAnda].git
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

Semua file soal asli yang diberikan (`.docx`, `.json`, `.txt`) dapat ditemukan di dalam folder `/soal_assessment` di repository ini.
