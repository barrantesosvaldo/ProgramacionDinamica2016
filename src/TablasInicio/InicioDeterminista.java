/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasInicio;

/**
 *
 * @author fabio
 */
public class InicioDeterminista {

    private int Sn;
    private int Xn;
    private double fAnSn;
    
    public InicioDeterminista(int fila, double valor) {
        this.Sn = fila;
        this.Xn = fila;
        this.fAnSn = valor;
    }
    
    public int getSn() {
        return Sn;
    }

    public void setSn(int Sn) {
        this.Sn = Sn;
    }

    public int getXn() {
        return Xn;
    }

    public void setXn(int Xn) {
        this.Xn = Xn;
    }

    public double getFnSn() {
        return fAnSn;
    }

    public void setFnSn(double fnSn) {
        this.fAnSn = fnSn;
    }
    
}
