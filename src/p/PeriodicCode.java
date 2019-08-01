package p;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;

public class PeriodicCode extends javax.swing.JFrame {

    Periodic_Table pt = new Periodic_Table();
    public int x = 0;

    public String symble[] = {"","H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K","Ca","Sc","Ti","V","Cr","Mn",
        "Fe","Co","Ni","Cu","Zn","Ga","Ge","As","Se","Br","Kr","Rb","Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn",
        "Sb","Te","I","Xe","Cs","Ba","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu","Hf","Ta","W","Re",
        "Os","Ir","Pt","Au","Hg","Tl","Pb","Bi","Po","At","Rn","Fr","Ra","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm",
        "Md","No","Lr","Rf","Db","Sg","Bh","Hs","Mt","Ds","Rg"};

    public String name[] = {"","Hydrogen","Helium","Lithium","Beryllium","Boron","Carbon","Nitrogen","Oxygen","Fluorine","Neon","Sodium","Magnesium",
              "Aluminium","Silicon","Phosphorus","Sulphur","Chlorine","Argon","Potassium","Calcium","Scandium","Titanium","Vanadium","Chromium","Manganese",
              "Iron","Cobalt","Nickel","Copper","Zinc","Gallium","Germanium","Arsenic","Selenium","Bromine","Krypton","Rubidium","Strontium","Yttrium","Zirconium",
              "Niobium","Molybdenum","Technetium","Ruthenium","Rhodium","Palladium","Silver","Cadmium","Indium","Tin","Antimony","Tellurium","Iodine","Xenon",
              "Caesium","Barium","Lanthanum","Cerium","Praseodimium","Neodimium","Promethium","Samarium","Europium","Gadolinium","Terbium","Dysprosium","Holmium",
              "Erbium","Thulium","Ytterbium","Lutetium","Hafnium","Tantalum","Tungsten","Rhenium","Osmium","Iridium","Platinum","Gold","Mercury","Thallium","Lead",
              "Bismuth","Polonium","Astetine","Radon","Francium","Radium","Actinium","Thorium","Protoactinium","Uranium","Neptunium","Plutonium","Americium",
              "Curium","Berkelium","Californium","Einsteinium","Fermium","Mendelevium","Nobelium","Lawrencium","Rutherfordium","Dubnium","Seaborgium","Bohrium",
              "Hassium","Meitnerium","Darmstadtium","Roentgenium"};

    public String electronegativity[] = {"","2.2","0","1.0","1.5","2.0","2.5","3.1","3.5","4.1","0","1.0","1.2","1.5","1.7","2.1","2.4","2.8","0","0.9","1.0",
            "1.2","1.3","1.5","1.6","1.6","1.6","1.7","1.8","1.8","1.7","1.8","2.0","2.2","2.5","2.7","0","0.9","1.0","1.1","1.2","1.2","1.3","1.4","1.4","1.5",
            "1.4","1.4","1.5","1.5","1.7","1.8","2.0","2.2","0","0.9","1.0","1.1","1.1","1.1","1.1","1.1","1.1","1.0","1.1","1.1","1.1","1.1","1.1","1.1","1.1",
            "1.1","1.2","1.3","1.4","1.5","1.5","1.6","1.4","1.4","1.5","1.4","1.6","1.7","1.8","2.0","0","0.9","1.0","1.0","1.1","1.1","1.2","1.2","1.2","-1.2",
            "-1.2","-1.2","-1.2","-1.2","-1.2","-1.2", "","","","","","","","","","","","","","","","","","","","","","",""};

