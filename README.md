# pbo-post-test-2
# Warnet
### Dzaki Nurtauriq Mirawan
### 2209116088
### B2  

## A. Screenshot Source

### a) Class Customer

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/4b816773-0a57-4983-9210-8ced3ae3019c)


### b) Class Warnet

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/de6c52af-273c-4da1-bb51-969e59e0105e)


![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/d450c014-2c47-498a-9e58-df1170d00433)


![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/6533ea2f-d715-44c6-80ea-03e90665afb9)


## B. Penjelasan Source Code

### a) Class Customer

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/5eb6a77c-cc3e-4d88-be11-9f981887a5c9)

1. pada gambar diatas adalah kerangka dasar dari sebuah kelas Java yang disebut customer. Berikut adalah penjelasannya:

-public class customer{: Kode dimulai dengan definisi kelas Java bernama customer. Kata kunci public menunjukkan bahwa kelas ini dapat diakses dari luar paket (package).

-final private int id; dan final private String name;: Ini adalah dua variabel anggota (member variables) dari kelas customer. Mereka dinyatakan sebagai final, yang berarti mereka hanya dapat diinisialisasi sekali. int id adalah variabel bertipe data integer yang menyimpan ID pelanggan, dan String name adalah variabel bertipe data string yang menyimpan nama pelanggan.

-private int hours;: Ini adalah variabel anggota lain dari kelas customer. Variabel ini dinyatakan sebagai private, yang berarti hanya dapat diakses di dalam kelas ini sendiri

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/746ca640-1936-4948-bc14-cfb08a98a08c)

2. pada gambar diatas adalah konstruktor untuk kelas customer. Berikut adalah penjelasannya:

-public customer(int id, String name, int hours): Ini adalah deklarasi konstruktor dengan tiga parameter. Konstruktor ini membutuhkan tiga argumen saat objek customer dibuat: id (integer), name (string), dan hours (integer).

-this.id = id;, this.name = name;, this.hours = hours;: Dalam konstruktor, this mengacu pada instansinya sendiri (yaitu objek yang sedang dibuat). Pernyataan ini menginisialisasi variabel anggota id, name, dan hours dari objek yang sedang dibuat dengan nilai dari argumen konstruktor

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/d554fb49-1f6a-42fa-aeb2-bd7153838235)

3. pada gambar diatas adalah bagian dari kelas customer yang berisi metode akses (getter) dan mutator (setter) untuk variabel anggota id, name, dan hours. Berikut adalah penjelasan singkatnya:

-public int getId() : Ini adalah metode untuk mengambil (mendapatkan) nilai dari variabel id. Metode ini mengembalikan nilai bertipe data integer.

-public String getName(): Ini adalah metode untuk mengambil (mendapatkan) nilai dari variabel name. Metode ini mengembalikan nilai bertipe data string.

-public int getHours(): Ini adalah metode untuk mengambil (mendapatkan) nilai dari variabel hours. Metode ini mengembalikan nilai bertipe data integer.

-public void setHours(int hours): Ini adalah metode untuk mengatur (memperbarui) nilai dari variabel hours. Metode ini menerima satu argumen hours bertipe data integer, dan kemudian memperbarui nilai variabel hours dengan nilai yang diberikan.

### b) Class warnet

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/9077adf7-51b3-4569-838b-355db36b3494)

1. pada gambar diatas adalah pengelompokan kode Java ke dalam sebuah paket (package) yang bernama warnets. Berikut adalah penjelasannya:

-package warnets;: Baris pertama menunjukkan deklarasi bahwa seluruh kode dalam file ini termasuk ke dalam paket (package) yang disebut warnets. Paket digunakan untuk mengelompokkan kelas-kelas terkait agar dapat diorganisir dengan baik.

-import java.util.Scanner;: Baris kedua adalah pernyataan import yang mengimpor kelas Scanner dari paket java.util. Ini memungkinkan penggunaan kelas Scanner untuk membaca input dari pengguna.

