package p;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;

public class Periodic_Table extends javax.swing.JFrame {

    String imageName="Images/";
    public Periodic_Table() {
        initComponents();
        //changeIcon();
        this.setIconImage(changeIcon());
        this.setTitle("Periodic Table");
        LabelArro1.setIcon(showImage("arro.gif"));
        LabelArro2.setIcon(showImage("arro.gif"));
        chaktiButton.setIcon(showImage("chakti.gif"));
        metalButton.setIcon(showImage("metalButton.png"));
        shortCutButton.setIcon(showImage("shortcutButon.jpg"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton169 = new javax.swing.JButton();
        jButton170 = new javax.swing.JButton();
        jButton171 = new javax.swing.JButton();
        jButton172 = new javax.swing.JButton();
        jButton173 = new javax.swing.JButton();
        jButton174 = new javax.swing.JButton();
        jButton175 = new javax.swing.JButton();
        jButton176 = new javax.swing.JButton();
        jButton177 = new javax.swing.JButton();
        jButton178 = new javax.swing.JButton();
        jButton179 = new javax.swing.JButton();
        jButton180 = new javax.swing.JButton();
        jButton181 = new javax.swing.JButton();
        jButton182 = new javax.swing.JButton();
        jButton183 = new javax.swing.JButton();
        jButton184 = new javax.swing.JButton();
        jButton185 = new javax.swing.JButton();
        jButton186 = new javax.swing.JButton();
        jButton187 = new javax.swing.JButton();
        jButton188 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton190 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn88 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn55 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn56 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        jButton201 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn72 = new javax.swing.JButton();
        btn104 = new javax.swing.JButton();
        btn73 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn47 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn75 = new javax.swing.JButton();
        btn76 = new javax.swing.JButton();
        btn74 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn106 = new javax.swing.JButton();
        btn105 = new javax.swing.JButton();
        btn107 = new javax.swing.JButton();
        btn77 = new javax.swing.JButton();
        btn108 = new javax.swing.JButton();
        jButton132 = new javax.swing.JButton();
        btn109 = new javax.swing.JButton();
        btn80 = new javax.swing.JButton();
        btn78 = new javax.swing.JButton();
        btn79 = new javax.swing.JButton();
        btn111 = new javax.swing.JButton();
        btn110 = new javax.swing.JButton();
        jButton202 = new javax.swing.JButton();
        jButton203 = new javax.swing.JButton();
        jButton204 = new javax.swing.JButton();
        btn84 = new javax.swing.JButton();
        btn83 = new javax.swing.JButton();
        btn81 = new javax.swing.JButton();
        btn82 = new javax.swing.JButton();
        btn51 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn49 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn54 = new javax.swing.JButton();
        btn85 = new javax.swing.JButton();
        jButton219 = new javax.swing.JButton();
        jButton220 = new javax.swing.JButton();
        btn86 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn53 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn52 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn71 = new javax.swing.JButton();
        btn103 = new javax.swing.JButton();
        btn70 = new javax.swing.JButton();
        btn102 = new javax.swing.JButton();
        btn69 = new javax.swing.JButton();
        btn101 = new javax.swing.JButton();
        btn68 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn67 = new javax.swing.JButton();
        btn99 = new javax.swing.JButton();
        btn66 = new javax.swing.JButton();
        btn98 = new javax.swing.JButton();
        btn65 = new javax.swing.JButton();
        btn97 = new javax.swing.JButton();
        btn64 = new javax.swing.JButton();
        btn96 = new javax.swing.JButton();
        btn63 = new javax.swing.JButton();
        btn95 = new javax.swing.JButton();
        btn62 = new javax.swing.JButton();
        btn94 = new javax.swing.JButton();
        btn61 = new javax.swing.JButton();
        btn93 = new javax.swing.JButton();
        btn60 = new javax.swing.JButton();
        btn92 = new javax.swing.JButton();
        btn59 = new javax.swing.JButton();
        btn91 = new javax.swing.JButton();
        btn58 = new javax.swing.JButton();
        btn90 = new javax.swing.JButton();
        btn57 = new javax.swing.JButton();
        btn89 = new javax.swing.JButton();
        jButton148 = new javax.swing.JButton();
        jButton147 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btn87 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        shortCutButton = new javax.swing.JButton();
        metalButton = new javax.swing.JButton();
        chaktiButton = new javax.swing.JLabel();
        LabelArro1 = new javax.swing.JLabel();
        LabelArro2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setToolTipText("Periodic Table (Main Table)");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(164, 503));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton169.setBackground(new java.awt.Color(0, 255, 255));
        jButton169.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton169.setText("Tb");
        jButton169.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton169, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton170.setBackground(new java.awt.Color(0, 255, 255));
        jButton170.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton170.setText("Bk");
        jButton170.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton170, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton171.setBackground(new java.awt.Color(0, 255, 255));
        jButton171.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton171.setText("Dy");
        jButton171.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton171, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton172.setBackground(new java.awt.Color(0, 255, 255));
        jButton172.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton172.setText("Am");
        jButton172.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton172, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton173.setBackground(new java.awt.Color(0, 255, 255));
        jButton173.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton173.setText("Cm");
        jButton173.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton173, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton174.setBackground(new java.awt.Color(0, 255, 255));
        jButton174.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton174.setText("Th");
        jButton174.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton174, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton175.setBackground(new java.awt.Color(0, 255, 255));
        jButton175.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton175.setText("Ce");
        jButton175.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton175, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton176.setBackground(new java.awt.Color(0, 255, 255));
        jButton176.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton176.setText("Ac");
        jButton176.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton176, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton177.setBackground(new java.awt.Color(0, 255, 255));
        jButton177.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton177.setText("La");
        jButton177.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton177, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton178.setBackground(new java.awt.Color(0, 255, 255));
        jButton178.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton178.setText("Pu");
        jButton178.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton178, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton179.setBackground(new java.awt.Color(0, 255, 255));
        jButton179.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton179.setText("Pa");
        jButton179.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton179, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton180.setBackground(new java.awt.Color(0, 255, 255));
        jButton180.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton180.setText("Nd");
        jButton180.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton180, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton181.setBackground(new java.awt.Color(0, 255, 255));
        jButton181.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton181.setText("Np");
        jButton181.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton181, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton182.setBackground(new java.awt.Color(0, 255, 255));
        jButton182.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton182.setText("U");
        jButton182.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton182, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton183.setBackground(new java.awt.Color(0, 255, 255));
        jButton183.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton183.setText("Eu");
        jButton183.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton183, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton184.setBackground(new java.awt.Color(0, 255, 255));
        jButton184.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton184.setText("Sm");
        jButton184.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton184, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton185.setBackground(new java.awt.Color(0, 255, 255));
        jButton185.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton185.setText("Pr");
        jButton185.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton185, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton186.setBackground(new java.awt.Color(0, 255, 255));
        jButton186.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton186.setText("Pm");
        jButton186.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton186, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton187.setBackground(new java.awt.Color(0, 255, 255));
        jButton187.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton187.setText("Cf");
        jButton187.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton187, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton188.setBackground(new java.awt.Color(0, 255, 255));
        jButton188.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton188.setText("Gd");
        jButton188.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton188, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        btn3.setBackground(new java.awt.Color(205, 76, 145));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn3.setText("Li");
        btn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 85, 50, 40));

