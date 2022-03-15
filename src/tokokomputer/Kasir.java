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
public class Kasir extends Thread {
    Thread kasir2;
    public static void main(String[] args) {
        Kasir obj = new Kasir();
        obj.kasir2();

        for (int pembeli = 1; pembeli <= 8; pembeli++) {
            try {
                sleep(1000);
                System.out.println("Pelayan 1 Sedang Melayani Pembeli ke : " + pembeli);
            } catch (Exception e) {
                System.out.println("Pelayan 1 Sedang Panic");
            }
        }
    }

    void kasir2() {
        kasir2 = new Thread() {
            public void run() {
                for (int pembeli = 9; pembeli <= 16; pembeli++) {
                    try {

                        System.out.println("Pelayan 2 Sedang Melayani Pembeli ke : " + pembeli);
                        sleep(1500);
                    } catch (InterruptedException e) {
                        System.out.println("Pelayan Sedang Kewalahan");
                    }
                }
            }
        };
        kasir2.start();
    }
    
}
