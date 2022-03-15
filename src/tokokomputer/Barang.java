/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokokomputer;

/**
 *
 * @author User
 */
abstract class Barang {
     //property/atribute
    private String namaBarang ="Belum ada nama";
    private int hargaBarang =0;
    private int stokBarang =0;
    
    //methode abstrak
    public abstract String tampilJenisBarang();
    
    //method/beavior
    //method constructor
    //constructor untuk mengisi nilai property
    //untuk pengisian di argumen/parameter hanya 1 atau 2 buat constraktor barang lain
    
    public Barang()
    {}
    
    public Barang(String namaBarang){
        this.namaBarang = namaBarang;
    }
    
    public Barang(String namaBarang,int hargaBarang){
        this.namaBarang = namaBarang;
        this.hargaBarang = this.hargaBarang;
    }
    
    public Barang(String namaBarang,int hargaBarang,int stokBarang)
    {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.stokBarang = stokBarang;
    }
    //method wajib 
    // methode overloading jika tidak ada parameter otomatis -1
    
    public void tambahStok()
    {
        stokBarang = stokBarang +1;
        System.out.println("Stok Barang Berhasil Ditambahkan Menjadi=" + stokBarang + "\n");
    }
    
    public void tambahStok(int jmlTambah)
    {
        stokBarang = stokBarang + jmlTambah;
        System.out.println("Stok Barang Berhasil Ditambahkan Menjadi=" + stokBarang + "\n");
    }
    
      public void kurangiStok()
    {
        stokBarang -= 1;
        System.out.println("Stok Barang Berhasil Dikurangi Menjadi" + stokBarang +"\n");
    }
    
    public void kurangiStok(int jmlKurang)
    {
        stokBarang -= jmlKurang;
        System.out.println("Stok Barang Berhasil Dikurangi Menjadi" + stokBarang +"\n");
    }
    public boolean cekStok()
    {
        if(stokBarang >0){
            return true;
        }else
            return false;
    }
    public void cetakinfoBarang()
    {
        System.out.println("Nama Barang :"+ this.namaBarang +"\n"+"harga Barang :"
        + this.hargaBarang +"\n"+"Stok Barang :"+ this.stokBarang+"pcs");
    }
    
    //method setter(tidak mengembalikan nilai
    public void setNamaBarang(String namaBarang)
    {
        this.namaBarang=namaBarang;
    }
    public void setHargaBarang(int hargaBarang)
    {
        this.hargaBarang=hargaBarang;
    }
    public void setStokBarang(int stokBarang)
    {
        this.stokBarang=stokBarang;
    }
    
    //method getter(mengembalikan nilai
    public String getNamaBarang()
    {
        return this.namaBarang;
    }
    public int getHargaBarang()
    {
        return this.hargaBarang;
    }
    public int getStokBarang()
    {
        return this.stokBarang;
    }
}