    public String oxidation[] = {"0","-1.1","0","1","2","3","-4,2,4","-3,2,3,4,5","-2,-1","-1","0","1","2","3","4","-3,3,5","-2,2,4,6","-1,1,3,5,7","0","1","2","3",
        "3,4","2,3,4,5","2,3,6","2,3,4,6,7","2,3,6","2,3","2,3","1.2","2","3","4","-3,3,5","-2,4,6","-1,1,3,5,7","0","1","2","3","4","3,5","2,3,4,5,6","7",
        "3,4,8","1,2,3,4","2,4","1,2","2","3","2,4","-3,3,5","-2,4,6","-1,1,3,5,7","2,4,6","1","2","3","3.4","3.4","3","3","2,3","2,3","3","3,4","3","3","3",
        "2,3","2,3","3","4","5","2,3,4,5,6","2,4,7","2,3,4,6,8","1,2,3,4,6","1.4","1.3","1.2","1,3","2,4","3,5","2,4,6","-1,1,3,5,7","2","1","2","3","4",
        "4.5","3,4,5,6","3,4,5,6","3,4,5,6","3,4,5,6","3,4","3,4","3,4","3","3","3","2,3","3"};

    public String atomic_mass[] = {"","1.008","4.003","6.94","9.012","10.81","12.011","14.007","16.00","19.00","20.18","22.99","24.30","26.982","28.086","30.974",
        "32.064","35.46","39.948","39.10","40.08","44.956","47.67","50.942","52.00","54.94","55.85","58.93","58.69","63.546","65.41","69.72","72.64","74.922",
        "78.96","79.904","83.80","85.68","87.62","88.910","91.224","92.910","95.94","99.00","101.07","102.91","106.42","107.87","112.41","114.76","118.70",
        "121.76","127.60","126.90","131.29","132.91","137.34","138.91","140.12","140.91","144.24","146.92","150.36","151.96","157.25","158.93","162.50",
        "164.93","167.26","168.93","173.04","174.97","178.49","180.95","183.84","186.21","190.23","192.22","195.08","196.97","200.59","204.38","207.20",
        "208.98","208.98","210.00","222.02","223.02","226.03","227.03","232.04","231.04","238.03","237.05","244.06","243.06","247.07","247.07","251.08",
        "252.08","257.01","258.01","259.01","262.11","261.11","262.11","262.11","266.12","264.12","277.00","268.13","271.00","272.00"};

    public String freezing_point[] = {"","-259.14","-272.2","180.54","1278","2079","3387","-209.86","-218.4","-219.62","-248.67","97.81","648.8","660.37","14.10","44.1",
        "112.8","-100.98","-189.2","63.65","839","1541","1660","1890","1857","1244","1535","1495","1453","1083","419.6","29.78","937.4","817","217","-7.2",
        "-156.6","38.89","769","1522","1852","2468","2617","2172","2310","1966","1552","961.9","320.9","156.6","232","630.7","449.5","113.5","-111.9","28.40",
        "725","921","799","931","1021","1168","1077","822","1331","1356","1412","1474","1497","1545","819","1663","2227","2996","3410","3180","3045","2410",
        "1772","1064","-38.84","303.5","327.5","271.8","254","302","71","27","700","1050","1750","1600","1132","640","641","994","1340", "","","","","","",
        "","","","","","","","","","","","","","","","",""};

    public String meltting_point[] = {"","-252.87","-268.93","1347","2970","2550","4827","-195.8","-182.96","-188.14","-246.05","882.9","1090","2467","2355","280",
        "444.67","-34.6","-185.7","774","1484","2831","3287","3380","2672","1962","2750","2870","2732","2567","907","2403","2830","613","684.9","58.78","-152.3",
        "688","1384","3338","4377","4742","4612","4877","3900","3727","3140","2212","765","2080","2270","1750","990","184.4","-107.1","678.4","1640","3757",
        "3426","3512","3068","2460","1791","1597","3266","3123","2562","2695","2900","1947","1194","3395","4602","5425","5660","5627","5027","4130","3827",
        "2807","356.6","1457","1740","1560","962","337","-61.8","677","1140","32000","4790","","3818","3902","3232","2607", "","","","","","","","","","","",
        "","","","","","","","","","","",""};

