/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempengelolaanpersediaanfarmasi;

/**
 *
 * @author Talitha Reva Nabila
 */
public class Obat extends ProdukFarmasi {
    private String dosis;
    private String jenis;
    
    public Obat(String idProduk, String namaProduk, double harga, int stok, 
                String expired, String dosis, String jenis) {
        super(idProduk, namaProduk, harga, stok, expired);
        this.dosis = dosis;
        this.jenis = jenis;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.print("[Obat] ");
        super.tampilkanInfo();
        System.out.printf(" | Dosis: %-5s | Jenis: %-5s\n", this.dosis, this.jenis);
    }
    
    @Override
    public void caraSimpan() {
        System.out.println("SOP Simpan Obat: Simpan di tempat yang sejuk dan hindari sinar matahari langsung agar zat aktif tidak rusak.");
    }
}
