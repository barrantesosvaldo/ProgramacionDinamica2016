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
public class IntermediaDinamicaFila {
    private int Sn;
    private ArrayList<Integer> fnSnXn; //contiene los Xn
    private int FAnSn;
    private ArrayList<Integer> XAn;
    
    public void buscarFAnSn(){
        for(int i = 0; i < fnSnXn.size(); i++){
            if(i == 0){
                FAnSn =  fnSnXn.get(i);
                XAn.add(i);
            }
            else{
                if(fnSnXn.get(i) == -1){
                }
                else if(FAnSn == fnSnXn.get(i)){
                    XAn.add(i);
                }
                else if(FAnSn < fnSnXn.get(i)){
                    XAn.clear();
                    FAnSn =  fnSnXn.get(i);
                    XAn.add(i);
                }
            }
        }
    }

    public int getSn() {
        return Sn;
    }

    public void setSn(int Sn) {
        this.Sn = Sn;
    }

    public ArrayList<Integer> getFnSnXn() {
        return fnSnXn;
    }

    public void setFnSnXn(ArrayList<Integer> fnSnXn) {
        this.fnSnXn = fnSnXn;
    }

    public int getFAnSn() {
        return FAnSn;
    }

    public void setFAnSn(int FAnSn) {
        this.FAnSn = FAnSn;
    }

    public ArrayList<Integer> getXAn() {
        return XAn;
    }

    public void setXAn(ArrayList<Integer> XAn) {
        this.XAn = XAn;
    }
    
    public IntermediaDinamicaFila(int Sn, ArrayList<Integer> fnSnXn) {
        this.Sn = Sn;
        this.fnSnXn = fnSnXn;
        this.XAn = new ArrayList<>();
    }

    public void iniciarFnSnXn(int nColumnas) {
        for(int i = 0; i < nColumnas; i++){
            fnSnXn.add(-1);
        }
    }
    
    public void setCasilla(int k, int resF){
        fnSnXn.set(k, resF);
    }
    
}
