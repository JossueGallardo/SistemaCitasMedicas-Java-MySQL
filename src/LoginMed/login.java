/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginMed;

import java.awt.Color;

/**
 *
 * @author Jossue
 */
import java.sql.*;
import javax.swing.*;

public class login extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        PanelIz = new javax.swing.JPanel();
        Usuario = new javax.swing.JTextField();
        IniciarSesionLb = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        Ingresar = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        UsuarioLb = new javax.swing.JLabel();
        ContraLb = new javax.swing.JLabel();
        PanelDer = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FondoIz = new javax.swing.JPanel();
        BarraAzul = new javax.swing.JPanel();
        BarraBlanca = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Inicio");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        PanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelIz.setBackground(new java.awt.Color(255, 255, 255));

        Usuario.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        Usuario.setText("Ingrese su nombre de usuario");
        Usuario.setToolTipText("Usuario");
        Usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsuarioMousePressed(evt);
            }
        });
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });

        IniciarSesionLb.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        IniciarSesionLb.setText("       INICIAR SESIÓN");

        jPasswordField1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jPasswordField1.setText("********");
        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField1MousePressed(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        Ingresar.setBackground(new java.awt.Color(0, 183, 186));
        Ingresar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar.setMnemonic('I');
        Ingresar.setText("INGRESAR");
        Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        Registrar.setBackground(new java.awt.Color(0, 183, 186));
        Registrar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setMnemonic('R');
        Registrar.setText("REGISTRAR");
        Registrar.setBorderPainted(false);
        Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        UsuarioLb.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        UsuarioLb.setText("Usuario");

        ContraLb.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        ContraLb.setText("Contraseña");

        javax.swing.GroupLayout PanelIzLayout = new javax.swing.GroupLayout(PanelIz);
        PanelIz.setLayout(PanelIzLayout);
        PanelIzLayout.setHorizontalGroup(
            PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzLayout.createSequentialGroup()
                .addGroup(PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelIzLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsuarioLb)
                            .addComponent(ContraLb)))
                    .addGroup(PanelIzLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IniciarSesionLb, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelIzLayout.createSequentialGroup()
                                .addComponent(Ingresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Registrar)
                                .addGap(15, 15, 15)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelIzLayout.setVerticalGroup(
            PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(IniciarSesionLb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(UsuarioLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ContraLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingresar)
                    .addComponent(Registrar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        PanelFondo.add(PanelIz, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 280, 370));

        PanelDer.setBackground(new java.awt.Color(223, 244, 246));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoHospital2.jpeg.jpg"))); // NOI18N
        logo.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("HOSPITAL ");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("SAN CURITA");

        javax.swing.GroupLayout PanelDerLayout = new javax.swing.GroupLayout(PanelDer);
        PanelDer.setLayout(PanelDerLayout);
        PanelDerLayout.setHorizontalGroup(
            PanelDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerLayout.createSequentialGroup()
                .addGroup(PanelDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelDerLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(86, 86, 86))
        );
        PanelDerLayout.setVerticalGroup(
            PanelDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        PanelFondo.add(PanelDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 290, 370));

        FondoIz.setBackground(new java.awt.Color(0, 183, 186));

        BarraAzul.setBackground(new java.awt.Color(0, 183, 186));
        BarraAzul.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraAzulMouseDragged(evt);
            }
        });
        BarraAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraAzulMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BarraAzulLayout = new javax.swing.GroupLayout(BarraAzul);
        BarraAzul.setLayout(BarraAzulLayout);
        BarraAzulLayout.setHorizontalGroup(
            BarraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        BarraAzulLayout.setVerticalGroup(
            BarraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FondoIzLayout = new javax.swing.GroupLayout(FondoIz);
        FondoIz.setLayout(FondoIzLayout);
        FondoIzLayout.setHorizontalGroup(
            FondoIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FondoIzLayout.setVerticalGroup(
            FondoIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoIzLayout.createSequentialGroup()
                .addComponent(BarraAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 502, Short.MAX_VALUE))
        );

        PanelFondo.add(FondoIz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 530));

        BarraBlanca.setBackground(new java.awt.Color(255, 255, 255));
        BarraBlanca.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraBlancaMouseDragged(evt);
            }
        });
        BarraBlanca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraBlancaMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel3.setText("  X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BarraBlancaLayout = new javax.swing.GroupLayout(BarraBlanca);
        BarraBlanca.setLayout(BarraBlancaLayout);
        BarraBlancaLayout.setHorizontalGroup(
            BarraBlancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraBlancaLayout.createSequentialGroup()
                .addGap(0, 315, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BarraBlancaLayout.setVerticalGroup(
            BarraBlancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraBlancaLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        PanelFondo.add(BarraBlanca, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 340, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
          String usuario = Usuario.getText().trim();
        String contrasena = new String(jPasswordField1.getPassword()).trim();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos de usuario y contraseña no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = ConexionBD.conectar()) {
            String query = "INSERT INTO usuarios (username, password, nombre_completo, direccion, telefono) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setString(1, usuario);
                ps.setString(2, contrasena);
                ps.setString(3, "Nombre Ejemplo");
                ps.setString(4, "Dirección Ejemplo");
                ps.setString(5, "0999999999");

                int rowsInserted = ps.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al registrar usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
                                            

    }//GEN-LAST:event_RegistrarActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void BarraAzulMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraAzulMouseDragged
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_BarraAzulMouseDragged

    private void BarraBlancaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraBlancaMouseDragged
          int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_BarraBlancaMouseDragged

    private void BarraAzulMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraAzulMousePressed
          xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraAzulMousePressed

    private void BarraBlancaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraBlancaMousePressed
          xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraBlancaMousePressed

    private void UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioMousePressed
        if (Usuario.getText().equals("Ingrese su nombre de Usuario")) {
        Usuario.setText("");
        Usuario.setForeground(Color.black);
       }
    }//GEN-LAST:event_UsuarioMousePressed

    private void jPasswordField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1MousePressed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
    String usuario = Usuario.getText().trim();
    String contrasena = new String(jPasswordField1.getPassword()).trim();

    try (Connection conn = ConexionBD.conectar()) {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String nombreCompleto = rs.getString("nombre_completo") != null ? rs.getString("nombre_completo") : "Desconocido";
                    String direccion = rs.getString("direccion") != null ? rs.getString("direccion") : "No especificada";
                    String telefono = rs.getString("telefono") != null ? rs.getString("telefono") : "Sin teléfono";

                    Paciente paciente = new Paciente(usuario, contrasena, nombreCompleto, direccion, telefono);

                    new PaginaPrincipal(paciente).setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al autenticar usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_IngresarActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraAzul;
    private javax.swing.JPanel BarraBlanca;
    private javax.swing.JLabel ContraLb;
    private javax.swing.JPanel FondoIz;
    private javax.swing.JButton Ingresar;
    private javax.swing.JLabel IniciarSesionLb;
    private javax.swing.JPanel PanelDer;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelIz;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel UsuarioLb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
