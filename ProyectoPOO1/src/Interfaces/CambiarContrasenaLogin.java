
package Interfaces;

import ConexionDDBB.*;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import ConsultasMysql.*;
public class CambiarContrasenaLogin extends javax.swing.JFrame {

    ConexionDDBB coneDB = new ConexionDDBB();
    ResultSetDDBB resuDB = new ResultSetDDBB();
    StatementDDBB state = new StatementDDBB();
    String usuario;
            
    public CambiarContrasenaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        traerUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCambiarContra_RpContra = new javax.swing.JTextField();
        txtCambiarContra_NvContra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCambiarContra_Primo = new javax.swing.JTextField();
        txtCambiarContra_Lugar = new javax.swing.JTextField();
        txtCambiarContra_Mascota = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCambiarContra_Usuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        panelRound1 = new ClasesPersonalizadas.PanelRound();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 132, 196));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cambiar Credenciales");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 300, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Repetir contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 140, -1));

        jLabel3.setBackground(new java.awt.Color(32, 132, 196));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Preguntas de recuperación");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 270, -1));

        txtCambiarContra_RpContra.setBackground(new java.awt.Color(255, 255, 255));
        txtCambiarContra_RpContra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCambiarContra_RpContra.setForeground(new java.awt.Color(102, 102, 102));
        txtCambiarContra_RpContra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtCambiarContra_RpContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 150, -1));

        txtCambiarContra_NvContra.setBackground(new java.awt.Color(255, 255, 255));
        txtCambiarContra_NvContra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCambiarContra_NvContra.setForeground(new java.awt.Color(102, 102, 102));
        txtCambiarContra_NvContra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtCambiarContra_NvContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 150, -1));

        jButton1.setBackground(new java.awt.Color(32, 132, 196));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 100, 30));

        jButton2.setBackground(new java.awt.Color(32, 132, 196));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 100, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Ingresa el nombre de tu primera mascota:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 280, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Ingresa el nombre de tu prim@ favorito@:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 290, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Ingresa el nombre de tu lugar de nacimiento:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 310, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 70, -1));

        jLabel8.setBackground(new java.awt.Color(32, 132, 196));
        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Usuario");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 140, -1));

        txtCambiarContra_Primo.setBackground(new java.awt.Color(255, 255, 255));
        txtCambiarContra_Primo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCambiarContra_Primo.setForeground(new java.awt.Color(102, 102, 102));
        txtCambiarContra_Primo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtCambiarContra_Primo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 190, 20));

        txtCambiarContra_Lugar.setBackground(new java.awt.Color(255, 255, 255));
        txtCambiarContra_Lugar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCambiarContra_Lugar.setForeground(new java.awt.Color(102, 102, 102));
        txtCambiarContra_Lugar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtCambiarContra_Lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 190, 20));

        txtCambiarContra_Mascota.setBackground(new java.awt.Color(255, 255, 255));
        txtCambiarContra_Mascota.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCambiarContra_Mascota.setForeground(new java.awt.Color(102, 102, 102));
        txtCambiarContra_Mascota.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtCambiarContra_Mascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 190, 20));

        jLabel9.setBackground(new java.awt.Color(32, 132, 196));
        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Contraseña");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 140, -1));

        txtCambiarContra_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        txtCambiarContra_Usuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCambiarContra_Usuario.setForeground(new java.awt.Color(83, 83, 83));
        txtCambiarContra_Usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtCambiarContra_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 150, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Nueva contraseña:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 140, -1));

        panelRound1.setBackground(new java.awt.Color(229, 241, 255));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/masculino 64px.png"))); // NOI18N
        panelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 100));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 150, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nvContra = txtCambiarContra_NvContra.getText();
        String rpContra = txtCambiarContra_RpContra.getText();
        
        String mascota = txtCambiarContra_Mascota.getText();
        String primo = txtCambiarContra_Primo.getText();
        String lugar = txtCambiarContra_Lugar.getText();
        usuario = txtCambiarContra_Usuario.getText();
        
        if(nvContra.equals("") || rpContra.equals("") || mascota.equals("") || primo.equals("") || lugar.equals("") || usuario.equals("")){
            JOptionPane.showMessageDialog(null, "¡Hay campos vacios!");
        }else{
            if(nvContra.equals(rpContra)){
                
                resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), "Update Login set Contrasena = '"+nvContra+"', Primera_mascota = '"+mascota+"', Prim_fav = '"+primo+"', Lugar_nacimineto = '"+lugar+"', Maestro = '"+usuario+"'");
                JOptionPane.showMessageDialog(null, "¡Credenciales exitosamente actualizada!");
                LoginMaestros iniciar = new LoginMaestros();

                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "¡Las contraseñas ingresadas no coinciden!");
            }
        }   
    }//GEN-LAST:event_jButton1ActionPerformed
    
    void traerUsuario(){
        ResultSet resultados = resuDB.myResultSetQuery(state.myStatement(coneDB.conexion()),ConsultasSql.DatosLogin);
                
        try{
            while(resultados.next()){
                usuario = resultados.getString("Maestro");
            }
        }catch(Exception e){
           System.out.println("No se pudo obtenber el nombre del usuario, error: "+e);
        }
                
        txtCambiarContra_Usuario.setText(usuario);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoginMaestros iniciar = new LoginMaestros();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private ClasesPersonalizadas.PanelRound panelRound1;
    private javax.swing.JTextField txtCambiarContra_Lugar;
    private javax.swing.JTextField txtCambiarContra_Mascota;
    private javax.swing.JTextField txtCambiarContra_NvContra;
    private javax.swing.JTextField txtCambiarContra_Primo;
    private javax.swing.JTextField txtCambiarContra_RpContra;
    private javax.swing.JTextField txtCambiarContra_Usuario;
    // End of variables declaration//GEN-END:variables
}
