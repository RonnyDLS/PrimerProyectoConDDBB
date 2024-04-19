
package Interfaces;

import ConexionDDBB.*;
import ConsultasMysql.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginMaestros extends javax.swing.JFrame {
    ConexionDDBB coneDB = new ConexionDDBB();
    ResultSetDDBB resuDB = new ResultSetDDBB();
    StatementDDBB state = new StatementDDBB();
    
    public static int idUsuario;
    
    public LoginMaestros() {
        initComponents();
        setLocationRelativeTo(null);
        admin();
        setVisible(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtLogin_Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLogin_Contrasena = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelRound1 = new ClasesPersonalizadas.PanelRound();
        IconoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(167, 208, 246));
        jLabel1.setText(" App");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 180, 90));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 132, 196));
        jLabel3.setText(" Educa");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 280, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("Usuario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 130, 30));

        txtLogin_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        txtLogin_Usuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtLogin_Usuario.setForeground(new java.awt.Color(153, 153, 153));
        txtLogin_Usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jPanel2.add(txtLogin_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 250, 40));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 150, 30));

        txtLogin_Contrasena.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtLogin_Contrasena.setForeground(new java.awt.Color(153, 153, 153));
        txtLogin_Contrasena.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jPanel2.add(txtLogin_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 250, 40));

        jButton1.setBackground(new java.awt.Color(22, 132, 196));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 250, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(32, 132, 196));
        jButton2.setText("Olvide mi contraseña");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 140, 30));

        panelRound1.setBackground(new java.awt.Color(229, 241, 255));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/masculino login.png"))); // NOI18N
        panelRound1.add(IconoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 420, 240));

        jPanel2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 420, 290));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        ResultSet myresultadoDDBB;
        String usuario = txtLogin_Usuario.getText();
        String contra = txtLogin_Contrasena.getText();
        
        String dbNomMaestro = null;
        String dbContrasena = null; 
        
        String nuevoIngreso = null;
        
        myresultadoDDBB = resuDB.myResultSetQuery(state.myStatement(coneDB.conexion()), ConsultasSql.DatosLogin);
        
        try{
            
            while(myresultadoDDBB.next()){
                dbNomMaestro = myresultadoDDBB.getString("Maestro");
                dbContrasena = myresultadoDDBB.getString("Contrasena");
                nuevoIngreso = myresultadoDDBB.getString("nuevoIngreso");
                idUsuario = myresultadoDDBB.getInt("Id");
            }
           
        }catch(Exception e){
            
            System.out.println("No conecta la DDBB en login, Error: "+e);
            
        }
        
        if(usuario.equals(dbNomMaestro) && contra.equals(dbContrasena)){
            if(nuevoIngreso.equals("0")){
                UnaVezRecupContrasena iniciar = new UnaVezRecupContrasena();
                resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), "Update Login set nuevoIngreso = 1");
            }else{
                Materias iniMaterias = new Materias();
                iniMaterias.setVisible(true);
                Binvenida ini = new Binvenida();
            }
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos!!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    void admin(){
        String usuario = null, contra = null;
        int primeraVez = 0;
        
        ResultSet resultados = resuDB.myResultSetQuery(state.myStatement(coneDB.conexion()),ConsultasSql.DatosLogin);
        try{
            while(resultados.next()){
                usuario = resultados.getString("Maestro");
                contra = resultados.getString("Contrasena");
                primeraVez = resultados.getShort("nuevoIngreso");
            }
        }catch(Exception e){
           System.out.println("No se pudo obtenber el nombre del usuario, error: "+e);
        }
        
        if(primeraVez == 0){
            txtLogin_Usuario.setText(usuario);
            txtLogin_Contrasena.setText(contra);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        RecuperacionDeContasena iniciar = new RecuperacionDeContasena();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconoLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private ClasesPersonalizadas.PanelRound panelRound1;
    private javax.swing.JPasswordField txtLogin_Contrasena;
    private javax.swing.JTextField txtLogin_Usuario;
    // End of variables declaration//GEN-END:variables
}
