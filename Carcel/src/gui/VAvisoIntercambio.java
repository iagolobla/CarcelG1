package gui;

import carcel.Celda;
import carcel.FachadaCarcel;
import carcel.Preso;

public class VAvisoIntercambio extends javax.swing.JDialog {
    
    FachadaCarcel fc;
    Celda celda;
    Preso preso;
    
    public VAvisoIntercambio(java.awt.Frame parent, boolean modal, FachadaCarcel fc, Celda celda, Preso preso) {
        super(parent, modal);
        initComponents();
        this.fc = fc;
        this.celda = celda;
        this.preso = preso;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonSI = new javax.swing.JButton();
        BotonNo = new javax.swing.JButton();
        TextoPregunta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BotonSI.setText("SI");
        BotonSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSIActionPerformed(evt);
            }
        });

        BotonNo.setText("NO");
        BotonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNoActionPerformed(evt);
            }
        });

        TextoPregunta.setColumns(20);
        TextoPregunta.setRows(5);
        TextoPregunta.setText("Esta intentando meter a un \npreso en una celda llena,\n¿Desea intercambiarlo por otro?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BotonSI)
                        .addGap(57, 57, 57)
                        .addComponent(BotonNo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(TextoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSI)
                    .addComponent(BotonNo))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSIActionPerformed
        fc.iniciaGestionIntercambio(celda, preso);
        this.dispose();
    }//GEN-LAST:event_BotonSIActionPerformed

    private void BotonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNoActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonNoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonNo;
    private javax.swing.JButton BotonSI;
    private javax.swing.JTextArea TextoPregunta;
    // End of variables declaration//GEN-END:variables
}
