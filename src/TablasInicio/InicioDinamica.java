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
public class InicioDinamica {
    
    private int Sn;
    private int Xn;
    private int fAnSn;
    
    public InicioDinamica(int fila, int valor) {
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

    public int getFnSn() {
        return fAnSn;
    }

    public void setFnSn(int fnSn) {
        this.fAnSn = fnSn;
    }
    
    
}
