## </h1 >

### NAMA : FADILA MAYAMASITA

### NIM : 254107020012

### KELAS : 1C_TI

## Percoban 1 : Review perulangan 1

1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian?

   Jawaban :

   *Setelah mengubah i = 1; menjadi i = 0;:*

   <img width="529" height="42" alt="Screenshot 2025-11-02 235320" src="https://github.com/user-attachments/assets/6d5ce835-9a66-4590-ada0-37b0f18db0fd" />

   *Hasilnya:*

   <img width="253" height="51" alt="Screenshot 2025-11-02 235333" src="https://github.com/user-attachments/assets/dab00760-df5b-4c5b-b843-f267ba069717" />

   Karena Perulangan dimulai dari 1 = 0 dan berhenti saat i lebih besar dari n dan karena 0 juga dihitung sebagia literasi pertama maka jumlahnya akan selalu bertambah satu = n + 1

2. Jika pada perulangan for, kondisi i<=n diubah menjadi i<n, bagaimana bentuk outputnya jika input n = 5? Mengapa hasilnya berbeda?

   *Setelah mengubah i<=n menjadi i<n:*

    <img width="341" height="34" alt="Screenshot 2025-11-02 235942" src="https://github.com/user-attachments/assets/4c80fc8c-4c34-4235-b477-b192bc978953" />

    *Hasilnya:*

   <img width="195" height="40" alt="Screenshot 2025-11-03 000106" src="https://github.com/user-attachments/assets/a24eec92-6c12-4f64-8b60-edcce348456d" />

   Karena ketika i = 5, kondisi i < 5 (5 < 5)salah. dan perulangan berhenti, akibatnya jumlah  bintang berkurang satu 

3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya? Mengapa bisa demikian?

   Jawaban :

   *Setelah mengubah i <= n menjadi i > n :*

   <img width="379" height="13" alt="Screenshot 2025-11-03 001050" src="https://github.com/user-attachments/assets/132ac9af-e63c-4e4c-89d8-ec7ca9b0a155" />

   *Hasilnya :*

   <img width="252" height="147" alt="Screenshot 2025-11-03 001103" src="https://github.com/user-attachments/assets/f90b81d0-f826-4980-8475-a10a1e9df310" />

Karena kondisi awal langsung salah, maka perulangan tidak dijalankan sama sekali

4. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian?

   Jawaban :

   *Kondisi step i++ setelh diubah menjadi i--:*

  <img width="394" height="29" alt="Screenshot 2025-11-03 001615" src="https://github.com/user-attachments/assets/07ee800c-33e8-46da-9242-41ed528b478e" />

   *Hasilnya :*

   <img width="1141" height="349" alt="Screenshot 2025-11-03 001623" src="https://github.com/user-attachments/assets/0fd1e1f8-eb55-439f-8822-bb7172ddbb9c" />

  Karena ketika nilai i berkurang terus maka kondisi i <= n selalu benar namun perulangan tidak pernah berhenti (Infinite loop)

5. Jika pada perulangan for, step i++ diubah menjadi i += 2, bagaimana pola outputnya jika input n = 6? Apa yang menyebabkan perubahan tersebut?

   Jawaban :

  *i ++ diubah menjadi i += 2, hasilnya:*

  <img width="450" height="29" alt="Screenshot 2025-11-03 004138" src="https://github.com/user-attachments/assets/7e7a4eb5-1b6c-4f3f-b7e3-a41d3cec615e" />

 *Hasilnya:*

 <img width="240" height="52" alt="Screenshot 2025-11-03 004152" src="https://github.com/user-attachments/assets/a1822eec-2950-4af2-b1bb-1317a2d56d77" />

 Karena i bertambah 2 setiap kali, maka jumlah literasi berkurang setengah, dan pola bintang lebih sedikit karena perulangan melangkah dua kali lebih jauh.


## Percoban 2 : bintang persegi waktu

1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian?

   Jawban :

   *perubahan dari inisialisasi iOuter = 1 menjadi iOuter = 0 hasilnya:*

   <img width="502" height="42" alt="Screenshot 2025-11-03 040210" src="https://github.com/user-attachments/assets/f99db20a-db08-488d-baf0-ef8d015cc689" />

   *Hasilnya:*

   <img width="217" height="171" alt="Screenshot 2025-11-03 040217" src="https://github.com/user-attachments/assets/9bfbc8e5-8c1b-4508-a593-cc5e3aa21738" />

   Karena perulangan dimulai dari 0, iterasi dilakukan untuk iOuter = 0,1,2,3,4 -> 5 kali dan seharusnya hanya 4kali jika dimulai dari satu, jadi perulangan bertambah satu  baris

