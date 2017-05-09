package gui;

public class VPrincipal extends javax.swing.JFrame {

    private carcel.FachadaCarcel fc;

    public VPrincipal(carcel.FachadaCarcel fc) {
        this.fc = fc;
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
        MenuVisitas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EtiquetaEmisor.setText("Emisor");

        EtiquetaReceptor.setText("Receptor");

        CampoEmisorDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmisorDNIActionPerformed(evt);
            }
        });

        EtiquetaFecha.setText("Fecha");

        EtiquetaDNI.setText("DNI");

        CampoEmisorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmisorNombreActionPerformed(evt);
            }
        });

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

        jScrollPane1.setViewportView(TablaTrapicheos);

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        jLabel1.setText("Gestion de Trapicheos");

        EtiquetaApodo.setText("Apodo");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonInsertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(EtiquetaEmisor)
                                                .addGap(23, 23, 23))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(EtiquetaFecha)
                                                    .addComponent(EtiquetaReceptor))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(EtiquetaDNI)
                                                .addGap(78, 78, 78)
                                                .addComponent(EtiquetaNombre)
                                                .addGap(84, 84, 84)
                                                .addComponent(EtiquetaApodo))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                            .addComponent(CampoReceptorDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(CampoReceptorNombre))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                            .addComponent(CampoEmisorDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(CampoEmisorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(CampoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(BotonBuscar))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(CampoEmisorApodo)
                                                        .addComponent(CampoReceptorApodo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addComponent(jLabel1))
                                .addGap(147, 147, 147))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
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
                .addGap(29, 29, 29)
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

        MenuVisitas.setText("Visitas");
        MenuVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVisitasActionPerformed(evt);
            }
        });
        jMenu1.add(MenuVisitas);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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
        iniciaGestionEmpleados();
    }//GEN-LAST:event_MenuEmpleadosActionPerformed

    private void CampoEmisorDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmisorDNIActionPerformed

    }//GEN-LAST:event_CampoEmisorDNIActionPerformed

    private void CampoEmisorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmisorNombreActionPerformed

    }//GEN-LAST:event_CampoEmisorNombreActionPerformed

    private void BotonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarActionPerformed
        
    }//GEN-LAST:event_BotonInsertarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        BuscarTrapicheos();
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void MenuPresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPresosActionPerformed
        iniciaGestionPresos();
    }//GEN-LAST:event_MenuPresosActionPerformed

    private void MenuCeldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCeldasActionPerformed
        iniciaGestionCeldas();
    }//GEN-LAST:event_MenuCeldasActionPerformed

    private void MenuBandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBandasActionPerformed
        iniciaGestionBandas();
    }//GEN-LAST:event_MenuBandasActionPerformed

    private void MenuVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVisitasActionPerformed
        iniciaGestionVisitas();
    }//GEN-LAST:event_MenuVisitasActionPerformed


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
    private javax.swing.JMenuItem MenuVisitas;
    private javax.swing.JTable TablaTrapicheos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    private void BuscarTrapicheos() {
        //fc
    }

    private void iniciaGestionEmpleados() {
        fc.iniciaGestionEmpleados();
    }

    private void iniciaGestionPresos() {
        fc.iniciaGestionPresos();
    }

    private void iniciaGestionCeldas() {
        fc.iniciaGestionCeldas();
    }

    private void iniciaGestionBandas() {
        fc.iniciaGestionBandas();
    }

    private void iniciaGestionVisitas() {
        fc.iniciaGestionVisitas();
    }

}
