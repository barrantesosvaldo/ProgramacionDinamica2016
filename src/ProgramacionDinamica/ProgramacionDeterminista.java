/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionDinamica;

import TablasInicio.ItemDeterminista;
import java.util.ArrayList;

/**
 *
 * @author fabio
 */
public class ProgramacionDeterminista {
    
    private ArrayList<ArrayList<Double>> tablaOrigen;
    private ArrayList<ItemDeterminista> tablaInicio;
    private int n;
    private boolean tipoValores;
    private boolean formula;
    
    public ProgramacionDeterminista(boolean tipoValores, boolean formula, ArrayList<ArrayList<Double>> tablaOrigen, int n) {
        this.tipoValores = tipoValores;
        this.formula = formula;
        this.tablaOrigen = tablaOrigen;
        this.n = n;
        this.tablaInicio = generarTablaInicio();
    }
    
    private int FormulaFnDinamica(int Sn, int Xn){
        //Fn(Sn, Xn) = Pn(Xn) + fn+1(Sn-Xn)
        return 0;
    }
    
    private int FormulaFnDeterminista(int Sn, int Xn){
        //Fn(Sn, Xn) = Pn(Xn) * fn+1(Sn-Xn)
        return 0;
    }

    private ArrayList<ItemDeterminista> generarTablaInicio() {
        ArrayList<ItemDeterminista> tbInicio = new ArrayList<>();
        for (int i = 0; i < tablaOrigen.size(); i++) {
            ItemDeterminista iDeterminista = new ItemDeterminista(i,tablaOrigen.get(i).get(n-1));
            tbInicio.add(iDeterminista);
        }
        return tbInicio;
    }
    
}
