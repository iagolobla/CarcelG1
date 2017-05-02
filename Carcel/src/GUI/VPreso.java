package GUI;

public class VPreso extends javax.swing.JDialog {

    public VPreso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPanel = new javax.swing.JTabbedPane();
        Presos = new javax.swing.JPanel();
        EtiquetaDNI = new javax.swing.JLabel();
        CampoDNI = new javax.swing.JTextField();
        EtiquetaNombre = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        EtiquetaApodo = new javax.swing.JLabel();
        CampoApodo = new javax.swing.JTextField();
        EtiquetaFechaN = new javax.swing.JLabel();
        CampoFechaN = new javax.swing.JTextField();
        EtiquetaFechaI = new javax.swing.JLabel();
        CampoFechaI = new javax.swing.JTextField();
        EtiquetaAgresividad = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        Celda = new javax.swing.JPanel();
        EtiquetaIdCelda = new javax.swing.JLabel();
        CampoIdCelda = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BotonBuscar1 = new javax.swing.JButton();
        EtiquetaPlazas = new javax.swing.JLabel();
        CampoPlazas = new javax.swing.JTextField();
        EtiquetaSeguridad = new javax.swing.JLabel();
        jComboBoxSeguridad = new javax.swing.JComboBox<String>();
        BotonAlojar = new javax.swing.JButton();
        Banda = new javax.swing.JPanel();
        EtiquetaTipo = new javax.swing.JLabel();
        CampoTipo = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotonVincular = new javax.swing.JButton();
        BotonDesvincular = new javax.swing.JButton();
        Cargos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        EtiquetaTipoDelito = new javax.swing.JLabel();
        CampoTipoDelito = new javax.swing.JTextField();
        EtiquetaDescripcion = new javax.swing.JLabel();
        PanelDescripcion = new javax.swing.JScrollPane();
        CampoDescripcion = new javax.swing.JTextArea();
        EtiquetaIntensidad = new javax.swing.JLabel();
        BotonInsertar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        ComboBoxIntensidad = new javax.swing.JComboBox<String>();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EtiquetaDNI.setText("DNI");

        CampoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDNIActionPerformed(evt);
            }
        });

        EtiquetaNombre.setText("Nombre");

        EtiquetaApodo.setText("Apodo");

        CampoApodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoApodoActionPerformed(evt);
            }
        });

        EtiquetaFechaN.setText("Fecha Nacimiento");

        CampoFechaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaNActionPerformed(evt);
            }
        });

        EtiquetaFechaI.setText("Fecha Ingreso");

        EtiquetaAgresividad.setText("Agresividad");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PresosLayout = new javax.swing.GroupLayout(Presos);
        Presos.setLayout(PresosLayout);
        PresosLayout.setHorizontalGroup(
            PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PresosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PresosLayout.createSequentialGroup()
                        .addComponent(EtiquetaApodo)
                        .addGap(18, 18, 18)
                        .addComponent(CampoApodo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PresosLayout.createSequentialGroup()
                            .addComponent(EtiquetaDNI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CampoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PresosLayout.createSequentialGroup()
                            .addComponent(EtiquetaFechaN)
                            .addGap(18, 18, 18)
                            .addComponent(CampoFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PresosLayout.createSequentialGroup()
                        .addComponent(EtiquetaNombre)
                        .addGap(18, 18, 18)
                        .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PresosLayout.createSequentialGroup()
                        .addComponent(EtiquetaFechaI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CampoFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PresosLayout.createSequentialGroup()
                        .addComponent(EtiquetaAgresividad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
        );
        PresosLayout.setVerticalGroup(
            PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PresosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaDNI)
                    .addComponent(EtiquetaNombre)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaFechaN)
                    .addComponent(CampoFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaFechaI)
                    .addComponent(CampoFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaAgresividad)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoApodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaApodo))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPanel.addTab("Datos Personales", Presos);

        EtiquetaIdCelda.setText("Id Celda");

        CampoIdCelda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdCeldaActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        BotonBuscar1.setText("Buscar");

        EtiquetaPlazas.setText("Plazas");

        EtiquetaSeguridad.setText("Seguridad");

        jComboBoxSeguridad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonAlojar.setText("Alojar");

        javax.swing.GroupLayout CeldaLayout = new javax.swing.GroupLayout(Celda);
        Celda.setLayout(CeldaLayout);
        CeldaLayout.setHorizontalGroup(
            CeldaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CeldaLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(BotonBuscar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CeldaLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(CeldaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CeldaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CeldaLayout.createSequentialGroup()
                            .addComponent(EtiquetaIdCelda)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CampoIdCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EtiquetaPlazas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CampoPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EtiquetaSeguridad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotonAlojar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        CeldaLayout.setVerticalGroup(
            CeldaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CeldaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(CeldaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaIdCelda)
                    .addComponent(CampoIdCelda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaPlazas)
                    .addComponent(CampoPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaSeguridad)
                    .addComponent(jComboBoxSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonBuscar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonAlojar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPanel.addTab("Celda", Celda);

        EtiquetaTipo.setText("Tipo");

        BotonBuscar.setText("Buscar");

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

        BotonVincular.setText("Vincular");

        BotonDesvincular.setText("Desasociar");

        javax.swing.GroupLayout BandaLayout = new javax.swing.GroupLayout(Banda);
        Banda.setLayout(BandaLayout);
        BandaLayout.setHorizontalGroup(
            BandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BandaLayout.createSequentialGroup()
                .addGroup(BandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BandaLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(EtiquetaTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(BotonBuscar))
                    .addGroup(BandaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BandaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonVincular)
                .addGap(18, 18, 18)
                .addComponent(BotonDesvincular)
                .addGap(52, 52, 52))
        );
        BandaLayout.setVerticalGroup(
            BandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BandaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(BandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaTipo)
                    .addComponent(CampoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(BandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonVincular)
                    .addComponent(BotonDesvincular))
                .addGap(20, 20, 20))
        );

        jTabbedPanel.addTab("Banda", Banda);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        EtiquetaTipoDelito.setText("Tipo Delito");

        CampoTipoDelito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTipoDelitoActionPerformed(evt);
            }
        });

        EtiquetaDescripcion.setText("Descripcion");

        CampoDescripcion.setColumns(20);
        CampoDescripcion.setRows(5);
        PanelDescripcion.setViewportView(CampoDescripcion);

        EtiquetaIntensidad.setText("Intensidad");

        BotonInsertar.setText("Insertar");

        BotonModificar.setText("Modificar");

        BotonEliminar.setText("Eliminar");

        ComboBoxIntensidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout CargosLayout = new javax.swing.GroupLayout(Cargos);
        Cargos.setLayout(CargosLayout);
        CargosLayout.setHorizontalGroup(
            CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargosLayout.createSequentialGroup()
                .addGroup(CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CargosLayout.createSequentialGroup()
                                .addGroup(CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EtiquetaTipoDelito)
                                    .addComponent(EtiquetaDescripcion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoTipoDelito, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CargosLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(PanelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EtiquetaIntensidad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBoxIntensidad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(CargosLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(BotonInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(BotonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(BotonEliminar)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        CargosLayout.setVerticalGroup(
            CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaTipoDelito)
                    .addComponent(CampoTipoDelito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtiquetaDescripcion)
                    .addComponent(PanelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EtiquetaIntensidad)
                        .addComponent(ComboBoxIntensidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInsertar)
                    .addComponent(BotonModificar)
                    .addComponent(BotonEliminar))
                .addGap(89, 89, 89))
        );

        jTabbedPanel.addTab("Cargos", Cargos);

        BotonSalir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDNIActionPerformed

    }//GEN-LAST:event_CampoDNIActionPerformed

    private void CampoApodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoApodoActionPerformed

    }//GEN-LAST:event_CampoApodoActionPerformed

    private void CampoFechaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaNActionPerformed

    }//GEN-LAST:event_CampoFechaNActionPerformed

    private void CampoIdCeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdCeldaActionPerformed

    }//GEN-LAST:event_CampoIdCeldaActionPerformed

    private void CampoTipoDelitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTipoDelitoActionPerformed

    }//GEN-LAST:event_CampoTipoDelitoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Banda;
    private javax.swing.JButton BotonAlojar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonBuscar1;
    private javax.swing.JButton BotonDesvincular;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonInsertar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonVincular;
    private javax.swing.JTextField CampoApodo;
    private javax.swing.JTextField CampoDNI;
    private javax.swing.JTextArea CampoDescripcion;
    private javax.swing.JTextField CampoFechaI;
    private javax.swing.JTextField CampoFechaN;
    private javax.swing.JTextField CampoIdCelda;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoPlazas;
    private javax.swing.JTextField CampoTipo;
    private javax.swing.JTextField CampoTipoDelito;
    private javax.swing.JPanel Cargos;
    private javax.swing.JPanel Celda;
    private javax.swing.JComboBox<String> ComboBoxIntensidad;
    private javax.swing.JLabel EtiquetaAgresividad;
    private javax.swing.JLabel EtiquetaApodo;
    private javax.swing.JLabel EtiquetaDNI;
    private javax.swing.JLabel EtiquetaDescripcion;
    private javax.swing.JLabel EtiquetaFechaI;
    private javax.swing.JLabel EtiquetaFechaN;
    private javax.swing.JLabel EtiquetaIdCelda;
    private javax.swing.JLabel EtiquetaIntensidad;
    private javax.swing.JLabel EtiquetaNombre;
    private javax.swing.JLabel EtiquetaPlazas;
    private javax.swing.JLabel EtiquetaSeguridad;
    private javax.swing.JLabel EtiquetaTipo;
    private javax.swing.JLabel EtiquetaTipoDelito;
    private javax.swing.JScrollPane PanelDescripcion;
    private javax.swing.JPanel Presos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSeguridad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPanel;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
