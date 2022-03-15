/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokokomputer;
import tokokomputer.Barang;

/**
 *
 * @author User
 */
public class Keyboard extends Barang{
    //property
    private String backlight="Tidak ada backlight";
    private int banyakKeys=0;
    private String tipeSwitch="Tidak ada switch";
    
    //overridng methode abstrak
    public  String tampilJenisBarang(){
        return"ini keyboard";
    }
    
    //method
    public Keyboard(String namaBarang,int hargaBarang,int stokBarang,String backlight,int banyakKeys,String tipeSwitch){
       super(namaBarang,hargaBarang,stokBarang);
       this.backlight = backlight;
       this.banyakKeys = banyakKeys;
       this.tipeSwitch = tipeSwitch;
}

    public String getBacklight() {
        return backlight;
    }

    public void setBacklight(String backlight) {
        this.backlight = backlight;
    }

    int getBanyakKeys() {
        return banyakKeys;
    }

    public void setBanyakKeys(int banyakKeys) {
        this.banyakKeys = banyakKeys;
    }

    public String getTipeSwitch() {
        return tipeSwitch;
    }

    public void setTipeSwitch(String tipeSwitch) {
        this.tipeSwitch = tipeSwitch;
    }
    
    //overriding-----> polimorfisme dinamis
    @Override
      public void cetakinfoBarang()
    {
        super.cetakinfoBarang();
        System.out.println("Backlight: "+this.backlight
        +"\n"+"Banyak Keys :"+this.banyakKeys+"\n"+"Tipe Switch :"+this.tipeSwitch+"\n");
    }
}
