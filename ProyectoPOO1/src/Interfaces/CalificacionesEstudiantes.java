
package Interfaces;

import ConexionDDBB.ConexionDDBB;
import ConexionDDBB.ResultSetDDBB;
import ConexionDDBB.StatementDDBB;
import Main.*;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CalificacionesEstudiantes extends javax.swing.JFrame {
    ConexionDDBB coneDB = new ConexionDDBB();
    ResultSetDDBB resuDB = new ResultSetDDBB();
    StatementDDBB state = new StatementDDBB();
    
    
    String[] alumnosFila = new String[3];
    String[] caliFila = new String[4];
    double total;
    
    String matriculaAlumno;
    
    DefaultTableModel modelo = new DefaultTableModel();
    //DefaultTableModel modeloCali = new DefaultTableModel();
    
    public CalificacionesEstudiantes() {
        initComponents();
        setSize(1000, 650);
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
        /*
        modeloCali.addColumn("Asignacion");
        modeloCali.addColumn("Practica");
        modeloCali.addColumn("Examen");
        modeloCali.addColumn("Total");
        */
        modelo.addColumn("Matricula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        
        addAlumos();
        
        //tablaCalifica.setModel(modeloCali);
        tablaCalificacionesAlum.setModel(modelo);
        
        PAsig.setText("0");
        PPract.setText("0");
        PExa.setText("0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new ClasesPersonalizadas.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCalificacionesAlum = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAsig = new javax.swing.JTextField();
        txtPract = new javax.swing.JTextField();
        txtExa = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCalificacionesAlum1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        TAsig = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PAsig = new javax.swing.JTextField();
        TPrac = new javax.swing.JTextField();
        PObPrac = new javax.swing.JTextField();
        PPract = new javax.swing.JTextField();
        PObExa = new javax.swing.JTextField();
        TExa = new javax.swing.JTextField();
        PExa = new javax.swing.JTextField();
        PObAsig = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ChekActivarEdit = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbNombreAlumno = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 132, 196));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setPreferredSize(new java.awt.Dimension(847, 472));
        panelRound1.setRoundBottomLeft(60);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(60);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 132, 196));
        jLabel1.setText("Calificaciones");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 34, 170, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCalificacionesAlum.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tablaCalificacionesAlum.setForeground(new java.awt.Color(32, 132, 196));
        tablaCalificacionesAlum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCalificacionesAlum.setRowHeight(50);
        tablaCalificacionesAlum.setSelectionBackground(new java.awt.Color(229, 241, 255));
        tablaCalificacionesAlum.setSelectionForeground(new java.awt.Color(32, 132, 196));
        tablaCalificacionesAlum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCalificacionesAlumMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaCalificacionesAlum);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 620, 220));

        txtTotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(31, 166, 105));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTotal.setEnabled(false);
        jPanel3.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 94, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Asignación: ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 110, 26));

        txtAsig.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        txtAsig.setForeground(new java.awt.Color(31, 166, 105));
        txtAsig.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAsig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAsig.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAsig.setEnabled(false);
        jPanel3.add(txtAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 94, 30));

        txtPract.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        txtPract.setForeground(new java.awt.Color(31, 166, 105));
        txtPract.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPract.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPract.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPract.setEnabled(false);
        jPanel3.add(txtPract, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 94, 30));

        txtExa.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        txtExa.setForeground(new java.awt.Color(31, 166, 105));
        txtExa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtExa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtExa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtExa.setEnabled(false);
        jPanel3.add(txtExa, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 94, 30));

        tablaCalificacionesAlum1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCalificacionesAlum1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCalificacionesAlum1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaCalificacionesAlum1);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 500, 220));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Practica:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 80, 26));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("  Examenes:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 100, 26));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Total: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 70, 30));

        panelRound1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 910, 220));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(209, 209, 209)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TAsig.setBackground(new java.awt.Color(236, 236, 236));
        TAsig.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        TAsig.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TAsig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TAsig.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TAsig.setEnabled(false);
        jPanel4.add(TAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 94, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Puntos obtenidos:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("+Puntos:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        PAsig.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        PAsig.setForeground(new java.awt.Color(102, 102, 102));
        PAsig.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PAsig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PAsig.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel4.add(PAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 94, 30));

        TPrac.setBackground(new java.awt.Color(236, 236, 236));
        TPrac.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        TPrac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TPrac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TPrac.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TPrac.setEnabled(false);
        jPanel4.add(TPrac, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 94, 30));

        PObPrac.setBackground(new java.awt.Color(236, 236, 236));
        PObPrac.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        PObPrac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PObPrac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PObPrac.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PObPrac.setEnabled(false);
        jPanel4.add(PObPrac, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 94, 30));

        PPract.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        PPract.setForeground(new java.awt.Color(102, 102, 102));
        PPract.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PPract.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PPract.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel4.add(PPract, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 94, 30));

        PObExa.setBackground(new java.awt.Color(236, 236, 236));
        PObExa.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        PObExa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PObExa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PObExa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PObExa.setEnabled(false);
        jPanel4.add(PObExa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 94, 30));

        TExa.setBackground(new java.awt.Color(236, 236, 236));
        TExa.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        TExa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TExa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TExa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TExa.setEnabled(false);
        jPanel4.add(TExa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 94, 30));

        PExa.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        PExa.setForeground(new java.awt.Color(102, 102, 102));
        PExa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PExa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PExa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel4.add(PExa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 94, 30));

        PObAsig.setBackground(new java.awt.Color(236, 236, 236));
        PObAsig.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        PObAsig.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PObAsig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PObAsig.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PObAsig.setEnabled(false);
        jPanel4.add(PObAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 94, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Asignaciones");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 26));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Practica");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 86, 26));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("  Examenes");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 120, 26));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Total: ");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 128, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText(" <<<");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 35, 30));

        ChekActivarEdit.setBackground(new java.awt.Color(255, 255, 255));
        ChekActivarEdit.setText("Editar");
        ChekActivarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChekActivarEditActionPerformed(evt);
            }
        });
        jPanel4.add(ChekActivarEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 73, 30));

        jButton4.setBackground(new java.awt.Color(32, 132, 169));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Sumar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 110, 40));

        panelRound1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 630, 180));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRound1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 220, 24));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRound1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 293, 597, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        panelRound1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 762, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(32, 132, 196));
        jLabel12.setText("Acomulado");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 120, 20));

        lbNombreAlumno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbNombreAlumno.setForeground(new java.awt.Color(32, 132, 196));
        panelRound1.add(lbNombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 180, 30));

        jButton1.setBackground(new java.awt.Color(32, 132, 196));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 160, 40));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(32, 132, 196));
        jLabel16.setText("Alumnos");
        panelRound1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 80, 20));

        jButton5.setBackground(new java.awt.Color(0, 153, 102));
        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Aplicar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, 80, 40));

        jButton6.setBackground(new java.awt.Color(200, 108, 62));
        jButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Pasar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, 80, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EditarGestion iniciar = new EditarGestion();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaCalificacionesAlumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCalificacionesAlumMouseClicked
        PObAsig.setText("0");
        PObPrac.setText("0");
        PObExa.setText("0");
        
        int fila = tablaCalificacionesAlum.getSelectedRow();
        matriculaAlumno = (String) tablaCalificacionesAlum.getValueAt(fila, 0);
        lbNombreAlumno.setText((String) tablaCalificacionesAlum.getValueAt(fila, 1));
        addCaliAlumos();
        
        PObAsig.setText(txtAsig.getText());
        PObPrac.setText(txtPract.getText());
        PObExa.setText(txtExa.getText());
        
        PObAsig.setDisabledTextColor(Color.GRAY);
        PObPrac.setDisabledTextColor(Color.GRAY);
        PObExa.setDisabledTextColor(Color.GRAY);
        
        TAsig.setDisabledTextColor(Color.GRAY);
        TPrac.setDisabledTextColor(Color.GRAY);
        TExa.setDisabledTextColor(Color.GRAY);
        
    }//GEN-LAST:event_tablaCalificacionesAlumMouseClicked

    private void tablaCalificacionesAlum1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCalificacionesAlum1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaCalificacionesAlum1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
            JOptionPane.showMessageDialog(null, "Cambios exitosamente agregados!");
            String updateCali = "Update calificaciones  set Asignacion = '"+txtAsig.getText()+"', Practica ='"+txtPract.getText()+"', Examen = '"+txtExa.getText()+"', Total ='"+txtTotal.getText()+"' where Id_matricula ="+matriculaAlumno;
            resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), updateCali);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

            
        if(PObAsig.getText().equals("") || PObPrac.getText().equals("") || PObExa.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Seleccione un estudiante");
        }else{
            txtAsig.setText(TAsig.getText());
            txtPract.setText(TPrac.getText());
            txtExa.setText(TExa.getText());

            double asignaciones, practica, examenes, total;

            asignaciones = Double.valueOf(TAsig.getText());
            practica = Double.valueOf(TPrac.getText());
            examenes = Double.valueOf(TExa.getText());

            total = asignaciones + practica + examenes;
            txtTotal.setText(String.valueOf(total));   
            
            PAsig.setText("0");
            PPract.setText("0");
            PExa.setText("0");
            TAsig.setText("0");
            TPrac.setText("0");
            TExa.setText("0");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if(PObAsig.getText().equals("") || PObPrac.getText().equals("") || PObExa.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Seleccione un estudiante");
        }else{
            double PuntosObtenidosAsig = Double.valueOf(PObAsig.getText());
            double masPuntosAsig = Double.valueOf(PAsig.getText());

            double PuntosObtenidosPra = Integer.valueOf(PObPrac.getText());
            double masPuntosPra = Double.valueOf(PPract.getText());

            double PuntosObtenidosExa = Integer.valueOf(PObExa.getText());
            double masPuntosExa = Double.valueOf(PExa.getText());

            Nota Asignaciones = new Nota(PuntosObtenidosAsig, masPuntosAsig);
            Nota Practica = new Nota(PuntosObtenidosPra, masPuntosPra);
            Nota Examenes = new Nota(PuntosObtenidosExa, masPuntosExa);

            TAsig.setText( String.valueOf(Asignaciones.sumaTotal()));
            TPrac.setText( String.valueOf(Practica.sumaTotal()));
            TExa.setText( String.valueOf(Examenes.sumaTotal()));

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ChekActivarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChekActivarEditActionPerformed
        if(ChekActivarEdit.isSelected()){
            PObAsig.setEnabled(true);
            PObPrac.setEnabled(true);
            PObExa.setEnabled(true);
        }else{
            PObAsig.setEnabled(false);
            PObPrac.setEnabled(false);
            PObExa.setEnabled(false);
            
            PObAsig.setDisabledTextColor(Color.GRAY);
            PObPrac.setDisabledTextColor(Color.GRAY);
            PObExa.setDisabledTextColor(Color.GRAY);
        }
    }//GEN-LAST:event_ChekActivarEditActionPerformed

    void addCaliAlumos(){
        String allCali = "select* from calificaciones as c join alumnos as a on c.Id_matricula = a.Matricula where a.Matricula = "+matriculaAlumno;        
        ResultSet resultado = resuDB.myResultSetQuery(state.myStatement(coneDB.conexion()), allCali);
        
        try{
            while (resultado.next()) {                
                caliFila[0] = resultado.getString("Asignacion");
                caliFila[1] = resultado.getString("Practica");
                caliFila[2] = resultado.getString("Examen");
                caliFila[3] = resultado.getString("Total");
                
                //modeloCali.addRow(caliFila);
            }
        }catch(Exception e){
            System.out.println("Error al obtener los alumnos en calificaciones: "+e);
        }
        
        txtAsig.setText(caliFila[0]);
        txtPract.setText(caliFila[1]);
        txtExa.setText(caliFila[2]);
        txtTotal.setText(caliFila[3]);
        
        txtAsig.setDisabledTextColor(Color.BLUE);
        txtPract.setDisabledTextColor(Color.BLUE);
        txtExa.setDisabledTextColor(Color.BLUE);
        txtTotal.setDisabledTextColor(Color.BLUE);
    }
    
    void addAlumos(){
        String allAlumnos = "select* from alumnos as a join materia as m on a.Id_materias = m.Id where m.id = "+Materias.txtMaterias_ID.getText();        
        ResultSet resultado = resuDB.myResultSetQuery(state.myStatement(coneDB.conexion()), allAlumnos);
        
        try{
            while (resultado.next()) {                
                alumnosFila[0] = resultado.getString("Matricula");
                alumnosFila[1] = resultado.getString("Nombre");
                alumnosFila[2] = resultado.getString("Apellido");
                
                modelo.addRow(alumnosFila);
            }
        }catch(Exception e){
            System.out.println("Error al obtener los alumnos en calificaciones: "+e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChekActivarEdit;
    private javax.swing.JTextField PAsig;
    private javax.swing.JTextField PExa;
    private javax.swing.JTextField PObAsig;
    private javax.swing.JTextField PObExa;
    private javax.swing.JTextField PObPrac;
    private javax.swing.JTextField PPract;
    private javax.swing.JTextField TAsig;
    private javax.swing.JTextField TExa;
    private javax.swing.JTextField TPrac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbNombreAlumno;
    private ClasesPersonalizadas.PanelRound panelRound1;
    private javax.swing.JTable tablaCalificacionesAlum;
    private javax.swing.JTable tablaCalificacionesAlum1;
    private javax.swing.JTextField txtAsig;
    private javax.swing.JTextField txtExa;
    private javax.swing.JTextField txtPract;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