-import posttest2.customer;: Baris ketiga adalah pernyataan import yang mengimpor kelas customer dari paket posttest2. Ini mengizinkan penggunaan kelas customer dari paket posttest2 dalam paket warnets.

-import java.util.ArrayList; dan import java.util.List;: Baris keempat dan kelima mengimpor kelas ArrayList dan List dari paket java.util. Ini memungkinkan penggunaan struktur data List dan ArrayList untuk menyimpan dan mengelola koleksi objek.

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/9379bd35-d664-4f6c-b423-3401b72af2a7)

2. pada gambar diatas adalah implementasi dasar dari kelas Java yang disebut warnet. Berikut adalah penjelasannya:

-private static final List<customer> customers = new ArrayList<>();: Ini adalah deklarasi dan inisialisasi variabel customers. Ini adalah sebuah daftar (List) yang menyimpan objek dari kelas customer. private menunjukkan bahwa variabel ini hanya dapat diakses di dalam kelas warnet. static berarti bahwa variabel ini bersifat statis, artinya hanya ada satu salinan untuk seluruh kelas dan digunakan bersama oleh semua objek kelas. final menunjukkan bahwa variabel ini tidak dapat diubah setelah inisialisasi.

-public static void main(String[] args): Ini adalah metode utama (entry point) dari program. Program Java akan memulai eksekusi dari sini. public menunjukkan bahwa metode ini dapat diakses dari luar kelas. static berarti metode ini terkait dengan kelas itu sendiri, bukan dengan instansi kelas apa pun. void menunjukkan bahwa metode ini tidak mengembalikan nilai. String[] args adalah argumen yang dapat diterima saat program dijalankan.

-Scanner scanner = new Scanner(System.in);: Ini mendeklarasikan objek scanner yang digunakan untuk membaca input dari pengguna melalui konsol.

-while (true) {...}: Ini adalah loop tak terbatas yang akan menjalankan menu program terus-menerus sampai program dihentikan secara eksplisit.

-Menu: Baris-baris berikut ini mencetak menu yang memungkinkan pengguna untuk memilih berbagai tindakan seperti menambahkan pelanggan baru, menampilkan daftar pelanggan, memperbarui durasi penggunaan, menghapus pelanggan, atau keluar dari program.

-int choice = scanner.nextInt();: Ini membaca input integer dari pengguna, yang akan menjadi pilihan menu.

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/21318097-0331-4124-bb0f-87fe2a05decb)

3. pada gambar diatas adalah bagian dari blok switch dalam program yang menangani kasus ketika pengguna memilih opsi 1 dari menu. Berikut adalah penjelasan singkatnya:

-switch (choice) {...}: Ini adalah struktur kontrol switch yang memeriksa nilai dari variabel choice yang telah diinput oleh pengguna.

-case 1:: Ini adalah kasus pertama di dalam struktur switch. Ini berarti jika nilai dari choice adalah 1, maka blok kode di bawah ini akan dieksekusi.

-System.out.print("Insert Id customer: ");: Ini mencetak pesan untuk meminta pengguna memasukkan ID pelanggan.

-int id = scanner.nextInt();: Ini membaca input integer dari pengguna dan menginisialisasi variabel id dengan nilai tersebut.

-scanner.nextLine();: Ini digunakan untuk membersihkan karakter newline (\n) yang tersisa setelah nextInt() sehingga scanner.nextLine() selanjutnya dapat berfungsi dengan benar.

-System.out.print("Insert customer name: ");: Ini mencetak pesan untuk meminta pengguna memasukkan nama pelanggan.

-String name = scanner.nextLine();: Ini membaca input string dari pengguna dan menginisialisasi variabel name dengan nilai tersebut.

-System.out.print("Enter the duration of the time usage: ");: Ini mencetak pesan untuk meminta pengguna memasukkan durasi penggunaan waktu.

-int hours = scanner.nextInt();: Ini membaca input integer dari pengguna dan menginisialisasi variabel hours dengan nilai tersebut.

