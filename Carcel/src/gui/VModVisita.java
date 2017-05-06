/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import carcel.FachadaCarcel;

/**
 *
 * @author root
 */
public class VModVisita extends javax.swing.JDialog {

    FachadaCarcel fc;
    
    public VModVisita(java.awt.Frame parent, boolean modal, FachadaCarcel fc) {
        super(parent, modal);
        initComponents();
        this.fc = fc;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabs = new javax.swing.JTabbedPane();
        TabGeneral = new javax.swing.JPanel();
        EtiquetaDNIV = new javax.swing.JLabel();
        EtiquetaNombreV = new javax.swing.JLabel();
        EtiquetaRelacion = new javax.swing.JLabel();
        EtiquetaFecha = new javax.swing.JLabel();
        TextoDNIVisitante = new javax.swing.JTextField();
        TextoNombreVisitante = new javax.swing.JTextField();
        TextoRelacion = new javax.swing.JTextField();
        TextoFecha = new javax.swing.JTextField();
        TabPreso = new javax.swing.JPanel();
        EtiquetaDNIP = new javax.swing.JLabel();
        EtiquetaNombreP = new javax.swing.JLabel();
        EtiquetaApodoP = new javax.swing.JLabel();
        CampoDNIP = new javax.swing.JTextField();
        CampoNombreP = new javax.swing.JTextField();
        CampoApodoP = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        BotonSalir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EtiquetaDNIV.setText("DNI Visitante");

        EtiquetaNombreV.setText("Nombre Visitante");

        EtiquetaRelacion.setText("Relacion");

        EtiquetaFecha.setText("Fecha");

        TextoRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoRelacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TabGeneralLayout = new javax.swing.GroupLayout(TabGeneral);
        TabGeneral.setLayout(TabGeneralLayout);
        TabGeneralLayout.setHorizontalGroup(
            TabGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabGeneralLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(TabGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EtiquetaRelacion)
                    .addComponent(EtiquetaNombreV)
                    .addComponent(EtiquetaDNIV)
                    .addComponent(EtiquetaFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextoFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(TextoRelacion)
                    .addComponent(TextoNombreVisitante)
                    .addComponent(TextoDNIVisitante))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        TabGeneralLayout.setVerticalGroup(
            TabGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabGeneralLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(TabGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDNIV)
                    .addComponent(TextoDNIVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaNombreV)
                    .addComponent(TextoNombreVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaRelacion)
                    .addComponent(TextoRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaFecha)
                    .addComponent(TextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        Tabs.addTab("General", TabGeneral);

        EtiquetaDNIP.setText("DNI");

        EtiquetaNombreP.setText("Nombre");

        EtiquetaApodoP.setText("Apodo");

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        jTable1.setModel(new ModeloTablaPresos());
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout TabPresoLayout = new javax.swing.GroupLayout(TabPreso);
        TabPreso.setLayout(TabPresoLayout);
        TabPresoLayout.setHorizontalGroup(
            TabPresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPresoLayout.createSequentialGroup()
                .addGroup(TabPresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabPresoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(EtiquetaDNIP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoDNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EtiquetaNombreP))
                    .addGroup(TabPresoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EtiquetaApodoP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoApodoP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabPresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabPresoLayout.createSequentialGroup()
                        .addComponent(BotonBuscar)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addComponent(CampoNombreP))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabPresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        TabPresoLayout.setVerticalGroup(
            TabPresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPresoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(TabPresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDNIP)
                    .addComponent(CampoDNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaNombreP)
                    .addComponent(CampoNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabPresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaApodoP)
                    .addComponent(CampoApodoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tabs.addTab("Preso", TabPreso);

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(BotonGuardar)
                .addGap(18, 18, 18)
                .addComponent(BotonSalir)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(330, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSalir)
                    .addComponent(BotonGuardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoRelacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoRelacionActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        guardarVisita();
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        buscarPreso();
    }//GEN-LAST:event_BotonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField CampoApodoP;
    private javax.swing.JTextField CampoDNIP;
    private javax.swing.JTextField CampoNombreP;
    private javax.swing.JLabel EtiquetaApodoP;
    private javax.swing.JLabel EtiquetaDNIP;
    private javax.swing.JLabel EtiquetaDNIV;
    private javax.swing.JLabel EtiquetaFecha;
    private javax.swing.JLabel EtiquetaNombreP;
    private javax.swing.JLabel EtiquetaNombreV;
    private javax.swing.JLabel EtiquetaRelacion;
    private javax.swing.JPanel TabGeneral;
    private javax.swing.JPanel TabPreso;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JTextField TextoDNIVisitante;
    private javax.swing.JTextField TextoFecha;
    private javax.swing.JTextField TextoNombreVisitante;
    private javax.swing.JTextField TextoRelacion;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void guardarVisita(){
        
    }
    
    public void buscarPreso(){
        
    }
    
}
