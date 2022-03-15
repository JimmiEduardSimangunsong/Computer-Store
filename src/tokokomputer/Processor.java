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
public class Processor extends Barang {
    //property
    private double frekuensiDasar=0;
    private double turboBoost=0;
    
    //overridng methode abstrak
    public  String tampilJenisBarang(){
        return"ini processor";
    }
    
    public Processor(String namaBarang,int hargaBarang,int stokBarang,double frekuensiDasar,double turboBoost){
       super(namaBarang,hargaBarang,stokBarang);
       this.frekuensiDasar = frekuensiDasar;
       this.turboBoost = turboBoost;
        }
    //setter dan getter

    public double getFrekuensiDasar() {
        return frekuensiDasar;
    }

    public void setFrekuensiDasar(double frekuensiDasar) {
        this.frekuensiDasar = frekuensiDasar;
    }

    public double getTurboBoost() {
        return turboBoost;
    }

    public void setTurboBoost(double turboBoost) {
        this.turboBoost = turboBoost;
    }
    
    //overriding
    @Override
      public void cetakinfoBarang()
    {
        super.cetakinfoBarang();
        System.out.println("Frekuensi Dasar: "+this.frekuensiDasar
        +"\n"+"Turbo Boost :"+this.turboBoost+"\n");
    }
    
}
