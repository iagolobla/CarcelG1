package GUI;

public class VTrapicheos extends javax.swing.JDialog {

    public VTrapicheos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelEmisor = new javax.swing.JPanel();
        EtiquetaDNI1 = new javax.swing.JLabel();
        CampoDNI1 = new javax.swing.JTextField();
        EtiquetaNombre1 = new javax.swing.JLabel();
        CampoNombre1 = new javax.swing.JTextField();
        BotonBuscar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        EtiquetaApodo1 = new javax.swing.JLabel();
        CampoApodo1 = new javax.swing.JTextField();
        PanelReceptor = new javax.swing.JPanel();
        EtiquetaDNI2 = new javax.swing.JLabel();
        CampoDNI2 = new javax.swing.JTextField();
        EtiquetaNombre2 = new javax.swing.JLabel();
        CampoNombre2 = new javax.swing.JTextField();
        BotonBuscar2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        CampoApodo2 = new javax.swing.JTextField();
        EtiquetaApodo2 = new javax.swing.JLabel();
        PanelInfo = new javax.swing.JPanel();
        EtiquetaFecha3 = new javax.swing.JLabel();
        CampoFecha3 = new javax.swing.JTextField();
        EtiquetaObjeto = new javax.swing.JLabel();
        CampoObjeto = new javax.swing.JTextField();
        EtiquetaDescripcion = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CampoDescripcion = new javax.swing.JTextArea();
        BotonSalir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EtiquetaDNI1.setText("DNI");

        EtiquetaNombre1.setText("Nombre");

        BotonBuscar1.setText("Buscar");

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

        EtiquetaApodo1.setText("Apodo");

        javax.swing.GroupLayout PanelEmisorLayout = new javax.swing.GroupLayout(PanelEmisor);
        PanelEmisor.setLayout(PanelEmisorLayout);
        PanelEmisorLayout.setHorizontalGroup(
            PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmisorLayout.createSequentialGroup()
                .addGroup(PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelEmisorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEmisorLayout.createSequentialGroup()
                        .addGroup(PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEmisorLayout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(EtiquetaApodo1))
                            .addGroup(PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PanelEmisorLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(CampoApodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelEmisorLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(EtiquetaDNI1)
                                    .addGap(18, 18, 18)
                                    .addComponent(CampoDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(EtiquetaNombre1)
                                    .addGap(18, 18, 18)
                                    .addComponent(CampoNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonBuscar1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelEmisorLayout.setVerticalGroup(
            PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmisorLayout.createSequentialGroup()
                .addGroup(PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEmisorLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaDNI1)
                            .addComponent(EtiquetaNombre1)
                            .addComponent(CampoNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaApodo1)
                            .addComponent(CampoApodo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEmisorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonBuscar1)
                        .addGap(44, 44, 44)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Emisor", PanelEmisor);

        EtiquetaDNI2.setText("DNI");

        EtiquetaNombre2.setText("Nombre");

        BotonBuscar2.setText("Buscar");

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

        EtiquetaApodo2.setText("Apodo");

        javax.swing.GroupLayout PanelReceptorLayout = new javax.swing.GroupLayout(PanelReceptor);
        PanelReceptor.setLayout(PanelReceptorLayout);
        PanelReceptorLayout.setHorizontalGroup(
            PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReceptorLayout.createSequentialGroup()
                .addGroup(PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelReceptorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelReceptorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelReceptorLayout.createSequentialGroup()
                                .addComponent(EtiquetaApodo2)
                                .addGap(18, 18, 18)
                                .addComponent(CampoApodo2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelReceptorLayout.createSequentialGroup()
                                .addComponent(EtiquetaDNI2)
                                .addGap(18, 18, 18)
                                .addComponent(CampoDNI2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(EtiquetaNombre2)
                                .addGap(18, 18, 18)
                                .addComponent(CampoNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonBuscar2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelReceptorLayout.setVerticalGroup(
            PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReceptorLayout.createSequentialGroup()
                .addGroup(PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelReceptorLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoDNI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaDNI2)
                            .addComponent(EtiquetaNombre2)
                            .addComponent(CampoNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelReceptorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaApodo2)
                            .addComponent(CampoApodo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelReceptorLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(BotonBuscar2)))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Receptor", PanelReceptor);

        EtiquetaFecha3.setText("Fecha");

        EtiquetaObjeto.setText("Objeto");

        EtiquetaDescripcion.setText("Descripcion");

        CampoDescripcion.setColumns(20);
        CampoDescripcion.setRows(5);
        jScrollPane3.setViewportView(CampoDescripcion);

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
                        .addComponent(CampoFecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EtiquetaObjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        PanelInfoLayout.setVerticalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaFecha3)
                    .addComponent(CampoFecha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaObjeto)
                    .addComponent(CampoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtiquetaDescripcion)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Info. General", PanelInfo);

        BotonSalir.setText("Salir");

        BotonGuardar.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonGuardar)
                .addGap(28, 28, 28))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar1;
    private javax.swing.JButton BotonBuscar2;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField CampoApodo1;
    private javax.swing.JTextField CampoApodo2;
    private javax.swing.JTextField CampoDNI1;
    private javax.swing.JTextField CampoDNI2;
    private javax.swing.JTextArea CampoDescripcion;
    private javax.swing.JTextField CampoFecha3;
    private javax.swing.JTextField CampoNombre1;
    private javax.swing.JTextField CampoNombre2;
    private javax.swing.JTextField CampoObjeto;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
