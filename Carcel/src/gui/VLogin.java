package gui;

import java.awt.Image;
import javax.swing.ImageIcon;

public class VLogin extends javax.swing.JDialog {

    private carcel.FachadaCarcel fc;
    public Image imagenInterna = new ImageIcon(getClass().getResource("Logo-full-1.png")).getImage();

    public VLogin(java.awt.Frame parent, boolean modal, carcel.FachadaCarcel fc) {
        super(parent, modal);
        this.fc = fc;
        initComponents();
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        EtiquetaDNI = new javax.swing.JLabel();
        EtiquetaContraseña = new javax.swing.JLabel();
        CampoDNI = new javax.swing.JTextField();
        CampoContrasena = new javax.swing.JTextField();
        botonAcceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Logo-full-1.png"))); // NOI18N
        Logo.setLabelFor(Logo);

        EtiquetaDNI.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        EtiquetaDNI.setText("DNI:");

        EtiquetaContraseña.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        EtiquetaContraseña.setText("Contraseña:");

        CampoDNI.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N

        CampoContrasena.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N

        botonAcceder.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        botonAcceder.setText("Acceder");
        botonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAccederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(EtiquetaDNI)
                            .addGap(18, 18, 18)
                            .addComponent(CampoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EtiquetaContraseña)
                            .addGap(18, 18, 18)
                            .addComponent(CampoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(Logo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(botonAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDNI)
                    .addComponent(EtiquetaContraseña)
                    .addComponent(CampoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(botonAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAccederActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAccederActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoContrasena;
    private javax.swing.JTextField CampoDNI;
    private javax.swing.JLabel EtiquetaContraseña;
    private javax.swing.JLabel EtiquetaDNI;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton botonAcceder;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void login() {
        if (fc.validarAdministrador(CampoDNI.getText(), CampoContrasena.getText())) {
            this.dispose();
        } else {
            System.out.println("error");
        }
    }
}
