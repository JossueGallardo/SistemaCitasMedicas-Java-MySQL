
package LoginMed;


import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class PaginaPrincipal extends javax.swing.JFrame {

    private Paciente paciente;
    private int xMouse;
    private int yMouse;
    private JComboBox<Object> comboBoxMedicos;
    

    
    public PaginaPrincipal(Paciente paciente) {
    if (paciente == null) {
        throw new IllegalArgumentException("El objeto paciente no puede ser null.");
    }
    this.paciente = paciente;
    initComponents();
    bienvenida();
    cargarMedicos();
    
    
    
}

    
    

private void bienvenida() {
    if (paciente != null) {
        jLabel1.setText(paciente.getNombreCompleto()); 
    } else {
        jLabel1.setText("XD"); 
    }
}


private void cargarMedicos() {
        try (Connection conn = ConexionBD.conectar()) {
            String query = "SELECT id, nombre, apellido, especialidad FROM medicos";
            try (PreparedStatement ps = conn.prepareStatement(query);
                 ResultSet rs = ps.executeQuery()) {

                comboBoxMedicos2.removeAllItems(); // Limpia el comboBox
                comboBoxMedicos2.addItem("Seleccione un médico"); // Opción inicial

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    String especialidad = rs.getString("especialidad");

                    // Crear y añadir el texto del médico directamente
                    comboBoxMedicos2.addItem(id + " - " + nombre + " " + apellido + " (" + especialidad + ")");
                }

                System.out.println("Médicos cargados en comboBoxMedicos2: " + comboBoxMedicos2.getItemCount());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar médicos: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

   private int obtenerIdMedico() throws SQLException {
    String selectedItem = (String) comboBoxMedicos2.getSelectedItem();
    if (selectedItem != null && !selectedItem.equals("Seleccione un médico")) {
        try {
            int id = Integer.parseInt(selectedItem.split(" - ")[0]);
            System.out.println("ID médico seleccionado: " + id);
            return id;
        } catch (NumberFormatException e) {
            throw new SQLException("Error al extraer el ID del médico: " + selectedItem);
        }
    }
    throw new SQLException("Debe seleccionar un médico válido.");
}
   
   





    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelIz = new javax.swing.JPanel();
        Bienvenido = new javax.swing.JLabel();
        AgendarCita = new javax.swing.JLabel();
        VerCita = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JButton();
        barraSup = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AgregarMedicos = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        comboBoxMedicos2 = new javax.swing.JComboBox<>();
        XSalida = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelIz.setBackground(new java.awt.Color(215, 248, 248));

        Bienvenido.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        Bienvenido.setText("BIENVENIDO");

        AgendarCita.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        AgendarCita.setText("Agendar Cita");

        VerCita.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        VerCita.setText("Ver Citas");

        CerrarSesion.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        CerrarSesion.setText("CERRAR SESIÓN");
        CerrarSesion.setBorder(null);

        barraSup.setBackground(new java.awt.Color(255, 255, 255));
        barraSup.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSupMouseDragged(evt);
            }
        });
        barraSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSupMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraSupLayout = new javax.swing.GroupLayout(barraSup);
        barraSup.setLayout(barraSupLayout);
        barraSupLayout.setHorizontalGroup(
            barraSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        barraSupLayout.setVerticalGroup(
            barraSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/logoHospital2.jpeg.jpg"))); // NOI18N

        jButton1.setText("Agendar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        AgregarMedicos.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        AgregarMedicos.setText("Agregar Medicos");

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        comboBoxMedicos2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxMedicos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMedicos2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelIzLayout = new javax.swing.GroupLayout(PanelIz);
        PanelIz.setLayout(PanelIzLayout);
        PanelIzLayout.setHorizontalGroup(
            PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzLayout.createSequentialGroup()
                .addGroup(PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelIzLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelIzLayout.createSequentialGroup()
                                .addComponent(VerCita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(PanelIzLayout.createSequentialGroup()
                                .addComponent(AgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxMedicos2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelIzLayout.createSequentialGroup()
                                .addComponent(AgregarMedicos)
                                .addGap(18, 18, 18)
                                .addComponent(botonAgregar))))
                    .addGroup(PanelIzLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelIzLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(icono))
                    .addGroup(PanelIzLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(Bienvenido))
                    .addGroup(PanelIzLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelIzLayout.setVerticalGroup(
            PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzLayout.createSequentialGroup()
                .addComponent(barraSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(icono)
                .addGap(61, 61, 61)
                .addGroup(PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgendarCita)
                    .addComponent(jButton1)
                    .addComponent(comboBoxMedicos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerCita)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(PanelIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarMedicos)
                    .addComponent(botonAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(PanelIz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 640));

        XSalida.setText("      X");
        XSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XSalidaMouseClicked(evt);
            }
        });
        jPanel1.add(XSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 40, 20));

        jPanel2.setBackground(new java.awt.Color(0, 186, 183));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 400, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraSupMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSupMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_barraSupMouseDragged

    private void barraSupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSupMousePressed
          xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraSupMousePressed

    private void XSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XSalidaMouseClicked
       System.exit(0);
    }//GEN-LAST:event_XSalidaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try (Connection conn = ConexionBD.conectar()) {
        // Consulta SQL con JOIN para obtener el nombre del médico
        String query = "SELECT c.id, c.paciente_nombre, CONCAT(m.nombre, ' ', m.apellido) AS medico_nombre, c.fecha, c.hora " +
                       "FROM citas c " +
                       "JOIN medicos m ON c.medico_id = m.id";
        try (PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            // Crear un modelo para el JTable
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    // Todas las celdas son no editables
                    return false;
                }
            };

            // Agregar columnas al modelo
            modelo.addColumn("ID");
            modelo.addColumn("Paciente");
            modelo.addColumn("Médico");
            modelo.addColumn("Fecha");
            modelo.addColumn("Hora");

            // Llenar el modelo con los datos del ResultSet
            while (rs.next()) {
                int id = rs.getInt("id");
                String pacienteNombre = rs.getString("paciente_nombre");
                String medicoNombre = rs.getString("medico_nombre");
                Date fecha = rs.getDate("fecha");
                Time hora = rs.getTime("hora");

                modelo.addRow(new Object[]{id, pacienteNombre, medicoNombre, fecha, hora});
            }

            // Crear una tabla para mostrar las citas y asignar el modelo
            JTable tablaCitas = new JTable(modelo);
            tablaCitas.getTableHeader().setReorderingAllowed(false); // Desactivar el reordenamiento de columnas
            JScrollPane scrollPane = new JScrollPane(tablaCitas);

            // Mostrar las citas en un diálogo
            JOptionPane.showMessageDialog(this, scrollPane, "Lista de Citas", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al obtener las citas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try {
        if (comboBoxMedicos2.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un médico.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (paciente == null) {
            JOptionPane.showMessageDialog(this, "El paciente no está inicializado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nombrePaciente = paciente.getNombreCompleto();
        if (nombrePaciente == null || nombrePaciente.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre del paciente no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String fechaSeleccionada = "2024-12-06"; // Fecha dinámica en producción
        String horaSeleccionada = "10:00"; // Hora dinámica en producción

        // Validar formato de hora y agregar segundos si es necesario
        if (!horaSeleccionada.contains(":")) {
            JOptionPane.showMessageDialog(this, "Formato de hora incorrecto. Debe ser HH:mm:ss.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (horaSeleccionada.split(":").length == 2) {
            horaSeleccionada += ":00"; // Agregar segundos al formato
        }

        System.out.println("Nombre del paciente: " + nombrePaciente);
        System.out.println("Fecha seleccionada: " + fechaSeleccionada);
        System.out.println("Hora seleccionada: " + horaSeleccionada);

        try (Connection conn = ConexionBD.conectar()) {
            String query = "INSERT INTO citas (paciente_nombre, medico_id, fecha, hora) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setString(1, nombrePaciente);
                ps.setInt(2, obtenerIdMedico());
                ps.setDate(3, java.sql.Date.valueOf(fechaSeleccionada));
                ps.setTime(4, java.sql.Time.valueOf(horaSeleccionada)); // Formato corregido
                ps.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Cita registrada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al registrar la cita: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // Crear la ventana de ingreso de médicos
    IngresoMedico ingresoMedico = new IngresoMedico(comboBoxMedicos);
    
    // Agregar un WindowListener para actualizar los médicos al cerrar la ventana
    ingresoMedico.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent e) {
            cargarMedicos(); // Actualizar el comboBoxMedicos2 al cerrar la ventana
        }
    });
    
    // Mostrar la ventana
    ingresoMedico.setVisible(true);
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void comboBoxMedicos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMedicos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxMedicos2ActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel AgendarCita;
    private javax.swing.JLabel AgregarMedicos;
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JPanel PanelIz;
    private javax.swing.JLabel VerCita;
    private javax.swing.JLabel XSalida;
    private javax.swing.JPanel barraSup;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JComboBox<String> comboBoxMedicos2;
    private javax.swing.JLabel icono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
