/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenlab;

import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class AgregarAmigo extends javax.swing.JFrame {

    /**
     * Creates new form AgregarAmigo
     */
    public AgregarAmigo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        user1Field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        user2Field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese el username de quien quiere ser amigo: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 410, 30));
        getContentPane().add(user1Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 170, 30));

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        jLabel2.setText("Agregar Amigo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 120, -1));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 80, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese el username de la cuenta Principal: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 360, 30));

        user2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user2FieldActionPerformed(evt);
            }
        });
        getContentPane().add(user2Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 170, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        String  user1=user1Field.getText();
        String user2= user2Field.getText();

        UberSocial.agregarAmigo(user1, user2);

        Main menu = new Main();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Main menu = new Main();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void user2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user2FieldActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField user1Field;
    private javax.swing.JTextField user2Field;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
