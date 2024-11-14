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

        jPanel1 = new javax.swing.JPanel();
        bttnInicio = new javax.swing.JButton();
        bttnFinanzas = new javax.swing.JButton();
        bttnUsuarios = new javax.swing.JButton();
        bttnPlanes = new javax.swing.JButton();
        bttnEstadisticas = new javax.swing.JButton();
        bttnTransacciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(67, 65, 130));

        bttnInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Sistema_Gestion_Ventas\\src\\main\\java\\com\\mycompany\\sistema_gestion_ventas\\Imagenes\\pagina-de-inicio (1).png")); // NOI18N
        bttnInicio.setText("Inicio");
        bttnInicio.setBorder(null);
        bttnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnInicioActionPerformed(evt);
            }
        });

        bttnFinanzas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnFinanzas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Sistema_Gestion_Ventas\\src\\main\\java\\com\\mycompany\\sistema_gestion_ventas\\Imagenes\\barras.png")); // NOI18N
        bttnFinanzas.setText("Finanzas");

        bttnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/sistema_gestion_ventas/Imagenes/agregar-usuario.png"))); // NOI18N
        bttnUsuarios.setText("Usuarios");

        bttnPlanes.setText("Planes");

        bttnEstadisticas.setText("Estadisticas");

        bttnTransacciones.setText("Transacciones");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnTransacciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnEstadisticas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnPlanes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnFinanzas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(bttnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttnFinanzas)
                .addGap(18, 18, 18)
                .addComponent(bttnUsuarios)
                .addGap(18, 18, 18)
                .addComponent(bttnPlanes)
                .addGap(18, 18, 18)
                .addComponent(bttnEstadisticas)
                .addGap(18, 18, 18)
                .addComponent(bttnTransacciones)
                .addGap(163, 163, 163))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnInicioActionPerformed

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
    private javax.swing.JButton bttnEstadisticas;
    private javax.swing.JButton bttnFinanzas;
    private javax.swing.JButton bttnInicio;
    private javax.swing.JButton bttnPlanes;
    private javax.swing.JButton bttnTransacciones;
    private javax.swing.JButton bttnUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}