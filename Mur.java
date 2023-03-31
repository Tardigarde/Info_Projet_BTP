/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.insa_BITAT_Ilian.projet_devis_btp;
import java.lang.Math;
/**
 *
 * @author ibitat01
 */
public class Mur {
    int idMur;
    Coin debut;
    Coin fin;

    public Mur(int idMur, Coin debut, Coin fin) {
        this.idMur = idMur;
        this.debut = debut;
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Mur{" + "idMur=" + idMur + ", debut=" + debut + ", fin=" + fin + '}';
    }
    public double longueur (){
        return Math.sqrt(Math.pow(fin.getX()- debut.getX(),2)+ Math.pow(fin.getY()- debut.getY(),2));
    }
    public double surface (){
        double hsp=Lire.d();
        return hsp * this.longueur();
    }
}
