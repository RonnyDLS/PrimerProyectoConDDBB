
package Interfaces;

import ConexionDDBB.*;

public class CrearClases extends javax.swing.JFrame {
    ConexionDDBB coneDB = new ConexionDDBB();
    ResultSetDDBB resuDB = new ResultSetDDBB();
    StatementDDBB state = new StatementDDBB();
    
    public CrearClases() {
        initComponents();
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtAddMateria_Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 132, 196));
        jLabel3.setText("Agregar materia");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        txtAddMateria_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txtAddMateria_Nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAddMateria_Nombre.setForeground(new java.awt.Color(51, 51, 51));
        txtAddMateria_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddMateria_NombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddMateria_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 280, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        jButton1.setBackground(new java.awt.Color(32, 133, 196));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CREAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 350, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddMateria_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddMateria_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddMateria_NombreActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nombreMateria = txtAddMateria_Nombre.getText();
        String addMateria = "Insert into materia(Nom_materia,Id_maestro) values('"+nombreMateria+"',"+LoginMaestros.idUsuario+")";
        resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), addMateria);
        
        Materias materia = new Materias();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddMateria_Nombre;
    // End of variables declaration//GEN-END:variables
}
