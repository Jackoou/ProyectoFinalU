/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Frames;

import java.awt.Color;

/**
 *
 * @author andre
 */
public class crudPlay extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    
            
    public crudPlay() {
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

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jpExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        jpIngresarDatos = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        txtPublic = new javax.swing.JLabel();
        txtConsola = new javax.swing.JLabel();
        tfConsola = new javax.swing.JTextField();
        txtGenero = new javax.swing.JLabel();
        txtFormato = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        txtDirector = new javax.swing.JLabel();
        tfDirector = new javax.swing.JTextField();
        jDatePlay = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jpBotones = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JPanel();
        txtNuevo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        txtEliminar = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JPanel();
        txtConsultar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        txtEditar = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JPanel();
        txtEnviar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setOpaque(false);
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        jpExit.setBackground(new java.awt.Color(9, 9, 11));
        jpExit.setForeground(new java.awt.Color(9, 9, 11));
        jpExit.setOpaque(false);
        jpExit.setPreferredSize(new java.awt.Dimension(40, 40));

        txtExit.setBackground(new java.awt.Color(255, 255, 255));
        txtExit.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        txtExit.setForeground(new java.awt.Color(255, 255, 255));
        txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit.setText("x");
        txtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtExitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpExitLayout = new javax.swing.GroupLayout(jpExit);
        jpExit.setLayout(jpExitLayout);
        jpExitLayout.setHorizontalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpExitLayout.setVerticalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(jpExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 960, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(jpExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        jpIngresarDatos.setOpaque(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTitulo.setText("Titulo");

        tfTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPublic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPublic.setText("Fecha Publicación");

        txtConsola.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtConsola.setText("Consola");

        tfConsola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtGenero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtGenero.setText("Genero");

        txtFormato.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFormato.setText("Formato");

        cbGenero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terror", "RPG", "Aventuras", "Acción", "Infantil", "Musical" }));
        cbGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setText("Digital");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Físico");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Coleccionista");

        txtDirector.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDirector.setText("Director");

        tfDirector.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jDatePlay.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jpIngresarDatosLayout = new javax.swing.GroupLayout(jpIngresarDatos);
        jpIngresarDatos.setLayout(jpIngresarDatosLayout);
        jpIngresarDatosLayout.setHorizontalGroup(
            jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresarDatosLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIngresarDatosLayout.createSequentialGroup()
                        .addGroup(jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGenero)
                            .addComponent(txtTitulo)
                            .addComponent(txtConsola)
                            .addComponent(txtPublic)
                            .addComponent(txtFormato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                        .addGroup(jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIngresarDatosLayout.createSequentialGroup()
                                .addGroup(jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTitulo)
                                    .addComponent(cbGenero, 0, 213, Short.MAX_VALUE)
                                    .addComponent(tfConsola)
                                    .addComponent(jDatePlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIngresarDatosLayout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox2)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox3)
                                .addGap(21, 21, 21))))
                    .addGroup(jpIngresarDatosLayout.createSequentialGroup()
                        .addComponent(txtDirector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jpIngresarDatosLayout.setVerticalGroup(
            jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPublic)
                    .addComponent(jDatePlay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConsola)
                    .addComponent(tfConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero)
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIngresarDatosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtFormato))
                    .addGroup(jpIngresarDatosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3))))
                .addGap(18, 18, 18)
                .addGroup(jpIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDirector)
                    .addComponent(tfDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jpIngresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 490, 300));

        jList1.setEnabled(false);
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 320, 150));

        jpBotones.setOpaque(false);

        btnNuevo.setBackground(new java.awt.Color(48, 18, 7));
        btnNuevo.setForeground(new java.awt.Color(49, 78, 146));
        btnNuevo.setToolTipText("");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNuevoMousePressed(evt);
            }
        });

        txtNuevo.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtNuevo.setForeground(new java.awt.Color(224, 124, 48));
        txtNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNuevo.setText("Nuevo");
        txtNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNuevoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnNuevoLayout = new javax.swing.GroupLayout(btnNuevo);
        btnNuevo.setLayout(btnNuevoLayout);
        btnNuevoLayout.setHorizontalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNuevoLayout.createSequentialGroup()
                .addComponent(txtNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnNuevoLayout.setVerticalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnEliminar.setBackground(new java.awt.Color(48, 18, 7));
        btnEliminar.setForeground(new java.awt.Color(49, 78, 146));
        btnEliminar.setToolTipText("");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
        });

        txtEliminar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(224, 124, 48));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("Eliminar");
        txtEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEliminarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnConsultar.setBackground(new java.awt.Color(48, 18, 7));
        btnConsultar.setForeground(new java.awt.Color(49, 78, 146));
        btnConsultar.setToolTipText("");
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConsultarMousePressed(evt);
            }
        });

        txtConsultar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtConsultar.setForeground(new java.awt.Color(224, 124, 48));
        txtConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtConsultar.setText("Consultar");
        txtConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtConsultarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtConsultarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnConsultarLayout = new javax.swing.GroupLayout(btnConsultar);
        btnConsultar.setLayout(btnConsultarLayout);
        btnConsultarLayout.setHorizontalGroup(
            btnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConsultarLayout.createSequentialGroup()
                .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnConsultarLayout.setVerticalGroup(
            btnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnEditar.setBackground(new java.awt.Color(48, 18, 7));
        btnEditar.setForeground(new java.awt.Color(49, 78, 146));
        btnEditar.setToolTipText("");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditarMousePressed(evt);
            }
        });

        txtEditar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtEditar.setForeground(new java.awt.Color(224, 124, 48));
        txtEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEditar.setText("Editar");
        txtEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEditarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEditarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEditarLayout.createSequentialGroup()
                .addComponent(txtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnEnviar.setBackground(new java.awt.Color(48, 18, 7));
        btnEnviar.setForeground(new java.awt.Color(49, 78, 146));
        btnEnviar.setToolTipText("");
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEnviarMousePressed(evt);
            }
        });

        txtEnviar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtEnviar.setForeground(new java.awt.Color(224, 124, 48));
        txtEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEnviar.setText("Guardar");
        txtEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEnviarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEnviarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnEnviarLayout = new javax.swing.GroupLayout(btnEnviar);
        btnEnviar.setLayout(btnEnviarLayout);
        btnEnviarLayout.setHorizontalGroup(
            btnEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEnviarLayout.createSequentialGroup()
                .addComponent(txtEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnEnviarLayout.setVerticalGroup(
            btnEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpBotonesLayout = new javax.swing.GroupLayout(jpBotones);
        jpBotones.setLayout(jpBotonesLayout);
        jpBotonesLayout.setHorizontalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotonesLayout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotonesLayout.createSequentialGroup()
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotonesLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel1.add(jpBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 450, 130));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/16226731252609.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        //jpExit.setBackground(Color.red);
        txtExit.setForeground(Color.red);
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        jpExit.setBackground(new Color(9,9,11));
        txtExit.setForeground(Color.white);
    }//GEN-LAST:event_txtExitMouseExited

    private void txtExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExitMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen(), y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void txtNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoMouseEntered
        btnNuevo.setBackground(new Color(159,165,181));
        txtNuevo.setForeground(Color.white);
    }//GEN-LAST:event_txtNuevoMouseEntered

    private void txtNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoMouseExited
        btnNuevo.setBackground(new Color(48,18,7));
        txtNuevo.setForeground(new Color(224,124,48));
    }//GEN-LAST:event_txtNuevoMouseExited

    private void txtNuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoMousePressed

    private void btnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoMouseExited

    private void btnNuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoMousePressed

    private void txtEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseEntered
        btnEliminar.setBackground(new Color(159,165,181));
        txtEliminar.setForeground(Color.white);
    }//GEN-LAST:event_txtEliminarMouseEntered

    private void txtEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseExited
        btnEliminar.setBackground(new Color(48,18,7));
        txtEliminar.setForeground(new Color(224,124,48));
    }//GEN-LAST:event_txtEliminarMouseExited

    private void txtEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarMousePressed

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMousePressed

    private void txtConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultarMouseEntered
        btnConsultar.setBackground(new Color(159,165,181));
        txtConsultar.setForeground(Color.white);
    }//GEN-LAST:event_txtConsultarMouseEntered

    private void txtConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultarMouseExited
        btnConsultar.setBackground(new Color(48,18,7));
        txtConsultar.setForeground(new Color(224,124,48));
    }//GEN-LAST:event_txtConsultarMouseExited

    private void txtConsultarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarMousePressed

    private void btnConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarMouseExited

    private void btnConsultarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarMousePressed

    private void txtEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEditarMouseEntered
        btnEditar.setBackground(new Color(159,165,181));
        txtEditar.setForeground(Color.white);
    }//GEN-LAST:event_txtEditarMouseEntered

    private void txtEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEditarMouseExited
        btnEditar.setBackground(new Color(48,18,7));
        txtEditar.setForeground(new Color(224,124,48));
    }//GEN-LAST:event_txtEditarMouseExited

    private void txtEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEditarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditarMousePressed

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarMousePressed

    private void txtEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnviarMouseEntered
        btnEnviar.setBackground(new Color(159,165,181));
        txtEnviar.setForeground(Color.white);
    }//GEN-LAST:event_txtEnviarMouseEntered

    private void txtEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnviarMouseExited
        btnEnviar.setBackground(new Color(48,18,7));
        txtEnviar.setForeground(new Color(224,124,48));
    }//GEN-LAST:event_txtEnviarMouseExited

    private void txtEnviarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnviarMousePressed

    }//GEN-LAST:event_txtEnviarMousePressed

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited

    }//GEN-LAST:event_btnEnviarMouseExited

    private void btnEnviarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMousePressed

    }//GEN-LAST:event_btnEnviarMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crudPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudPlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel btnConsultar;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnEnviar;
    private javax.swing.JPanel btnNuevo;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private com.toedter.calendar.JDateChooser jDatePlay;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpIngresarDatos;
    private javax.swing.JTextField tfConsola;
    private javax.swing.JTextField tfDirector;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JLabel txtConsola;
    private javax.swing.JLabel txtConsultar;
    private javax.swing.JLabel txtDirector;
    private javax.swing.JLabel txtEditar;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtEnviar;
    private javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtFormato;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JLabel txtNuevo;
    private javax.swing.JLabel txtPublic;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
