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
public class IntermediaDeterministaFila {
    private int Sn;
    private ArrayList<Double> fnSnXn; //contiene los Xn
    private int FAnSn;
    private ArrayList<Double> XAn;

    public IntermediaDeterministaFila(int Sn, ArrayList<Double> fnSnXn) {
        this.Sn = Sn;
        this.fnSnXn = fnSnXn;
    }

    public int getSn() {
        return Sn;
    }

    public void setSn(int Sn) {
        this.Sn = Sn;
    }

    public ArrayList<Double> getFnSnXn() {
        return fnSnXn;
    }

    public void setFnSnXn(ArrayList<Double> fnSnXn) {
        this.fnSnXn = fnSnXn;
    }

    public int getFAnSn() {
        return FAnSn;
    }

    public void setFAnSn(int FAnSn) {
        this.FAnSn = FAnSn;
    }

    public ArrayList<Double> getXAn() {
        return XAn;
    }

    public void setXAn(ArrayList<Double> XAn) {
        this.XAn = XAn;
    }
    
}