-customers.add(new customer(id, name, hours));: Ini membuat objek customer baru dengan ID, nama, dan jumlah jam yang telah diinputkan, lalu menambahkannya ke daftar customers.

-System.out.println(" Customer has been added ");: Ini mencetak pesan konfirmasi bahwa pelanggan telah berhasil ditambahkan.

-break;: Ini menghentikan eksekusi switch setelah kasus ini dijalankan.

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/c656f113-7284-4f32-b0a0-4f4d75926cf1)

4. pada gambar diatas adalah bagian dari blok switch dalam program yang menangani kasus ketika pengguna memilih opsi 2 dari menu. Berikut adalah penjelasannya:

-case 2:: Ini adalah kasus kedua di dalam struktur switch. Ini berarti jika nilai dari choice adalah 2, maka blok kode di bawah ini akan dieksekusi.

-System.out.println(" Customers List: ");: Ini mencetak judul "Customers List" untuk menampilkan daftar pelanggan.

-for (customer customer : customers) {...}: Ini adalah loop for-each yang akan mengulang setiap objek customer dalam daftar customers.

-System.out.println("ID: " + customer.getId() + ", Name: " + customer.getName() + ", Duration: " + customer.getHours() + " Hours");: Di dalam loop, kode ini mencetak informasi dari setiap pelanggan, termasuk ID, nama, dan durasi penggunaan waktu.

-break;: Ini menghentikan eksekusi switch setelah kasus ini dijalankan. 

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/21aeded5-e971-4f5b-aaf9-2b5c6b2d46b1)

5. pada gambar diatas adalah bagian dari blok switch dalam program yang menangani kasus ketika pengguna memilih opsi 3 dari menu. Berikut adalah penjelasannya:

-case 3:: Ini adalah kasus ketiga di dalam struktur switch. Ini berarti jika nilai dari choice adalah 3, maka blok kode di bawah ini akan dieksekusi.

-System.out.println("Enter the Customer ID you want to update: ");: Ini mencetak pesan meminta pengguna memasukkan ID pelanggan yang ingin diperbarui.

-int updateId = scanner.nextInt();: Ini membaca input integer dari pengguna dan menginisialisasi variabel updateId dengan nilai tersebut.

-for (customer customer : customers) {...}: Ini adalah loop for-each yang akan mengulang setiap objek customer dalam daftar customers.

-if (customer.getId() == updateId) {...}: Di dalam loop, kondisi ini memeriksa apakah ID pelanggan dari objek saat ini cocok dengan updateId yang dimasukkan pengguna.

-Jika kondisi di atas terpenuhi, maka pengguna diminta untuk memasukkan durasi penggunaan baru melalui pesan "Enter the duration of the new user: " dan nilai tersebut disimpan dalam variabel newHours.

-customer.setHours(newHours);: Durasi penggunaan waktu pelanggan diperbarui dengan nilai dari newHours menggunakan metode setHours.

-System.out.println("The duration for which the user has been updated. ");: Ini mencetak pesan konfirmasi bahwa durasi penggunaan waktu telah diperbarui.

-break;: Ini menghentikan eksekusi loop setelah pelanggan yang sesuai ditemukan dan diperbarui.

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/b79acce5-b174-442e-a22a-1ee988692475)

6. pada gambar diatas adalah bagian dari blok switch dalam program yang menangani kasus ketika pengguna memilih opsi 4 dari menu. Berikut adalah penjelasan singkatnya:

-case 4:: Ini adalah kasus keempat di dalam struktur switch. Ini berarti jika nilai dari choice adalah 4, maka blok kode di bawah ini akan dieksekusi.

-System.out.print("Enter the customer ID you want to delete: ");: Ini mencetak pesan meminta pengguna memasukkan ID pelanggan yang ingin dihapus.

-final int deleteId = scanner.nextInt();: Ini membaca input integer dari pengguna dan menginisialisasi variabel deleteId dengan nilai tersebut. Kata kunci final menunjukkan bahwa nilai dari deleteId tidak dapat diubah setelah inisialisasi.

