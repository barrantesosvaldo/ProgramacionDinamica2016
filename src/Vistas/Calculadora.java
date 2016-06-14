/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProgramacionDinamica.ProgramacionDeterminista;
import ProgramacionDinamica.ProgramacionDinamica;

/**
 * @description Frame for getting information
 * @version 1.0
 * @authors Osvaldo Francisco Barrantes Paniagua
 *          Jose Fabio Ávila Estrada
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        establecerIcono();
    }
    
    /**
     * Establece el ícono del JFrame
     */
    private void establecerIcono() {
        URL ruta = getClass().getResource("/res/icono.png");
        ImageIcon icono = new ImageIcon(ruta);
        this.setIconImage(icono.getImage());
    }
    
    /**
     * Genera la tabla donde se van a ingresar los datos.
     * @param filas cantidad de filas de la tabla.
     * @param columnas cantidad de filas de la tabla.
     * @return 
     */
    private DefaultTableModel generarTabla(int filas, int columnas){
        DefaultTableModel modelo = new DefaultTableModel();
        Object[] fila = new Object[columnas];
        
        for(int i = 0; i < columnas; i++) {
            modelo.addColumn("");
            fila[i] = "";
        }
        
        for (int i = 0; i < filas; i++){
            modelo.addRow(fila);
        }
        
        return modelo;
    } 
    
    private ArrayList<ArrayList<Integer>> generarTablaOrigenDinamica(){
        ArrayList<ArrayList<Integer>> tabla = new ArrayList<>();
        for(int i = 0; i < (int)spEstados.getValue();i++){
            for(int j = 0; j < (int)spEstados.getValue();j++){
                tabla.get(i).add((int) tbDatos.getModel().getValueAt(i,j));
            }
        }
        return tabla;
    }
    
    private ArrayList<ArrayList<Double>> generarTablaOrigenDeterminista(){
        ArrayList<ArrayList<Double>> tabla = new ArrayList<>();
        for(int i = 0; i < (int)spEstados.getValue();i++){
            for(int j = 0; j < (int)spEstados.getValue();j++){
                tabla.get(i).add((double) tbDatos.getModel().getValueAt(i,j));
            }
        }
        return tabla;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgValores = new javax.swing.ButtonGroup();
        bgFórmulas = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        rbMáximos = new javax.swing.JRadioButton();
        rbMínimos = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        rbFórmula1 = new javax.swing.JRadioButton();
        rbFórmula2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfCantidadADistribuir = new javax.swing.JTextField();
        tfCantidadMínima = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spEtapas = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spEstados = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuAjustes = new javax.swing.JMenu();
        itemFuente = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuAcercaDe = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programación Dinámica");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(309, 353));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Valores:");

        bgValores.add(rbMáximos);
        rbMáximos.setSelected(true);
        rbMáximos.setText("Máximos");
        rbMáximos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rbMáximos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        bgValores.add(rbMínimos);
        rbMínimos.setText("Mínimos");
        rbMínimos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fórmula:");

        bgFórmulas.add(rbFórmula1);
        rbFórmula1.setSelected(true);
        rbFórmula1.setText("Dinámica");
        rbFórmula1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rbFórmula1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        bgFórmulas.add(rbFórmula2);
        rbFórmula2.setText("Determinística");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(rbMáximos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbMínimos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbFórmula1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbFórmula2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMáximos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMínimos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFórmula1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbFórmula2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Mínimo de distribución:");

        tfCantidadADistribuir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCantidadADistribuir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCantidadADistribuirKeyTyped(evt);
            }
        });

        tfCantidadMínima.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCantidadMínima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCantidadMínimaKeyTyped(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cantidad a distribuir:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Etapas:");

        spEtapas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spEtapas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spEtapasStateChanged(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Estados:");

        spEstados.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spEstados.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spEstadosStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spEtapas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCantidadMínima, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spEstados)
                    .addComponent(tfCantidadADistribuir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCantidadADistribuir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCantidadMínima, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Etapas");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane1.setBorder(null);

        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(1);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(7);
        jTextArea1.setText("E\ns\nt\na\nd\no\ns");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setAutoscrolls(true);

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbDatos.setToolTipText("");
        jScrollPane2.setViewportView(tbDatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar2.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ejecutar.png"))); // NOI18N
        jButton1.setText("Ejecutar");
        jButton1.setToolTipText("Ejecutar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/alejar.png"))); // NOI18N
        jButton2.setText("Alejar");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/acercar.png"))); // NOI18N
        jButton3.setText("Acercar");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton3);

        menuArchivo.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ejecutar.png"))); // NOI18N
        jMenuItem1.setText("Ejecutar");
        menuArchivo.add(jMenuItem1);
        menuArchivo.add(jSeparator3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/salir.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        menuArchivo.add(jMenuItem2);

        jMenuBar1.add(menuArchivo);

        menuAjustes.setText("Ajustes");

        itemFuente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        itemFuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/fuente.png"))); // NOI18N
        itemFuente.setText("Fuente");
        itemFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFuenteActionPerformed(evt);
            }
        });
        menuAjustes.add(itemFuente);
        menuAjustes.add(jSeparator2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_MINUS, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/alejar.png"))); // NOI18N
        jMenuItem3.setText("Alejar");
        menuAjustes.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PLUS, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/acercar.png"))); // NOI18N
        jMenuItem4.setText("Acercar");
        menuAjustes.add(jMenuItem4);

        jMenuBar1.add(menuAjustes);

        menuAcercaDe.setText("Acerca de");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Créditos.png"))); // NOI18N
        jMenuItem5.setText("Créditos");
        menuAcercaDe.add(jMenuItem5);

        jMenuBar1.add(menuAcercaDe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(726, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFuenteActionPerformed
        new Fuente().setVisible(true);
    }//GEN-LAST:event_itemFuenteActionPerformed

    private void tfCantidadADistribuirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCantidadADistribuirKeyTyped
        // Solo permite números
        char enter = evt.getKeyChar();
        
        if(((Character.isDigit(enter)) || (enter == ',') || (enter == '.'))){
            
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_tfCantidadADistribuirKeyTyped

    private void tfCantidadMínimaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCantidadMínimaKeyTyped
        // Solo permite números
        char enter = evt.getKeyChar();
        
        if(((Character.isDigit(enter)) || (enter == ',') || (enter == '.'))){
            
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_tfCantidadMínimaKeyTyped

    private void spEtapasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spEtapasStateChanged
        // Actualiza la cantidad de columnas de la tabla.
        int filas = (int)spEstados.getValue();
        int columnas = (int)spEtapas.getValue();
        DefaultTableModel modeloDatos = generarTabla(filas, columnas);
        tbDatos.setModel(modeloDatos);
        
    }//GEN-LAST:event_spEtapasStateChanged

    private void spEstadosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spEstadosStateChanged
        // Actualiza la cantidad de filas de la tabla.
        int filas = (int)spEstados.getValue();
        int columnas = (int)spEtapas.getValue();
        DefaultTableModel modeloDatos = generarTabla(filas, columnas);
        tbDatos.setModel(modeloDatos);
    }//GEN-LAST:event_spEstadosStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if((int)spEstados.getValue() == 0 || (int)spEtapas.getValue() == 0){
            JOptionPane.showMessageDialog(null, "Por favor incluya etapas y estados", "Atencion", JOptionPane.WARNING_MESSAGE); 
        }
        else{
            if(rbMáximos.isSelected()){
                if(rbFórmula1.isSelected()){
                    System.out.println("Maximos y Dinamica");
                    ArrayList<ArrayList<Integer>> tabla = generarTablaOrigenDinamica();
                    ProgramacionDinamica instancia = new ProgramacionDinamica(true,true,tabla,(int)spEtapas.getValue());
                }
                else{
                    System.out.println("Maximos y Determinista");
                    ArrayList<ArrayList<Double>> tabla = generarTablaOrigenDeterminista();
                    ProgramacionDeterminista instancia = new ProgramacionDeterminista(true,false,tabla,(int)spEtapas.getValue());
                }
            }
            else{
                if(rbFórmula1.isSelected()){
                    System.out.println("Minimos y Dinamica");
                    ArrayList<ArrayList<Integer>> tabla = generarTablaOrigenDinamica();
                    ProgramacionDinamica instancia = new ProgramacionDinamica(false,true,tabla,(int)spEtapas.getValue());
                }
                else{
                    System.out.println("Minimos y Determinista");
                    ArrayList<ArrayList<Double>> tabla = generarTablaOrigenDeterminista();
                    ProgramacionDeterminista instancia = new ProgramacionDeterminista(false,false,tabla,(int)spEtapas.getValue());
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.
                    UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | 
                IllegalAccessException | javax.swing.
                UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFórmulas;
    private javax.swing.ButtonGroup bgValores;
    private javax.swing.JMenuItem itemFuente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenu menuAcercaDe;
    private javax.swing.JMenu menuAjustes;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JRadioButton rbFórmula1;
    private javax.swing.JRadioButton rbFórmula2;
    private javax.swing.JRadioButton rbMáximos;
    private javax.swing.JRadioButton rbMínimos;
    private javax.swing.JSpinner spEstados;
    private javax.swing.JSpinner spEtapas;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField tfCantidadADistribuir;
    private javax.swing.JTextField tfCantidadMínima;
    // End of variables declaration//GEN-END:variables
}