/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasIntermedias;

import java.util.ArrayList;

/**
 *
 * @author fabio
 */
public class IntermediaDeterminista {
    private int n;
    private ArrayList<IntermediaDeterministaFila> filas;
    
    public IntermediaDeterminista(int n){
        this.n = n;
        this.filas = new ArrayList<>();
    }
    
    public void addFila(int Sn){
        ArrayList<Double> fnSnXn = new ArrayList<Double>();
        IntermediaDeterministaFila fila = new IntermediaDeterministaFila(Sn, fnSnXn);
        filas.add(fila);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<IntermediaDeterministaFila> getFilas() {
        return filas;
    }

    public void setFilas(ArrayList<IntermediaDeterministaFila> fila) {
        this.filas = fila;
    }
    
    
}
