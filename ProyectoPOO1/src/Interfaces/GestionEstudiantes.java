
package Interfaces;

import ConexionDDBB.ConexionDDBB;
import ConexionDDBB.ResultSetDDBB;
import ConexionDDBB.StatementDDBB;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionEstudiantes extends javax.swing.JFrame {
    ConexionDDBB coneDB = new ConexionDDBB();
    ResultSetDDBB resuDB = new ResultSetDDBB();
    StatementDDBB state = new StatementDDBB();
    
    String[] fila = new String[3];
    public static String matricula, nomAlumno;
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public GestionEstudiantes() {
        initComponents();
        setSize(1000, 650);
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
        
        modelo.addColumn("Matricula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        
        addAlumnos();
        
        tablaAlumnos.setModel(modelo);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarAlumno = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        matriculaAlumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidoAlumno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nombreAlumno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        editarNombreAlumno = new javax.swing.JDialog();
        Si = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        nmAlumno = new javax.swing.JLabel();
        eliminarAlumnoInterfaz = new javax.swing.JDialog();
        Si1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        nmAlumno1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new ClasesPersonalizadas.PanelRound();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panelRound3 = new ClasesPersonalizadas.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        txtMateriasEditar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMateriasApellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 132, 196));
        jLabel2.setText("Agregar alumno");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 250, 32));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 72, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 126, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 180, -1, -1));

        matriculaAlumno.setBackground(new java.awt.Color(255, 255, 255));
        matriculaAlumno.setForeground(new java.awt.Color(153, 153, 153));
        matriculaAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.add(matriculaAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 230, 30));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/graduado 128px.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 140, 170));

        apellidoAlumno.setBackground(new java.awt.Color(255, 255, 255));
        apellidoAlumno.setForeground(new java.awt.Color(153, 153, 153));
        apellidoAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.add(apellidoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 230, 30));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Apellido");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 80, -1));

        nombreAlumno.setBackground(new java.awt.Color(255, 255, 255));
        nombreAlumno.setForeground(new java.awt.Color(153, 153, 153));
        nombreAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.add(nombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 230, 30));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Nombre");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 80, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Matricula");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 80, -1));

        jButton5.setBackground(new java.awt.Color(32, 132, 196));
        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 330, 40));

        javax.swing.GroupLayout AgregarAlumnoLayout = new javax.swing.GroupLayout(AgregarAlumno.getContentPane());
        AgregarAlumno.getContentPane().setLayout(AgregarAlumnoLayout);
        AgregarAlumnoLayout.setHorizontalGroup(
            AgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AgregarAlumnoLayout.setVerticalGroup(
            AgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Si.setBackground(new java.awt.Color(255, 255, 255));
        Si.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(32, 132, 196));
        jLabel12.setText("Advertencia");
        Si.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 43, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/warning (1).png"))); // NOI18N
        Si.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 113, 97, 79));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("nombre de:");
        Si.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Seguro que desea cambiar el");
        Si.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(32, 132, 196));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("No");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        Si.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 235, 74, 32));

        jToggleButton2.setBackground(new java.awt.Color(254, 119, 119));
        jToggleButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("Si");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        Si.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 235, 74, 32));

        nmAlumno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        nmAlumno.setForeground(new java.awt.Color(102, 102, 102));
        nmAlumno.setText("nombre ");
        Si.add(nmAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 160, 161, -1));

        javax.swing.GroupLayout editarNombreAlumnoLayout = new javax.swing.GroupLayout(editarNombreAlumno.getContentPane());
        editarNombreAlumno.getContentPane().setLayout(editarNombreAlumnoLayout);
        editarNombreAlumnoLayout.setHorizontalGroup(
            editarNombreAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Si, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editarNombreAlumnoLayout.setVerticalGroup(
            editarNombreAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Si, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Si1.setBackground(new java.awt.Color(255, 255, 255));
        Si1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(32, 132, 196));
        jLabel14.setText("Advertencia");
        Si1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 43, -1, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/warning (1).png"))); // NOI18N
        Si1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 113, 97, 79));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("alumno: ");
        Si1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Seguro que desea eliminar al");
        Si1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jToggleButton3.setBackground(new java.awt.Color(32, 132, 196));
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("No");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        Si1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 235, 74, 32));

        jToggleButton4.setBackground(new java.awt.Color(254, 119, 119));
        jToggleButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setText("Si");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        Si1.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 235, 74, 32));

        nmAlumno1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        nmAlumno1.setForeground(new java.awt.Color(102, 102, 102));
        nmAlumno1.setText("nombre ");
        Si1.add(nmAlumno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 180, -1));

        javax.swing.GroupLayout eliminarAlumnoInterfazLayout = new javax.swing.GroupLayout(eliminarAlumnoInterfaz.getContentPane());
        eliminarAlumnoInterfaz.getContentPane().setLayout(eliminarAlumnoInterfazLayout);
        eliminarAlumnoInterfazLayout.setHorizontalGroup(
            eliminarAlumnoInterfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Si1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        eliminarAlumnoInterfazLayout.setVerticalGroup(
            eliminarAlumnoInterfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Si1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 132, 196));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setPreferredSize(new java.awt.Dimension(847, 472));
        panelRound1.setRoundBottomLeft(60);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(32, 132, 196));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(32, 132, 196));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(32, 132, 196));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(32, 132, 196));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        panelRound3.setBackground(new java.awt.Color(229, 241, 255));
        panelRound3.setRoundBottomLeft(30);
        panelRound3.setRoundBottomRight(30);
        panelRound3.setRoundTopLeft(30);
        panelRound3.setRoundTopRight(30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/graduado 128px.png"))); // NOI18N

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtMateriasEditar.setBackground(new java.awt.Color(237, 237, 237));
        txtMateriasEditar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtMateriasEditar.setForeground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 132, 196));
        jLabel7.setText("Editar nombre");

        txtMateriasApellido.setBackground(new java.awt.Color(237, 237, 237));
        txtMateriasApellido.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtMateriasApellido.setForeground(new java.awt.Color(153, 153, 153));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 132, 196));
        jLabel10.setText("Editar apellido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMateriasApellido)
                    .addComponent(txtMateriasEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addGap(104, 104, 104)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMateriasEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMateriasApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tablaAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        tablaAlumnos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tablaAlumnos.setForeground(new java.awt.Color(32, 132, 196));
        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaAlumnos.setRowHeight(50);
        tablaAlumnos.setSelectionBackground(new java.awt.Color(229, 241, 255));
        tablaAlumnos.setSelectionForeground(new java.awt.Color(32, 132, 196));
        tablaAlumnos.setShowVerticalLines(false);
        tablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAlumnos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AgregarAlumno.setSize(680, 410);
        AgregarAlumno.setLocationRelativeTo(null);
        AgregarAlumno.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            
        int fila = tablaAlumnos.getSelectedRow();
        
        if(fila < 0){
            JOptionPane.showMessageDialog(null, "No hay alumno selecionado");
        }else{
            nmAlumno.setText(nomAlumno);
            
            editarNombreAlumno.setSize(480, 360);
            editarNombreAlumno.setLocationRelativeTo(null);
            editarNombreAlumno.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EditarGestion iniciar = new EditarGestion();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    void addAlumnos(){
        String allAlumnosMateria = "select* from alumnos as a join materia as m on a.Id_materias = m.id where m.id ="+Materias.txtMaterias_ID.getText();
        
        ResultSet resultados = resuDB.myResultSetQuery(state.myStatement(coneDB.conexion()), allAlumnosMateria);
        try{
           while (resultados.next()) {               
               fila[0] = resultados.getString("Matricula");
               fila[1] = resultados.getString("Nombre");
               fila[2] = resultados.getString("Apellido");
               modelo.addRow(fila);
           }
        }catch(Exception e){
           System.out.println("No se obtuvieron los estudiantes, error: "+e);
        }
    }
    
    void limpiartabla(){
        for(int i =0; i<tablaAlumnos.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String matriculaAlum = matriculaAlumno.getText();
        String nombreAlum = nombreAlumno.getText();
        String apellidoAlum = apellidoAlumno.getText();
        String idUsu = Materias.txtMaterias_ID.getText();
        
        if(matriculaAlum.equals("") || nombreAlumno.equals("") || apellidoAlum.equals("")){
            JOptionPane.showMessageDialog(null, "¡Hay campos vacios! ");
        }else{
            String insertarAlumnos = "insert into alumnos(Matricula,Nombre,Apellido,Id_materias) values ('"+matriculaAlum+"','"+nombreAlum+"','"+apellidoAlum+"',"+idUsu+")";
            System.out.println("matriculaAlum: "+matriculaAlum);
            resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), insertarAlumnos);
            limpiartabla();
            addAlumnos();
            
            matriculaAlumno.setText("");
            nombreAlumno.setText("");
            apellidoAlumno.setText("");
            
            String updateCali = "INSERT INTO Calificaciones (Asignacion, Practica, Examen, Total,Id_matricula) VALUES ( '0' , '0', '0', '0','"+matriculaAlum+"')";
            resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), updateCali);
            
            JOptionPane.showMessageDialog(null, "¡Alumno agregado correctamente!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnosMouseClicked
        int fila = tablaAlumnos.getSelectedRow();
        matricula = String.valueOf(tablaAlumnos.getValueAt(fila, 0));
        nomAlumno = String.valueOf(tablaAlumnos.getValueAt(fila, 1));
        txtMateriasApellido.setText(String.valueOf(tablaAlumnos.getValueAt(fila, 2)));
        
        txtMateriasEditar.setText(nomAlumno);
    }//GEN-LAST:event_tablaAlumnosMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        editarNombreAlumno.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        String updateAlumno = "Update alumnos set Nombre = '"+txtMateriasEditar.getText()+"', Apellido = '"+txtMateriasApellido.getText()+"' where Matricula = "+matricula;
        resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), updateAlumno);
      
        limpiartabla();
        addAlumnos();
        txtMateriasEditar.setText("");
        txtMateriasApellido.setText("");
        editarNombreAlumno.dispose();
        JOptionPane.showMessageDialog(null, "¡Nombre exitosamente cambiado!");
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila = tablaAlumnos.getSelectedRow();
        
        if(fila < 0){
            JOptionPane.showMessageDialog(null, "¡No hay alumno selecionado!");
        }else{
            nmAlumno1.setText(nomAlumno);
            
            eliminarAlumnoInterfaz.setSize(480, 360);
            eliminarAlumnoInterfaz.setLocationRelativeTo(null);
            eliminarAlumnoInterfaz.setVisible(true);
        }
        txtMateriasEditar.setText("");
        txtMateriasApellido.setText("");        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        editarNombreAlumno.dispose();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        String eliminarAlumno = "delete from alumnos where Matricula = "+matricula;
        String eliminarAsisAlum = "delete from asistencia where Matricula ="+matricula;
        String eliminarCalifi = "delete from calificaciones where Id_matricula = "+matricula; 
        
        resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), eliminarCalifi); 
        resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), eliminarAsisAlum); 
        resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), eliminarAlumno); 
        
        limpiartabla();
        addAlumnos();
        txtMateriasEditar.setText("");
        JOptionPane.showMessageDialog(null, "¡Alumno exitosamente eliminado!");
        eliminarAlumnoInterfaz.dispose();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgregarAlumno;
    private javax.swing.JPanel Si;
    private javax.swing.JPanel Si1;
    private javax.swing.JTextField apellidoAlumno;
    private javax.swing.JDialog editarNombreAlumno;
    private javax.swing.JDialog eliminarAlumnoInterfaz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JTextField matriculaAlumno;
    private javax.swing.JLabel nmAlumno;
    private javax.swing.JLabel nmAlumno1;
    private javax.swing.JTextField nombreAlumno;
    private ClasesPersonalizadas.PanelRound panelRound1;
    private ClasesPersonalizadas.PanelRound panelRound3;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTextField txtMateriasApellido;
    private javax.swing.JTextField txtMateriasEditar;
    // End of variables declaration//GEN-END:variables
}
