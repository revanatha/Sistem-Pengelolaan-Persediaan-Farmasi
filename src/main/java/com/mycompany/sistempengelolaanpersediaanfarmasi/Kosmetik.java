/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempengelolaanpersediaanfarmasi;

/**
 *
 * @author Talitha Reva Nabila
 */
public class Kosmetik extends ProdukFarmasi {
    private String jenisKulit;
    private String areaPenggunaan;
    
    public Kosmetik(String idProduk, String namaProduk, double harga, int stok, String expired, String jenisKulit, String areaPenggunaan) {
        super(idProduk, namaProduk, harga, stok, expired);
        this.jenisKulit = jenisKulit;
        this.areaPenggunaan = areaPenggunaan;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.print("[Kosmetik] ");
        super.tampilkanInfo();
        System.out.printf(" | Jenis Kulit: %-15s | Area Penggunaan: %-10s\n", this.jenisKulit, this.areaPenggunaan);
    }
    
    @Override
    public void caraSimpan() {
        System.out.println("SOP Simpan Kosmetik: Simpan di suhu ruang, pastikan tertutup rapat, dan hindari paparan sinar matahari langsung.");
    }
}
