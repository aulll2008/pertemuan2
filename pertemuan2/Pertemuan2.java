/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan2;

/**
 *
 * @author DILAISA
 */
public class Pertemuan2 {
//instan variabel
    public String Variabelku="instabce variabel";
    
    public void Methodku(){
        
        String Variabelku = "inside Method";
        System.out.println(Variabelku);
    }
    public static void main(String[] args) {
        
        Pertemuan2 objek = new Pertemuan2();
        System.out.println("pepeleg 2");
        objek.Methodku();
        System.out.println(objek.Variabelku);
    }
}
