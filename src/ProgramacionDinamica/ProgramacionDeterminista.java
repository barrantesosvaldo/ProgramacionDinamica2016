/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionDinamica;

import TablasInicio.InicioDeterminista;
import TablasIntermedias.IntermediaDeterminista;
import java.util.ArrayList;

/**
 * @description Clase para el desarrollo de la programacion dinamica determinista
 * @version 1.0
 * @authors Osvaldo Francisco Barrantes Paniagua
 *          Jose Fabio Ávila Estrada
 */
public class ProgramacionDeterminista {
    
    private ArrayList<ArrayList<Double>> tablaOrigen;
    private ArrayList<InicioDeterminista> tablaInicio;
    private ArrayList<IntermediaDeterminista> tablasIntermedias;
    private int n;
    private boolean tipoValores;
    private boolean formula;
    
    public ProgramacionDeterminista(boolean tipoValores, boolean formula, ArrayList<ArrayList<Double>> tablaOrigen, int n) {
        this.tipoValores = tipoValores;
        this.formula = formula;
        this.tablaOrigen = tablaOrigen;
        this.n = n;
        this.tablaInicio = generarTablaInicio();
        printTbI();
        Inicializar();
    }
    
    public void iniciar(){
        for(int i = 0; i < tablasIntermedias.size(); i++ ){
            System.out.println("Tabla "+tablasIntermedias.get(i).getN());
        }
    }
    
    private void Inicializar(){
        for(int i = n-1; i > 0; i-- ){
            IntermediaDeterminista tabla = new IntermediaDeterminista(i);
            System.out.println("Tabla "+tabla.getN());
            for(int j = 0; j < tablaOrigen.size(); j++){
                tabla.addFila(j);
            }
            tablasIntermedias.add(tabla);
            System.out.println("Tabla count = "+tabla.getFilas().size());
        }
    }
    
    private int FormulaFnDeterminista(int Sn, int Xn){
        //Fn(Sn, Xn) = Pn(Xn) * fn+1(Sn-Xn)
        return 0;
    }

    private ArrayList<InicioDeterminista> generarTablaInicio() {
        ArrayList<InicioDeterminista> tbInicio = new ArrayList<>();
        for (int i = 0; i < tablaOrigen.size(); i++) {
            InicioDeterminista iDeterminista = new InicioDeterminista(i,tablaOrigen.get(i).get(n-1));
            tbInicio.add(iDeterminista);
        }
        return tbInicio;
    }
    
    private void printTbI(){
        System.out.println("-----------------------");
        System.out.println("     Tabla Inicio      ");
        System.out.println("-----------------------");
        System.out.println("S"+n+" - F"+n+" - X"+n);
        for (InicioDeterminista fila : tablaInicio) {
            System.out.println(String.valueOf(fila.getSn())
                    +" - "+String.valueOf(fila.getFnSn()) 
                    +" - "+String.valueOf(fila.getXn()));
        }
        System.out.println("-----------------------");
        System.out.println("");
    }
    
}