        btn1.setBackground(new java.awt.Color(205, 141, 124));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setText("H");
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 39, 50, 40));

        jLabel3.setBackground(new java.awt.Color(198, 131, 131));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText(" 1");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, -1, 33));

        jButton190.setBackground(new java.awt.Color(205, 76, 145));
        jButton190.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton190.setText("Na");
        jButton190.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jButton190.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton190ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton190, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 131, 50, 40));

        btn19.setBackground(new java.awt.Color(205, 76, 145));
        btn19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn19.setText("K");
        btn19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });
        jPanel2.add(btn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 182, 50, 40));

        btn37.setBackground(new java.awt.Color(205, 76, 145));
        btn37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn37.setText("Rb");
        btn37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });
        jPanel2.add(btn37, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 228, 50, 40));

        btn88.setBackground(new java.awt.Color(205, 76, 145));
        btn88.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn88.setText("Ra");
        btn88.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn88.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn88ActionPerformed(evt);
            }
        });
        jPanel2.add(btn88, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 320, 50, 40));

        btn11.setBackground(new java.awt.Color(205, 76, 145));
        btn11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn11.setText("Na");
        btn11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel2.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 131, 50, 40));

        btn55.setBackground(new java.awt.Color(205, 76, 145));
        btn55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn55.setText("Cs");
        btn55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn55ActionPerformed(evt);
            }
        });
        jPanel2.add(btn55, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 274, 50, 40));

        btn20.setBackground(new java.awt.Color(205, 76, 145));
        btn20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn20.setText("Ca");
        btn20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        jPanel2.add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 182, 50, 40));

        btn56.setBackground(new java.awt.Color(205, 76, 145));
        btn56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn56.setText("Ba");
        btn56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn56ActionPerformed(evt);
            }
        });
        jPanel2.add(btn56, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 274, 50, 40));

        btn38.setBackground(new java.awt.Color(205, 76, 145));
        btn38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn38.setText("Sr");
        btn38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn38ActionPerformed(evt);
            }
        });
        jPanel2.add(btn38, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 228, 50, 40));

        btn4.setBackground(new java.awt.Color(205, 76, 145));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn4.setText("Be");
        btn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 85, 50, 40));

        btn12.setBackground(new java.awt.Color(205, 76, 145));
        btn12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn12.setText("Mg");
        btn12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel2.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 131, 50, 40));

        jButton201.setBackground(new java.awt.Color(205, 76, 145));
        jButton201.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton201.setText(" ");
        jButton201.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton201, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 320, 50, 40));

        btn21.setBackground(new java.awt.Color(0, 255, 255));
        btn21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn21.setText("Sc");
        btn21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        jPanel2.add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 182, 50, 40));

        btn39.setBackground(new java.awt.Color(0, 255, 255));
        btn39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn39.setText("Y");
        btn39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn39ActionPerformed(evt);
            }
        });
        jPanel2.add(btn39, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 228, 50, 40));

        btn30.setBackground(new java.awt.Color(0, 255, 255));
        btn30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn30.setText("Zn");
        btn30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });
        jPanel2.add(btn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 182, 50, 40));

        btn40.setBackground(new java.awt.Color(0, 255, 255));
        btn40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn40.setText("Zr");
        btn40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40ActionPerformed(evt);
            }
        });
        jPanel2.add(btn40, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 228, 50, 40));

        btn72.setBackground(new java.awt.Color(0, 255, 255));
        btn72.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn72.setText("Hf");
        btn72.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn72ActionPerformed(evt);
            }
        });
        jPanel2.add(btn72, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 274, 50, 40));

        btn104.setBackground(new java.awt.Color(0, 255, 255));
        btn104.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn104.setText("Rf");
        btn104.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn104.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn104ActionPerformed(evt);
            }
        });
        jPanel2.add(btn104, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 50, 40));

        btn73.setBackground(new java.awt.Color(0, 255, 255));
        btn73.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn73.setText("Ta");
        btn73.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn73.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn73ActionPerformed(evt);
            }
        });
        jPanel2.add(btn73, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 274, 50, 40));

        btn42.setBackground(new java.awt.Color(0, 255, 255));
        btn42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn42.setText("Mo");
        btn42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn42ActionPerformed(evt);
            }
        });
        jPanel2.add(btn42, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 228, 50, 40));

        btn43.setBackground(new java.awt.Color(0, 255, 255));
        btn43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn43.setText("Tc");
        btn43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn43ActionPerformed(evt);
            }
        });
        jPanel2.add(btn43, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 228, 50, 40));

        btn29.setBackground(new java.awt.Color(0, 255, 255));
        btn29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn29.setText("Cu");
        btn29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });
        jPanel2.add(btn29, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 182, 50, 40));

        btn22.setBackground(new java.awt.Color(0, 255, 255));
        btn22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn22.setText("Ti");
        btn22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        jPanel2.add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 182, 50, 40));

        btn23.setBackground(new java.awt.Color(0, 255, 255));
        btn23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn23.setText("V");
        btn23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });
        jPanel2.add(btn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 182, 50, 40));

        btn41.setBackground(new java.awt.Color(0, 255, 255));
        btn41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn41.setText("Nb");
        btn41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41ActionPerformed(evt);
            }
        });
        jPanel2.add(btn41, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 228, 50, 40));

        btn45.setBackground(new java.awt.Color(0, 255, 255));
        btn45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn45.setText("Rh");
        btn45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn45ActionPerformed(evt);
            }
        });
        jPanel2.add(btn45, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 228, 50, 40));

        btn47.setBackground(new java.awt.Color(0, 255, 255));
        btn47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn47.setText("Ag");
        btn47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn47ActionPerformed(evt);
            }
        });
        jPanel2.add(btn47, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 228, 50, 40));

        btn46.setBackground(new java.awt.Color(0, 255, 255));
        btn46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn46.setText("Pd");
        btn46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn46ActionPerformed(evt);
            }
        });
        jPanel2.add(btn46, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 228, 50, 40));

        btn44.setBackground(new java.awt.Color(0, 255, 255));
        btn44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn44.setText("Ru");
        btn44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn44ActionPerformed(evt);
            }
        });
        jPanel2.add(btn44, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 228, 50, 40));

        btn28.setBackground(new java.awt.Color(0, 255, 255));
        btn28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn28.setText("Ni");
        btn28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });
        jPanel2.add(btn28, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 182, 50, 40));

        btn27.setBackground(new java.awt.Color(0, 255, 255));
        btn27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn27.setText("Co");
        btn27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });
        jPanel2.add(btn27, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 182, 50, 40));

        btn25.setBackground(new java.awt.Color(0, 255, 255));
        btn25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn25.setText("Mn");
        btn25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });
        jPanel2.add(btn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 182, 50, 40));

        btn26.setBackground(new java.awt.Color(0, 255, 255));
        btn26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn26.setText("I");
        btn26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });
        jPanel2.add(btn26, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 182, 50, 40));

        btn24.setBackground(new java.awt.Color(0, 255, 255));
        btn24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn24.setText("Cr");
        btn24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });
        jPanel2.add(btn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 182, 50, 40));

        btn75.setBackground(new java.awt.Color(0, 255, 255));
        btn75.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn75.setText("Re");
        btn75.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn75.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn75ActionPerformed(evt);
            }
        });
        jPanel2.add(btn75, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 274, 50, 40));

        btn76.setBackground(new java.awt.Color(0, 255, 255));
        btn76.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn76.setText("Os");
        btn76.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn76.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn76ActionPerformed(evt);
            }
        });
        jPanel2.add(btn76, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 274, 50, 40));

        btn74.setBackground(new java.awt.Color(0, 255, 255));
        btn74.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn74.setText("W");
        btn74.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn74ActionPerformed(evt);
            }
        });
        jPanel2.add(btn74, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 274, 50, 40));

        btn48.setBackground(new java.awt.Color(0, 255, 255));
        btn48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn48.setText("Cd");
        btn48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn48ActionPerformed(evt);
            }
        });
        jPanel2.add(btn48, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 228, 50, 40));

        btn106.setBackground(new java.awt.Color(0, 255, 255));
        btn106.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn106.setText("Sg");
        btn106.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn106.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn106ActionPerformed(evt);
            }
        });
        jPanel2.add(btn106, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 320, 50, 40));

        btn105.setBackground(new java.awt.Color(0, 255, 255));
        btn105.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn105.setText("Db");
        btn105.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn105.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn105ActionPerformed(evt);
            }
        });
        jPanel2.add(btn105, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 320, 50, 40));

        btn107.setBackground(new java.awt.Color(0, 255, 255));
        btn107.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn107.setText("Bh");
        btn107.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn107.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn107ActionPerformed(evt);
            }
        });
        jPanel2.add(btn107, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 50, 40));

        btn77.setBackground(new java.awt.Color(0, 255, 255));
        btn77.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn77.setText("Ir");
        btn77.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn77.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn77ActionPerformed(evt);
            }
        });
        jPanel2.add(btn77, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 274, 50, 40));

        btn108.setBackground(new java.awt.Color(0, 255, 255));
        btn108.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn108.setText("Hs");
        btn108.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn108.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn108ActionPerformed(evt);
            }
        });
        jPanel2.add(btn108, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 320, 50, 40));

        jButton132.setBackground(new java.awt.Color(0, 255, 255));
        jButton132.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton132.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jButton132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton132ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton132, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 320, 50, 40));

        btn109.setBackground(new java.awt.Color(0, 255, 255));
        btn109.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn109.setText("Mt");
        btn109.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn109.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn109ActionPerformed(evt);
            }
        });
        jPanel2.add(btn109, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 320, 50, 40));

        btn80.setBackground(new java.awt.Color(0, 255, 255));
        btn80.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn80.setText("Hg");
        btn80.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn80.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn80ActionPerformed(evt);
            }
        });
        jPanel2.add(btn80, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 274, 50, 40));

        btn78.setBackground(new java.awt.Color(0, 255, 255));
        btn78.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn78.setText("Pt");
        btn78.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn78.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn78ActionPerformed(evt);
            }
        });
        jPanel2.add(btn78, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 274, 50, 40));

        btn79.setBackground(new java.awt.Color(0, 255, 255));
        btn79.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn79.setText("Au");
        btn79.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn79.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn79ActionPerformed(evt);
            }
        });
        jPanel2.add(btn79, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 274, 50, 40));

        btn111.setBackground(new java.awt.Color(0, 255, 255));
        btn111.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn111.setText("Rg");
        btn111.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn111.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn111ActionPerformed(evt);
            }
        });
        jPanel2.add(btn111, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 320, 50, 40));

        btn110.setBackground(new java.awt.Color(0, 255, 255));
        btn110.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn110.setText("Ds");
        btn110.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn110.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn110ActionPerformed(evt);
            }
        });
        jPanel2.add(btn110, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 50, 40));

        jButton202.setBackground(new java.awt.Color(205, 76, 145));
        jButton202.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton202.setText(" ");
        jButton202.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton202, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 320, 50, 40));

        jButton203.setBackground(new java.awt.Color(205, 76, 145));
        jButton203.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton203.setText(" ");
        jButton203.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton203, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 50, 40));

        jButton204.setBackground(new java.awt.Color(205, 76, 145));
        jButton204.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton204.setText(" ");
        jButton204.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton204, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 320, 50, 40));

        btn84.setBackground(new java.awt.Color(205, 76, 145));
        btn84.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn84.setText("Po");
        btn84.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn84.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn84ActionPerformed(evt);
            }
        });
        jPanel2.add(btn84, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 274, 50, 40));

        btn83.setBackground(new java.awt.Color(205, 76, 145));
        btn83.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn83.setText("Bi");
        btn83.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn83.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn83ActionPerformed(evt);
            }
        });
        jPanel2.add(btn83, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 274, 50, 40));

        btn81.setBackground(new java.awt.Color(205, 76, 145));
        btn81.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn81.setText("Tl");
        btn81.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn81.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn81ActionPerformed(evt);
            }
        });
        jPanel2.add(btn81, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 274, 50, 40));

        btn82.setBackground(new java.awt.Color(205, 76, 145));
        btn82.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn82.setText("Pb");
        btn82.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn82.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn82ActionPerformed(evt);
            }
        });
        jPanel2.add(btn82, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 274, 50, 40));

        btn51.setBackground(new java.awt.Color(205, 76, 145));
        btn51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn51.setText("Sb");
        btn51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn51ActionPerformed(evt);
            }
        });
        jPanel2.add(btn51, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 228, 50, 40));

        btn50.setBackground(new java.awt.Color(205, 76, 145));
        btn50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn50.setText("Sn");
        btn50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });
        jPanel2.add(btn50, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 228, 50, 40));

        btn49.setBackground(new java.awt.Color(205, 76, 145));
        btn49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn49.setText("In");
        btn49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn49ActionPerformed(evt);
            }
        });
        jPanel2.add(btn49, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 228, 50, 40));

        btn31.setBackground(new java.awt.Color(205, 76, 145));
        btn31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn31.setText("Ga");
        btn31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });
        jPanel2.add(btn31, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 182, 50, 40));

        btn13.setBackground(new java.awt.Color(205, 76, 145));
        btn13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn13.setText("Al");
        btn13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        jPanel2.add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 131, 50, 40));

        btn32.setBackground(new java.awt.Color(205, 76, 145));
        btn32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn32.setText("Ge");
        btn32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });
        jPanel2.add(btn32, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 182, 50, 40));

        btn15.setBackground(new java.awt.Color(205, 141, 124));
        btn15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn15.setText("P");
        btn15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        jPanel2.add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 131, 50, 40));

        btn10.setBackground(new java.awt.Color(205, 141, 124));
        btn10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn10.setText("Ne");
        btn10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel2.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 85, 50, 40));

        btn54.setBackground(new java.awt.Color(205, 141, 124));
        btn54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn54.setText("Xe");
        btn54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn54ActionPerformed(evt);
            }
        });
        jPanel2.add(btn54, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 228, 50, 40));

        btn85.setBackground(new java.awt.Color(205, 141, 124));
        btn85.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn85.setText("At");
        btn85.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn85.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn85ActionPerformed(evt);
            }
        });
        jPanel2.add(btn85, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 274, 50, 40));

        jButton219.setBackground(new java.awt.Color(205, 141, 124));
        jButton219.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton219.setText(" ");
        jButton219.setAlignmentY(0.0F);
        jButton219.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton219, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, 50, 40));

        jButton220.setBackground(new java.awt.Color(205, 141, 124));
        jButton220.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton220.setText(" ");
        jButton220.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jPanel2.add(jButton220, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 320, 50, 40));

        btn86.setBackground(new java.awt.Color(205, 141, 124));
        btn86.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn86.setText("Rn");
        btn86.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn86.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn86ActionPerformed(evt);
            }
        });
        jPanel2.add(btn86, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 274, 50, 40));

        btn9.setBackground(new java.awt.Color(205, 141, 124));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn9.setText("F");
        btn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 85, 50, 40));

        btn53.setBackground(new java.awt.Color(205, 141, 124));
        btn53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn53.setText("I");
        btn53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn53ActionPerformed(evt);
            }
        });
        jPanel2.add(btn53, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 228, 50, 40));

        btn18.setBackground(new java.awt.Color(205, 141, 124));
        btn18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn18.setText("Ar");
        btn18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });
        jPanel2.add(btn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 131, 50, 40));

        btn33.setBackground(new java.awt.Color(205, 141, 124));
        btn33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn33.setText("As");
        btn33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });
        jPanel2.add(btn33, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 182, 50, 40));

        btn14.setBackground(new java.awt.Color(205, 141, 124));
        btn14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn14.setText("Si");
        btn14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        jPanel2.add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 131, 50, 40));

        btn34.setBackground(new java.awt.Color(205, 141, 124));
        btn34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn34.setText("Se");
        btn34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });
        jPanel2.add(btn34, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 182, 50, 40));

        btn52.setBackground(new java.awt.Color(205, 141, 124));
        btn52.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn52.setText("Te");
        btn52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn52ActionPerformed(evt);
            }
        });
        jPanel2.add(btn52, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 228, 50, 40));

        btn35.setBackground(new java.awt.Color(205, 141, 124));
        btn35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn35.setText("Br");
        btn35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });
        jPanel2.add(btn35, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 182, 50, 40));

        btn36.setBackground(new java.awt.Color(205, 141, 124));
        btn36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn36.setText("Kr");
        btn36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });
        jPanel2.add(btn36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 182, 50, 40));

        btn7.setBackground(new java.awt.Color(205, 141, 124));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn7.setText("N");
        btn7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 85, 50, 40));

        btn6.setBackground(new java.awt.Color(205, 141, 124));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn6.setText("C");
        btn6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 85, 50, 40));

        btn2.setBackground(new java.awt.Color(205, 141, 124));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setText("He");
        btn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 39, 50, 40));

        btn5.setBackground(new java.awt.Color(205, 141, 124));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn5.setText("B");
        btn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 85, 50, 40));

        btn8.setBackground(new java.awt.Color(205, 141, 124));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn8.setText("O");
        btn8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 85, 50, 40));

        btn16.setBackground(new java.awt.Color(205, 141, 124));
        btn16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn16.setText("S");
        btn16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        jPanel2.add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 131, 50, 40));

        btn17.setBackground(new java.awt.Color(205, 141, 124));
        btn17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn17.setText("Cl");
        btn17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });
        jPanel2.add(btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 131, 50, 40));

        jPanel3.setBackground(new java.awt.Color(255, 169, 207));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 255), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(255, 0, 204)));

        btn71.setBackground(new java.awt.Color(0, 255, 255));
        btn71.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn71.setText("Lu");
        btn71.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn71.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn71ActionPerformed(evt);
            }
        });

        btn103.setBackground(new java.awt.Color(0, 255, 255));
        btn103.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn103.setText("Lr");
        btn103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn103.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn103ActionPerformed(evt);
            }
        });

        btn70.setBackground(new java.awt.Color(0, 255, 255));
        btn70.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn70.setText("Yb");
        btn70.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn70ActionPerformed(evt);
            }
        });

        btn102.setBackground(new java.awt.Color(0, 255, 255));
        btn102.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn102.setText("No");
        btn102.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn102.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn102ActionPerformed(evt);
            }
        });

        btn69.setBackground(new java.awt.Color(0, 255, 255));
        btn69.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn69.setText("Tm");
        btn69.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn69.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn69ActionPerformed(evt);
            }
        });

        btn101.setBackground(new java.awt.Color(0, 255, 255));
        btn101.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn101.setText("Md");
        btn101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn101.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn101ActionPerformed(evt);
            }
        });

        btn68.setBackground(new java.awt.Color(0, 255, 255));
        btn68.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn68.setText("Er");
        btn68.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn68.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn68ActionPerformed(evt);
            }
        });

        btn100.setBackground(new java.awt.Color(0, 255, 255));
        btn100.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn100.setText("Fm");
        btn100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn100.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });

        btn67.setBackground(new java.awt.Color(0, 255, 255));
        btn67.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn67.setText("Ho");
        btn67.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn67.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn67ActionPerformed(evt);
            }
        });

        btn99.setBackground(new java.awt.Color(0, 255, 255));
        btn99.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn99.setText("Es");
        btn99.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn99.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn99ActionPerformed(evt);
            }
        });

        btn66.setBackground(new java.awt.Color(0, 255, 255));
        btn66.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn66.setText("Dy");
        btn66.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn66.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn66ActionPerformed(evt);
            }
        });

        btn98.setBackground(new java.awt.Color(0, 255, 255));
        btn98.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn98.setText("Cf");
        btn98.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn98.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn98ActionPerformed(evt);
            }
        });

        btn65.setBackground(new java.awt.Color(0, 255, 255));
        btn65.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn65.setText("Tb");
        btn65.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn65.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn65ActionPerformed(evt);
            }
        });

        btn97.setBackground(new java.awt.Color(0, 255, 255));
        btn97.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn97.setText("Bk");
        btn97.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn97.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn97ActionPerformed(evt);
            }
        });

        btn64.setBackground(new java.awt.Color(0, 255, 255));
        btn64.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn64.setText("Gd");
        btn64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn64ActionPerformed(evt);
            }
        });

        btn96.setBackground(new java.awt.Color(0, 255, 255));
        btn96.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn96.setText("Cm");
        btn96.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn96.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn96ActionPerformed(evt);
            }
        });

        btn63.setBackground(new java.awt.Color(0, 255, 255));
        btn63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn63.setText("Eu");
        btn63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn63ActionPerformed(evt);
            }
        });

        btn95.setBackground(new java.awt.Color(0, 255, 255));
        btn95.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn95.setText("Am");
        btn95.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn95.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn95ActionPerformed(evt);
            }
        });

        btn62.setBackground(new java.awt.Color(0, 255, 255));
        btn62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn62.setText("Sm");
        btn62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn62ActionPerformed(evt);
            }
        });

        btn94.setBackground(new java.awt.Color(0, 255, 255));
        btn94.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn94.setText("Pu");
        btn94.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn94.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn94ActionPerformed(evt);
            }
        });

        btn61.setBackground(new java.awt.Color(0, 255, 255));
        btn61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn61.setText("Pm");
        btn61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn61ActionPerformed(evt);
            }
        });

        btn93.setBackground(new java.awt.Color(0, 255, 255));
        btn93.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn93.setText("Np");
        btn93.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn93.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn93ActionPerformed(evt);
            }
        });

        btn60.setBackground(new java.awt.Color(0, 255, 255));
        btn60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn60.setText("Nd");
        btn60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn60ActionPerformed(evt);
            }
        });

        btn92.setBackground(new java.awt.Color(0, 255, 255));
        btn92.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn92.setText("U");
        btn92.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn92.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn92ActionPerformed(evt);
            }
        });

        btn59.setBackground(new java.awt.Color(0, 255, 255));
        btn59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn59.setText("Pr");
        btn59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn59ActionPerformed(evt);
            }
        });

        btn91.setBackground(new java.awt.Color(0, 255, 255));
        btn91.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn91.setText("Pa");
        btn91.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn91.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn91ActionPerformed(evt);
            }
        });

        btn58.setBackground(new java.awt.Color(0, 255, 255));
        btn58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn58.setText("Ce");
        btn58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn58ActionPerformed(evt);
            }
        });

        btn90.setBackground(new java.awt.Color(0, 255, 255));
        btn90.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn90.setText("Th");
        btn90.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn90.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn90ActionPerformed(evt);
            }
        });

        btn57.setBackground(new java.awt.Color(0, 255, 255));
        btn57.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn57.setText("La");
        btn57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn57ActionPerformed(evt);
            }
        });

        btn89.setBackground(new java.awt.Color(0, 255, 255));
        btn89.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn89.setText("Ac");
        btn89.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn89.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn89ActionPerformed(evt);
            }
        });

        jButton148.setBackground(new java.awt.Color(0, 255, 255));
        jButton148.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton148.setText("Lanthannid Series -->");
        jButton148.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jButton148.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton148ActionPerformed(evt);
            }
        });

        jButton147.setBackground(new java.awt.Color(0, 255, 255));
        jButton147.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton147.setText("Actinite Series -->");
        jButton147.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jButton147.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton147ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton147, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn89, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn90, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn91, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn92, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton148, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btn93, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn94, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn95, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn96, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn97, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn98, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn99, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn101, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn102, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn103, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton148, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn103, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn102, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn101, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton147, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 374, 1042, -1));

        jLabel4.setBackground(new java.awt.Color(198, 131, 131));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("2");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 90, -1, 32));

        jLabel5.setBackground(new java.awt.Color(198, 131, 131));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("3");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 136, -1, 33));

        jLabel6.setBackground(new java.awt.Color(198, 131, 131));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("4");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 187, -1, 33));

        jLabel7.setBackground(new java.awt.Color(198, 131, 131));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("5");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 241, -1, -1));

        jLabel8.setBackground(new java.awt.Color(198, 131, 131));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("6");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 287, -1, -1));

        jLabel9.setBackground(new java.awt.Color(198, 131, 131));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("7");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 333, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 204, 153));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("  IB");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("    IA");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("  IA");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("  IA");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 51));
        jLabel16.setText("  IA");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("    IIB");

        jPanel7.setBackground(new java.awt.Color(0, 255, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("VIII");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 51));
        jLabel17.setText("  IA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(31, 31, 31)
                .addComponent(jLabel15)
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addComponent(jLabel10)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 151, -1, 20));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jPanel9.setBackground(new java.awt.Color(0, 255, 153));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 51));
        jLabel24.setText("    IIA");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 51));
        jLabel25.setText("    IA");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, -2, 130, 30));

        btn87.setBackground(new java.awt.Color(205, 76, 145));
        btn87.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn87.setText("Fr");
        btn87.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btn87.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn87ActionPerformed(evt);
            }
        });
        jPanel2.add(btn87, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 320, 50, 40));

        jPanel8.setBackground(new java.awt.Color(0, 255, 153));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 51));
        jLabel18.setText("  VIIIA");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 51));
        jLabel19.setText("  VIIA");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 51));
        jLabel21.setText("  VIA");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 51));
        jLabel20.setText("  IIIA");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 51));
        jLabel22.setText("  VA");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 51));
        jLabel23.setText("  IVA");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addGap(28, 28, 28)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 11, -1, -1));

        shortCutButton.setText(" ");
        shortCutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shortCutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortCutButtonActionPerformed(evt);
            }
        });
        jPanel2.add(shortCutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 39, 152, 33));

        metalButton.setText(" ");
        metalButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        metalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metalButtonActionPerformed(evt);
            }
        });
        jPanel2.add(metalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 41, 148, 33));

        chaktiButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        chaktiButton.setForeground(new java.awt.Color(255, 51, 102));
        chaktiButton.setText("about");
        chaktiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chaktiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chaktiButtonMouseClicked(evt);
            }
        });
        chaktiButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                chaktiButtonMouseDragged(evt);
            }
        });
        jPanel2.add(chaktiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 32, 111, 40));

        LabelArro1.setText(" ");
        jPanel2.add(LabelArro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 282, 60, 31));

        LabelArro2.setText(" ");
        jPanel2.add(LabelArro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 50, 40));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("More Short Cut Technic");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 318, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p/Main Menu.png"))); // NOI18N
        jLabel1.setText("Main Menu");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 150, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

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

    private void btn53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn53ActionPerformed
        dispose();
        PeriodicCode ob2 = new PeriodicCode(53);
        ob2.setVisible(true); 
    }//GEN-LAST:event_btn53ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        ElementInformation(2);  
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        ElementInformation(1); 
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        ElementInformation(3); 
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        ElementInformation(4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        ElementInformation(5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        ElementInformation(6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        ElementInformation(7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        ElementInformation(8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        ElementInformation(9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        ElementInformation(10);
    }//GEN-LAST:event_btn10ActionPerformed

    private void jButton190ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton190ActionPerformed
        ElementInformation(11);
    }//GEN-LAST:event_jButton190ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        ElementInformation(12);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        ElementInformation(13);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        ElementInformation(14);
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        ElementInformation(15);
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        ElementInformation(16);
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        ElementInformation(17);
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        ElementInformation(18);
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        ElementInformation(19);
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        ElementInformation(20);
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        ElementInformation(21);
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        ElementInformation(22);
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        ElementInformation(23);
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        ElementInformation(24);
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        ElementInformation(25);
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        ElementInformation(26);
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        ElementInformation(27);
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        ElementInformation(28);
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
        ElementInformation(29);
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        ElementInformation(30);
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        ElementInformation(31);
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        ElementInformation(32);
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        ElementInformation(33);
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        ElementInformation(34);
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        ElementInformation(35);
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        ElementInformation(36);
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        ElementInformation(37);
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn38ActionPerformed
        ElementInformation(38);
    }//GEN-LAST:event_btn38ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        ElementInformation(11); 
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn39ActionPerformed
        ElementInformation(39);
    }//GEN-LAST:event_btn39ActionPerformed

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
        ElementInformation(40);
    }//GEN-LAST:event_btn40ActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
        ElementInformation(41);
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42ActionPerformed
        ElementInformation(42);
    }//GEN-LAST:event_btn42ActionPerformed

    private void btn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn43ActionPerformed
        ElementInformation(43);
    }//GEN-LAST:event_btn43ActionPerformed

    private void btn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn44ActionPerformed
        ElementInformation(44);
    }//GEN-LAST:event_btn44ActionPerformed

    private void btn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn45ActionPerformed
        ElementInformation(45);
    }//GEN-LAST:event_btn45ActionPerformed

    private void btn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn46ActionPerformed
        ElementInformation(46);
    }//GEN-LAST:event_btn46ActionPerformed

    private void btn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn47ActionPerformed
        ElementInformation(47);
    }//GEN-LAST:event_btn47ActionPerformed

    private void btn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn48ActionPerformed
        ElementInformation(48);
    }//GEN-LAST:event_btn48ActionPerformed

    private void btn49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn49ActionPerformed
        ElementInformation(49);
    }//GEN-LAST:event_btn49ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        ElementInformation(50);
    }//GEN-LAST:event_btn50ActionPerformed

    private void btn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn51ActionPerformed
        ElementInformation(51);
    }//GEN-LAST:event_btn51ActionPerformed

    private void btn52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn52ActionPerformed
        ElementInformation(52);
    }//GEN-LAST:event_btn52ActionPerformed

    private void btn54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn54ActionPerformed
        ElementInformation(54);
    }//GEN-LAST:event_btn54ActionPerformed

    private void btn55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn55ActionPerformed
        ElementInformation(55);
    }//GEN-LAST:event_btn55ActionPerformed

    private void btn56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn56ActionPerformed
        ElementInformation(56);
    }//GEN-LAST:event_btn56ActionPerformed

    private void btn57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn57ActionPerformed
        ElementInformation(57);
    }//GEN-LAST:event_btn57ActionPerformed

    private void btn58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn58ActionPerformed
        ElementInformation(58);
    }//GEN-LAST:event_btn58ActionPerformed

    private void btn59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn59ActionPerformed
        ElementInformation(59);
    }//GEN-LAST:event_btn59ActionPerformed

    private void btn60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn60ActionPerformed
        ElementInformation(60);
    }//GEN-LAST:event_btn60ActionPerformed

    private void btn61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn61ActionPerformed
        ElementInformation(61);
    }//GEN-LAST:event_btn61ActionPerformed

    private void btn62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn62ActionPerformed
        ElementInformation(62);
    }//GEN-LAST:event_btn62ActionPerformed

    private void btn63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn63ActionPerformed
        ElementInformation(63);
    }//GEN-LAST:event_btn63ActionPerformed

    private void btn64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn64ActionPerformed
        ElementInformation(64);
    }//GEN-LAST:event_btn64ActionPerformed

    private void btn65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn65ActionPerformed
        ElementInformation(65);
    }//GEN-LAST:event_btn65ActionPerformed

    private void btn66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn66ActionPerformed
        ElementInformation(66);
    }//GEN-LAST:event_btn66ActionPerformed

    private void btn67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn67ActionPerformed
        ElementInformation(67);
    }//GEN-LAST:event_btn67ActionPerformed

    private void btn68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn68ActionPerformed
        ElementInformation(68);
    }//GEN-LAST:event_btn68ActionPerformed

    private void btn69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn69ActionPerformed
        ElementInformation(69);
    }//GEN-LAST:event_btn69ActionPerformed

    private void btn70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn70ActionPerformed
        ElementInformation(70);
    }//GEN-LAST:event_btn70ActionPerformed

    private void btn71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn71ActionPerformed
        ElementInformation(71);
    }//GEN-LAST:event_btn71ActionPerformed

    private void btn72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn72ActionPerformed
        ElementInformation(72);
    }//GEN-LAST:event_btn72ActionPerformed

    private void btn73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn73ActionPerformed
        ElementInformation(73);
    }//GEN-LAST:event_btn73ActionPerformed

    private void btn74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn74ActionPerformed
        ElementInformation(74);
    }//GEN-LAST:event_btn74ActionPerformed

    private void btn75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn75ActionPerformed
        ElementInformation(75);
    }//GEN-LAST:event_btn75ActionPerformed

    private void btn76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn76ActionPerformed
        ElementInformation(76);
    }//GEN-LAST:event_btn76ActionPerformed

    private void btn77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn77ActionPerformed
        ElementInformation(77);
    }//GEN-LAST:event_btn77ActionPerformed

    private void btn78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn78ActionPerformed
        ElementInformation(78);
    }//GEN-LAST:event_btn78ActionPerformed

    private void btn79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn79ActionPerformed
        ElementInformation(79);
    }//GEN-LAST:event_btn79ActionPerformed

    private void btn80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn80ActionPerformed
        ElementInformation(80);
    }//GEN-LAST:event_btn80ActionPerformed

    private void btn81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn81ActionPerformed
        ElementInformation(81);
    }//GEN-LAST:event_btn81ActionPerformed

    private void btn82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn82ActionPerformed
        ElementInformation(82);
    }//GEN-LAST:event_btn82ActionPerformed

    private void btn83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn83ActionPerformed
        ElementInformation(83);
    }//GEN-LAST:event_btn83ActionPerformed

    private void btn84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn84ActionPerformed
        ElementInformation(84);
    }//GEN-LAST:event_btn84ActionPerformed

    private void btn85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn85ActionPerformed
        ElementInformation(85);
    }//GEN-LAST:event_btn85ActionPerformed

    private void btn86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn86ActionPerformed
        ElementInformation(86);
    }//GEN-LAST:event_btn86ActionPerformed

    private void btn87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn87ActionPerformed
        ElementInformation(87);
    }//GEN-LAST:event_btn87ActionPerformed

    private void btn88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn88ActionPerformed
        ElementInformation(88);
    }//GEN-LAST:event_btn88ActionPerformed

    private void btn89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn89ActionPerformed
        ElementInformation(89);
    }//GEN-LAST:event_btn89ActionPerformed

    private void btn90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn90ActionPerformed
        ElementInformation(90);
    }//GEN-LAST:event_btn90ActionPerformed

    private void btn91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn91ActionPerformed
        ElementInformation(91);
    }//GEN-LAST:event_btn91ActionPerformed

    private void btn92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn92ActionPerformed
        ElementInformation(92);
    }//GEN-LAST:event_btn92ActionPerformed

    private void btn93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn93ActionPerformed
        ElementInformation(93);
    }//GEN-LAST:event_btn93ActionPerformed

    private void btn94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn94ActionPerformed
        ElementInformation(94);
    }//GEN-LAST:event_btn94ActionPerformed

    private void btn95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn95ActionPerformed
        ElementInformation(95);
    }//GEN-LAST:event_btn95ActionPerformed

    private void btn96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn96ActionPerformed
        ElementInformation(96);
    }//GEN-LAST:event_btn96ActionPerformed

    private void btn97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn97ActionPerformed
        ElementInformation(97);
    }//GEN-LAST:event_btn97ActionPerformed

    private void btn98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn98ActionPerformed
        ElementInformation(98);
    }//GEN-LAST:event_btn98ActionPerformed

    private void btn99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn99ActionPerformed
        ElementInformation(99);
    }//GEN-LAST:event_btn99ActionPerformed

    private void btn101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn101ActionPerformed
        ElementInformation(101);
    }//GEN-LAST:event_btn101ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        ElementInformation(100);
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn102ActionPerformed
        ElementInformation(102);
    }//GEN-LAST:event_btn102ActionPerformed

    private void btn103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn103ActionPerformed
        ElementInformation(103);
    }//GEN-LAST:event_btn103ActionPerformed

    private void btn104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn104ActionPerformed
        ElementInformation(104);
    }//GEN-LAST:event_btn104ActionPerformed

    private void btn105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn105ActionPerformed
        ElementInformation(105);
    }//GEN-LAST:event_btn105ActionPerformed

    private void btn106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn106ActionPerformed
        ElementInformation(106);
    }//GEN-LAST:event_btn106ActionPerformed

    private void btn107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn107ActionPerformed
        ElementInformation(107);
    }//GEN-LAST:event_btn107ActionPerformed

    private void btn108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn108ActionPerformed
        ElementInformation(108);
    }//GEN-LAST:event_btn108ActionPerformed

    private void btn109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn109ActionPerformed
        ElementInformation(109);
    }//GEN-LAST:event_btn109ActionPerformed

    private void btn110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn110ActionPerformed
        ElementInformation(110);
    }//GEN-LAST:event_btn110ActionPerformed

    private void btn111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn111ActionPerformed
        ElementInformation(111);
    }//GEN-LAST:event_btn111ActionPerformed

    private void shortCutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortCutButtonActionPerformed
        dispose();
        ShortcutTecnic tec = new ShortcutTecnic();
        tec.setVisible(true);
