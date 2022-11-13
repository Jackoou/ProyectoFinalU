package com.Frames;


import java.awt.Color;

public class LoginGaming extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    SeleccionConsola segundoFrame = new SeleccionConsola();
    
    public LoginGaming() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgPanda = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jpExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        ImagenJuegos = new javax.swing.JLabel();
        DatosIngreso = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JPanel();
        txtEntrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgPanda.setBackground(new java.awt.Color(0, 0, 0));
        imgPanda.setForeground(new java.awt.Color(204, 204, 0));
        imgPanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/220px-Panda3D_Logo.png"))); // NOI18N
        jPanel1.add(imgPanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

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

        ImagenJuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/840_560.jpeg"))); // NOI18N
        ImagenJuegos.setText("jLabel1");
        jPanel1.add(ImagenJuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 560));

        DatosIngreso.setBackground(new java.awt.Color(51, 102, 255));

        txtTitulo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("PROGAMING");

        txtUsuario.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtUsuario.setText("USUARIO");

        tfUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(204, 204, 204));
        tfUsuario.setText("Ingrese el nombre de usuario");
        tfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfUsuarioMousePressed(evt);
            }
        });
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });

        txtContraseña.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtContraseña.setText("CONTRASEÑA");

        tfPassword.setForeground(new java.awt.Color(204, 204, 204));
        tfPassword.setText("123456789");
        tfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfPasswordMousePressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(49, 78, 146));
        btnLogin.setForeground(new java.awt.Color(49, 78, 146));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoginMousePressed(evt);
            }
        });

        txtEntrar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtEntrar.setForeground(new java.awt.Color(255, 255, 255));
        txtEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEntrar.setText("Entrar");
        txtEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEntrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEntrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                .addComponent(txtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                .addComponent(txtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DatosIngresoLayout = new javax.swing.GroupLayout(DatosIngreso);
        DatosIngreso.setLayout(DatosIngresoLayout);
        DatosIngresoLayout.setHorizontalGroup(
            DatosIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosIngresoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(DatosIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosIngresoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtContraseña)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUsuario)
                        .addComponent(tfUsuario)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        DatosIngresoLayout.setVerticalGroup(
            DatosIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosIngresoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );

        jPanel1.add(DatosIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 270, 560));

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

    private void txtExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExitMousePressed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen(), y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        jpExit.setBackground(Color.red);
        txtExit.setForeground(Color.black);
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        jpExit.setBackground(new Color(9,9,11));
        txtExit.setForeground(Color.white);
    }//GEN-LAST:event_txtExitMouseExited

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited

    }//GEN-LAST:event_btnLoginMouseExited

    private void txtEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEntrarMousePressed
        if(tfUsuario.getText().equals("Ingrese el nombre de usuario") || tfUsuario.getText().equals("")){ 
            javax.swing.JOptionPane.showMessageDialog(this, "El campo de Nombre no puede estar vacio.", "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else if(String.valueOf(tfPassword.getPassword()).equals("123456789") || String.valueOf(tfPassword.getPassword()).isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "El campo de Password no puede estar vacio.", "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            //javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " +tfUsuario.getText()+ "\nContraseña: "+ String.valueOf(tfPassword.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            //Aquí cambia de JFrame
            this.setVisible(false);
            segundoFrame.setVisible(true);
        }
        segundoFrame.tfUsuario.setText(tfUsuario.getText());
    }//GEN-LAST:event_txtEntrarMousePressed

    private void txtEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEntrarMouseExited
        btnLogin.setBackground(new Color(49,78,146));
        txtEntrar.setForeground(Color.white);
    }//GEN-LAST:event_txtEntrarMouseExited

    private void txtEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEntrarMouseEntered
        btnLogin.setBackground(new Color(173,181,227));
        txtEntrar.setForeground(Color.black);
    }//GEN-LAST:event_txtEntrarMouseEntered

    private void tfPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPasswordMousePressed
        if(String.valueOf(tfPassword.getPassword()).equals("123456789")){
            tfPassword.setText("");
            tfPassword.setForeground(Color.black);
        }
        if(tfUsuario.getText().isEmpty()){
            tfUsuario.setText("Ingrese el nombre de usuario");
            tfUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfPasswordMousePressed

    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed
        
    }//GEN-LAST:event_btnLoginMousePressed

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void tfUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsuarioMousePressed
        if(tfUsuario.getText().equals("Ingrese el nombre de usuario")){
            tfUsuario.setText("");
            tfUsuario.setForeground(Color.black);
        }
        if(String.valueOf(tfPassword.getPassword()).isEmpty()){
            tfPassword.setText("123456789");
            tfPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfUsuarioMousePressed

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
            java.util.logging.Logger.getLogger(LoginGaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGaming().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosIngreso;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel ImagenJuegos;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JLabel imgPanda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsuario;
    private javax.swing.JLabel txtContraseña;
    private javax.swing.JLabel txtEntrar;
    private javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
    
}
