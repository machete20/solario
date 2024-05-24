package javaapplication1; 

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        buttonGroup1.add(mercurio);
        buttonGroup1.add(venus);
        buttonGroup1.add(tierra);
        buttonGroup1.add(marte);
        buttonGroup1.add(jupiter);
        buttonGroup1.add(saturno);
        buttonGroup1.add(urano);
        buttonGroup1.add(neptuno);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tituloo = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        marte = new javax.swing.JButton();
        mercurio = new javax.swing.JButton();
        tierra = new javax.swing.JButton();
        venus = new javax.swing.JButton();
        jupiter = new javax.swing.JButton();
        saturno = new javax.swing.JButton();
        urano = new javax.swing.JButton();
        neptuno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipos = new javax.swing.JLabel();
        radios = new javax.swing.JLabel();
        temperaturas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(60, 85, 186));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(new java.awt.Color(0, 6, 22));
        setResizable(false);

        tituloo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tituloo.setText("PRÁCTICA INTERMODULAR - SISTEMA SOLAR");

        nombre2.setText("Estrella Sol:");

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/sol.png"))); // NOI18N

        marte.setBackground(new java.awt.Color(255, 0, 0));
        marte.setForeground(new java.awt.Color(255, 255, 255));
        marte.setText("Marte");
        marte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marteActionPerformed(evt);
            }
        });

        mercurio.setBackground(new java.awt.Color(77, 39, 0));
        mercurio.setForeground(new java.awt.Color(255, 255, 255));
        mercurio.setText("Mercurio");
        mercurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercurioActionPerformed(evt);
            }
        });

        tierra.setBackground(new java.awt.Color(102, 153, 255));
        tierra.setForeground(new java.awt.Color(255, 102, 0));
        tierra.setText("Tierra");
        tierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tierraActionPerformed(evt);
            }
        });

        venus.setBackground(new java.awt.Color(56, 57, 58));
        venus.setForeground(new java.awt.Color(255, 255, 255));
        venus.setText("Venus");
        venus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venusActionPerformed(evt);
            }
        });

        jupiter.setBackground(new java.awt.Color(255, 144, 62));
        jupiter.setForeground(new java.awt.Color(255, 255, 255));
        jupiter.setText("Jupiter");
        jupiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupiterActionPerformed(evt);
            }
        });

        saturno.setBackground(new java.awt.Color(255, 204, 153));
        saturno.setText("Saturno");
        saturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturnoActionPerformed(evt);
            }
        });

        urano.setBackground(new java.awt.Color(0, 153, 255));
        urano.setForeground(new java.awt.Color(255, 255, 255));
        urano.setText("Urano");
        urano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uranoActionPerformed(evt);
            }
        });

        neptuno.setBackground(new java.awt.Color(0, 0, 204));
        neptuno.setForeground(new java.awt.Color(255, 255, 255));
        neptuno.setText("Neptuno");
        neptuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neptunoActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo: ");

        jLabel3.setText("Radio:");

        jLabel4.setText("Temperatura: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mercurio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tierra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(marte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(venus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(neptuno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jupiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saturno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(urano, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloo)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(radios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(temperaturas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(tipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(554, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(tituloo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nombre2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jupiter)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saturno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(urano)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(neptuno))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mercurio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(venus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tierra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(marte))))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(temperaturas))
                .addGap(119, 119, 119))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mercurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mercurioActionPerformed
        nombre.setText("Mercurio");
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/mercurio.png"))); // NOI18N
        Trabajo.mercurio();
      
    }//GEN-LAST:event_mercurioActionPerformed

    private void venusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venusActionPerformed
        nombre.setText("Venus");
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/venus.png"))); // NOI18N
    }//GEN-LAST:event_venusActionPerformed

    private void tierraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tierraActionPerformed
        nombre.setText("Tierra");
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/tierra.png"))); // NOI18N
    }//GEN-LAST:event_tierraActionPerformed

    private void marteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marteActionPerformed
        nombre.setText("Marte");
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/marte.png"))); // NOI18N
    }//GEN-LAST:event_marteActionPerformed

    private void jupiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupiterActionPerformed
        nombre.setText("Jupiter");
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/jupiter.png"))); // NOI18N
    }//GEN-LAST:event_jupiterActionPerformed

    private void saturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturnoActionPerformed
        nombre.setText("Saturno");
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/saturno.png"))); // NOI18N
    }//GEN-LAST:event_saturnoActionPerformed

    private void uranoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uranoActionPerformed
        nombre.setText("Urano");
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/urano.png"))); // NOI18N
    }//GEN-LAST:event_uranoActionPerformed

    private void neptunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neptunoActionPerformed
        nombre.setText("Neptuno");
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/neptuno.png"))); // NOI18N
    }//GEN-LAST:event_neptunoActionPerformed

    
   
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Ventana().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel img;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jupiter;
    private javax.swing.JButton marte;
    private javax.swing.JButton mercurio;
    private javax.swing.JButton neptuno;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel radios;
    private javax.swing.JButton saturno;
    private javax.swing.JLabel temperaturas;
    private javax.swing.JButton tierra;
    private javax.swing.JLabel tipos;
    private javax.swing.JLabel tituloo;
    private javax.swing.JButton urano;
    private javax.swing.JButton venus;
    // End of variables declaration//GEN-END:variables
}
