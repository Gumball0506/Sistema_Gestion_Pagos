package com.mycompany.sistema_gestion_ventas;
public class Pagina_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Pagina_Principal
     */
    public Pagina_Principal() {
        initComponents();

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnPrincipal = new javax.swing.JPanel();
        bttnInicio = new javax.swing.JButton();
        bttnFinanzas = new javax.swing.JButton();
        bttnUsuarios = new javax.swing.JButton();
        bttnPlanes = new javax.swing.JButton();
        bttnEstadisticas = new javax.swing.JButton();
        bttnTransacciones = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JpnProgreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JpnIngresos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JpnUsuarios = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnPrincipal.setBackground(new java.awt.Color(67, 65, 130));

        bttnInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Sistema_Gestion_Ventas\\src\\main\\java\\com\\mycompany\\sistema_gestion_ventas\\Imagenes\\pagina-de-inicio (1).png")); // NOI18N
        bttnInicio.setText("Inicio");
        bttnInicio.setBorder(null);
        bttnInicio.setBorderPainted(false);
        bttnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnInicioActionPerformed(evt);
            }
        });

        bttnFinanzas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnFinanzas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Sistema_Gestion_Ventas\\src\\main\\java\\com\\mycompany\\sistema_gestion_ventas\\Imagenes\\barras.png")); // NOI18N
        bttnFinanzas.setText("Finanzas");
        bttnFinanzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnFinanzasActionPerformed(evt);
            }
        });

        bttnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnUsuarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Sistema_Gestion_Ventas\\src\\main\\java\\com\\mycompany\\sistema_gestion_ventas\\Imagenes\\agregar-usuario.png")); // NOI18N
        bttnUsuarios.setText("Usuarios");

        bttnPlanes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnPlanes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Sistema_Gestion_Ventas\\src\\main\\java\\com\\mycompany\\sistema_gestion_ventas\\Imagenes\\juego-de-cartas.png")); // NOI18N
        bttnPlanes.setText("Planes");
        bttnPlanes.setBorderPainted(false);

        bttnEstadisticas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnEstadisticas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Sistema_Gestion_Ventas\\src\\main\\java\\com\\mycompany\\sistema_gestion_ventas\\Imagenes\\informe.png")); // NOI18N
        bttnEstadisticas.setText("Estadisticas");
        bttnEstadisticas.setBorderPainted(false);

        bttnTransacciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnTransacciones.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Sistema_Gestion_Ventas\\src\\main\\java\\com\\mycompany\\sistema_gestion_ventas\\Imagenes\\transaccion (1).png")); // NOI18N
        bttnTransacciones.setText("Transacciones");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Frank Ruehl CLM", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Admision");
        jLabel7.setAutoscrolls(true);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Frank Ruehl CLM", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Smart");
        jLabel8.setAutoscrolls(true);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Cerrar Sesion");

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\harol\\OneDrive\\Documentos\\NetBeansProjects\\Sistema_Gestion_Pagos\\src\\main\\java\\com\\mycompany\\sistema_gestion_ventas\\Imagenes\\download__1_-removebg-preview.png")); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setDoubleBuffered(true);
        jButton2.setFocusCycleRoot(true);
        jButton2.setFocusable(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.setRolloverEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnPrincipalLayout = new javax.swing.GroupLayout(jpnPrincipal);
        jpnPrincipal.setLayout(jpnPrincipalLayout);
        jpnPrincipalLayout.setHorizontalGroup(
            jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttnInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttnFinanzas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttnTransacciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttnEstadisticas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttnPlanes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel7))
                            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel8)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnPrincipalLayout.setVerticalGroup(
            jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bttnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnFinanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnUsuarios)
                .addGap(18, 18, 18)
                .addComponent(bttnPlanes)
                .addGap(18, 18, 18)
                .addComponent(bttnEstadisticas)
                .addGap(18, 18, 18)
                .addComponent(bttnTransacciones)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(42, 42, 42))
        );

        getContentPane().add(jpnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JpnProgreso.setBackground(new java.awt.Color(255, 153, 102));
        JpnProgreso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JpnProgreso.setFocusTraversalPolicyProvider(true);

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel1.setText("Progreso Anual ");

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Sistema_Gestion_Ventas\\src\\main\\java\\com\\mycompany\\sistema_gestion_ventas\\Imagenes\\estadisticas.png")); // NOI18N

        javax.swing.GroupLayout JpnProgresoLayout = new javax.swing.GroupLayout(JpnProgreso);
        JpnProgreso.setLayout(JpnProgresoLayout);
        JpnProgresoLayout.setHorizontalGroup(
            JpnProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnProgresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        JpnProgresoLayout.setVerticalGroup(
            JpnProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnProgresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpnProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        JpnIngresos.setBackground(new java.awt.Color(153, 255, 153));
        JpnIngresos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JpnIngresos.setFocusTraversalPolicyProvider(true);

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel3.setText("Ingresos ");

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Sistema_Gestion_Ventas\\src\\main\\java\\com\\mycompany\\sistema_gestion_ventas\\Imagenes\\aumentar (2).png")); // NOI18N

        javax.swing.GroupLayout JpnIngresosLayout = new javax.swing.GroupLayout(JpnIngresos);
        JpnIngresos.setLayout(JpnIngresosLayout);
        JpnIngresosLayout.setHorizontalGroup(
            JpnIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnIngresosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        JpnIngresosLayout.setVerticalGroup(
            JpnIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnIngresosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpnIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        JpnUsuarios.setBackground(new java.awt.Color(102, 204, 255));
        JpnUsuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JpnUsuarios.setFocusTraversalPolicyProvider(true);

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel5.setText("Usuarios");

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Sistema_Gestion_Ventas\\src\\main\\java\\com\\mycompany\\sistema_gestion_ventas\\Imagenes\\incrementar.png")); // NOI18N

        javax.swing.GroupLayout JpnUsuariosLayout = new javax.swing.GroupLayout(JpnUsuarios);
        JpnUsuarios.setLayout(JpnUsuariosLayout);
        JpnUsuariosLayout.setHorizontalGroup(
            JpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnUsuariosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        JpnUsuariosLayout.setVerticalGroup(
            JpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(JpnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(JpnIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JpnProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JpnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JpnIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JpnProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(464, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 980, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnInicioActionPerformed

    private void bttnFinanzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnFinanzasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnFinanzasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pagina_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagina_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagina_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagina_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpnIngresos;
    private javax.swing.JPanel JpnProgreso;
    private javax.swing.JPanel JpnUsuarios;
    private javax.swing.JButton bttnEstadisticas;
    private javax.swing.JButton bttnFinanzas;
    private javax.swing.JButton bttnInicio;
    private javax.swing.JButton bttnPlanes;
    private javax.swing.JButton bttnTransacciones;
    private javax.swing.JButton bttnUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnPrincipal;
    // End of variables declaration//GEN-END:variables
}
