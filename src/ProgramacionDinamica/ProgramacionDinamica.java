/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionDinamica;

import TablasInicio.InicioDinamica;
import TablasIntermedias.IntermediaDinamica;
import java.awt.List;
import java.util.ArrayList;

/**
 * @description Clase para el desarrollo de la programacion dinamica
 * @version 1.0
 * @authors Osvaldo Francisco Barrantes Paniagua
 *          Jose Fabio Ávila Estrada
 */
public class ProgramacionDinamica {

    private ArrayList<ArrayList<Integer>> tablaOrigen;
    private ArrayList<InicioDinamica> tablaInicio;
    private ArrayList<IntermediaDinamica> tablasIntermedias;
    private int n;
    private boolean tipoValores;
    private boolean formula;
    
    public ProgramacionDinamica(boolean tipoValores, boolean formula, ArrayList<ArrayList<Integer>> tablaOrigen, int n) {
        this.tipoValores = tipoValores;
        this.formula = formula;
        this.tablaOrigen = tablaOrigen;
        this.n = n;
        this.tablaInicio = generarTablaInicio();
        this.tablasIntermedias = new ArrayList<IntermediaDinamica>();
        printTbI();
        Inicializar();
    }
    
    public void iniciar(){
        boolean primera = false;
        for(int i = 0; i < tablasIntermedias.size(); i++ ){
            //System.out.println(" * Tabla "+tablasIntermedias.get(i).getN());
            if(n - tablasIntermedias.get(i).getN() == 1){
                System.out.print(" --- primera\n");
                primera = true;
                for(int j = 0; j < tablasIntermedias.get(i).getFilas().size(); j++){
                    //tablasIntermedias.get(i).getFilas().get(j).getFnSnXn()
                    for(int k = 0; k < tablasIntermedias.get(i).getFilas().get(j).getFnSnXn().size(); k++){
                        int resF = FormulaFnDinamica(j, k, primera, tablasIntermedias.get(i).getN(), i);
                        tablasIntermedias.get(i).getFilas().get(j).setCasilla(k,resF);
                        tablasIntermedias.get(i).getFilas().get(j).buscarFAnSn();
                        //System.out.println("Mod "+resF);
                    }
                }
                primera = false;
                
                printTI();
            }
            else{
                System.out.println(" --- Tabla "+i);
                for(int j = 0; j < tablasIntermedias.get(i).getFilas().size(); j++){
                    //tablasIntermedias.get(i).getFilas().get(j).getFnSnXn()
                    for(int k = 0; k < tablasIntermedias.get(i).getFilas().get(j).getFnSnXn().size(); k++){
                        int resF = FormulaFnDinamica(j, k, primera, tablasIntermedias.get(i).getN(), i);
                        tablasIntermedias.get(i).getFilas().get(j).setCasilla(k,resF);
                        //System.out.println("Mod "+resF);
                    }
                }
                //printTI();
            }
        }
    }
    
    private void printTI(){
        System.out.println("------------------------");
        System.out.println("   Tablas Intermedias   ");
        System.out.println("------------------------");
        for(int l = 0; l < tablasIntermedias.size(); l++ ){
            System.out.println("------------------------");
            System.out.println(" * Tabla "+tablasIntermedias.get(l).getN());
            System.out.println("------------------------");
            for(int j = 0; j < tablasIntermedias.get(l).getFilas().size(); j++){
                tablasIntermedias.get(l).getFilas().get(j).iniciarFnSnXn(tablaOrigen.size());
                System.out.print(j+" "+tablasIntermedias.get(l).getFilas().get(j).getFnSnXn());
                System.out.println(" "+tablasIntermedias.get(l).getFilas().get(j).getFAnSn()
                        + " " +tablasIntermedias.get(l).getFilas().get(j).getXAn());
            }
        }
    }
    
    private void Inicializar(){
        for(int i = n-1; i > 0; i-- ){
            IntermediaDinamica tabla = new IntermediaDinamica(i);
            //System.out.println("Tabla "+tabla.getN());
            for(int j = 0; j < tablaOrigen.size(); j++){
                tabla.addFila(j);
            }
            tablasIntermedias.add(tabla);
            //System.out.println("Tabla count = "+tabla.getFilas().size());
        }
        System.out.println("------------------------");
        System.out.println("   Tablas Intermedias   ");
        System.out.println("------------------------");
        for(int i = 0; i < tablasIntermedias.size(); i++ ){
            System.out.println("------------------------");
            System.out.println(" * Tabla "+tablasIntermedias.get(i).getN());
            System.out.println("------------------------");
            for(int j = 0; j < tablasIntermedias.get(i).getFilas().size(); j++){
                tablasIntermedias.get(i).getFilas().get(j).iniciarFnSnXn(tablaOrigen.size());
                System.out.println(j+" "+tablasIntermedias.get(i).getFilas().get(j).getFnSnXn());
            }
        }
    }
    
    private ArrayList<InicioDinamica> generarTablaInicio() {
        ArrayList<InicioDinamica> tbInicio = new ArrayList<>();
        for (int i = 0; i < tablaOrigen.size(); i++) {
            InicioDinamica iDeterminista = new InicioDinamica(i,tablaOrigen.get(i).get(n-1));
            tbInicio.add(iDeterminista);
        }
        return tbInicio;
    }
    
    private void printTbI(){
        System.out.println("-----------------------");
        System.out.println("     Tabla Inicio      ");
        System.out.println("-----------------------");
        System.out.println("S"+n+" - F"+n+" - X"+n);
        for (InicioDinamica fila : tablaInicio) {
            System.out.println(" "+String.valueOf(fila.getSn())
                    +" - "+String.valueOf(fila.getFnSn()) 
                    +" - "+String.valueOf(fila.getXn()));
        }
        System.out.println("-----------------------");
        System.out.println("");
    }

    private int FormulaFnDinamica(int Sn, int Xn, boolean primero, int c, int tabla){
        //Fn(Sn, Xn) = Pn(Xn) + fn+1(Sn-Xn)
        if((Sn-Xn) >=0){
            return Pn(Xn,c) + obtenerFAn(Sn-Xn, primero, tabla);
        }
        else{
            return -1;
        }
    }
    
    private int Pn(int Xn, int c) {
        for(int i = 0; i < tablaOrigen.size(); i++){
            if(i == Xn){
                for(int j = 0; j < tablaOrigen.get(i).size(); j++){
                    if(j == c){
                        return tablaOrigen.get(i).get(j);
                    }
                }
            }
        }
        return 0;
    }

    private int obtenerFAn(int estado, boolean primero, int tabla) {
        if(primero){
            for(int i = 0; i < tablaInicio.size(); i++){
                if(estado == tablaInicio.get(i).getSn()){
                    return tablaInicio.get(i).getFnSn();
                }
            }
        }
        else{
            //obtener los valores de las tablas despues de la primera
            for(int i = 0; i < tablaInicio.size(); i++){
                if(estado == tablaInicio.get(i).getSn()){
                    //return tablaInicio.get(i).getFnSn();
                }
            }
            return 0;
        }
        return 0;
    }
}
