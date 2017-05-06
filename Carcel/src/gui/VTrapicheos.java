package gui;

import carcel.FachadaCarcel;

public class VTrapicheos extends javax.swing.JDialog {

    FachadaCarcel fc;
    
    public VTrapicheos(java.awt.Frame parent, boolean modal, FachadaCarcel fc) {
        super(parent, modal);
        initComponents();
        this.fc = fc;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelEmisor = new javax.swing.JPanel();
        EtiquetaDNI1 = new javax.swing.JLabel();
        CampoDNIE = new javax.swing.JTextField();
        EtiquetaNombre1 = new javax.swing.JLabel();
        CampoNombreE = new javax.swing.JTextField();
        BotonBuscarE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        EtiquetaApodo1 = new javax.swing.JLabel();
        CampoApodoE = new javax.swing.JTextField();
        PanelReceptor = new javax.swing.JPanel();
        EtiquetaDNI2 = new javax.swing.JLabel();
        CampoDNIR = new javax.swing.JTextField();
        EtiquetaNombre2 = new javax.swing.JLabel();
        CampoNombreR = new javax.swing.JTextField();
        BotonBuscarR = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        CampoApodoR = new javax.swing.JTextField();
        EtiquetaApodo2 = new javax.swing.JLabel();
        PanelInfo = new javax.swing.JPanel();
        EtiquetaFecha3 = new javax.swing.JLabel();
        TextoFecha = new javax.swing.JTextField();
        EtiquetaObjeto = new javax.swing.JLabel();
        TextoObjeto = new javax.swing.JTextField();
        EtiquetaDescripcion = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextoDescripcion = new javax.swing.JTextArea();
        BotonSalir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EtiquetaDNI1.setText("DNI");

        EtiquetaNombre1.setText("Nombre");

        BotonBuscarE.setText("Buscar");
        BotonBuscarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarEActionPerformed(evt);
            }
        });

        jTable1.setModel(new ModeloTablaPresos());
        jScrollPane1.setViewportView(jTable1);

        EtiquetaApodo1.setText("Apodo");

        javax.swing.GroupLayout PanelEmisorLayout = new javax.swing.GroupLayout(PanelEmisor);
        PanelEmisor.setLayout(PanelEmisorLayout);
        PanelEmisorLayout.setHorizontalGroup(
            PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmisorLayout.createSequentialGroup()
                .addGroup(PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEmisorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EtiquetaApodo1)
                            .addGroup(PanelEmisorLayout.createSequentialGroup()
                                .addComponent(EtiquetaDNI1)
                                .addGap(18, 18, 18)
                                .addComponent(CampoDNIE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(EtiquetaNombre1)))
                        .addGroup(PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEmisorLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CampoNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEmisorLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(CampoApodoE, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonBuscarE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelEmisorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelEmisorLayout.setVerticalGroup(
            PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmisorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDNIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaDNI1)
                    .addComponent(EtiquetaNombre1)
                    .addComponent(CampoNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaApodo1)
                    .addComponent(CampoApodoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Emisor", PanelEmisor);

        EtiquetaDNI2.setText("DNI");

        EtiquetaNombre2.setText("Nombre");

        BotonBuscarR.setText("Buscar");
        BotonBuscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarRActionPerformed(evt);
            }
        });

        jTable2.setModel(new ModeloTablaPresos());
        jScrollPane2.setViewportView(jTable2);

        EtiquetaApodo2.setText("Apodo");

        javax.swing.GroupLayout PanelReceptorLayout = new javax.swing.GroupLayout(PanelReceptor);
        PanelReceptor.setLayout(PanelReceptorLayout);
        PanelReceptorLayout.setHorizontalGroup(
            PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReceptorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelReceptorLayout.createSequentialGroup()
                        .addComponent(EtiquetaDNI2)
                        .addGap(18, 18, 18)
                        .addComponent(CampoDNIR, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(EtiquetaNombre2))
                    .addComponent(EtiquetaApodo2))
                .addGap(18, 18, 18)
                .addGroup(PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoNombreR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoApodoR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonBuscarR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelReceptorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelReceptorLayout.setVerticalGroup(
            PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReceptorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDNIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaDNI2)
                    .addComponent(EtiquetaNombre2)
                    .addComponent(CampoNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaApodo2)
                    .addComponent(CampoApodoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarR))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Receptor", PanelReceptor);

        EtiquetaFecha3.setText("Fecha");

        EtiquetaObjeto.setText("Objeto");

        EtiquetaDescripcion.setText("Descripcion");

        TextoDescripcion.setColumns(20);
        TextoDescripcion.setRows(5);
        jScrollPane3.setViewportView(TextoDescripcion);

        javax.swing.GroupLayout PanelInfoLayout = new javax.swing.GroupLayout(PanelInfo);
        PanelInfo.setLayout(PanelInfoLayout);
        PanelInfoLayout.setHorizontalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addComponent(EtiquetaDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addComponent(EtiquetaFecha3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EtiquetaObjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        PanelInfoLayout.setVerticalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaFecha3)
                    .addComponent(TextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaObjeto)
                    .addComponent(TextoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtiquetaDescripcion)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Info. General", PanelInfo);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonGuardar)
                .addGap(18, 18, 18)
                .addComponent(BotonSalir)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSalir)
                    .addComponent(BotonGuardar))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonBuscarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarEActionPerformed
        buscar();
    }//GEN-LAST:event_BotonBuscarEActionPerformed

    private void BotonBuscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarRActionPerformed
        buscar();
    }//GEN-LAST:event_BotonBuscarRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarE;
    private javax.swing.JButton BotonBuscarR;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField CampoApodoE;
    private javax.swing.JTextField CampoApodoR;
    private javax.swing.JTextField CampoDNIE;
    private javax.swing.JTextField CampoDNIR;
    private javax.swing.JTextField CampoNombreE;
    private javax.swing.JTextField CampoNombreR;
    private javax.swing.JLabel EtiquetaApodo1;
    private javax.swing.JLabel EtiquetaApodo2;
    private javax.swing.JLabel EtiquetaDNI1;
    private javax.swing.JLabel EtiquetaDNI2;
    private javax.swing.JLabel EtiquetaDescripcion;
    private javax.swing.JLabel EtiquetaFecha3;
    private javax.swing.JLabel EtiquetaNombre1;
    private javax.swing.JLabel EtiquetaNombre2;
    private javax.swing.JLabel EtiquetaObjeto;
    private javax.swing.JPanel PanelEmisor;
    private javax.swing.JPanel PanelInfo;
    private javax.swing.JPanel PanelReceptor;
    private javax.swing.JTextArea TextoDescripcion;
    private javax.swing.JTextField TextoFecha;
    private javax.swing.JTextField TextoObjeto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    public void guardar(){
        
    }
    
    public void buscar(){
        
    }
}