//        jLabel2.setIcon(st.showImage("E:\\PeriodicTable\\Images\\1AA.jpg"));
    }//GEN-LAST:event_shortCutButtonActionPerformed

    private void metalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metalButtonActionPerformed
        dispose();
        new MetalAndNonMetal().setVisible(true);
    }//GEN-LAST:event_metalButtonActionPerformed

    private void chaktiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chaktiButtonMouseClicked
        dispose();
        new Information().setVisible(true);
    }//GEN-LAST:event_chaktiButtonMouseClicked

    private void chaktiButtonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chaktiButtonMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_chaktiButtonMouseDragged

    private void jButton148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton148ActionPerformed
        dispose();
        LanthanideAndActinide la = new LanthanideAndActinide(1);
        la.setVisible(true);
    }//GEN-LAST:event_jButton148ActionPerformed

    private void jButton147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton147ActionPerformed
        dispose();
        LanthanideAndActinide la = new LanthanideAndActinide(2);
        la.setVisible(true);
    }//GEN-LAST:event_jButton147ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        OtherShortCutTechnic ost = new OtherShortCutTechnic();
        ost.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton132ActionPerformed
        
    }//GEN-LAST:event_jButton132ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
        MenuBar mn = new MenuBar();
        mn.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelArro1;
    private javax.swing.JLabel LabelArro2;
    public static javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn101;
    private javax.swing.JButton btn102;
    private javax.swing.JButton btn103;
    private javax.swing.JButton btn104;
    private javax.swing.JButton btn105;
    private javax.swing.JButton btn106;
    private javax.swing.JButton btn107;
    private javax.swing.JButton btn108;
    private javax.swing.JButton btn109;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn110;
    private javax.swing.JButton btn111;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    public javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn52;
    private javax.swing.JButton btn53;
    private javax.swing.JButton btn54;
    private javax.swing.JButton btn55;
    private javax.swing.JButton btn56;
    private javax.swing.JButton btn57;
    private javax.swing.JButton btn58;
    private javax.swing.JButton btn59;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn60;
    private javax.swing.JButton btn61;
    private javax.swing.JButton btn62;
    private javax.swing.JButton btn63;
    private javax.swing.JButton btn64;
    private javax.swing.JButton btn65;
    private javax.swing.JButton btn66;
    private javax.swing.JButton btn67;
    private javax.swing.JButton btn68;
    private javax.swing.JButton btn69;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn70;
    private javax.swing.JButton btn71;
    private javax.swing.JButton btn72;
    private javax.swing.JButton btn73;
    private javax.swing.JButton btn74;
    private javax.swing.JButton btn75;
    private javax.swing.JButton btn76;
    private javax.swing.JButton btn77;
    private javax.swing.JButton btn78;
    private javax.swing.JButton btn79;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn80;
    private javax.swing.JButton btn81;
    private javax.swing.JButton btn82;
    private javax.swing.JButton btn83;
    private javax.swing.JButton btn84;
    private javax.swing.JButton btn85;
    private javax.swing.JButton btn86;
    private javax.swing.JButton btn87;
    private javax.swing.JButton btn88;
    private javax.swing.JButton btn89;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn90;
    private javax.swing.JButton btn91;
    private javax.swing.JButton btn92;
    private javax.swing.JButton btn93;
    private javax.swing.JButton btn94;
    private javax.swing.JButton btn95;
    private javax.swing.JButton btn96;
    private javax.swing.JButton btn97;
    private javax.swing.JButton btn98;
    private javax.swing.JButton btn99;
    private javax.swing.JLabel chaktiButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton132;
    private javax.swing.JButton jButton147;
    private javax.swing.JButton jButton148;
    private javax.swing.JButton jButton169;
    private javax.swing.JButton jButton170;
    private javax.swing.JButton jButton171;
    private javax.swing.JButton jButton172;
    private javax.swing.JButton jButton173;
    private javax.swing.JButton jButton174;
    private javax.swing.JButton jButton175;
    private javax.swing.JButton jButton176;
    private javax.swing.JButton jButton177;
    private javax.swing.JButton jButton178;
    private javax.swing.JButton jButton179;
    private javax.swing.JButton jButton180;
    private javax.swing.JButton jButton181;
    private javax.swing.JButton jButton182;
    private javax.swing.JButton jButton183;
    private javax.swing.JButton jButton184;
    private javax.swing.JButton jButton185;
    private javax.swing.JButton jButton186;
    private javax.swing.JButton jButton187;
    private javax.swing.JButton jButton188;
    private javax.swing.JButton jButton190;
    private javax.swing.JButton jButton201;
    private javax.swing.JButton jButton202;
    private javax.swing.JButton jButton203;
    private javax.swing.JButton jButton204;
    private javax.swing.JButton jButton219;
    private javax.swing.JButton jButton220;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton metalButton;
    private javax.swing.JButton shortCutButton;
    // End of variables declaration//GEN-END:variables

    // Button Information
    public void ElementInformation(int x) {
        dispose();
        new PeriodicCode(x).setVisible(true);
    }
    // Image show  
    public ImageIcon showImage(String image) {
         java.net.URL imageU = getClass().getResource(image);
        ImageIcon iconLogo = new ImageIcon(imageU);
        return iconLogo;
    }
    
    // This code for change icon
    public Image changeIcon() {
        URL url = getClass().getResource("table.png");
        ImageIcon icon = new ImageIcon(url);
        Image image = icon.getImage();
        return image;
    }
}
