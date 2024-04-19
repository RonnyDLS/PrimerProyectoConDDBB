
package Interfaces;

import ClasesPersonalizadas.ColorearTabla;
import ConexionDDBB.ConexionDDBB;
import ConexionDDBB.ResultSetDDBB;
import ConexionDDBB.StatementDDBB;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class AsistenciaAlumnos extends javax.swing.JFrame {
    ConexionDDBB coneDB = new ConexionDDBB();
    ResultSetDDBB resuDB = new ResultSetDDBB();
    StatementDDBB state = new StatementDDBB();
    
    LocalDate fechaActual = LocalDate.now();
        
    String dia = String.valueOf(fechaActual.getDayOfMonth());
    int mes = fechaActual.getMonthValue();
    int anio = fechaActual.getYear();
    
    String presente;
    String idAsistencia;
    
    String[] fila = new String[3];
    String[] fila2 = new String[4];
    
    //String matricula, nomAlumno;
    
    String matriculaAlumno;
    
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DefaultTableModel modeloAsistencia = new DefaultTableModel();
    
    public AsistenciaAlumnos() {
        
        initComponents();
        setSize(1000, 650);
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
        
        modeloAsistencia.addColumn("Matricula");        
        modeloAsistencia.addColumn("Asistio");   
        modeloAsistencia.addColumn("Fecha");   
        modeloAsistencia.addColumn("");  
        
        modeloTabla.addColumn("Matricula");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        
        addAlumnos();
        addAsistencia();
        
        tabla.setModel(modeloTabla);
        tablaAsistencia.setModel(modeloAsistencia);

        diaBox.setSelectedItem(dia);
        mesBox.setSelectedIndex(mes);
        anioBox.setSelectedItem(anio);
        
        tablaAsistencia.getColumnModel().getColumn(3).setMaxWidth(0);
        tablaAsistencia.getColumnModel().getColumn(3).setMinWidth(0);
        colorDeColumna();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new ClasesPersonalizadas.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAsistencia = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        nombreDeAlum = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        presenteCheck = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        anioBox = new javax.swing.JComboBox<>();
        diaBox = new javax.swing.JComboBox<>();
        mesBox = new javax.swing.JComboBox<>();
        activarTabla = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        fechaAsis = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 132, 196));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setPreferredSize(new java.awt.Dimension(847, 472));
        panelRound1.setRoundBottomLeft(60);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(60);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 132, 196));
        jLabel1.setText("Asistencia");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 132, 196));
        jLabel3.setText("Alumnos");

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tabla.setForeground(new java.awt.Color(32, 132, 196));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Matricula", "Nombre", "Apellido"
            }
        ));
        tabla.setRowHeight(50);
        tabla.setSelectionBackground(new java.awt.Color(229, 241, 255));
        tabla.setSelectionForeground(new java.awt.Color(32, 132, 196));
        tabla.setShowVerticalLines(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        tablaAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        tablaAsistencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tablaAsistencia.setForeground(new java.awt.Color(32, 132, 196));
        tablaAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Matricula", "Fecha", "Asistio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaAsistencia.setEnabled(false);
        tablaAsistencia.setRowHeight(25);
        tablaAsistencia.setSelectionBackground(new java.awt.Color(229, 241, 255));
        tablaAsistencia.setSelectionForeground(new java.awt.Color(32, 132, 196));
        tablaAsistencia.setShowVerticalLines(false);
        tablaAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAsistenciaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAsistencia);
        if (tablaAsistencia.getColumnModel().getColumnCount() > 0) {
            tablaAsistencia.getColumnModel().getColumn(2).setMinWidth(70);
            tablaAsistencia.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 132, 196));
        jLabel6.setText("Alumno:");

        nombreDeAlum.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        nombreDeAlum.setForeground(new java.awt.Color(32, 132, 196));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 132, 196));
        jLabel7.setText("Fecha:");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 132, 196));
        jLabel5.setText("Asistio:");

        presenteCheck.setBackground(new java.awt.Color(255, 255, 255));
        presenteCheck.setForeground(new java.awt.Color(32, 132, 196));
        presenteCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presenteCheckActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(32, 132, 196));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        anioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        anioBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioBoxActionPerformed(evt);
            }
        });

        diaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        mesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        activarTabla.setBackground(new java.awt.Color(255, 255, 255));
        activarTabla.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        activarTabla.setForeground(new java.awt.Color(32, 132, 196));
        activarTabla.setText("Activar Taabla");
        activarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarTablaActionPerformed(evt);
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

        Actualizar.setBackground(new java.awt.Color(32, 132, 196));
        Actualizar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        fechaAsis.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        fechaAsis.setForeground(new java.awt.Color(102, 102, 102));
        fechaAsis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreDeAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(activarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fechaAsis, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(diaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(anioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(presenteCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreDeAlum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(fechaAsis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(anioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(diaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7))
                    .addComponent(presenteCheck))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(activarTabla)
                        .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(32, 132, 196));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 132, 196));
        jLabel4.setText("Asistencia");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23))))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(11, 11, 11)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Void colorDeColumna(){
        ColorearTabla renderizador = new ColorearTabla(); 
        TableColumnModel modeloColumnas = tablaAsistencia.getColumnModel();
        modeloColumnas.getColumn(3).setCellRenderer(renderizador);
        return null;
    }
    
    void addAlumnos(){
        String allAlumnosMateria = "select* from alumnos as a join materia as m on a.Id_materias = m.id where m.id ="+Materias.txtMaterias_ID.getText();
        
        ResultSet resultados = resuDB.myResultSetQuery(state.myStatement(coneDB.conexion()), allAlumnosMateria);
        try{
           while (resultados.next()) {               
               fila[0] = resultados.getString("Matricula");
               fila[1] = resultados.getString("Nombre");
               fila[2] = resultados.getString("Apellido");
               modeloTabla.addRow(fila);
           }
        }catch(Exception e){
           System.out.println("No se obtuvieron los estudiantes, error: "+e);
        }
    }
    void limpiar(){
        for(int i =0; i<tablaAsistencia.getRowCount(); i++){
            modeloAsistencia.removeRow(i);
            i = i-1;
        }   
    }
    void limpiarAlumos(){
        for (int i = tabla.getRowCount() - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }
    void addAsistencia(){
        
        String allAsistenciaMateria = "select alum.Matricula, asis.Id_asistencia, asis.Asisitio, asis.Fecha from alumnos as alum join asistencia as asis on asis.Matricula = alum.Matricula where alum.Matricula = "+matriculaAlumno;
        ResultSet resultados1 = resuDB.myResultSetQuery(state.myStatement(coneDB.conexion()), allAsistenciaMateria);
        try{
           while (resultados1.next()) {               
               fila2[0] = resultados1.getString("Matricula");
               fila2[1] = String.valueOf(resultados1.getString("Asisitio"));
               fila2[2] = resultados1.getString("Fecha");
               fila2[3] = resultados1.getString("Id_asistencia");
               modeloAsistencia.addRow(fila2);
           }
        }catch(Exception e){
           System.out.println("No se obtuvieron los estudiantes, error: "+e);
        }
    }
    private void anioBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioBoxActionPerformed

    private void presenteCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presenteCheckActionPerformed
        
    }//GEN-LAST:event_presenteCheckActionPerformed
    void asistio(){
        if(presenteCheck.isSelected()){
            presente = "SI";
        }else{
            presente = "NO";
        }
    } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EditarGestion iniciar = new EditarGestion();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        asistio();
        fecha();
        limpiarAlumos();
        addAlumnos();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    void fecha(){
        int fila = tabla.getSelectedRow();
        if (fila != -1) {
        matriculaAlumno = (String) modeloTabla.getValueAt(fila, 0);
        
        String insertAsis = "insert into asistencia(Matricula, Asisitio, Fecha) values ('"+matriculaAlumno+"','"+presente+"','"+anioBox.getSelectedItem()+"-"+(mesBox.getSelectedIndex()+1)+"-"+diaBox.getSelectedItem()+"')";
        resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), insertAsis);
        
        limpiar();
        addAsistencia();
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un alumno");
        }
    }
    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        presenteCheck.setSelected(true);
        int fila2 = tabla.getSelectedRow();
        matriculaAlumno = String.valueOf(tabla.getValueAt(fila2, 0));
        nombreDeAlum.setText(String.valueOf(tabla.getValueAt(fila2, 1)));
        
        limpiar();
        addAsistencia();
    }//GEN-LAST:event_tablaMouseClicked

    private void tablaAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAsistenciaMouseClicked
        int fila = tablaAsistencia.getSelectedRow();
        if(fila > -1){
            String fecha = (String) modeloAsistencia.getValueAt(fila, 2);
            String asistio = (String) modeloAsistencia.getValueAt(fila, 1);
            idAsistencia = (String) modeloAsistencia.getValueAt(fila, 3);
            
            if(asistio.equals("SI")){
                presenteCheck.setSelected(true);
            }else {
                if(asistio.equals("NO")){
                    presenteCheck.setSelected(false);
                }
            }
            
            fechaAsis.setText(fecha);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione la asistencia, verifique que este activa la tabla");
        }    
    }//GEN-LAST:event_tablaAsistenciaMouseClicked

    private void activarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarTablaActionPerformed
        if(activarTabla.isSelected()){
            tablaAsistencia.setEnabled(true);
        }else{
            tablaAsistencia.setEnabled(false);
            limpiar();
            addAsistencia();
        }
    }//GEN-LAST:event_activarTablaActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        
        asistio();
        String updateAsis = "Update asistencia  set Asisitio = '"+presente+"', Fecha = '"+anioBox.getSelectedItem()+"-"+(mesBox.getSelectedIndex()+1)+"-"+diaBox.getSelectedItem()+"' where Id_asistencia =" +idAsistencia;
        resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), updateAsis);
        
        limpiar();
        addAsistencia();
        fechaAsis.setText("");
    }//GEN-LAST:event_ActualizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String eliminarAsis = "delete from asistencia where Id_asistencia = "+idAsistencia;
        resuDB.myResultSetUpdate(state.myStatement(coneDB.conexion()), eliminarAsis);
        limpiar();
        addAsistencia();
        fechaAsis.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JCheckBox activarTabla;
    private javax.swing.JComboBox<String> anioBox;
    private javax.swing.JComboBox<String> diaBox;
    private javax.swing.JLabel fechaAsis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> mesBox;
    private javax.swing.JLabel nombreDeAlum;
    private ClasesPersonalizadas.PanelRound panelRound1;
    private javax.swing.JCheckBox presenteCheck;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaAsistencia;
    // End of variables declaration//GEN-END:variables
}
