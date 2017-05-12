package gui;

import carcel.Celda;
import carcel.FachadaCarcel;
import carcel.Nivel;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class VGestionCeldas extends javax.swing.JDialog {

    FachadaCarcel fc;

    public VGestionCeldas(java.awt.Frame parent, boolean modal, FachadaCarcel fc) {
        super(parent, modal);
        initComponents();
        this.fc = fc;
        ComboCampoSeguridad.setModel(new DefaultComboBoxModel(Nivel.values()));
        ComboSeguridad.setModel(new DefaultComboBoxModel(Nivel.values()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EtiquetaId = new javax.swing.JLabel();
        CampoId = new javax.swing.JTextField();
        EtiquetaSeguridad = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCeldas = new javax.swing.JTable();
        EtiquetaPlazas1 = new javax.swing.JLabel();
        TextoPlazas = new javax.swing.JTextField();
        EtiquetaSuperficie = new javax.swing.JLabel();
        TextoSuperficie = new javax.swing.JTextField();
        EtiquetaSeguridad1 = new javax.swing.JLabel();
        BotonInsertar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        EtqiuetaPlazas = new javax.swing.JLabel();
        CampoPlazas = new javax.swing.JTextField();
        BotonSalir = new javax.swing.JButton();
        ComboCampoSeguridad = new javax.swing.JComboBox();
        ComboSeguridad = new javax.swing.JComboBox();
        BotonVigilancia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EtiquetaId.setText("Id");

        EtiquetaSeguridad.setText("Seguridad");

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        TablaCeldas.setModel(new ModeloTablaCeldas());
        TablaCeldas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TablaCeldasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCeldas);

        EtiquetaPlazas1.setText("Plazas");

        EtiquetaSuperficie.setText("Superficie");

        EtiquetaSeguridad1.setText("Seguridad");

        BotonInsertar.setText("Insertar");
        BotonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarActionPerformed(evt);
            }
        });

        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        EtqiuetaPlazas.setText("Plazas");

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        ComboCampoSeguridad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboSeguridad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonVigilancia.setText("Vigilancia");
        BotonVigilancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVigilanciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EtqiuetaPlazas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoPlazas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(EtiquetaSeguridad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboCampoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(BotonInsertar)
                                .addGap(18, 18, 18)
                                .addComponent(BotonModificar)
                                .addGap(18, 18, 18)
                                .addComponent(BotonEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(BotonVigilancia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonSalir)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EtiquetaPlazas1)
                                    .addComponent(EtiquetaSeguridad1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboSeguridad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoPlazas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EtiquetaSuperficie)
                                .addGap(18, 18, 18)
                                .addComponent(TextoSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaId)
                    .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaSeguridad)
                    .addComponent(BotonBuscar)
                    .addComponent(ComboCampoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtqiuetaPlazas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaPlazas1)
                    .addComponent(TextoPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaSuperficie)
                    .addComponent(TextoSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaSeguridad1)
                    .addComponent(ComboSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInsertar)
                    .addComponent(BotonModificar)
                    .addComponent(BotonEliminar)
                    .addComponent(BotonSalir)
                    .addComponent(BotonVigilancia))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarActionPerformed
        insertarCelda();
    }//GEN-LAST:event_BotonInsertarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        modificarCelda();
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        eliminarCelda();
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        buscarCelda();
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void TablaCeldasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCeldasMouseReleased
        rellenarCampos();
    }//GEN-LAST:event_TablaCeldasMouseReleased

    private void BotonVigilanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVigilanciaActionPerformed
        iniciaVigilancia();
    }//GEN-LAST:event_BotonVigilanciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonInsertar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonVigilancia;
    private javax.swing.JTextField CampoId;
    private javax.swing.JTextField CampoPlazas;
    private javax.swing.JComboBox ComboCampoSeguridad;
    private javax.swing.JComboBox ComboSeguridad;
    private javax.swing.JLabel EtiquetaId;
    private javax.swing.JLabel EtiquetaPlazas1;
    private javax.swing.JLabel EtiquetaSeguridad;
    private javax.swing.JLabel EtiquetaSeguridad1;
    private javax.swing.JLabel EtiquetaSuperficie;
    private javax.swing.JLabel EtqiuetaPlazas;
    private javax.swing.JTable TablaCeldas;
    private javax.swing.JTextField TextoPlazas;
    private javax.swing.JTextField TextoSuperficie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void insertarCelda() {
        fc.insertarCelda(TextoPlazas.getText(), TextoSuperficie.getText(), ComboSeguridad.getSelectedItem().toString());
    }

    private void modificarCelda() {
        ModeloTablaCeldas mc;
        Celda celda = null;

        mc = (ModeloTablaCeldas) TablaCeldas.getModel();
        celda = fc.obtenerCelda(mc.getValueAt(TablaCeldas.getSelectedRow(), 0).toString());

        if (celda != null) {
            fc.modificarCelda(celda, TextoPlazas.getText(), TextoSuperficie.getText(), ComboSeguridad.getSelectedItem().toString());
            mc.fireTableDataChanged();
        }
    }

    private void eliminarCelda() {
        ModeloTablaCeldas mc;
        Celda celda = null;

        mc = (ModeloTablaCeldas) TablaCeldas.getModel();
        celda = fc.obtenerCelda(mc.getValueAt(TablaCeldas.getSelectedRow(), 0).toString());

        if (celda != null) {
            fc.eliminarCelda(celda);
            mc.fireTableDataChanged();
        }
    }

    private void buscarCelda() {
        ModeloTablaCeldas mc;
        ArrayList<Celda> celdas = null;

        mc = (ModeloTablaCeldas) TablaCeldas.getModel();
        celdas = fc.buscarCelda(CampoId.getText(), CampoPlazas.getText(), ComboCampoSeguridad.getSelectedItem().toString());

        mc.setFilas(celdas);

        if (mc.getRowCount() > 0) {
            TablaCeldas.setRowSelectionInterval(0, 0);    //Selecciona el primero por defecto      
            rellenarCampos();
        }
    }

    private void rellenarCampos() {
        ModeloTablaCeldas mc;
        Celda celda = null;

        mc = (ModeloTablaCeldas) TablaCeldas.getModel();
        celda = mc.obtenerCelda(TablaCeldas.getSelectedRow());

        if (celda != null) {
            TextoPlazas.setText(String.valueOf(celda.getnCamas()));
            TextoSuperficie.setText(String.valueOf(celda.getSuperficie()));
            ComboSeguridad.setSelectedItem(celda.getSeguridad());
        }
    }
    
    private void iniciaVigilancia(){
        ModeloTablaCeldas mc = (ModeloTablaCeldas) TablaCeldas.getModel();
        
        if(mc.getRowCount() > 0 && TablaCeldas.getSelectedRowCount() > 0)
        fc.iniciaVigilancia(mc.obtenerCelda(TablaCeldas.getSelectedRow()));
    }
}