2.	Kembalikan program semula dimana inisialisasi . Kemudian perhatikan perulangan dalam. Jika pada sintaks for, inisialisasi diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?

    Jawaban :

    *diubah seperti semula menjadi i = 0:*

    <img width="284" height="32" alt="Screenshot 2025-11-03 041143" src="https://github.com/user-attachments/assets/60e5271e-eefe-45ef-b47d-d551500d3507" />

    *Hasilnya:*

    <img width="187" height="126" alt="Screenshot 2025-11-03 041156" src="https://github.com/user-attachments/assets/86898c7f-1947-4fe5-9cb6-b3caf2f7c421" />

    Karena i dimulai dari 0, iterasi berjalan 0,1,2,3,4 -> total 5 kali, maka jumlah bintang di tiap baris bertambah satu dibanding semula
  
3.	Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya?

    Jawaban :

    perulangan luar ( iOuter) berguna utuk mengatur jumlah baris bintang yang di cetak secara vertikal dan mencetak deretan bintang di satu baris sedangkan perulangan dalam ( i) berguna untuk mengatur kolom bintang per hari secraa horizontal dan menentukan berapa kali baris itu dicetak
  	
 4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan
 
    Jawaban :

karena fungsinya digunakan untuk pindah ke baris baru setelah satu baris bintang selesai di cetak dan jika dihilangkan sout println maka akibatnya semua bintang akan dicetak dalam satu baris panjang, bukan berbentuk persegi  
   
5.	Silakan commit dan push ke repository Anda.

    Jawaban :

    sudah di commit dan di push


 ## Percobaan 3: Bintang Segitiga Waktu 

 1.	Perhatikan, apakah output yang dihasilkan dengan nilai n = 5 sesuai dengan tampilan berikut?

    Jawaban :

    Sudah  sesuai dengan gambar yang di atas

    <img width="232" height="175" alt="Screenshot 2025-11-03 043114" src="https://github.com/user-attachments/assets/0b3bbe7e-e40b-4108-bdc4-791336ce3714" />

 2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan ?

    Jawaban :

    bagian yang harus diperbaiki adalah tambahkan System.out.println(""); etelah loop dalam ( while (j < i )) agar setiap baris baru muncul dan tutup Scanner untuk kebersiha kode
    
4. Silakan commit dan push ke repository Anda.

   Jawaban :

git add Triangle13.java
git commit -m "Perbaikan loop dan penambahan baris baru pada output segitiga"
git push origin main

telah di push dan commit ke dalam repository
   
4. Jelaskan peran masing-masing variabel i dan j dalam program ini. Mengapa j di-set ulang ke 0 di awal setiap iterasi outer loop? Apa yang akan terjadi jika j tidak di-reset?

   Jawaban :

   A. i (outer loop):Mengatur jumlah baris dari segitiga bintang.Setiap kali i bertambah 1, berarti program berpindah ke baris berikutnya.

   B.  j (inner loop):Mengatur jumlah bintang yang dicetak di tiap baris.Pada baris ke-i, program mencetak i buah bintang (*).

   C.  Mengapa j di-set ulang ke 0 di awal setiap iterasi outer loop? Karena untuk setiap baris baru, jumlah bintang harus dihitung ulang dari 0. Jika j tidak di-reset, maka nilai j akan terus meningkat dari iterasi sebelumnya, dan loop while (j < i) tidak akan berfungsi dengan benar (bisa langsung false atau tidak mencetak apa pun di baris berikutnya).

   D. Apa yang akan terjadi jika j tidak di-reset? Misalnya, setelah baris pertama j sudah mencapai nilai tertentu (misal j = 3).
Ketika masuk ke iterasi berikutnya, j tidak lagi 0, sehingga kondisi j < i mungkin langsung false, dan tidak ada bintang yang dicetak. Akibatnya, hanya baris pertama saja yang muncul, baris selanjutnya kosong.


## Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

1. Jelaskan apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop dan mengapa inisialisasinya (total = 0) berada di dalam outer loop, bukan di luar ?

   Jawaban :

   yang terjadi di totalNilai di setiap iterasi outer loop adalah variabel totalNilai digunakan untuk menjumlahkan semua nilai dari penilai pada setiap kelompok dan setiap kali loop luar/while berjalan, totalNilai di reset ke 0 agar perhitungan nilai untuk kelompok baru tidak tercampur dengan kelompok sebelumnya

   mengapa totalNilai = 0 berada di dalam outer loop ? karena setiap kelompok memiliki nilai penilaiannya sendiri dan ingin menghitung rata-rata perkelompok
  
2. Modifikasi program di atas, sehingga dapat mencari kelompok dengan rata-rata nilai tertinggi dan tampilkan nomor kelompok tersebut

   Jawaban :

   telah di modifikasikan

   import java.util.Scanner;

