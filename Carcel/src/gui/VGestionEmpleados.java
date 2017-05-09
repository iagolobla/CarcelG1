package gui;

import carcel.FachadaCarcel;
import carcel.Nivel;
import javax.swing.DefaultComboBoxModel;

public class VGestionEmpleados extends javax.swing.JDialog {

    public FachadaCarcel fc;
    
    public VGestionEmpleados(java.awt.Frame parent, boolean modal, FachadaCarcel fc) {
        super(parent, modal);
        initComponents();
        ComboAgresividad.setModel(new DefaultComboBoxModel(Nivel.values()));
        this.fc = fc;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        EtiquetaDNI = new javax.swing.JLabel();
        CampoDNIA = new javax.swing.JTextField();
        EtiquetaNombre = new javax.swing.JLabel();
        CampoNombreA = new javax.swing.JTextField();
        BotonBuscarA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAdministradores = new javax.swing.JTable();
        EtiquetaDNI1 = new javax.swing.JLabel();
        TextoDNIA = new javax.swing.JTextField();
        EtiquetaNombre1 = new javax.swing.JLabel();
        TextoNombreA = new javax.swing.JTextField();
        EtiquetaContrasena = new javax.swing.JLabel();
        EtiquetaPuesto = new javax.swing.JLabel();
        EtiquetaTelefono = new javax.swing.JLabel();
        TextoTelefonoA = new javax.swing.JTextField();
        EtiquetaDireccion = new javax.swing.JLabel();
        TextoDireccionA = new javax.swing.JTextField();
        EtiquetaEmail = new javax.swing.JLabel();
        TextoEmailA = new javax.swing.JTextField();
        ButonInsertarA = new javax.swing.JButton();
        BotonModificarA = new javax.swing.JButton();
        BotonEliminarA = new javax.swing.JButton();
        TextoContrasena = new javax.swing.JPasswordField();
        botonSalirA = new javax.swing.JButton();
        TextoPuestoA = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        EtiquetaDNI2 = new javax.swing.JLabel();
        CampoDNIG = new javax.swing.JTextField();
        EtiquetaNombre2 = new javax.swing.JLabel();
        CampoNombreG = new javax.swing.JTextField();
        BotonBuscarG = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaGuardias = new javax.swing.JTable();
        EtiquetaDNI3 = new javax.swing.JLabel();
        TextoDNIG = new javax.swing.JTextField();
        EtiquetaNombre3 = new javax.swing.JLabel();
        TextoNombreG = new javax.swing.JTextField();
        EtiquetaPuesto1 = new javax.swing.JLabel();
        EtiquetaTelefono1 = new javax.swing.JLabel();
        TextoTelefonoG = new javax.swing.JTextField();
        EtiquetaDireccion1 = new javax.swing.JLabel();
        TextoDireccionG = new javax.swing.JTextField();
        EtiquetaEmail1 = new javax.swing.JLabel();
        TextoEmailG = new javax.swing.JTextField();
        ButonInsertarG = new javax.swing.JButton();
        BotonModificarG = new javax.swing.JButton();
        BotonEliminarG = new javax.swing.JButton();
        EtiquetaAgresividad = new javax.swing.JLabel();
        ComboAgresividad = new javax.swing.JComboBox<>();
        TextoPuestoG = new javax.swing.JTextField();
        BotonSalirG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EtiquetaDNI.setText("DNI");

        EtiquetaNombre.setText("Nombre");

        BotonBuscarA.setText("Buscar");
        BotonBuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarAActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(TablaAdministradores);

        EtiquetaDNI1.setText("DNI");

        EtiquetaNombre1.setText("Nombre");

        EtiquetaContrasena.setText("Contraseña");

        EtiquetaPuesto.setText("Puesto");

        EtiquetaTelefono.setText("Telefono");

        TextoTelefonoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoTelefonoAActionPerformed(evt);
            }
        });

        EtiquetaDireccion.setText("Direccion");

        EtiquetaEmail.setText("Email");

        ButonInsertarA.setText("Insertar");
        ButonInsertarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonInsertarAActionPerformed(evt);
            }
        });

        BotonModificarA.setText("Modificar");
        BotonModificarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarAActionPerformed(evt);
            }
        });

        BotonEliminarA.setText("Eliminar");
        BotonEliminarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarAActionPerformed(evt);
            }
        });

        botonSalirA.setText("Salir");
        botonSalirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(EtiquetaDNI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoDNIA, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(EtiquetaNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonBuscarA)
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(EtiquetaTelefono)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextoTelefonoA, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(EtiquetaDNI1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextoDNIA, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EtiquetaNombre1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextoNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EtiquetaContrasena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(EtiquetaPuesto)
                                .addGap(13, 13, 13)
                                .addComponent(TextoPuestoA, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                                .addComponent(EtiquetaEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoEmailA, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ButonInsertarA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonModificarA, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(EtiquetaDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoDireccionA, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))
                        .addGap(6, 6, 6)
                        .addComponent(BotonEliminarA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalirA)
                        .addGap(9, 9, 9))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDNI)
                    .addComponent(CampoDNIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaNombre)
                    .addComponent(CampoNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarA))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDNI1)
                    .addComponent(TextoDNIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaNombre1)
                    .addComponent(TextoNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaContrasena)
                    .addComponent(TextoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaPuesto)
                    .addComponent(TextoEmailA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaEmail)
                    .addComponent(TextoTelefonoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaTelefono)
                    .addComponent(TextoPuestoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDireccion)
                    .addComponent(TextoDireccionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButonInsertarA)
                    .addComponent(BotonModificarA)
                    .addComponent(BotonEliminarA)
                    .addComponent(botonSalirA))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Administradores", jPanel2);

        EtiquetaDNI2.setText("DNI");

        EtiquetaNombre2.setText("Nombre");

        BotonBuscarG.setText("Buscar");
        BotonBuscarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarGActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(TablaGuardias);

        EtiquetaDNI3.setText("DNI");

        EtiquetaNombre3.setText("Nombre");

        EtiquetaPuesto1.setText("Puesto");

        EtiquetaTelefono1.setText("Telefono");

        TextoTelefonoG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoTelefonoGActionPerformed(evt);
            }
        });

        EtiquetaDireccion1.setText("Direccion");

        EtiquetaEmail1.setText("Email");

        ButonInsertarG.setText("Insertar");
        ButonInsertarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonInsertarGActionPerformed(evt);
            }
        });

        BotonModificarG.setText("Modificar");
        BotonModificarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarGActionPerformed(evt);
            }
        });

        BotonEliminarG.setText("Eliminar");
        BotonEliminarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarGActionPerformed(evt);
            }
        });

        EtiquetaAgresividad.setText("Agresividad");

        ComboAgresividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonSalirG.setText("Salir");
        BotonSalirG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(EtiquetaDNI2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoDNIG, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(EtiquetaNombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoNombreG, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonBuscarG)
                .addGap(27, 27, 27))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(ButonInsertarG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonModificarG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonEliminarG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonSalirG))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(EtiquetaPuesto1)
                                        .addGap(13, 13, 13)
                                        .addComponent(TextoPuestoG, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(EtiquetaTelefono1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextoTelefonoG, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))
                                .addComponent(EtiquetaEmail1))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(EtiquetaDireccion1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextoDireccionG, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(EtiquetaDNI3)
                                        .addGap(11, 11, 11)
                                        .addComponent(TextoDNIG, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(EtiquetaNombre3)
                                        .addGap(4, 4, 4)
                                        .addComponent(TextoNombreG, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addComponent(EtiquetaAgresividad)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboAgresividad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 20, Short.MAX_VALUE)
                                .addComponent(TextoEmailG, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDNI2)
                    .addComponent(CampoDNIG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaNombre2)
                    .addComponent(CampoNombreG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarG))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDNI3)
                    .addComponent(TextoDNIG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaNombre3)
                    .addComponent(TextoNombreG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaAgresividad)
                    .addComponent(ComboAgresividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaPuesto1)
                    .addComponent(EtiquetaTelefono1)
                    .addComponent(TextoTelefonoG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaEmail1)
                    .addComponent(TextoEmailG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoPuestoG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoDireccionG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaDireccion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButonInsertarG)
                    .addComponent(BotonModificarG)
                    .addComponent(BotonEliminarG)
                    .addComponent(BotonSalirG))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Guardias", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoTelefonoGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoTelefonoGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoTelefonoGActionPerformed

    private void TextoTelefonoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoTelefonoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoTelefonoAActionPerformed

    private void botonSalirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirAActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirAActionPerformed

    private void BotonSalirGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirGActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonSalirGActionPerformed

    private void ButonInsertarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonInsertarAActionPerformed
        
    }//GEN-LAST:event_ButonInsertarAActionPerformed

    private void BotonModificarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarAActionPerformed
        
    }//GEN-LAST:event_BotonModificarAActionPerformed

    private void BotonEliminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarAActionPerformed
        
    }//GEN-LAST:event_BotonEliminarAActionPerformed

    private void ButonInsertarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonInsertarGActionPerformed
        
    }//GEN-LAST:event_ButonInsertarGActionPerformed

    private void BotonModificarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarGActionPerformed
        
    }//GEN-LAST:event_BotonModificarGActionPerformed

    private void BotonEliminarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarGActionPerformed
        
    }//GEN-LAST:event_BotonEliminarGActionPerformed

    private void BotonBuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarAActionPerformed
        
    }//GEN-LAST:event_BotonBuscarAActionPerformed

    private void BotonBuscarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarGActionPerformed
        
    }//GEN-LAST:event_BotonBuscarGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarA;
    private javax.swing.JButton BotonBuscarG;
    private javax.swing.JButton BotonEliminarA;
    private javax.swing.JButton BotonEliminarG;
    private javax.swing.JButton BotonModificarA;
    private javax.swing.JButton BotonModificarG;
    private javax.swing.JButton BotonSalirG;
    private javax.swing.JButton ButonInsertarA;
    private javax.swing.JButton ButonInsertarG;
    private javax.swing.JTextField CampoDNIA;
    private javax.swing.JTextField CampoDNIG;
    private javax.swing.JTextField CampoNombreA;
    private javax.swing.JTextField CampoNombreG;
    private javax.swing.JComboBox<String> ComboAgresividad;
    private javax.swing.JLabel EtiquetaAgresividad;
    private javax.swing.JLabel EtiquetaContrasena;
    private javax.swing.JLabel EtiquetaDNI;
    private javax.swing.JLabel EtiquetaDNI1;
    private javax.swing.JLabel EtiquetaDNI2;
    private javax.swing.JLabel EtiquetaDNI3;
    private javax.swing.JLabel EtiquetaDireccion;
    private javax.swing.JLabel EtiquetaDireccion1;
    private javax.swing.JLabel EtiquetaEmail;
    private javax.swing.JLabel EtiquetaEmail1;
    private javax.swing.JLabel EtiquetaNombre;
    private javax.swing.JLabel EtiquetaNombre1;
    private javax.swing.JLabel EtiquetaNombre2;
    private javax.swing.JLabel EtiquetaNombre3;
    private javax.swing.JLabel EtiquetaPuesto;
    private javax.swing.JLabel EtiquetaPuesto1;
    private javax.swing.JLabel EtiquetaTelefono;
    private javax.swing.JLabel EtiquetaTelefono1;
    private javax.swing.JTable TablaAdministradores;
    private javax.swing.JTable TablaGuardias;
    private javax.swing.JPasswordField TextoContrasena;
    private javax.swing.JTextField TextoDNIA;
    private javax.swing.JTextField TextoDNIG;
    private javax.swing.JTextField TextoDireccionA;
    private javax.swing.JTextField TextoDireccionG;
    private javax.swing.JTextField TextoEmailA;
    private javax.swing.JTextField TextoEmailG;
    private javax.swing.JTextField TextoNombreA;
    private javax.swing.JTextField TextoNombreG;
    private javax.swing.JTextField TextoPuestoA;
    private javax.swing.JTextField TextoPuestoG;
    private javax.swing.JTextField TextoTelefonoA;
    private javax.swing.JTextField TextoTelefonoG;
    private javax.swing.JButton botonSalirA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}
