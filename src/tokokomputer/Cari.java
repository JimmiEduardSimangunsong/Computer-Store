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
//class interface
public class Cari implements Lowongan{
   @Override
   public void usia(){
       System.out.println("Usia : 20 tahun sampai 25 tahun");
   }
   
   @Override
   public void jenisKelamin(){
       System.out.println("Jenis Kelamin : Laki-Laki");
   }
   
   @Override
   public void kriteria(){
       System.out.println("Kriteria yang Dibutuhkan : Menguasai Hardware Komputer");
   }
   
   @Override
   public void posisi(){
       System.out.println("Posisi yang Dibutuhkan : MD(Marchentdaisher)");
   }
   
    
}
