
package p;

public class Series_or_Crom extends javax.swing.JFrame {

    Periodic_Table pt = new Periodic_Table();
    int count = 1, xMouse, yMouse;
    String[] img_path = {"", "sc_1.png", "sc_2.png", "sc_3.png", "sc_4.png",  "sc_5.png", "sc_6.png", "sc_7.png", "sc_8.png", "sc_9.png", "sc_10.png"};
   
    public Series_or_Crom() {
        initComponents();
        this.setIconImage(pt.changeIcon());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        cross = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        titlebar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        image_viwer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setText("  ");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, -1, 26, 24));

        cross.setText("  ");
        cross.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossMouseClicked(evt);
            }
        });
        jPanel1.add(cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, -1, 26, 24));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p/back.png"))); // NOI18N
        back.setText(" ");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 60, 30));

        titlebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p/sn_titelbar.png"))); // NOI18N
        titlebar.setText("jLabel1");
        titlebar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titlebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titlebarMousePressed(evt);
            }
        });
        titlebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titlebarMouseDragged(evt);
            }
        });
        jPanel1.add(titlebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 940, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p/sn_left.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 214, 30, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p/sn_right.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 214, 30, 40));

        image_viwer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p/sc_1.png"))); // NOI18N
        image_viwer.setText("jLabel1");
        jPanel1.add(image_viwer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 490));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (count < 10) {
            count++;
        }
        image_viwer.setIcon(pt.showImage(img_path[count]));
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (count > 1) {
            count--;
        }
        image_viwer.setIcon(pt.showImage(img_path[count]));
    }//GEN-LAST:event_jLabel2MouseClicked

    private void titlebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_titlebarMousePressed

    private void titlebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_titlebarMouseDragged

    private void crossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossMouseClicked
        System.exit(0);
    }//GEN-LAST:event_crossMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(Series_or_Crom.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        new MenuBar().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(Series_or_Crom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Series_or_Crom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Series_or_Crom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Series_or_Crom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Series_or_Crom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel cross;
    private javax.swing.JLabel image_viwer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel titlebar;
    // End of variables declaration//GEN-END:variables
}
