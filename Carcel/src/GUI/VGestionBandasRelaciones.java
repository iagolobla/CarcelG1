package GUI;

public class VGestionBandasRelaciones extends javax.swing.JDialog {

    public VGestionBandasRelaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoBanda = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        TablaBanda = new javax.swing.JScrollPane();
        TablaB = new javax.swing.JTable();
        EtiquetaRelacion = new javax.swing.JLabel();
        ComboBoxRelacion = new javax.swing.JComboBox<String>();
        BotonGuardar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        EtiquetaBanda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BotonBuscar.setText("Buscar");

        TablaB.setModel(new ModeloTablaBandas());
        TablaBanda.setViewportView(TablaB);

        EtiquetaRelacion.setText("Relacion");

        ComboBoxRelacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonGuardar.setText("Guardar");

        BotonCancelar.setText("Cancelar");

        EtiquetaBanda.setText("Banda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EtiquetaRelacion)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(BotonGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(BotonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBoxRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EtiquetaBanda)
                        .addGap(18, 18, 18)
                        .addComponent(CampoBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonBuscar))
                    .addComponent(TablaBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoBanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar)
                    .addComponent(EtiquetaBanda))
                .addGap(18, 18, 18)
                .addComponent(TablaBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaRelacion)
                    .addComponent(ComboBoxRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JTextField CampoBanda;
    private javax.swing.JComboBox<String> ComboBoxRelacion;
    private javax.swing.JLabel EtiquetaBanda;
    private javax.swing.JLabel EtiquetaRelacion;
    private javax.swing.JTable TablaB;
    private javax.swing.JScrollPane TablaBanda;
    // End of variables declaration//GEN-END:variables
}
