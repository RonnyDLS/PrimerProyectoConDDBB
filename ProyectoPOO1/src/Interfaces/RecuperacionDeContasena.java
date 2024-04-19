
package Interfaces;

import ConexionDDBB.*;
import ConsultasMysql.*;
import javax.swing.JOptionPane;
import java.sql.*;

public class RecuperacionDeContasena extends javax.swing.JFrame {

    public RecuperacionDeContasena() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(601, 470);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRecuCon_LugarNaci = new javax.swing.JTextField();
        txtRecuCon_Mascota = new javax.swing.JTextField();
        txtRecuCon_PriFav = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 132, 196));
        jLabel1.setText("Recuperación de contaseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 370, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("perderla.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 490, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Ingresa el nombre de tu prim@ favorito@:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 320, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Responde las siguientes pregunta para recuperar tu contraseña en caso de");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 490, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Ingresa el nombre de tu lugar de nacimiento:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 340, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Ingresa el nombre de tu primera mascota:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 310, -1));

        txtRecuCon_LugarNaci.setBackground(new java.awt.Color(255, 255, 255));
        txtRecuCon_LugarNaci.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRecuCon_LugarNaci.setForeground(new java.awt.Color(102, 102, 102));
        txtRecuCon_LugarNaci.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtRecuCon_LugarNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 200, 20));

        txtRecuCon_Mascota.setBackground(new java.awt.Color(255, 255, 255));
        txtRecuCon_Mascota.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRecuCon_Mascota.setForeground(new java.awt.Color(102, 102, 102));
        txtRecuCon_Mascota.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtRecuCon_Mascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 220, 20));

        txtRecuCon_PriFav.setBackground(new java.awt.Color(255, 255, 255));
        txtRecuCon_PriFav.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRecuCon_PriFav.setForeground(new java.awt.Color(102, 102, 102));
        txtRecuCon_PriFav.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtRecuCon_PriFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 220, 20));

        jButton2.setBackground(new java.awt.Color(32, 132, 196));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 140, 30));

        jButton3.setBackground(new java.awt.Color(32, 132, 196));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoginMaestros iniciar = new LoginMaestros();
        dispose();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       ConexionDDBB coneDB = new ConexionDDBB();
        ResultSetDDBB resuDB = new ResultSetDDBB();
        StatementDDBB state = new StatementDDBB();        
        
        ResultSet myresultadoDDBB;
        
        String mascota = txtRecuCon_Mascota.getText();
        String primoFav = txtRecuCon_PriFav.getText();
        String lugarNacimiento = txtRecuCon_LugarNaci.getText();
               
        String mscotaDB = null;
        String primoFavDB = null; 
        String lugarNacimientoDB = null;
        
        
        if(mascota.equals("") || primoFav.equals("") || lugarNacimiento.equals("")){
               JOptionPane.showMessageDialog(null, "¡Hay campos vacios!");
        }else{
            myresultadoDDBB = resuDB.myResultSetQuery(state.myStatement(coneDB.conexion()), ConsultasSql.DatosLogin);
        
            try{
                while(myresultadoDDBB.next()){
                mscotaDB = myresultadoDDBB.getString("Primera_mascota");
                primoFavDB = myresultadoDDBB.getString("Prim_fav");
                lugarNacimientoDB = myresultadoDDBB.getString("Lugar_nacimineto");
                }
           
            }catch(Exception e){
                System.out.println("No conecta la DDBB en Recuperacion Contraseña, Error: "+e);

            }
            
            if(mascota.equals(mscotaDB) && primoFav.equals(primoFavDB) && lugarNacimiento.equals(lugarNacimientoDB)){
                CambiarContrasenaLogin iniciar = new CambiarContrasenaLogin();
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "¡No coinciden, intentelo de nuevo!");
            }
        }        

    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtRecuCon_LugarNaci;
    private javax.swing.JTextField txtRecuCon_Mascota;
    private javax.swing.JTextField txtRecuCon_PriFav;
    // End of variables declaration//GEN-END:variables
}
