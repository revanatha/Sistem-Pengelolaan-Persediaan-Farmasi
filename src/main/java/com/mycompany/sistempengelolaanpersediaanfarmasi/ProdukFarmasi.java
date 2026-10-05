/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempengelolaanpersediaanfarmasi;

/**
 *
 * @author Talitha Reva Nabila
 */
public class ProdukFarmasi {
    private String idProduk;
    private String namaProduk;
    private double harga;
    private int stok;
    private String expired;
    
    public static int totalProdukDitambahkan = 0;
    
    public ProdukFarmasi(String idProduk, String namaProduk, double harga, int stok, String expired) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
        this.expired = expired;
        totalProdukDitambahkan++;
    }
    
    public String getIdProduk() {
        return idProduk;
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public int getStok() {
        return stok;
    }
    
    public String getExpired() {
        return expired;
    }
    
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Error: Harga tidak boleh negatif!");
        }
    }
    
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        }
    }
    
    public void tampilkanInfo() {
        System.out.printf("ID: %-5s | Nama Produk: %-15s | Harga: Rp%.2f | Stok: %d | Exp: %-10s ", 
                           this.idProduk, this.namaProduk, this.harga, this.stok, this.expired);
    }
    
    public void updateStok(int jumlah) {
        this.stok += jumlah;
        System.out.println("Stok berhasil ditambah. Stok sekarang: " + jumlah);
    }
    
    public void updateStok(int jumlah, String alasan) {
        if (this.stok - jumlah < 0) {
            System.out.println("Error: Stok tidak mencukup untuk dikurangi.");
        } else {
            this.stok -= jumlah;
            System.out.println("Stok berhasil dikurangi karena " + alasan);
            System.out.println("Stok sekarang: " + this.stok);
        }
    }
    
    public void caraSimpan() {
        System.out.println("SOP penyimpanan belum ditemukan.");
    }
}
