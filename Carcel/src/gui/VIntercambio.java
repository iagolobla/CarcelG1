package gui;

import carcel.Celda;
import carcel.FachadaCarcel;
import carcel.Preso;
import java.util.ArrayList;

public class VIntercambio extends javax.swing.JDialog {

    FachadaCarcel fc;
    Celda celda;
    Preso preso;

    public VIntercambio(java.awt.Frame parent, boolean modal, FachadaCarcel fc, Celda celda, Preso preso) {
        super(parent, modal);
        initComponents();
        this.fc = fc;
        this.celda = celda;
        this.preso = preso;

        buscarPresosCelda();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPresos = new javax.swing.JTable();
        BotonIntercambiar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TablaPresos.setModel(new ModeloTablaPresos());
        jScrollPane1.setViewportView(TablaPresos);

        BotonIntercambiar.setText("Intercambiar");
        BotonIntercambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIntercambiarActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(BotonIntercambiar)
                .addGap(75, 75, 75)
                .addComponent(BotonCancelar)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonIntercambiar)
                    .addComponent(BotonCancelar))
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void BotonIntercambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIntercambiarActionPerformed
        intercambiarPresos();
    }//GEN-LAST:event_BotonIntercambiarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonIntercambiar;
    private javax.swing.JTable TablaPresos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void buscarPresosCelda() {
        ModeloTablaPresos mp;
        ArrayList<Preso> presos;

        mp = (ModeloTablaPresos) TablaPresos.getModel();

        presos = fc.buscarPresosCelda(celda);
        mp.setFilas(presos);

        if (mp.getRowCount() > 0) {
            TablaPresos.setRowSelectionInterval(0, 0);
        }

    }

    private void intercambiarPresos() {
        Preso preso2;
        ModeloTablaPresos mp;

        mp = (ModeloTablaPresos) TablaPresos.getModel();
        if (mp.getRowCount() > 0) {
            if (TablaPresos.getSelectedRowCount() > 0) {   //Si hay algo seleccionado
                preso2 = new Preso(mp.obtenerPreso(TablaPresos.getSelectedRow()));
                //Hace de forma unitaria el intercambio
                fc.intercambiarPresos(this.preso, preso2);
            }
        }
        this.dispose(); //Al final cerramos la ventana
    }

}
