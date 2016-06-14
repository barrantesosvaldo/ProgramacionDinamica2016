/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionDinamica;

import TablasInicio.ItemDinamica;
import java.awt.List;
import java.util.ArrayList;

/**
 * @description Clase para calculos de las formulas
 * @version 1.0
 * @authors Osvaldo Francisco Barrantes Paniagua
 *          Jose Fabio Ávila Estrada
 */
public class ProgramacionDinamica {

    private ArrayList<ArrayList<Integer>> tablaOrigen;
    private ArrayList<ItemDinamica> tablaInicio;
    private int n;
    private boolean tipoValores;
    private boolean formula;
    
    public ProgramacionDinamica(boolean tipoValores, boolean formula, ArrayList<ArrayList<Integer>> tablaOrigen, int n) {
        this.tipoValores = tipoValores;
        this.formula = formula;
        this.tablaOrigen = tablaOrigen;
        this.n = n;
    }
    
    private int FormulaFnDinamica(int Sn, int Xn){
        //Fn(Sn, Xn) = Pn(Xn) + fn+1(Sn-Xn)
        return 0;
    }
    
    private int FormulaFnDeterminista(int Sn, int Xn){
        //Fn(Sn, Xn) = Pn(Xn) * fn+1(Sn-Xn)
        return 0;
    }
    
    private ArrayList<ItemDinamica> generarTablaInicio() {
        ArrayList<ItemDinamica> tbInicio = new ArrayList<>();
        for (int i = 0; i < tablaOrigen.size(); i++) {
            ItemDinamica iDeterminista = new ItemDinamica(i,tablaOrigen.get(i).get(n-1));
            tbInicio.add(iDeterminista);
        }
        return tbInicio;
    }
    
}
