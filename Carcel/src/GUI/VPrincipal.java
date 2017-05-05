package GUI;

public class VPrincipal extends javax.swing.JFrame {

    private carcel.FachadaCarcel fa;

    public VPrincipal(carcel.FachadaCarcel fa){
        this.fa = fa;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EtiquetaEmisor = new javax.swing.JLabel();
        EtiquetaReceptor = new javax.swing.JLabel();
        CampoEmisorDNI = new javax.swing.JTextField();
        CampoReceptorDNI = new javax.swing.JTextField();
        EtiquetaFecha = new javax.swing.JLabel();
        CampoFecha = new javax.swing.JTextField();
        EtiquetaDNI = new javax.swing.JLabel();
        CampoEmisorNombre = new javax.swing.JTextField();
        CampoReceptorNombre = new javax.swing.JTextField();
        EtiquetaNombre = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JButton();
        BotonInsertar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTrapicheos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        EtiquetaApodo = new javax.swing.JLabel();
        CampoEmisorApodo = new javax.swing.JTextField();
        CampoReceptorApodo = new javax.swing.JTextField();
        BotonSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuEmpleados = new javax.swing.JMenuItem();
        MenuPresos = new javax.swing.JMenuItem();
        MenuCeldas = new javax.swing.JMenuItem();
        MenuBandas = new javax.swing.JMenuItem();
        MenuVisitantes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EtiquetaEmisor.setText("Emisor");

        EtiquetaReceptor.setText("Receptor");

        EtiquetaFecha.setText("Fecha");

        EtiquetaDNI.setText("DNI");

        EtiquetaNombre.setText("Nombre");

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

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

        TablaTrapicheos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaTrapicheos);

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        jLabel1.setText("Gestion de Trapicheos");

        EtiquetaApodo.setText("Apodo");

        BotonSalir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtiquetaEmisor)
                            .addComponent(EtiquetaFecha)
                            .addComponent(EtiquetaReceptor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(EtiquetaDNI)
                                .addGap(78, 78, 78)
                                .addComponent(EtiquetaNombre)
                                .addGap(84, 84, 84)
                                .addComponent(EtiquetaApodo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(CampoReceptorDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CampoReceptorNombre))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(CampoEmisorDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CampoEmisorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoEmisorApodo)
                                    .addComponent(CampoReceptorApodo, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CampoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonBuscar)
                                .addGap(103, 103, 103)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonInsertar)
                        .addGap(12, 12, 12)
                        .addComponent(BotonModificar)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDNI)
                    .addComponent(EtiquetaNombre)
                    .addComponent(EtiquetaApodo))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoEmisorDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaEmisor)
                    .addComponent(CampoEmisorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoEmisorApodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoReceptorDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaReceptor)
                    .addComponent(CampoReceptorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoReceptorApodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaFecha)
                    .addComponent(BotonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificar)
                    .addComponent(BotonSalir))
                .addContainerGap())
        );

        jMenu1.setText("Gestion");

        MenuEmpleados.setText("Empleados");
        MenuEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEmpleadosActionPerformed(evt);
            }
        });
        jMenu1.add(MenuEmpleados);

        MenuPresos.setText("Presos");
        MenuPresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPresosActionPerformed(evt);
            }
        });
        jMenu1.add(MenuPresos);

        MenuCeldas.setText("Celdas");
        MenuCeldas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCeldasActionPerformed(evt);
            }
        });
        jMenu1.add(MenuCeldas);

        MenuBandas.setText("Bandas");
        MenuBandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBandasActionPerformed(evt);
            }
        });
        jMenu1.add(MenuBandas);

        MenuVisitantes.setText("Visitantes");
        MenuVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVisitantesActionPerformed(evt);
            }
        });
        jMenu1.add(MenuVisitantes);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEmpleadosActionPerformed
        
    }//GEN-LAST:event_MenuEmpleadosActionPerformed

    private void BotonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarActionPerformed
        
    }//GEN-LAST:event_BotonInsertarActionPerformed

    private void MenuPresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPresosActionPerformed

    }//GEN-LAST:event_MenuPresosActionPerformed

    private void MenuCeldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCeldasActionPerformed

    }//GEN-LAST:event_MenuCeldasActionPerformed

    private void MenuBandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBandasActionPerformed

    }//GEN-LAST:event_MenuBandasActionPerformed

    private void MenuVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVisitantesActionPerformed

    }//GEN-LAST:event_MenuVisitantesActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed

    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        
    }//GEN-LAST:event_BotonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonInsertar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField CampoEmisorApodo;
    private javax.swing.JTextField CampoEmisorDNI;
    private javax.swing.JTextField CampoEmisorNombre;
    private javax.swing.JTextField CampoFecha;
    private javax.swing.JTextField CampoReceptorApodo;
    private javax.swing.JTextField CampoReceptorDNI;
    private javax.swing.JTextField CampoReceptorNombre;
    private javax.swing.JLabel EtiquetaApodo;
    private javax.swing.JLabel EtiquetaDNI;
    private javax.swing.JLabel EtiquetaEmisor;
    private javax.swing.JLabel EtiquetaFecha;
    private javax.swing.JLabel EtiquetaNombre;
    private javax.swing.JLabel EtiquetaReceptor;
    private javax.swing.JMenuItem MenuBandas;
    private javax.swing.JMenuItem MenuCeldas;
    private javax.swing.JMenuItem MenuEmpleados;
    private javax.swing.JMenuItem MenuPresos;
    private javax.swing.JMenuItem MenuVisitantes;
    private javax.swing.JTable TablaTrapicheos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
public void BuscarTrapicheos(){
    ModeloTablaTrapicheos m;
    
    m= (ModeloTablaTrapicheos) TablaTrapicheos.getModel();
   // m.setFilas(VPrincipal.obtenerTrapicheo(CampoEmisorDNI.getText(), CampoEmisorNombre.getText(), CampoEmisorApodo.getText(), CampoReceptorDNI.getText(), CampoReceptorNombre.getText(), CampoReceptorApodo.getText(), CampoFecha.getText()));
}


}
