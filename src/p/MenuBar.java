
package p;
import java.io.IOException;
public class MenuBar extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    Periodic_Table pt = new Periodic_Table();
    public MenuBar() {
        initComponents();
        this.setIconImage(pt.changeIcon());
       /// BackGround.setIcon(pt.showImage("menu_bar.png"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        level_list = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        side_bar = new javax.swing.JLabel();
        btn_cross = new javax.swing.JLabel();
        btn_minimize = new javax.swing.JLabel();
        btn_periodic_table = new javax.swing.JLabel();
        btn_metal = new javax.swing.JLabel();
        btn_shortcut = new javax.swing.JLabel();
        btn_more_shortcut = new javax.swing.JLabel();
        btn_list = new javax.swing.JLabel();
        btn_sonket = new javax.swing.JLabel();
        btn_inventor = new javax.swing.JLabel();
        btn_me = new javax.swing.JLabel();
        btn_different_name = new javax.swing.JLabel();
        btn_more_option = new javax.swing.JLabel();
        level_pt = new javax.swing.JLabel();
        level_metal = new javax.swing.JLabel();
        level_shortcut = new javax.swing.JLabel();
        level_more_shortcut = new javax.swing.JLabel();
        level_sonket = new javax.swing.JLabel();
        level_inventor = new javax.swing.JLabel();
        level_me = new javax.swing.JLabel();
        level_different_name = new javax.swing.JLabel();
        level_more_option = new javax.swing.JLabel();
        list_level = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        level_list.setText(" ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(908, 515));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_bar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        side_bar.setForeground(new java.awt.Color(255, 255, 0));
        side_bar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        side_bar.setText("Menubar");
        side_bar.setAlignmentY(0.0F);
        side_bar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        side_bar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        side_bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                side_barMouseDragged(evt);
            }
        });
        side_bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                side_barMousePressed(evt);
            }
        });
        jPanel1.add(side_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 23));

        btn_cross.setText(" ");
        btn_cross.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crossMouseClicked(evt);
            }
        });
        jPanel1.add(btn_cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 3, 20, 20));

        btn_minimize.setText(" ");
        btn_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(btn_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 3, 20, 20));

        btn_periodic_table.setText(" ");
        btn_periodic_table.setAlignmentY(0.0F);
        btn_periodic_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_periodic_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_periodic_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_periodic_tableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_periodic_tableMouseExited(evt);
            }
        });
        jPanel1.add(btn_periodic_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 80, 314, 40));

        btn_metal.setText(" ");
        btn_metal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_metal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_metalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_metalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_metalMouseExited(evt);
            }
        });
        jPanel1.add(btn_metal, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 80, 314, 40));

        btn_shortcut.setText(" ");
        btn_shortcut.setAlignmentY(0.0F);
        btn_shortcut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_shortcut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_shortcutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_shortcutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_shortcutMouseExited(evt);
            }
        });
        jPanel1.add(btn_shortcut, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 158, 314, 40));

        btn_more_shortcut.setText(" ");
        btn_more_shortcut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_more_shortcut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_more_shortcutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_more_shortcutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_more_shortcutMouseExited(evt);
            }
        });
        jPanel1.add(btn_more_shortcut, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 158, 314, 40));

        btn_list.setAlignmentY(0.0F);
        btn_list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_listMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_listMouseExited(evt);
            }
        });
        jPanel1.add(btn_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 235, 314, 40));

        btn_sonket.setText(" ");
        btn_sonket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sonket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sonketMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sonketMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sonketMouseExited(evt);
            }
        });
        jPanel1.add(btn_sonket, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 235, 314, 40));

        btn_inventor.setText(" ");
        btn_inventor.setAlignmentY(0.0F);
        btn_inventor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inventor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inventorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inventorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inventorMouseExited(evt);
            }
        });
        jPanel1.add(btn_inventor, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 317, 314, 40));

        btn_me.setText(" ");
        btn_me.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_me.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_meMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_meMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_meMouseExited(evt);
            }
        });
        jPanel1.add(btn_me, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 317, 314, 40));

        btn_different_name.setText(" ");
        btn_different_name.setAlignmentY(0.0F);
        btn_different_name.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_different_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_different_nameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_different_nameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_different_nameMouseExited(evt);
            }
        });
        jPanel1.add(btn_different_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 399, 314, 40));

        btn_more_option.setText(" ");
        btn_more_option.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_more_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_more_optionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_more_optionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_more_optionMouseExited(evt);
            }
        });
        jPanel1.add(btn_more_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 399, 314, 40));

        level_pt.setText(" ");
        jPanel1.add(level_pt, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 65, 370, 70));

        level_metal.setText(" ");
        level_metal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level_metalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level_metalMouseExited(evt);
            }
        });
        jPanel1.add(level_metal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 65, 370, 70));

        level_shortcut.setText(" ");
        jPanel1.add(level_shortcut, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 144, 370, 70));

        level_more_shortcut.setText(" ");
        jPanel1.add(level_more_shortcut, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 144, 370, 70));

        level_sonket.setText(" ");
        jPanel1.add(level_sonket, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 370, 70));

        level_inventor.setText(" ");
        jPanel1.add(level_inventor, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 300, 370, 70));

        level_me.setText(" ");
        jPanel1.add(level_me, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 370, 70));

        level_different_name.setText(" ");
        jPanel1.add(level_different_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 384, 370, 70));

        level_more_option.setText(" ");
        jPanel1.add(level_more_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 384, 370, 70));

        list_level.setText(" ");
        jPanel1.add(list_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 222, 370, 70));

        BackGround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p/menu_bar.png"))); // NOI18N
        jPanel1.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 906, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crossMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_crossMouseClicked

    private void btn_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseClicked
        this.setState(MenuBar.ICONIFIED);
    }//GEN-LAST:event_btn_minimizeMouseClicked

    private void side_barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_barMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_side_barMouseDragged

    private void side_barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_barMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_side_barMousePressed

    private void btn_periodic_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_periodic_tableMouseEntered
        level_pt.setIcon(pt.showImage("pt.png"));
    }//GEN-LAST:event_btn_periodic_tableMouseEntered

    private void btn_periodic_tableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_periodic_tableMouseExited
        level_pt.setIcon(pt.showImage(""));
    }//GEN-LAST:event_btn_periodic_tableMouseExited

    private void level_metalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_metalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_level_metalMouseEntered

    private void level_metalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_metalMouseExited
       // level_metal.setIcon(pt.showImage(""));
    }//GEN-LAST:event_level_metalMouseExited

    private void btn_metalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_metalMouseEntered
        level_metal.setIcon(pt.showImage("mnm.png"));
    }//GEN-LAST:event_btn_metalMouseEntered

    private void btn_metalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_metalMouseExited
        level_metal.setIcon(pt.showImage(""));
    }//GEN-LAST:event_btn_metalMouseExited

    private void btn_shortcutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_shortcutMouseEntered
        level_shortcut.setIcon(pt.showImage("st.png"));
    }//GEN-LAST:event_btn_shortcutMouseEntered

    private void btn_shortcutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_shortcutMouseExited
        level_shortcut.setIcon(pt.showImage(""));
    }//GEN-LAST:event_btn_shortcutMouseExited

    private void btn_more_shortcutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_more_shortcutMouseEntered
        level_more_shortcut.setIcon(pt.showImage("mst.png"));
    }//GEN-LAST:event_btn_more_shortcutMouseEntered

    private void btn_more_shortcutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_more_shortcutMouseExited
        level_more_shortcut.setIcon(pt.showImage(""));
    }//GEN-LAST:event_btn_more_shortcutMouseExited

    private void btn_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listMouseEntered
        list_level.setIcon(pt.showImage("list.png"));
    }//GEN-LAST:event_btn_listMouseEntered

    private void btn_listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listMouseExited
        list_level.setIcon(pt.showImage(""));
    }//GEN-LAST:event_btn_listMouseExited

    private void btn_sonketMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sonketMouseEntered
        level_sonket.setIcon(pt.showImage("s&a.png"));
    }//GEN-LAST:event_btn_sonketMouseEntered

    private void btn_sonketMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sonketMouseExited
        level_sonket.setIcon(pt.showImage(""));
    }//GEN-LAST:event_btn_sonketMouseExited

    private void btn_inventorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventorMouseEntered
        level_inventor.setIcon(pt.showImage("inventor.png"));
    }//GEN-LAST:event_btn_inventorMouseEntered

    private void btn_inventorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventorMouseExited
        level_inventor.setIcon(pt.showImage(""));
    }//GEN-LAST:event_btn_inventorMouseExited

    private void btn_meMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_meMouseEntered
        level_me.setIcon(pt.showImage("and_me.png"));
    }//GEN-LAST:event_btn_meMouseEntered

    private void btn_meMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_meMouseExited
        level_me.setIcon(pt.showImage(""));
    }//GEN-LAST:event_btn_meMouseExited

    private void btn_different_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_different_nameMouseEntered
        level_different_name.setIcon(pt.showImage("different_name.png"));
    }//GEN-LAST:event_btn_different_nameMouseEntered

    private void btn_different_nameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_different_nameMouseExited
        level_different_name.setIcon(pt.showImage(""));
    }//GEN-LAST:event_btn_different_nameMouseExited

    private void btn_more_optionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_more_optionMouseEntered
        level_more_option.setIcon(pt.showImage("more_option.png"));
    }//GEN-LAST:event_btn_more_optionMouseEntered

    private void btn_more_optionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_more_optionMouseExited
        level_more_option.setIcon(pt.showImage(""));
    }//GEN-LAST:event_btn_more_optionMouseExited

    private void btn_periodic_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_periodic_tableMouseClicked
        dispose();
        pt.setVisible(true);
    }//GEN-LAST:event_btn_periodic_tableMouseClicked

    private void btn_metalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_metalMouseClicked
        dispose();
        new MetalAndNonMetal().setVisible(true);
    }//GEN-LAST:event_btn_metalMouseClicked

    private void btn_shortcutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_shortcutMouseClicked
        dispose();
        new ShortcutTecnic().setVisible(true);
    }//GEN-LAST:event_btn_shortcutMouseClicked

    private void btn_more_shortcutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_more_shortcutMouseClicked
        dispose();
        new OtherShortCutTechnic().setVisible(true);
    }//GEN-LAST:event_btn_more_shortcutMouseClicked

    private void btn_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listMouseClicked
        dispose();
        new List_Of_Element().setVisible(true);
    }//GEN-LAST:event_btn_listMouseClicked

    private void btn_sonketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sonketMouseClicked
