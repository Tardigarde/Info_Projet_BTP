/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.insa_BITAT_Ilian.projet_devis_btp;

/**
 *
 * @author ibitat01
 */
public class Projet_Devis_BTP {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Coin c1 = new Coin (100,10.0,20.0);
        Coin c2 =new Coin (101,30.0,50.0);
        Mur m1= new Mur (1000,c1,c2);
        System.out.println(m1.longueur());
        System.out.println(m1.surface());
    }

    
    
}
