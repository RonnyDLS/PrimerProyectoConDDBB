
package Interfaces;
import ConexionDDBB.*;
import java.sql.ResultSet;
import ConsultasMysql.*;
import javax.swing.Timer;

public class Binvenida extends javax.swing.JFrame {
    ConexionDDBB coneDB = new ConexionDDBB();
    ResultSetDDBB resuDB = new ResultSetDDBB();
    StatementDDBB state = new StatementDDBB();
    
    String usuario;
    
    public Binvenida() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
       /*
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dispose(); */
       
        Timer timer = new Timer(2000, (e) -> {
            dispose();
        });
        timer.setRepeats(false);
        timer.start();
        
        
        ResultSet resultados = resuDB.myResultSetQuery(state.myStatement(coneDB.conexion()),ConsultasSql.DatosLogin);
        try{
            while(resultados.next()){
                usuario = resultados.getString("Maestro");
            }
        }catch(Exception e){
           System.out.println("No se pudo obtenber el nombre del usuario, error: "+e);
        }
        
        lbNombreUsuario.setText(usuario);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNombreUsuario = new javax.swing.JLabel();
        lbBienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbNombreUsuario.setBackground(new java.awt.Color(32, 132, 196));
        lbNombreUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lbNombreUsuario.setForeground(new java.awt.Color(32, 132, 196));
        lbNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombreUsuario.setText("Nombre");

        lbBienvenido.setBackground(new java.awt.Color(32, 132, 196));
        lbBienvenido.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        lbBienvenido.setForeground(new java.awt.Color(32, 132, 196));
        lbBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBienvenido.setText("¡BINVENID@!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 142, Short.MAX_VALUE)
                        .addComponent(lbBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 121, Short.MAX_VALUE))
                    .addComponent(lbNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(lbBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNombreUsuario)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBienvenido;
    private javax.swing.JLabel lbNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
