package gui;

import carcel.Banda;
import carcel.Celda;
import carcel.Delito;
import carcel.FachadaCarcel;
import carcel.Nivel;
import carcel.Preso;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class VPreso extends javax.swing.JDialog {

    FachadaCarcel fc;

    public VPreso(java.awt.Frame parent, boolean modal, FachadaCarcel fc) {
        super(parent, modal);
        initComponents();
        this.fc = fc;

        ComboAgresividad.setModel(new DefaultComboBoxModel(Nivel.values()));
        ComboIntensidad.setModel(new DefaultComboBoxModel(Nivel.values()));
        ComboSeguridad.setModel(new DefaultComboBoxModel(Nivel.values()));
    }

    public VPreso(java.awt.Frame parent, boolean modal, FachadaCarcel fc, Preso preso) {
        super(parent, modal);
        initComponents();
        this.fc = fc;

        ComboAgresividad.setModel(new DefaultComboBoxModel(Nivel.values()));
        ComboIntensidad.setModel(new DefaultComboBoxModel(Nivel.values()));
        ComboSeguridad.setModel(new DefaultComboBoxModel(Nivel.values()));

        TextoDNI.setText(preso.getDNI());
        TextoNombre.setText(preso.getNombre());
        TextoApodo.setText(preso.getApodo());
        TextoFechaI.setText(preso.getFechaIngreso().toString());
        TextoFechaN.setText(preso.getFechaNacimiento().toString());
        ComboAgresividad.setSelectedItem(preso.getAgresividad());
        //Buscar celda segun el preso y seleccionar fila
        //Buscar banda segun el preso y seleccionar fila
        TextoDNI.setEditable(false);
        buscarCargosPreso(preso.getDNI());
        buscarBanda(preso.getBanda().getTipo_banda());
        buscarCargosPreso(preso.getDNI());
        obtenerCeldaPreso(String.valueOf(preso.getCelda().getnCelda()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPanel = new javax.swing.JTabbedPane();
        Presos = new javax.swing.JPanel();
        EtiquetaDNI = new javax.swing.JLabel();
        TextoDNI = new javax.swing.JTextField();
        EtiquetaNombre = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        EtiquetaApodo = new javax.swing.JLabel();
        TextoApodo = new javax.swing.JTextField();
        EtiquetaFechaN = new javax.swing.JLabel();
        TextoFechaN = new javax.swing.JTextField();
        EtiquetaFechaI = new javax.swing.JLabel();
        TextoFechaI = new javax.swing.JTextField();
        EtiquetaAgresividad = new javax.swing.JLabel();
        ComboAgresividad = new javax.swing.JComboBox<String>();
        Celda = new javax.swing.JPanel();
        EtiquetaIdCelda = new javax.swing.JLabel();
        CampoIdCelda = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCeldas = new javax.swing.JTable();
        BotonBuscarC = new javax.swing.JButton();
        EtiquetaPlazas = new javax.swing.JLabel();
        CampoPlazas = new javax.swing.JTextField();
        EtiquetaSeguridad = new javax.swing.JLabel();
        ComboSeguridad = new javax.swing.JComboBox<String>();
        BotonAlojar = new javax.swing.JButton();
        Banda = new javax.swing.JPanel();
        EtiquetaTipo = new javax.swing.JLabel();
        CampoTipoBanda = new javax.swing.JTextField();
        BotonBuscarB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBandas = new javax.swing.JTable();
        BotonAsociar = new javax.swing.JButton();
        BotonDesasociar = new javax.swing.JButton();
        Cargos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaCargos = new javax.swing.JTable();
        EtiquetaTipoDelito = new javax.swing.JLabel();
        TextoTipoDelito = new javax.swing.JTextField();
        EtiquetaDescripcion = new javax.swing.JLabel();
        PanelDescripcion = new javax.swing.JScrollPane();
        TextoDescripcion = new javax.swing.JTextArea();
        EtiquetaIntensidad = new javax.swing.JLabel();
        BotonInsertar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        ComboIntensidad = new javax.swing.JComboBox<String>();
        BotonSalir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EtiquetaDNI.setText("DNI");

        EtiquetaNombre.setText("Nombre");

        EtiquetaApodo.setText("Apodo");

        TextoApodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoApodoActionPerformed(evt);
            }
        });

        EtiquetaFechaN.setText("Fecha Nacimiento");

        TextoFechaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoFechaNActionPerformed(evt);
            }
        });

        EtiquetaFechaI.setText("Fecha Ingreso");

        EtiquetaAgresividad.setText("Agresividad");

        ComboAgresividad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                        .addComponent(TextoApodo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PresosLayout.createSequentialGroup()
                            .addComponent(EtiquetaDNI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PresosLayout.createSequentialGroup()
                            .addComponent(EtiquetaFechaN)
                            .addGap(18, 18, 18)
                            .addComponent(TextoFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PresosLayout.createSequentialGroup()
                        .addComponent(EtiquetaNombre)
                        .addGap(18, 18, 18)
                        .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PresosLayout.createSequentialGroup()
                        .addComponent(EtiquetaFechaI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextoFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PresosLayout.createSequentialGroup()
                        .addComponent(EtiquetaAgresividad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboAgresividad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
        );
        PresosLayout.setVerticalGroup(
            PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PresosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaDNI)
                    .addComponent(EtiquetaNombre)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaFechaN)
                    .addComponent(TextoFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaFechaI)
                    .addComponent(TextoFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(PresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaAgresividad)
                    .addComponent(ComboAgresividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoApodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaApodo))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPanel.addTab("Datos Personales", Presos);

        EtiquetaIdCelda.setText("Id Celda");

        CampoIdCelda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdCeldaActionPerformed(evt);
            }
        });

        TablaCeldas.setModel(new ModeloTablaCeldas());
        jScrollPane2.setViewportView(TablaCeldas);

        BotonBuscarC.setText("Buscar");
        BotonBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarCActionPerformed(evt);
            }
        });

        EtiquetaPlazas.setText("Plazas");

        EtiquetaSeguridad.setText("Seguridad");

        ComboSeguridad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonAlojar.setText("Alojar");
        BotonAlojar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAlojarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CeldaLayout = new javax.swing.GroupLayout(Celda);
        Celda.setLayout(CeldaLayout);
        CeldaLayout.setHorizontalGroup(
            CeldaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CeldaLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(BotonBuscarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CeldaLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
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
                            .addComponent(ComboSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotonAlojar, javax.swing.GroupLayout.Alignment.TRAILING))
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
                    .addComponent(ComboSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonBuscarC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonAlojar)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPanel.addTab("Celda", Celda);

        EtiquetaTipo.setText("Tipo");

        BotonBuscarB.setText("Buscar");
        BotonBuscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarBActionPerformed(evt);
            }
        });

        TablaBandas.setModel(new ModeloTablaBandas());
        jScrollPane1.setViewportView(TablaBandas);

        BotonAsociar.setText("Asociar");
        BotonAsociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAsociarActionPerformed(evt);
            }
        });

        BotonDesasociar.setText("Desasociar");
        BotonDesasociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDesasociarActionPerformed(evt);
            }
        });

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
                        .addComponent(CampoTipoBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(BotonBuscarB))
                    .addGroup(BandaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BandaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonAsociar)
                .addGap(18, 18, 18)
                .addComponent(BotonDesasociar)
                .addGap(52, 52, 52))
        );
        BandaLayout.setVerticalGroup(
            BandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BandaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(BandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaTipo)
                    .addComponent(CampoTipoBanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarB))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(BandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAsociar)
                    .addComponent(BotonDesasociar))
                .addGap(20, 20, 20))
        );

        jTabbedPanel.addTab("Banda", Banda);

        TablaCargos.setModel(new ModeloTablaCargos());
        TablaCargos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TablaCargosMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(TablaCargos);

        EtiquetaTipoDelito.setText("Tipo Delito");

        TextoTipoDelito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoTipoDelitoActionPerformed(evt);
            }
        });

        EtiquetaDescripcion.setText("Descripcion");

        TextoDescripcion.setColumns(20);
        TextoDescripcion.setRows(5);
        PanelDescripcion.setViewportView(TextoDescripcion);

        EtiquetaIntensidad.setText("Intensidad");

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

        BotonEliminar.setText("Eliminar");
        BotonEliminar.setEnabled(false);
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        ComboIntensidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                                    .addComponent(TextoTipoDelito, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CargosLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(PanelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EtiquetaIntensidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboIntensidad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CargosLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(BotonInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(BotonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(BotonEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CargosLayout.setVerticalGroup(
            CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaTipoDelito)
                    .addComponent(TextoTipoDelito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtiquetaDescripcion)
                    .addComponent(PanelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EtiquetaIntensidad)
                        .addComponent(ComboIntensidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(CargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInsertar)
                    .addComponent(BotonModificar)
                    .addComponent(BotonEliminar))
                .addGap(89, 89, 89))
        );

        jTabbedPanel.addTab("Cargos", Cargos);

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonSalir)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSalir)
                    .addComponent(BotonGuardar))
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

    private void TextoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoDNIActionPerformed

    }//GEN-LAST:event_TextoDNIActionPerformed

    private void TextoApodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoApodoActionPerformed

    }//GEN-LAST:event_TextoApodoActionPerformed

    private void TextoFechaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoFechaNActionPerformed

    }//GEN-LAST:event_TextoFechaNActionPerformed

    private void CampoIdCeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdCeldaActionPerformed

    }//GEN-LAST:event_CampoIdCeldaActionPerformed

    private void TextoTipoDelitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoTipoDelitoActionPerformed

    }//GEN-LAST:event_TextoTipoDelitoActionPerformed

    private void BotonBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarCActionPerformed
        buscarCelda();
    }//GEN-LAST:event_BotonBuscarCActionPerformed

    private void BotonAlojarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAlojarActionPerformed
        alojarPreso();
    }//GEN-LAST:event_BotonAlojarActionPerformed

    private void BotonBuscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarBActionPerformed
        buscarBanda(CampoTipoBanda.getText());
    }//GEN-LAST:event_BotonBuscarBActionPerformed

    private void BotonAsociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAsociarActionPerformed
        asociarPresoBanda();
        buscarBanda(CampoTipoBanda.getText());
    }//GEN-LAST:event_BotonAsociarActionPerformed

    private void BotonDesasociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDesasociarActionPerformed
        desasociarPresoBanda();
        buscarBanda(CampoTipoBanda.getText());
    }//GEN-LAST:event_BotonDesasociarActionPerformed

    private void BotonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarActionPerformed
        insertarCargo();
        buscarCargosPreso(TextoDNI.getText());
    }//GEN-LAST:event_BotonInsertarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        modificarCargo();
        buscarCargosPreso(TextoDNI.getText());
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        eliminarCargo();
        buscarCargosPreso(TextoDNI.getText());
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        insertarPreso();
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void TablaCargosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCargosMouseReleased
        rellenarCampos();
    }//GEN-LAST:event_TablaCargosMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Banda;
    private javax.swing.JButton BotonAlojar;
    private javax.swing.JButton BotonAsociar;
    private javax.swing.JButton BotonBuscarB;
    private javax.swing.JButton BotonBuscarC;
    private javax.swing.JButton BotonDesasociar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonInsertar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField CampoIdCelda;
    private javax.swing.JTextField CampoPlazas;
    private javax.swing.JTextField CampoTipoBanda;
    private javax.swing.JPanel Cargos;
    private javax.swing.JPanel Celda;
    private javax.swing.JComboBox<String> ComboAgresividad;
    private javax.swing.JComboBox<String> ComboIntensidad;
    private javax.swing.JComboBox<String> ComboSeguridad;
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
    private javax.swing.JTable TablaBandas;
    private javax.swing.JTable TablaCargos;
    private javax.swing.JTable TablaCeldas;
    private javax.swing.JTextField TextoApodo;
    private javax.swing.JTextField TextoDNI;
    private javax.swing.JTextArea TextoDescripcion;
    private javax.swing.JTextField TextoFechaI;
    private javax.swing.JTextField TextoFechaN;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoTipoDelito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPanel;
    // End of variables declaration//GEN-END:variables

    public void insertarPreso() {
        String DNI = TextoDNI.getText();
        String nombre = TextoNombre.getText();
        String apodo = TextoApodo.getText();
        Date fechaNacimiento = Date.valueOf(TextoFechaN.getText());
        Date fechaIngreso = Date.valueOf(TextoFechaI.getText());
        Nivel agresividad = (Nivel) ComboAgresividad.getSelectedItem();

        ModeloTablaBandas mtb = (ModeloTablaBandas) TablaBandas.getModel();
        ModeloTablaCeldas mtc = (ModeloTablaCeldas) TablaCeldas.getModel();

        Celda celda = null;
        Banda banda = null;
        if (mtb.getRowCount() > 0) {
            if (TablaBandas.getSelectedRowCount() > 0) {
                String tipoBanda = mtb.obtenerBanda(TablaBandas.getSelectedRow()).getTipo_banda();
                Integer numPresos = mtb.obtenerBanda((TablaBandas.getSelectedRow())).getPresos();
                banda = new Banda(tipoBanda, numPresos);
            }
        }

        //Parte de Celdas
        if (mtc.getRowCount() > 0) {
            if (TablaCeldas.getSelectedRowCount() > 0) {
                Integer nCelda = mtc.obtenerCelda(TablaCeldas.getSelectedRow()).getnCelda();
                Float superficie = mtc.obtenerCelda(TablaCeldas.getSelectedRow()).getSuperficie();
                Integer nCamas = mtc.obtenerCelda(TablaCeldas.getSelectedRow()).getnCamas();
                Nivel seguridad = mtc.obtenerCelda(TablaCeldas.getSelectedRow()).getSeguridad();
                Preso[] ocupantes = mtc.obtenerCelda(TablaCeldas.getSelectedRow()).getOcupantes();
                //Falta comprobar si hay sitio o no en la celda (¿o salta la excepcion?)
                celda = new Celda(nCelda, superficie, nCamas, seguridad, ocupantes);
            }
        }
        //Insertar Preso
        Preso preso = new Preso(DNI, nombre, apodo, fechaNacimiento, fechaIngreso, null, banda, agresividad, celda);
        fc.insertarPreso(preso);

        if (!TextoTipoDelito.getText().isEmpty()) {
            String nombreDelito = TextoTipoDelito.getText();
            String descripcion = TextoDescripcion.getText();
            Nivel intensidad = Nivel.Alta;
            switch (ComboIntensidad.getSelectedItem().toString()) {
                case "Alta":
                    intensidad = Nivel.Alta;
                    break;
                case "Media":
                    intensidad = Nivel.Media;
                    break;
                case "Baja":
                    intensidad = Nivel.Baja;
                    break;
            }
            Delito delito = new Delito(nombreDelito, descripcion, intensidad);
            fc.insertarCargo(DNI, delito);
        }
    }

    public void obtenerCeldaPreso(String id) {
        ModeloTablaCeldas mc = (ModeloTablaCeldas) TablaCeldas.getModel();
        java.util.List<Celda> celdas = new ArrayList<>();

        Celda celda = fc.obtenerCelda(id);
        if (celda!=null) {
            celdas.add(celda);
            mc.setFilas(celdas);
            TablaCeldas.setRowSelectionInterval(0, 0);
        }
    }

    //Debe usarse junto con la comprobacion previa de si esta ocupada o no una celda
    public void intercambiarPresos(Celda celda, Preso preso) {
        fc.iniciaAvisoIntercambio(celda, preso);
    }

    public void buscarCelda() {
        ModeloTablaCeldas mc;

        mc = (ModeloTablaCeldas) TablaCeldas.getModel();

        mc.setFilas(fc.buscarCelda(CampoIdCelda.getText(), CampoPlazas.getText(), ComboSeguridad.getSelectedItem().toString()));

        if (mc.getRowCount() > 0) {
            TablaCeldas.setRowSelectionInterval(0, 0);    //Selecciona el primero por defecto      
        }

    }

    public void alojarPreso() {

    }

    public void buscarBanda(String tipo) {
        ModeloTablaBandas mtb = (ModeloTablaBandas) TablaBandas.getModel();
        java.util.List<Banda> bandas = fc.obtenerBandas(tipo);
        mtb.setFilas(bandas);
        if (mtb.getRowCount() > 0) {
            TablaBandas.setRowSelectionInterval(0, 0);
        }

    }

    public void asociarPresoBanda() {
        String DNI = TextoDNI.getText();
        ModeloTablaBandas mtb = (ModeloTablaBandas) TablaBandas.getModel();

        Banda banda = null;
        if (mtb.getRowCount() > 0) {
            if (TablaBandas.getSelectedRowCount() > 0) {
                String tipoBanda = mtb.obtenerBanda(TablaBandas.getSelectedRow()).getTipo_banda();
                Integer numPresos = mtb.obtenerBanda((TablaBandas.getSelectedRow())).getPresos();
                banda = new Banda(tipoBanda, numPresos);
            }
        }
        fc.asociarPreso(DNI, banda);
    }

    public void desasociarPresoBanda() {
        String dni = TextoDNI.getText();
        fc.desasociarPreso(dni);
    }

    public void insertarCargo() {
        String dni = TextoDNI.getText();
        String nombre = TextoTipoDelito.getText();
        String descripcion = TextoDescripcion.getText();
        Nivel intensidad = Nivel.Alta;
        switch (ComboIntensidad.getSelectedItem().toString()) {
            case "Alta":
                intensidad = Nivel.Alta;
                break;
            case "Media":
                intensidad = Nivel.Media;
                break;
            case "Baja":
                intensidad = Nivel.Baja;
                break;
        }
        Delito delito = new Delito(nombre, descripcion, intensidad);

        fc.insertarCargo(dni, delito);

    }

    public void modificarCargo() {
        String dni = TextoDNI.getText();
        String nombre = TextoTipoDelito.getText();
        String descripcion = TextoDescripcion.getText();
        Nivel intensidad = Nivel.Alta;
        switch (ComboIntensidad.getSelectedItem().toString()) {
            case "Alta":
                intensidad = Nivel.Alta;
                break;
            case "Media":
                intensidad = Nivel.Media;
                break;
            case "Baja":
                intensidad = Nivel.Baja;
                break;
        }
        Delito delito = new Delito(nombre, descripcion, intensidad);

        fc.modificarCargo(dni, delito);
    }

    public void eliminarCargo() {
        String dni = TextoDNI.getText();
        String nombre = TextoTipoDelito.getText();
        String descripcion = TextoDescripcion.getText();
        Nivel intensidad = Nivel.Alta;
        switch (ComboIntensidad.getSelectedItem().toString()) {
            case "Alta":
                intensidad = Nivel.Alta;
                break;
            case "Media":
                intensidad = Nivel.Media;
                break;
            case "Baja":
                intensidad = Nivel.Baja;
                break;
        }
        Delito delito = new Delito(nombre, descripcion, intensidad);

        fc.eliminarCargo(dni, delito);
    }

    public void buscarCargosPreso(String DNI) {
        ModeloTablaCargos mtc = (ModeloTablaCargos) TablaCargos.getModel();

        mtc.setFilas(fc.obtenerCargosPreso(DNI));
        if (mtc.getRowCount() > 0) {
            TablaCargos.setRowSelectionInterval(0, 0);
            BotonEliminar.setEnabled(true);
            rellenarCampos();
        } else {
            BotonEliminar.setEnabled(false);
        }
    }

    public void rellenarCampos() {
        int fila = TablaCargos.getSelectedRow();
        String tipo = TablaCargos.getValueAt(fila, 0).toString();
        java.util.ArrayList<String> resultado = (java.util.ArrayList<String>) fc.rellenarCampos(tipo);
        TextoTipoDelito.setText(resultado.get(0));
        TextoDescripcion.setText(resultado.get(1));
        switch (resultado.get(2)) {
            case "Alta":
                ComboIntensidad.setSelectedIndex(0);
                break;
            case "Media":
                ComboIntensidad.setSelectedIndex(1);
                break;
            case "Baja":
                ComboIntensidad.setSelectedIndex(2);
                break;
        }
    }

}
