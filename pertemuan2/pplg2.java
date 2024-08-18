/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author DILAISA
 */
public class pplg2 {
    public static String myClassVar="class or static variabel";
    
    public static void main(String args[]){
        pplg2 objek  = new pplg2();
        pplg2 objek2 = new pplg2();
        pplg2 objek3 = new pplg2();
        
        System.out.println(objek.myClassVar);
        System.out.println(objek2.myClassVar);
        System.out.println(objek3.myClassVar);
        
        objek2.myClassVar = "kelas pplg 2 hebat!";
        
        System.out.println(objek.myClassVar);
        System.out.println(objek2.myClassVar);
        System.out.println(objek3.myClassVar);
        
    }
}