//       String filePath = "Sonket and  Akorik.exe";
//        try {
//             
//            Process p = Runtime.getRuntime().exec(filePath);
//             
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            java.net.URL link = getClass().getResource("Sonket and Akorik.exe");
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+link);
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_btn_sonketMouseClicked

    private void btn_inventorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventorMouseClicked
        dispose();
        new Information().setVisible(true);
    }//GEN-LAST:event_btn_inventorMouseClicked

    private void btn_meMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_meMouseClicked
        dispose();
        new Me().setVisible(true);
    }//GEN-LAST:event_btn_meMouseClicked

    private void btn_different_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_different_nameMouseClicked
        dispose();
        new Same_Name().setVisible(true);
    }//GEN-LAST:event_btn_different_nameMouseClicked

    private void btn_more_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_more_optionMouseClicked
        dispose();
        new Series_or_Crom().setVisible(true);
    }//GEN-LAST:event_btn_more_optionMouseClicked

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
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel btn_cross;
    private javax.swing.JLabel btn_different_name;
    private javax.swing.JLabel btn_inventor;
    private javax.swing.JLabel btn_list;
    private javax.swing.JLabel btn_me;
    private javax.swing.JLabel btn_metal;
    private javax.swing.JLabel btn_minimize;
    private javax.swing.JLabel btn_more_option;
    private javax.swing.JLabel btn_more_shortcut;
    private javax.swing.JLabel btn_periodic_table;
    private javax.swing.JLabel btn_shortcut;
    private javax.swing.JLabel btn_sonket;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel level_different_name;
    private javax.swing.JLabel level_inventor;
    private javax.swing.JLabel level_list;
    private javax.swing.JLabel level_me;
    private javax.swing.JLabel level_metal;
    private javax.swing.JLabel level_more_option;
    private javax.swing.JLabel level_more_shortcut;
    private javax.swing.JLabel level_pt;
    private javax.swing.JLabel level_shortcut;
    private javax.swing.JLabel level_sonket;
    private javax.swing.JLabel list_level;
    private javax.swing.JLabel side_bar;
    // End of variables declaration//GEN-END:variables
}
