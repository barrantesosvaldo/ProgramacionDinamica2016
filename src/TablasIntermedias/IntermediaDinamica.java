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
public class IntermediaDinamica {
    private int n;
    private ArrayList<IntermediaDinamicaFila> filas;
    
    public IntermediaDinamica(int n){
        this.n = n;
        this.filas = new ArrayList<>();
    }
    
    public void addFila(int Sn){
        ArrayList<Integer> fnSnXn = new ArrayList<Integer>();
        IntermediaDinamicaFila fila = new IntermediaDinamicaFila(Sn, fnSnXn);
        filas.add(fila);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<IntermediaDinamicaFila> getFilas() {
        return filas;
    }

    public void setFilas(ArrayList<IntermediaDinamicaFila> fila) {
        this.filas = fila;
    }
    
    public IntermediaDinamicaFila getFila(int i){
        return filas.get(i);
    }
    
    
}
