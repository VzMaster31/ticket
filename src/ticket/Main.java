/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.Scanner;

/**
 *
 * @author 4d3h3
 */
public class Main {
    
    public static void ticketList(Tiket[] tickets) {
        System.out.println("=========================================");
        System.out.println("= Tiket Kereta jurusan Surabaya Jakarta =");
        
        for (int i = 0; i < tickets.length; i++) {
            System.out.println((i + 1) + ". " + tickets[i].ambilNama() + " : " + tickets[i].ambilHarga());
        }
        
        System.out.println("=========================================");
    }
    
    public static void main(String[] args) {
        /**
         * Membuat array / list untuk tiket-tiket yang ada di aplikasi
         * Tipe data menggunakan interface Ticket
         * 
         * new Ekonomi/Bisnis/Eksekutif adalah deklarasi objek dengan class
         * tersebut (Economy/Business/Executive)
         */
        Tiket[] tickets = {
            new Ekonomi("Ekonomi"),
            new Bisnis("Bisnis"),
            new Eksekutif("Eksekutif")
        };
        
        /**
         * Menjalankan method start (Memulai aplikasinya)
         */
        start(tickets);
    }
    
    public static void start(Tiket[] tickets) {
        /**
         * Deklarasi variabel boolean stop agar sistem tahu kapan untuk berhenti
         * apabila variabel berhenti bernilai true maka aplikasi berhenti
         * jika bernilai false maka aplikasi akan lanjut membuat transaksi berikutnya
         */
        boolean berhenti = false;
        
        /**
             * Deklarasi variabel scanner untuk input data transaksinya
             * variabel ticketIndex berisi index tiket yang diisi
             * variabel quantity berisi jumlah penumpang / jumlah tiket yang
             * dibeli
             * variabel price berisi nilai harga tiket tersebut
             */
        Scanner input = new Scanner(System.in);
        int ticketIndex, jumlah = 0, harga, kursi = 80;
        String again;
            
        /**
         * Perulangan aplikasi akan dijalankani selama user menginginkan untuk
         * membuat transaksi lainnya
         */
        while (!berhenti) {
            /**
             * menjalankan method printTicketList
             * Mengoutput / mengeprint list tiket berdasarkan array tiket yang diatas
             * tahan ctrl dan klik fungsi nya untuk melihat
             */
            ticketList(tickets);

            if (kursi < 1 ) {
                System.out.println("Maaf Belum Ada Kursi Tersedia");
                System.out.println("Silahkan Coba di Lain Waktu");
                break;
            }
            /**
             * Print pertanyaan input data
             */
            System.out.println("Kursi Yang Tersedia : " + kursi);
            System.out.println("Masukkan Pilihan Anda");
            System.out.print("Masukkan Kelas = ");
                
                /**
                 * Membuat validasi agar memastikan bahwa input yang dimasukkan
                 * berupa angka
                 */
                while (!input.hasNextInt()) {
                    System.out.println("Untuk Pilihan Kelas Harus Berupa Angka");
                    System.out.print("Masukkan Kelas = ");
                   
                    input.next();
                }

            ticketIndex = input.nextInt();
            
            /**
             * Membuat validasi apabila nomor tiket yang dimasukkan tidak sesuai
             * dengan kriteria
             */
            if (ticketIndex <= 0 || ticketIndex > tickets.length) {
                System.out.println("=================");
                
                System.out.println("!Tolong masukkan nomor tiket sesuai list!");
                
               continue;
            }
            
            
            
            /**
             * Membuat Validasi apabila jumlah penumpang tidak memenuhi kriteria
             */
            
            while(jumlah <= 0) {
                System.out.print("Jumlah Penumpang = ");     
                /**
                 * Membuat validasi agar memastikan bahwa input yang dimasukkan
                 * berupa angka
                 */
                while (!input.hasNextInt()) {
                    System.out.println("!Memasukkan jumlah penumpang Harus Berupa Angka!");
                    System.out.print("Jumlah Penumpang = ");
                   
                    input.next();
                }
                
                jumlah = input.nextInt();
                if (jumlah > kursi) {
                    System.out.println("Maaf Kursi yang anda pesan tidak cukup");
                    jumlah = 0;
                }
            }
            

            int total = tickets[ticketIndex - 1].ambilHarga() * jumlah;
            kursi = kursi - jumlah;
            
            /**
             * Output / print total yang harus dibayar oleh pembeli
             */
            System.out.println("Anda Memilih Kelas : " + tickets[ticketIndex - 1].ambilNama());
            System.out.println("Dengan jumlah penumpang : " + jumlah );
            System.out.println("Maka Total Yang Harus Dibayar: " + total);
            
            System.out.println("=========================================");
            
            jumlah = 0;
            
            
            /**
             * Deklarasi variabel boolean stopAsk agar sistem tahu kapan untuk berhenti
             * bertanya tentang lanjut transaksi atau tidak
             * Bila diisi "y" aplikasi akan melanjutkan ke transaksi selanjutnya
             * Bila diisi "n" aplikasi akan berhenti
             * Bila diisi selain "y" / "n" aplikasi akan lanjut menanyakan lanjut atau tidak
             */
            boolean ulang = false;
            
            while (!ulang) {
                System.out.println("Pesan Tiket Lagi? (Y/N) ");

                again = input.next();

                if (!again.toLowerCase().equals("y") && !again.toLowerCase().equals("n")) {
                    continue;
                }
                
                ulang = true;
                
                if (again.toLowerCase().equals("n")) {
                    System.out.println("");
                    System.out.println("Terima Kasih Telah Memesan tiket disini");
                    System.out.println("Semoga Perjalanan Anda Menyenangkan");
                    berhenti = true;
                }
            }
        }
    }
    
    
    
}
