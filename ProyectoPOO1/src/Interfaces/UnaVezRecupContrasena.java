
package Interfaces;

import ConexionDDBB.*;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UnaVezRecupContrasena extends javax.swing.JFrame {
    
    ConexionDDBB coneDB = new ConexionDDBB();
    ResultSetDDBB resuDB = new ResultSetDDBB();
    StatementDDBB state = new StatementDDBB();
    
    public UnaVezRecupContrasena() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRecuaperacion_LugarNaci = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtRecuaperacion_NvContra = new javax.swing.JTextField();
        txtRecuaperacion_NvUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRecuaperacion_Mascota = new javax.swing.JTextField();
        txtRecuaperacion_Primo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 132, 196));
        jLabel1.setText("Recuperación  y modificacion de contraseña");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 570, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Ingresa el nombre de tu lugar de nacimiento:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 290, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Responde las siguientes pregunta para recuperar tu contraseña en caso de");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 500, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("perderla.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 470, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Ingresa el nombre de tu prim@ favorito@:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 290, -1));

        txtRecuaperacion_LugarNaci.setBackground(new java.awt.Color(255, 255, 255));
        txtRecuaperacion_LugarNaci.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRecuaperacion_LugarNaci.setForeground(new java.awt.Color(102, 102, 102));
        txtRecuaperacion_LugarNaci.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel2.add(txtRecuaperacion_LugarNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 190, -1));

        jButton1.setBackground(new java.awt.Color(22, 132, 196));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 130, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Modificar contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 12), new java.awt.Color(32, 132, 196))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRecuaperacion_NvContra.setBackground(new java.awt.Color(236, 236, 236));
        txtRecuaperacion_NvContra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRecuaperacion_NvContra.setForeground(new java.awt.Color(102, 102, 102));
        txtRecuaperacion_NvContra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(txtRecuaperacion_NvContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 240, 30));

        txtRecuaperacion_NvUsuario.setBackground(new java.awt.Color(236, 236, 236));
        txtRecuaperacion_NvUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRecuaperacion_NvUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtRecuaperacion_NvUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(txtRecuaperacion_NvUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nueva contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Nombre de usuario");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 280, 200));

        txtRecuaperacion_Mascota.setBackground(new java.awt.Color(255, 255, 255));
        txtRecuaperacion_Mascota.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRecuaperacion_Mascota.setForeground(new java.awt.Color(102, 102, 102));
        txtRecuaperacion_Mascota.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        txtRecuaperacion_Mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecuaperacion_MascotaActionPerformed(evt);
            }
        });
        jPanel2.add(txtRecuaperacion_Mascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 210, -1));

        txtRecuaperacion_Primo.setBackground(new java.awt.Color(255, 255, 255));
        txtRecuaperacion_Primo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRecuaperacion_Primo.setForeground(new java.awt.Color(102, 102, 102));
        txtRecuaperacion_Primo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel2.add(txtRecuaperacion_Primo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 210, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Ingresa el nombre de tu primera mascota:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String mascota = txtRecuaperacion_Mascota.getText();
        String pri_Fav = txtRecuaperacion_Primo.getText();
        String lugar_naci = txtRecuaperacion_LugarNaci.getText();
        
        String nuevaContra = txtRecuaperacion_NvContra.getText();
        String nuevoUsu = txtRecuaperacion_NvUsuario.getText();
        
        List<String> lista = new ArrayList<>();
        
        ResultSet myUSU = resuDB.myResultSetQuery(state.myStatement(coneDB.conexion()), "Select * from login where Maestro = 'admin'");
            
        try{
            while(myUSU.next()){
                lista.add(myUSU.getString("Id"));
            }
        }catch(Exception e){
            System.out.println("No se pudo obterner el resultado del admin en Login, error: "+e);
        }
        
        String updateContra = "Update Login set Maestro = '"+nuevoUsu+"', Contrasena = '"+nuevaContra+"',  Primera_mascota = '"+mascota+"',  Prim_fav = '"+pri_Fav+"',  Lugar_nacimineto = '"+lugar_naci+"' where id ="+lista.get(0);
        
        if(mascota.equals("") || pri_Fav.equals("") || lugar_naci.equals("") || nuevaContra.equals("") || nuevoUsu.equals("")){
               JOptionPane.showMessageDialog(null, "¡Hay un campo vacio!");
        }else{
            resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), updateContra);
            Materias iniciar = new Materias();
            iniciar.setVisible(true);
            Binvenida ini = new Binvenida();
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtRecuaperacion_MascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecuaperacion_MascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecuaperacion_MascotaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtRecuaperacion_LugarNaci;
    private javax.swing.JTextField txtRecuaperacion_Mascota;
    private javax.swing.JTextField txtRecuaperacion_NvContra;
    private javax.swing.JTextField txtRecuaperacion_NvUsuario;
    private javax.swing.JTextField txtRecuaperacion_Primo;
    // End of variables declaration//GEN-END:variables
}
