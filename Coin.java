/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.insa_BITAT_Ilian.projet_devis_btp;

/**
 *
 * @author ibitat01
 */
public class Coin {
      private int  idCoin;
      private double x;
      private double y;
    
    public Coin(int idCoin, double x, double y){
        this.idCoin=idCoin;
        this.x=x;
        this.y=y;   
    }
    public String afficher(){
        return "id="+ idCoin+ " x="+x+" y ="+y ;
    }
    public double getX() {
        return x;
    }

    public int getIdCoin() {
        return idCoin;
    }

    public double getY() {
        return y;
    }

    public void setIdCoin(int idCoin) {
        this.idCoin = idCoin;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
