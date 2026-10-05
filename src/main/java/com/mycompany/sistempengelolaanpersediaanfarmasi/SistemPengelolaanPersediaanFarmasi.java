/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistempengelolaanpersediaanfarmasi;
import java.util.Scanner;

/**
 *
 * @author Talitha Reva Nabila
 */

public class SistemPengelolaanPersediaanFarmasi {
    
    public static void cariProduk(String namaProduk, ProdukFarmasi[] daftarProduk, int jumlahProduk) {
        System.out.println("Mencari produk berdasarkan nama: " + namaProduk);
        boolean ditemukan = false;
        for (int i = 0; i < jumlahProduk; i++) {
            if (daftarProduk[i].getNamaProduk().equalsIgnoreCase(namaProduk)) { 
                System.out.print("Ditemukan: ");
                daftarProduk[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Produk tidak ditemukan.");
    }
    
    public static void cariProduk(int stok, ProdukFarmasi[] daftarProduk, int jumlahProduk) {
        System.out.println("Mencari produk berdasarkan stok: " + stok);
        boolean ditemukan = false;
        for (int i = 0; i < jumlahProduk; i++) {
            if (daftarProduk[i].getStok()== stok) { 
                System.out.print("Ditemukan: ");
                daftarProduk[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Produk tidak ditemukan.");
    }

    public static void cariExpired(String expired, ProdukFarmasi[] daftarProduk, int jumlahProduk) {
        System.out.println("Mencari produk berdasarkan tanggal kedaluwarsa: " + expired);
        boolean ditemukan = false;
        for (int i = 0; i < jumlahProduk; i++) {
            if (daftarProduk[i].getExpired().equalsIgnoreCase(expired)) { 
                System.out.print("Ditemukan: ");
                daftarProduk[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Produk tidak ditemukan.");
    }
    
    public static void simulasiSimpan(ProdukFarmasi item) {
        item.caraSimpan();
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ProdukFarmasi[] daftarProduk = new ProdukFarmasi[10];
            
        int jumlahProduk = 0;
        boolean isRunning = true;
            
        System.out.println("==============================================");
        System.out.println("    SISTEM PENGELOLAAN PERSEDIAAN FARMASI!    ");
        System.out.println("==============================================");            
            
        while(isRunning) {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Tambah Produk Farmasi");
            System.out.println("2. Lihat Daftar Produk");
            System.out.println("3. Cari Produk");
            System.out.println("4. Update Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu (1-5): ");
                
            int pilihan = scanner.nextInt();
            scanner.nextLine();
               
            switch(pilihan) {
                case 1:
                    if (jumlahProduk < daftarProduk.length) {
                    
                        System.out.println("\n-- Pilih Kategori Produk --");
                        System.out.println("1. Obat");
                        System.out.println("2. Alat Kesehatan");
                        System.out.println("3. Kosmetik");
                        System.out.print("Pilihan (1/2/3): ");

                        int kategori = scanner.nextInt();
                        scanner.nextLine();
                            
                        System.out.print("Masukkan ID Produk: ");
                        String idProduk = scanner.nextLine();
                            
                        System.out.print("Masukkan Nama Produk: ");
                        String namaProduk = scanner.nextLine();
                            
                        System.out.print("Masukkan Harga Produk: ");
                        double harga = scanner.nextInt();
                        scanner.nextLine();
                        
                        System.out.print("Masukkan Stok Produk: ");
                        int stok = scanner.nextInt();
                        scanner.nextLine();
                        
                        System.out.print("Masukkan Tanggal Kedaluwarsa: ");
                        String expired = scanner.nextLine();
                            
                        if (kategori == 1) {
                            System.out.print("Masukkan Dosis Obat: ");
                            String dosis = scanner.nextLine();
                            
                            System.out.print("Masukkan Jenis Obat: ");
                            String jenis = scanner.nextLine();
                            scanner.nextLine();
                            
                            daftarProduk[jumlahProduk] = new Obat(idProduk, namaProduk, harga, stok, expired, dosis, jenis);
                        } else if (kategori == 2) {
                            System.out.print("Masukkan Kategori Alat: ");
                            String kategoriAlat = scanner.nextLine();
                            scanner.nextLine();
                            
                            daftarProduk[jumlahProduk] = new AlatKesehatan(idProduk, namaProduk, harga, stok, expired, kategoriAlat);
                        } else if (kategori == 3) {
                            System.out.print("Masukkan Jenis Kulit: ");
                            String jenisKulit = scanner.nextLine();
                            
                            System.out.print("Masukkan Area Penggunaan: ");
                            String areaPenggunaan = scanner.nextLine();
                            scanner.nextLine();
                            
                            daftarProduk[jumlahProduk] = new Kosmetik(idProduk, namaProduk, harga, stok, expired, jenisKulit, areaPenggunaan);
                        }
                            
                        jumlahProduk++;
                        System.out.println("Produk berhasil ditambahkan.");
                    } else {
                        System.out.println("Maaf, kapasitas gudang sudah penuh!");
                    }
                    
                    System.out.print("Tekan Enter untuk melanjutkan...");
                    scanner.nextLine();
                    
                    break;
                case 2:
                    System.out.println("\n Daftar Produk Farmasi ");
                    if (jumlahProduk == 0) {
                        System.out.println("Belum ada produk yang ditambahkan");
                    } else {
                        for (int i = 0; i < jumlahProduk; i++) {
                            System.out.print((i + 1) + ". ");
                            daftarProduk[i].tampilkanInfo();
                            simulasiSimpan(daftarProduk[i]);
                            System.out.println();
                        }
                            
                        System.out.println("\nTotal Produk Farmasi yang Terdaftar: " + ProdukFarmasi.totalProdukDitambahkan);
                    }
                    
                    System.out.print("Tekan Enter untuk melanjutkan...");
                    scanner.nextLine();
                    
                    break;
                case 3:
                    System.out.println("\n Cari Produk ");
                    System.out.println("1. Cari Berdasarkan Nama");
                    System.out.println("2. Cari Berdasarkan Stok");
                    System.out.println("3. Cari Berdasarkan Tanggal Kedaluwarsa");
                    System.out.print("Pilih (1/2/3): ");
                    
                    int tipeCari = scanner.nextInt();
                    scanner.nextLine(); 
                        
                    if (tipeCari == 1) {
                        System.out.print("Masukkan Nama Produk: ");
                        String kataKunci = scanner.nextLine();
                        cariProduk(kataKunci, daftarProduk, jumlahProduk);
                    } else if (tipeCari == 2) {
                        System.out.print("Masukkan Jumlah Stok: ");
                        int angkaKunci = scanner.nextInt();
                        cariProduk(angkaKunci, daftarProduk, jumlahProduk);
                    } else if (tipeCari == 3) {
                        System.out.print("Masukkan Tanggal Kedaluwarsa: ");
                        String kataKunci = scanner.nextLine();
                        cariExpired(kataKunci, daftarProduk, jumlahProduk);
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                        
                    System.out.print("Tekan Enter untuk melanjutkan...");
                    scanner.nextLine();
                    
                    break;
                case 4:
                    System.out.println("\n  Update Stok  ");
                    
                    if (jumlahProduk == 0) {
                        System.out.println("Belum ada produk yang tersimpan.");
                    } else {
                        System.out.print("Masukkan nama produk yang akan di-update: ");
                        String namaUpdate = scanner.nextLine();
                        boolean namaDitemukan = false;
                        
                        for (int i = 0; i < jumlahProduk; i++) {
                            if (daftarProduk[i].getNamaProduk().equalsIgnoreCase(namaUpdate)) {
                                namaDitemukan = true;
                                System.out.println("Produk ditemukan: " + daftarProduk[i].getNamaProduk() + " | Stok saat ini: " + daftarProduk[i].getStok());
                                System.out.println("1. Tambah Stok");
                                System.out.println("2. Kurangi Stok (Terjual/Kedaluwarsa/Rusak)");
                                System.out.print("Pilih (1/2): ");
                                
                                int tipeUpdate = scanner.nextInt();
                                scanner.nextLine();
                                
                                if (tipeUpdate == 1) {
                                    System.out.print("Masukkan jumlah stok yang ditambahkan: ");
                                    int jumlah = scanner.nextInt();
                                    scanner.nextLine();
                                    daftarProduk[i].updateStok(jumlah);
                                } else if (tipeUpdate == 2) {
                                    System.out.print("Masukkan jumlah stok dikurangi: ");
                                    int jumlah = scanner.nextInt();
                                    scanner.nextLine();
                                    
                                    System.out.print("Masukkan alasan (terjual/kedaluwarsa/rusak): ");
                                    String alasan = scanner.nextLine();
                                    
                                    daftarProduk[i].updateStok(jumlah, alasan);
                                } else {
                                    System.out.println("Pilihan tidak valid.");
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan Sistem Pengelolaan Persediaan Farmasi.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan masukkan angka 1-5.");
                    scanner.nextLine();
                    break;
            }
        }
    }
}
