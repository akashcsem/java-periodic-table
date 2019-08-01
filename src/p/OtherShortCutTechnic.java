

package p;

public class OtherShortCutTechnic extends javax.swing.JFrame {

    
    Periodic_Table pt = new Periodic_Table();
    int count = 0, slide=2, buttonClick=1, start=0;
    String[] img_path = {"", "1.png", "2.png", "3.png", "4.png",  "5.png", "6.png", "7.png", "8.png", "9.png", "10.png", "11.png", "12.png", "13.png", "14.png", "15.png", "16.png", "17.png", "18.png", "19.png", "20.png", "21.png", "22.png", "23.png", "24.png", "25.png", "26.png", "27.png", "28.png", "29.png", "30.png", "31.png", "32.png", "33.png", "34.png", "35.png", "36.png", "37.png", "38.png", "39.png", "40.png", "41.png", "42.png", "43.png", "44.png", "45.png", "46.png", "47.png", "48.png"};
    public OtherShortCutTechnic() {
        initComponents();
        this.setIconImage(pt.changeIcon());
        Background.setIcon(pt.showImage("osct_background.jpg"));
    }
    
    public void SlideShow() {
        //slide = 1;
        if(start==0) {
            count++;
            start++;
        }
        new Thread() {
            @Override
            public void run() {
                try{
                    while(buttonClick == 2) {
                        imageShow(count);
                        if(count==48)
                            starButton.setIcon(pt.showImage("star.gif"));
                        else 
                            starButton.setIcon(pt.showImage(""));
                        sleep(1500);
                        count++;
                    }
                } catch(Exception e) {
                    
                }
            }
        }.start();
    }
    void imageShow(int range) {
        SlideShow.setIcon(pt.showImage(img_path[range]));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_slide = new javax.swing.JButton();
        btn_slide_stop = new javax.swing.JButton();
        btn_previous = new javax.swing.JButton();
        starButton = new javax.swing.JLabel();
        SlideShow = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("More  Shortcut Technic");
        setPreferredSize(new java.awt.Dimension(790, 447));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(790, 422));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setBackground(new java.awt.Color(0, 255, 204));
        btn_back.setText("Back");
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 70, -1));

        btn_next.setBackground(new java.awt.Color(0, 255, 204));
        btn_next.setText("Next");
        btn_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        jPanel1.add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 10, 60, -1));

        btn_slide.setBackground(new java.awt.Color(0, 255, 204));
        btn_slide.setText("Slide Show");
        btn_slide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_slide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_slideActionPerformed(evt);
            }
        });
        jPanel1.add(btn_slide, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        btn_slide_stop.setBackground(new java.awt.Color(0, 255, 204));
        btn_slide_stop.setText("Stop Slide");
        btn_slide_stop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_slide_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_slide_stopActionPerformed(evt);
            }
        });
        jPanel1.add(btn_slide_stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        btn_previous.setBackground(new java.awt.Color(0, 255, 204));
        btn_previous.setText("Previous");
        btn_previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previousActionPerformed(evt);
            }
        });
        jPanel1.add(btn_previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        starButton.setText(" ");
        jPanel1.add(starButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 60, 60));

        SlideShow.setText("  ");
        SlideShow.setPreferredSize(new java.awt.Dimension(806, 422));
        jPanel1.add(SlideShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 420));

        Background.setText(" ");
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        dispose();
        pt.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        slide = 2;
        if (count < 48) {
            count++;
        }
        if (count < 49) {
            imageShow(count);
        }

        if (count == 48) {
            starButton.setIcon(pt.showImage("star.gif"));
        } else {
            starButton.setIcon(pt.showImage(""));
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previousActionPerformed
        slide = 2;
        if (count > 0) {
            count--;
        }
        if (count > 0) {
            imageShow(count);
        }
        if (count == 48) {
            starButton.setIcon(pt.showImage("star.gif"));
        } else {
            starButton.setIcon(pt.showImage(""));
        }
    }//GEN-LAST:event_btn_previousActionPerformed

    private void btn_slideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_slideActionPerformed
       // slide = count;
        if(slide != 1) {
            buttonClick = 2;
            SlideShow();
        }
        
    }//GEN-LAST:event_btn_slideActionPerformed

    private void btn_slide_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_slide_stopActionPerformed
        slide=2;
        buttonClick = 1;
    }//GEN-LAST:event_btn_slide_stopActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OtherShortCutTechnic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel SlideShow;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_previous;
    private javax.swing.JButton btn_slide;
    private javax.swing.JButton btn_slide_stop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel starButton;
    // End of variables declaration//GEN-END:variables
}