public class NilaiKelompok13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j, nilai;
        float totalNilai, rataNilai;
        float maxRata = 0;
        int kelompokMax = 0;

        
        while (i <= 6) {
            System.out.println("\nKelompok " + i);

            totalNilai = 0; 

          
            for (j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari penilai ke-" + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

           
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + " : nilai rata-rata = " + rataNilai);

           
            if (rataNilai > maxRata) {
                maxRata = rataNilai;
                kelompokMax = i;
            }

            i++;
        }

        
        System.out.println("\n=======================================");
        System.out.println("Kelompok dengan rata-rata tertinggi adalah: Kelompok " 
                           + kelompokMax + " dengan nilai rata-rata " + maxRata);
        System.out.println("=======================================");

        sc.close();
    }
}


## TUGAS 

1. Buatlah program untuk menghitung dan menampilkan jumlah kuadrat bilangan 1 s.d
n. Gunakan perulangan bersarang. Berikut output yang diharapkan jika n pada rentang
1 s.d 5.

Jawaban : 

modifikasi kode :

import java.util.Scanner;

 public class kuadrat13 {
 
  public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      int n = 5;

      for ( int i = 1; i <= n; i++) {
          int jumlah = 0;
          String rincian = "";

      for (int j = 1; j <= i; j++) {
          jumlah += j * j;
          rincian += j * j;
          if (j < i) {
              rincian += " + ";
         }
       }

       System.out.println("n = " + i +" \u2192 Jumlah kuadrat = "  + rincian + "=" + jumlah);
      }
   }
 }

 *HASILNYA:* 

 <img width="575" height="186" alt="Screenshot 2025-11-03 050246" src="https://github.com/user-attachments/assets/7df1a81d-4e87-435e-b3f3-2eb1fbb6d785" />

2. Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan input n (nilai n minimal 3). Contoh n = 3, dan n = 5

   Jawaban :

   modifikasi kode :

   import java.util.Scanner;

public class persegi13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3!");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

*Hasilnya:* 

<img width="125" height="269" alt="Screenshot 2025-11-03 050450" src="https://github.com/user-attachments/assets/b2c99c9a-9346-4ef0-9acf-b5fea86a6952" />


3.	Sebuah jaringan kafe “Kopi Senja” memiliki beberapa cabang di berbagai lokasi kota. Untuk memantau kinerja operasional harian, manajemen membutuhkan data sederhana mengenai aktivitas penjualan di setiap cabang. Setiap hari, setiap cabang melayani sejumlah pelanggan, dan setiap pelanggan memesan satu atau lebih item, baik berupa makanan maupun minuman. Buatlah program untuk mencatat dan menghitung banyak pelanggan dan total item yang terjual pada masing-masing cabang. Karena sistem yang digunakan masih sederhana dan tidak menyimpan data historis, program hanya perlu mencatat secara langsung berapa banyak pelanggan yang dilayani dan berapa total item yang terjual di masing-masing cabang, tanpa perlu menyimpan nama pelanggan, jenis menu, atau detail lainnya. Program akan meminta input jumlah cabang terlebih dahulu. Lalu untuk setiap cabang, operator memasukkan jumlah pelanggan yang datang hari ini. Selanjutnya, untuk setiap pelanggan, operator memasukkan jumlah item yang dipesan. Program kemudian menghitung dan menampilkan ringkasan penjualan per cabang, serta total keseluruhan dari seluruh cabang pada akhir sesi. Berikut adalah contoh input dan output program:

Jawaban : 

import java.util.Scanner;

public class kopiSenja1 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
       
        int total_pelanggan_keseluruhan = 0;
        int total_item_keseluruhan = 0;
        
       
        System.out.print(" jumlah cabang kafe: ");
        int jumlah_cabang = sc.nextInt();
        
        
        for (int cabang = 1; cabang <= jumlah_cabang; cabang++) {
            System.out.println("\nCabang " + cabang + ":");
            
           
            System.out.print("Masukkan jumlah pelanggan? ");
            int jumlah_pelanggan = sc.nextInt();
            
            
            int total_item_cabang = 0;
            
            
            for (int pelanggan = 1; pelanggan <= jumlah_pelanggan; pelanggan++) {
                
                System.out.print("Masukkan jumlah item untuk pelanggan " + pelanggan + "? ");
                int jumlah_item = sc.nextInt();
                total_item_cabang += jumlah_item;
            }
            
            
            System.out.println("Cabang " + cabang + ": " + jumlah_pelanggan + " pelanggan, " + total_item_cabang + " item");
            
            total_pelanggan_keseluruhan += jumlah_pelanggan;
            total_item_keseluruhan += total_item_cabang;
        }
        
       
        System.out.println("\nTotal keseluruhan:");
        System.out.println("Total pelanggan: " + total_pelanggan_keseluruhan);
        System.out.println("Total item: " + total_item_keseluruhan);
        
        sc.close();
    }
}









   




   

