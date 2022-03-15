/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokokomputer;
import tokokomputer.*;

/**
 *
 * @author User
 */
public class TokoKomputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //instasiasi Objec dari class barang
      Keyboard key1 = new Keyboard("Vortex series VX7",1000000,97,"RGB",87,"outemu Blue"); 
      key1.cetakinfoBarang();
      key1.tambahStok(5);
      key1.cetakinfoBarang();
      
      Processor proc1 = new Processor("AMD Ryzen 5 3600",3000000,24,3.6,4.2);
      proc1.cetakinfoBarang();
      proc1.kurangiStok(4);
      proc1.cetakinfoBarang();
    
        //Instaisasi Objec Pembeli
        
        Pembeli pembeli1 = new Pembeli("Burju Orlando",21,"Laki-Laki","081268728003","Pasir Jaya","Keyboard series VX7");
        pembeli1.cetakinfoPembeli();
        
        Pembeli pembeli2 = new Pembeli("Inneke Dhea Fanny",19,"Perempuan","082268564523","Tambah Jaya","Processor AMD Ryzen 5 3600" );
        pembeli2.cetakinfoPembeli();
        
        Pekerja outerclass = new Pekerja();
        Pekerja.pekerja1 data1 =outerclass.new pekerja1();
        Pekerja.pekerja2 data2 =outerclass.new pekerja2();
        
        System.out.println("======Data Pekerja 1======");
        data1.Tampilkan();
        System.out.println("======Data Pekerja 2======");
        data2.Tampilkan();
        
        
        Cari cari1 =new Cari();
        System.out.println("======Info Lowongan Pekerjaan Jim's Komputer======");
        cari1.usia();
        cari1.jenisKelamin();
        cari1.kriteria();
        cari1.posisi();
    }
    
}
