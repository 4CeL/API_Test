# Technical Assessment - Back End Developer Intern

Repository ini berisi jawaban dari test yang diberikan untuk posisi Back End Developer Intern.

Penjelasan Setiap Folder

   1. `Soal` -> Berisi file-file soal untuk test ini

   2. `Logical_Answer` -> Berisi jawaban untuk Logical Test

   3. `src` -> Merupakan source code untuk Back End API Application

   4. `database` -> Berisi database yang diperlukan untuk Back End API Application

   5. `gitignore` -> File konfigurasi untuk memberitahu git apa saja yang harus diabaikan

   6. `ReadME` -> Berisi penjelasan project ini

   7. `pom.xml` -> File yang berisi konfigurasi yang berisi daftar dependesi yang diperlukan

Assessment ini terdiri dari dua bagian:
1.  **IT Logical Programming Test**
2.  **Backend API Development**

---
## 🧠 IT Logical Test

### 📁 File Soal
Seluruh dokumen soal IT Logical Test dapat dilihat dalam folder `\soal` pada respository ini

### 📄 Jawaban Soal
Jawaban dari IT Logical Test dapat dilihat dalam folder `\Logical_Answer` pada repository ini

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

### ⛓️ Struktur Project ###
   ```bash
    API_Test/
├── src/
│   ├── main/
│   │   ├── java/com/example/transaction/
│   │   │   ├── controller/
│   │   │   │   └── TransactionController.java     
│   │   │   ├── service/
│   │   │   │   └── TransactionService.java        
│   │   │   ├── repository/
│   │   │   │   ├── TransactionRepository.java     
│   │   │   │   └── StatusMasterRepository.java
│   │   │   ├── entity/
│   │   │   │   ├── Transaction.java               
│   │   │   │   └── StatusMaster.java
│   │   │   ├── dto/
│   │   │   │   ├── TransactionDTO.java            
│   │   │   │   ├── StatusDTO.java
│   │   │   │   └── ApiResponse.java
│   │   │   └── TransactionApiApplication.java      
│   │   └── resources/
│   │       └── application.properties             
│   └── test/
│       └── java/
├── database/
│   └── data.sql                                   
├── .gitignore
├── README.md
└── pom.xml                                          
   ```
**Penjelasan**

`controller/` -> Menangani HTTP requests dan responses

`service/` -> Berisi business logic aplikasi

`repository/` -> Interface untuk akses database

`entity/` -> Class untuk mempresentasikan database

`dto/` -> Object untuk transfer data

### 🚀 Cara Menjalankan Proyek

1. **Pastikan sofware yang diperlukan sudah diinstal**
    * JDK 17 atau lebih tinggi
    * Eclipse IDE atau InteliJ
    * Maven
    * MySQL

   Bisa verifikasi intalasi dengan
    ```bash
   # Cek Java version
   java -version

   # Cek Maven version
   mvn -version

   # Cek MySQL (via XAMPP atau service)
   mysql --version
   ```

2.  **Clone Repository**
    ```bash
    git clone https://github.com/4CeL/API_Test.git
    ```

3. **Setup Database**
   
   *Metode 1 -> Via MySQL command line*
    ```bash
    mysql -u root -p < database/data.sql
    ```
   *Metode 2 -> Via phpMyAdmin (XAMPP)*
   ```bash
    1. Start MySQL dari XAMPP
    2. Klik tab import
    3. pilih file database/data.sql
    4. Klik go
    ```
4. **Konfigurasi Koneksi Database**

   Edit file `src/main/resources/application.properties`
    ```bash
    # Database Configuration
   spring.datasource.url=jdbc:mysql://localhost:3306/transaction_data
   spring.datasource.username=root
   spring.datasource.password=

   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

   # JPA Configuration
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.format_sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

   # Server Configuration
   server.port=8080
    ```
   **Notes Tambahan:**
   Silahkan sesuaikan username dan password untuk database anda

5. **Build Project**
   
   Jalankan ini
   ```bash
    # Download dependencies dan compile
      mvn clean install
    ```
   Tunggu hingga success

7. **Run Application**
   
   *Cara 1* -> Via Maven
   ```bash
    mvn spring-boot:run
    ```
   *Cara 2* -> Via IDE
   ```bash
    1. Buka project di IDE
    2. Cari file DemoApplication.java
    3. Klik kanan → Run As → Java Application
    ```
9. **Cek Aplikasi**
   Jika berhasil maka akan muncul tampilan seperti ini
   ```bash
       .   ____          _            __ _ _
    /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
   ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
    \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
     '  |____| .__|_| |_|_| |_\__, | / / / /
    =========|_|==============|___/=/_/_/_/
    :: Spring Boot ::                (v3.x.x)
   ...
   Started DemoApplication in 3.456 seconds
   ```


### 📊 Database Schema
```bash
  ┌─────────────────────┐         ┌──────────────────┐
  │   transactions      │         │  status_master   │
  ├─────────────────────┤         ├──────────────────┤
  │ PK  id              │    ┌────│ PK  id           │
  │     product_id      │    │    │     name         │
  │     product_name    │    │    └──────────────────┘
  │     amount          │    │
  │     customer_name   │    │
  │ FK  status          │────┘
  │     transaction_date│
  │     create_by       │
  │     create_on       │
  └─────────────────────┘
   ```

### 🧪 Testing API

1. **Testing Via Browser**
   
   Buka browser dan akses
   ```bash
   http://localhost:8080/api/transactions
   ```
2. Testing Via Postman
   ```bash
   1. Buka Postman
   2. Create New Request
      - Method : GET
      - URL : http://localhost:8080/api/transactions
   3. Klik Send
   4. Hasil Akhir
      - Status : 200 OK
      - Body : JSON berisi data transaksi
   ```

