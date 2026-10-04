/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempengelolaanpersediaanfarmasi;

/**
 *
 * @author Talitha Reva Nabila
 */

public class AlatKesehatan extends ProdukFarmasi {
    private String kategoriAlat;
    
    public AlatKesehatan (String idProduk, String namaProduk, double harga, 
                          int stok, String expired, String kategoriAlat) {
        super(idProduk, namaProduk, harga, stok, expired);
        this.kategoriAlat = kategoriAlat;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.print("[Alat Kesehatan] ");
        super.tampilkanInfo();
        System.out.printf(" | Kategori Alat: %-15s\n", this.kategoriAlat);
    }
}
