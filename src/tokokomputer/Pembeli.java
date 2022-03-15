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
public class Pembeli {
    //property
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String noTelp;
    private String alamat;
    private String barangygdibeli;
    
    public Pembeli(String nama,int umur,String jenisKelamin,String noTelp,String alamat,String barangygdibeli)
    {
        this.nama=nama;
        this.umur=umur;
        this.jenisKelamin=jenisKelamin;
        this.noTelp=noTelp;
        this.alamat=alamat;
        this.barangygdibeli=barangygdibeli;
        
        
    }
    
    //method  
    public void cetakinfoPembeli()
            {
              System.out.println("Nama Pembeli :"+ nama +"\n"
              +"Umur Pembeli :"+umur +"\n"+"Jenis Kelamin :"+jenisKelamin+"\n"+"Nomor Telpon :"+noTelp+"\n"+"Alamat :"+alamat+"\n"
              +"Barang yang Dibeli :"+barangygdibeli+"\n");  
                
            } 
}
