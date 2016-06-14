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
public class ItemDeterminista {

    private int Sn;
    private int Xn;
    private double fnSn;
    
    public ItemDeterminista(int fila, double valor) {
        this.Sn = fila;
        this.Xn = fila;
        this.fnSn = valor;
    }
    
}