-customers.removeIf(customer -> customer.getId() == deleteId);: Baris ini menggunakan metode removeIf() untuk menghapus elemen dari daftar customers jika ID pelanggan dari elemen tersebut sama dengan deleteId.

-System.out.println("The account has been deleted.");: Ini mencetak pesan konfirmasi bahwa akun pelanggan telah berhasil dihapus.

-break;: Ini menghentikan eksekusi switch setelah kasus ini dijalankan.

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/91f2050a-6a32-4db7-844b-7a162d7e120c)

7. pada gambar diatas adalah bagian akhir dari blok switch dan dari kelas warnet secara keseluruhan. Berikut adalah penjelasan singkatnya:

-case 5:: Ini adalah kasus kelima di dalam struktur switch. Ini berarti jika nilai dari choice adalah 5, maka blok kode di bawah ini akan dieksekusi.

   - System.out.println(" Shutdown ");: Ini mencetak pesan bahwa program akan dimatikan.

   - scanner.close();: Ini menutup objek Scanner, sehingga tidak ada lagi input yang dapat diterima setelah ini.

   - System.exit(0);: Ini memaksa program untuk keluar (exit) dengan status keluaran 0, menandakan bahwa program berhenti dengan normal.

2. default:: Jika choice tidak cocok dengan kasus manapun dalam switch, maka blok di bawah ini akan dieksekusi.

   - System.out.println(" the opsiont not invalid. ");: Ini mencetak pesan bahwa pilihan yang dimasukkan tidak valid.

Kode ini menangani dua kasus terakhir dari menu, yaitu pilihan untuk mematikan program (opsi 5) atau pilihan yang tidak valid. Setelah menjalankan aksi yang sesuai dengan pilihan pengguna, program akan kembali ke awal loop `while` untuk menampilkan kembali menu dan menunggu input berikutnya.

## C. Penjelasan output

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/250c7b47-a6e7-4297-bf8a-f3930daff3dd)

pada gambar diatas adalah tampilan awal atau menu yang berisikan 5 pilihan yaitu :
1. add new customer, yang berfungsi untuk menambahkan data pengguna baru
2. customer's list, yang berfungsi untuk menampilkan isi data pengguna yang sudah terinput
3. update duration of use, yang berfungsi untuk mengubah durasi waktu pengguna
4. remove customer's, yang berfungsi untuk menghapus data pengguna didalam data
5. exit, yang berfungsi keluar dari program

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/d6fe5a65-4022-4e26-a331-b480fabdbd33)

pada gambar diatas adalah tampilan jika menginput nomor 1, lalu dilanjutkan dengan menginput ID pelanggan selanjutnya menginput nama pelanggan dan terakhir mengisi durasi bermain pelanggan. Dan jika sudah maka akan muncul Customer has been added.

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/fb5c145d-7d4d-4561-bcfa-d503beda6227)

pada gambar diatas adalah tampilan jika menginput nomor 2, maka akan muncul list data yang telah dimasukan oleh user.

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/96754de0-9644-4a1f-84c2-418170f1fa58)

pada gambar diatas adalah tampilan jika menginput nomor 3, lalu masukan ID pelanggan dilanjutkan mengisi durasi baru yang ingin dimasukan jika sudah maka akan muncul The duration for which the user has been updated. maka jika menginput nomer 2 maka akan terlihat durasi terubah. 

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/0b27eec0-960a-47e1-aba5-859e9b6377f4)

pada gambar diatas adalah tampilan jika menginput nomor 4, lalu masukan ID pelanggan yang ingin dihapus jika sudah maka akan muncul The account has been deleted. lalu jika menginput nomer 2 maka akan terlihat data pelanggan yang sudah terhapus.

![image](https://github.com/DzakiNurtauriqMirawan/pbo-post-test-2/assets/126880712/314238cd-18e3-449f-966a-902f3263a0ff)

pada gambar diatas adalah tampilan jika menginput nomor 5, maka akan keluar dari program dan muncul shutdown