    public String location1[] = {"","IA","O or VIIIA","IA","IIA","IIIA","IVA","VA","VIA","VIIIA","O or VIIIA","IA","IIA","IIIA","IVA","VA","VIA","VIIA","O or VIIIA","IA",
        "IIA","IIIB","IVB","VB","VIB","VIIB","VIII","VIII","VIII","IB","IIB","IIIA","IVA","VA","VIA","VIIA","O or VIIIA","IA","IIA","IIIB","IVB","VB","VIB",
        "VIIB","VIII","VIII","VIII","IB","IIB","IIIA","IVA","VA","VIA","VIIA","O or VIIIA","IA","IIA","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB",
        "IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IVB","VB","VIB","VIIB","VIII","VIII","VIII","IB","IIB","IIIA","IVA","VA","VIA","VIIA","O or VIIIA",
        "IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IA","IIA","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB",
        "IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IVB","VB","VIB","VIIB","VIII","VIII","VIII","IB","IIB","IIIA","IVA","VA","VIA","VIIA","O or VIIIA",
        "IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB","IIIB"};

    public String location2[] = {"","1st","1st","2nd","2nd","2nd","2nd","2nd","2nd","2nd","2nd","3th","3th","3th","3th","3th","3th","3th","3th","4th","4th","4th","4th",
        "4th","4th","4th","4th","4th","4th","4th","4th","4th","4th","4th","4th","4th","4th","5th","5th","5th","5th","5th","5th","5th","5th","5th","5th","5th",
        "5th","5th","5th","5th","5th","5th","5th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th",
        "6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","6th","7th","7th","7th","7th","7th","7th","7th","7th","7th","7th",
        "7th","7th","7th","7th","7th","7th","7th","7th","7th","7th","7th","7th","7th","7th","7th"};

    public String type[] = {"","non metal","non metal","metal","metal","non metal","non metal","non metal","non metal","non metal","non metal","metal","metal","metal",
        "non metal","non metal","non metal","non metal","non metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal",
        "metal","metal","metal","non metal","non metal","non metal","non metal","metal","metal","metal","metal","metal","metal","metal","metal","metal",
        "metal","metal","metal","metal","metal","metal","non metal","non metal","non metal","metal","metal","metal","metal","metal","metal","metal","metal",
        "metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal",
        "metal","metal","metal","metal","non metal","non metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal",
        "metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal","metal",};
    
       

    public PeriodicCode(int  x) {
        initComponents();
        this.setIconImage(pt.changeIcon());
        table2.setIcon(pt.showImage("table2.jpg"));
        jLabel1.setText("01. Atomic number     > " + String.valueOf(x));
        jLabel2.setText("02. Symble                  > " + symble[x]);
        jLabel3.setText("03. Element                 > " + name[x]);
        jLabel4.setText("04. Atomic mass          > " + atomic_mass[x]);
        if (x<102)
        jLabel9.setText("09. Electronegativity   > " + electronegativity[x]);
        if (x<97)
        jLabel10.setText("10. Freezing point       > " + freezing_point[x]);
        if (x<96)
        jLabel11.setText("11. Meltting point       > " + meltting_point[x]);
        if(x<104)
        jLabel8.setText("08. Oxidation number > " + oxidation[x]);
        jLabel5.setText("5. Group                    > " + location1[x]);
        jLabel6.setText("6. Period                    > " + location2[x]);
        jLabel7.setText("7. Type of element     > " + type[x]);
    }

    PeriodicCode() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        table2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Element's information");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText(" ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText(" ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText(" ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText(" ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText(" ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText(" ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText(" ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText(" ");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText(" ");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText(" ");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("  ");

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("     Reference  books on  Hazari sir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        table2.setText(" ");
        table2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(table2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(table2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        dispose();
        new Periodic_Table().setVisible(true);
    }//GEN-LAST:event_table2MouseClicked

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
            java.util.logging.Logger.getLogger(PeriodicCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeriodicCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeriodicCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeriodicCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new PeriodicCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel table2;
    // End of variables declaration//GEN-END:variables

}
