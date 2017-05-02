package GUI;

public class VGestionVisitantes extends javax.swing.JDialog {

    public VGestionVisitantes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EtiquetaNombrePreso = new javax.swing.JLabel();
        CampoNombrePreso = new javax.swing.JTextField();
        EtiquetaDNIPreso = new javax.swing.JLabel();
        CampoDNIPreso = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        EtiquetaNombreVisitante = new javax.swing.JLabel();
        CampoNombreVisitante = new javax.swing.JTextField();
        EtiquetaDNIVisitante = new javax.swing.JLabel();
        CampoDNIVisitante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        EtiquetaDNIPreso1 = new javax.swing.JLabel();
        CampoDNIPreso1 = new javax.swing.JTextField();
        EtiquetaDNIVisitante1 = new javax.swing.JLabel();
        CampoDNIVisitante1 = new javax.swing.JTextField();
        EtiquetaNombreVisitante1 = new javax.swing.JLabel();
        CampoNombreVisitante1 = new javax.swing.JTextField();
        EtqiuetaRelacion = new javax.swing.JLabel();
        CampoRelacion = new javax.swing.JTextField();
        BotonInsertar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        EtiquetaApodo = new javax.swing.JLabel();
        CampoApodo = new javax.swing.JTextField();
        EtiquetaFecha1 = new javax.swing.JLabel();
        CampoFecha1 = new javax.swing.JTextField();
        EtiquetaFecha2 = new javax.swing.JLabel();
        CampoFecha2 = new javax.swing.JTextField();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EtiquetaNombrePreso.setText("Nombre Preso");

        EtiquetaDNIPreso.setText("DNI Preso");

        BotonBuscar.setText("Buscar");

        EtiquetaNombreVisitante.setText("Nombre Visitante");

        EtiquetaDNIVisitante.setText("DNI Visitante");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        EtiquetaDNIPreso1.setText("DNI Preso");

        CampoDNIPreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDNIPreso1ActionPerformed(evt);
            }
        });

        EtiquetaDNIVisitante1.setText("DNI Visitante");

        EtiquetaNombreVisitante1.setText("Nombre Visitante");

        EtqiuetaRelacion.setText("Relacion");

        BotonInsertar.setText("Insertar");

        BotonModificar.setText("Modificar");

        EtiquetaApodo.setText("Apodo");

        EtiquetaFecha1.setText("Fecha");

        EtiquetaFecha2.setText("Fecha");

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaFecha2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CampoFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaNombreVisitante1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoNombreVisitante1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaDNIPreso1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoDNIPreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EtqiuetaRelacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoRelacion)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(EtiquetaDNIVisitante1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoDNIVisitante1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(BotonInsertar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonModificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaApodo)
                                .addGap(18, 18, 18)
                                .addComponent(CampoApodo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaNombrePreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoNombrePreso))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaNombreVisitante)
                                .addGap(18, 18, 18)
                                .addComponent(CampoNombreVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaFecha1)
                                .addGap(18, 18, 18)
                                .addComponent(CampoFecha1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaDNIPreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoDNIPreso))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaDNIVisitante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoDNIVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(BotonBuscar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaNombrePreso)
                            .addComponent(CampoNombrePreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaNombreVisitante)
                            .addComponent(CampoNombreVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaDNIPreso)
                            .addComponent(CampoDNIPreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoDNIVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaDNIVisitante)))
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoApodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaApodo)
                            .addComponent(EtiquetaFecha1))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CampoFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDNIPreso1)
                    .addComponent(CampoDNIPreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaDNIVisitante1)
                    .addComponent(CampoDNIVisitante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaNombreVisitante1)
                    .addComponent(CampoNombreVisitante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtqiuetaRelacion)
                    .addComponent(CampoRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInsertar)
                    .addComponent(BotonModificar)
                    .addComponent(EtiquetaFecha2)
                    .addComponent(CampoFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSalir))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDNIPreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDNIPreso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDNIPreso1ActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonInsertar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField CampoApodo;
    private javax.swing.JTextField CampoDNIPreso;
    private javax.swing.JTextField CampoDNIPreso1;
    private javax.swing.JTextField CampoDNIVisitante;
    private javax.swing.JTextField CampoDNIVisitante1;
    private javax.swing.JTextField CampoFecha1;
    private javax.swing.JTextField CampoFecha2;
    private javax.swing.JTextField CampoNombrePreso;
    private javax.swing.JTextField CampoNombreVisitante;
    private javax.swing.JTextField CampoNombreVisitante1;
    private javax.swing.JTextField CampoRelacion;
    private javax.swing.JLabel EtiquetaApodo;
    private javax.swing.JLabel EtiquetaDNIPreso;
    private javax.swing.JLabel EtiquetaDNIPreso1;
    private javax.swing.JLabel EtiquetaDNIVisitante;
    private javax.swing.JLabel EtiquetaDNIVisitante1;
    private javax.swing.JLabel EtiquetaFecha1;
    private javax.swing.JLabel EtiquetaFecha2;
    private javax.swing.JLabel EtiquetaNombrePreso;
    private javax.swing.JLabel EtiquetaNombreVisitante;
    private javax.swing.JLabel EtiquetaNombreVisitante1;
    private javax.swing.JLabel EtqiuetaRelacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
