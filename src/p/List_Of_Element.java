
package p;

public class List_Of_Element extends javax.swing.JFrame {

    Periodic_Table pt = new Periodic_Table();
    int count = 0;
    public String name[] = {"","Hydrogen","Helium","Lithium","Beryllium","Boron","Carbon","Nitrogen","Oxygen","Fluorine","Neon","Sodium","Magnesium",
              "Aluminium","Silicon","Phosphorus","Sulphur","Chlorine","Argon","Potassium","Calcium","Scandium","Titanium","Vanadium","Chromium","Manganese",
              "Iron","Cobalt","Nickel","Copper","Zinc","Gallium","Germanium","Arsenic","Selenium","Bromine","Krypton","Rubidium","Strontium","Yttrium","Zirconium",
              "Niobium","Molybdenum","Technetium","Ruthenium","Rhodium","Palladium","Silver","Cadmium","Indium","Tin","Antimony","Tellurium","Iodine","Xenon",
              "Caesium","Barium","Lanthanum","Cerium","Praseodimium","Neodimium","Promethium","Samarium","Europium","Gadolinium","Terbium","Dysprosium","Holmium",
              "Erbium","Thulium","Ytterbium","Lutetium","Hafnium","Tantalum","Tungsten","Rhenium","Osmium","Iridium","Platinum","Gold","Mercury","Thallium","Lead",
              "Bismuth","Polonium","Astetine","Radon","Francium","Radium","Actinium","Thorium","Protoactinium","Uranium","Neptunium","Plutonium","Americium",
              "Curium","Berkelium","Californium","Einsteinium","Fermium","Mendelevium","Nobelium","Lawrencium","Rutherfordium","Dubnium","Seaborgium","Bohrium",
              "Hassium","Meitnerium","Darmstadtium","Roentgenium"};
    public String symble[] = {"","H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K","Ca","Sc","Ti","V","Cr","Mn",
        "Fe","Co","Ni","Cu","Zn","Ga","Ge","As","Se","Br","Kr","Rb","Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn",
        "Sb","Te","I","Xe","Cs","Ba","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu","Hf","Ta","W","Re",
        "Os","Ir","Pt","Au","Hg","Tl","Pb","Bi","Po","At","Rn","Fr","Ra","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm",
        "Md","No","Lr","Rf","Db","Sg","Bh","Hs","Mt","Ds","Rg"};
    public String atomic_mass[] = {"","1.008","4.003","6.94","9.012","10.81","12.011","14.007","16.00","19.00","20.18","22.99","24.30","26.982","28.086","30.974",
        "32.064","35.46","39.948","39.10","40.08","44.956","47.67","50.942","52.00","54.94","55.85","58.93","58.69","63.546","65.41","69.72","72.64","74.922",
        "78.96","79.904","83.80","85.68","87.62","88.910","91.224","92.910","95.94","99.00","101.07","102.91","106.42","107.87","112.41","114.76","118.70",
        "121.76","127.60","126.90","131.29","132.91","137.34","138.91","140.12","140.91","144.24","146.92","150.36","151.96","157.25","158.93","162.50",
        "164.93","167.26","168.93","173.04","174.97","178.49","180.95","183.84","186.21","190.23","192.22","195.08","196.97","200.59","204.38","207.20",
        "208.98","208.98","210.00","222.02","223.02","226.03","227.03","232.04","231.04","238.03","237.05","244.06","243.06","247.07","247.07","251.08",
        "252.08","257.01","258.01","259.01","262.11","261.11","262.11","262.11","266.12","264.12","277.00","268.13","271.00","272.00"};
    
    public List_Of_Element() {
        initComponents();
        this.setIconImage(pt.changeIcon());
        btn_back.setIcon(pt.showImage("back.png"));
        level_bg.setIcon(pt.showImage("list_background.png"));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Element1 = new javax.swing.JLabel();
        mass1 = new javax.swing.JLabel();
        mass2 = new javax.swing.JLabel();
        mass3 = new javax.swing.JLabel();
        mass4 = new javax.swing.JLabel();
        mass5 = new javax.swing.JLabel();
        mass6 = new javax.swing.JLabel();
        mass7 = new javax.swing.JLabel();
        mass8 = new javax.swing.JLabel();
        mass9 = new javax.swing.JLabel();
        Element2 = new javax.swing.JLabel();
        Element3 = new javax.swing.JLabel();
        Element4 = new javax.swing.JLabel();
        Element5 = new javax.swing.JLabel();
        Element6 = new javax.swing.JLabel();
        Element7 = new javax.swing.JLabel();
        Element8 = new javax.swing.JLabel();
        Element9 = new javax.swing.JLabel();
        Symble1 = new javax.swing.JLabel();
        Symble2 = new javax.swing.JLabel();
        Symble3 = new javax.swing.JLabel();
        Symble4 = new javax.swing.JLabel();
        Symble5 = new javax.swing.JLabel();
        Symble6 = new javax.swing.JLabel();
        Symble7 = new javax.swing.JLabel();
        Symble8 = new javax.swing.JLabel();
        Symble9 = new javax.swing.JLabel();
        serial1 = new javax.swing.JLabel();
        serial2 = new javax.swing.JLabel();
        serial3 = new javax.swing.JLabel();
        serial4 = new javax.swing.JLabel();
        serial5 = new javax.swing.JLabel();
        serial6 = new javax.swing.JLabel();
        serial7 = new javax.swing.JLabel();
        serial8 = new javax.swing.JLabel();
        serial9 = new javax.swing.JLabel();
        btn_up = new javax.swing.JLabel();
        btn_down = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        level_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Element1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Element1.setForeground(new java.awt.Color(153, 0, 204));
        Element1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Element1.setText("Hydrogen");
        Element1.setAlignmentX(5.0F);
        Element1.setAlignmentY(0.0F);
        jPanel1.add(Element1, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 82, 190, 40));

        mass1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mass1.setForeground(new java.awt.Color(0, 51, 255));
        mass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mass1.setText("1.01");
        mass1.setAlignmentY(0.0F);
        jPanel1.add(mass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 82, 160, 40));

        mass2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mass2.setForeground(new java.awt.Color(0, 51, 255));
        mass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mass2.setText("4.00");
        mass2.setAlignmentY(0.0F);
        jPanel1.add(mass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 131, 160, 40));

        mass3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mass3.setForeground(new java.awt.Color(0, 51, 255));
        mass3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mass3.setText("6.94");
        mass3.setAlignmentY(0.0F);
        jPanel1.add(mass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 178, 160, 40));

        mass4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mass4.setForeground(new java.awt.Color(0, 51, 255));
        mass4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mass4.setText("9.01");
        mass4.setAlignmentY(0.0F);
        jPanel1.add(mass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 222, 160, 40));

        mass5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mass5.setForeground(new java.awt.Color(0, 51, 255));
        mass5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mass5.setText("10.81");
        mass5.setAlignmentY(0.0F);
        jPanel1.add(mass5, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 270, 160, 40));

        mass6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mass6.setForeground(new java.awt.Color(0, 51, 255));
        mass6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mass6.setText("12.01");
        mass6.setAlignmentY(0.0F);
        jPanel1.add(mass6, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 315, 160, 40));

        mass7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mass7.setForeground(new java.awt.Color(0, 51, 255));
        mass7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mass7.setText("16.00");
        mass7.setAlignmentY(0.0F);
        jPanel1.add(mass7, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 362, 160, 40));

        mass8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mass8.setForeground(new java.awt.Color(0, 51, 255));
        mass8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mass8.setText("19.00");
        mass8.setAlignmentY(0.0F);
        jPanel1.add(mass8, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 408, 160, 40));

        mass9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mass9.setForeground(new java.awt.Color(0, 51, 255));
        mass9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mass9.setText("20.18");
        mass9.setAlignmentY(0.0F);
        jPanel1.add(mass9, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 456, 160, 40));

        Element2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Element2.setForeground(new java.awt.Color(153, 0, 204));
        Element2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Element2.setText("Helium");
        Element2.setAlignmentX(5.0F);
        Element2.setAlignmentY(0.0F);
        jPanel1.add(Element2, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 131, 190, 40));

        Element3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Element3.setForeground(new java.awt.Color(153, 0, 204));
        Element3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Element3.setText("Lithium");
        Element3.setAlignmentX(5.0F);
        Element3.setAlignmentY(0.0F);
        jPanel1.add(Element3, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 178, 190, 40));

        Element4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Element4.setForeground(new java.awt.Color(153, 0, 204));
        Element4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Element4.setText("Beryllium");
        Element4.setAlignmentX(5.0F);
        Element4.setAlignmentY(0.0F);
        jPanel1.add(Element4, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 222, 190, 40));

        Element5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Element5.setForeground(new java.awt.Color(153, 0, 204));
        Element5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Element5.setText("Boron");
        Element5.setAlignmentX(5.0F);
        Element5.setAlignmentY(0.0F);
        jPanel1.add(Element5, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 270, 190, 40));

        Element6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Element6.setForeground(new java.awt.Color(153, 0, 204));
        Element6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Element6.setText("Carbon");
        Element6.setAlignmentX(5.0F);
        Element6.setAlignmentY(0.0F);
        jPanel1.add(Element6, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 315, 190, 40));

        Element7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Element7.setForeground(new java.awt.Color(153, 0, 204));
        Element7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Element7.setText("Nitrogen");
        Element7.setAlignmentX(5.0F);
        Element7.setAlignmentY(0.0F);
        jPanel1.add(Element7, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 362, 190, 40));

        Element8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Element8.setForeground(new java.awt.Color(153, 0, 204));
        Element8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Element8.setText("Oxygen");
        Element8.setAlignmentX(5.0F);
        Element8.setAlignmentY(0.0F);
        jPanel1.add(Element8, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 408, 190, 40));

        Element9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Element9.setForeground(new java.awt.Color(153, 0, 204));
        Element9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Element9.setText("Fluorine");
        Element9.setAlignmentX(5.0F);
        Element9.setAlignmentY(0.0F);
        jPanel1.add(Element9, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 456, 190, 40));

        Symble1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Symble1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Symble1.setText("H");
        Symble1.setAlignmentY(0.0F);
        jPanel1.add(Symble1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 82, 172, 40));

        Symble2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Symble2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Symble2.setText("He");
        Symble2.setAlignmentY(0.0F);
        jPanel1.add(Symble2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 131, 172, 40));

        Symble3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Symble3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Symble3.setText("Li");
        Symble3.setAlignmentY(0.0F);
        jPanel1.add(Symble3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 178, 172, 40));

        Symble4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Symble4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Symble4.setText("Be");
        Symble4.setAlignmentY(0.0F);
        jPanel1.add(Symble4, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 222, 172, 40));

        Symble5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Symble5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Symble5.setText("B");
        Symble5.setAlignmentY(0.0F);
        jPanel1.add(Symble5, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 270, 172, 40));

        Symble6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Symble6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Symble6.setText("C");
        Symble6.setAlignmentY(0.0F);
        jPanel1.add(Symble6, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 315, 172, 40));

        Symble7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Symble7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Symble7.setText("N");
        Symble7.setAlignmentY(0.0F);
        jPanel1.add(Symble7, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 362, 172, 40));

        Symble8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Symble8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Symble8.setText("O");
        Symble8.setAlignmentY(0.0F);
        jPanel1.add(Symble8, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 408, 172, 40));

        Symble9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Symble9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Symble9.setText("F");
        Symble9.setAlignmentY(0.0F);
        jPanel1.add(Symble9, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 456, 178, 40));

        serial1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        serial1.setForeground(new java.awt.Color(204, 0, 204));
        serial1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serial1.setText("1.");
        serial1.setAlignmentY(0.0F);
        jPanel1.add(serial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 82, 100, 40));

        serial2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        serial2.setForeground(new java.awt.Color(204, 0, 204));
        serial2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serial2.setText("2.");
        serial2.setAlignmentY(0.0F);
        jPanel1.add(serial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 131, 100, 40));

        serial3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        serial3.setForeground(new java.awt.Color(204, 0, 204));
        serial3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serial3.setText("3.");
        serial3.setAlignmentY(0.0F);
        jPanel1.add(serial3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 178, 100, 40));

        serial4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        serial4.setForeground(new java.awt.Color(204, 0, 204));
        serial4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serial4.setText("4.");
        serial4.setAlignmentY(0.0F);
        jPanel1.add(serial4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 222, 100, 40));

        serial5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        serial5.setForeground(new java.awt.Color(204, 0, 204));
        serial5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serial5.setText("5.");
        serial5.setAlignmentY(0.0F);
        jPanel1.add(serial5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 270, 100, 40));

        serial6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        serial6.setForeground(new java.awt.Color(204, 0, 204));
        serial6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serial6.setText("6.");
        serial6.setAlignmentY(0.0F);
        jPanel1.add(serial6, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 315, 100, 40));

        serial7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        serial7.setForeground(new java.awt.Color(204, 0, 204));
        serial7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serial7.setText("7.");
        serial7.setAlignmentY(0.0F);
        jPanel1.add(serial7, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 362, 100, 40));

        serial8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        serial8.setForeground(new java.awt.Color(204, 0, 204));
        serial8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serial8.setText("8.");
        serial8.setAlignmentY(0.0F);
        jPanel1.add(serial8, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 408, 100, 40));

        serial9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        serial9.setForeground(new java.awt.Color(204, 0, 204));
        serial9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serial9.setText("9.");
        serial9.setAlignmentY(0.0F);
        jPanel1.add(serial9, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 456, 100, 40));

        btn_up.setText(" ");
        btn_up.setAlignmentY(0.0F);
        btn_up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_upMouseClicked(evt);
            }
        });
        jPanel1.add(btn_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 230, 22, 20));

        btn_down.setText(" ");
        btn_down.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_downMouseClicked(evt);
            }
        });
        jPanel1.add(btn_down, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 258, 22, 20));

        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 1, 60, 30));

        level_bg.setForeground(new java.awt.Color(255, 255, 0));
        level_bg.setIcon(new javax.swing.ImageIcon("G:\\PeriodicTable\\Images\\list_background.png")); // NOI18N
        level_bg.setText(" ");
        jPanel1.add(level_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

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

    private void btn_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_upMouseClicked
        if(count>0) {
            textSet();
            count--;
        }
    }//GEN-LAST:event_btn_upMouseClicked

    private void btn_downMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_downMouseClicked
        if(count<103) {
            count ++;
            textSet();
        }
    }//GEN-LAST:event_btn_downMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        dispose();
        new MenuBar().setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List_Of_Element().setVisible(true);
            }
        });
    }

    /**********************************     Text setup       ************************************/
    void textSet() {
        serial1.setText(count + ".");
            serial2.setText(count+1 + ".");
            serial3.setText(count+2 + ".");
            serial4.setText(count+3 + ".");
            serial5.setText(count+4 + ".");
            serial6.setText(count+5 + ".");
            serial7.setText(count+6 + ".");
            serial8.setText(count+7 + ".");
            serial9.setText(count+8 + ".");
            Symble1.setText(symble[count]);
            Symble2.setText(symble[count+1]);
            Symble3.setText(symble[count+2]);
            Symble4.setText(symble[count+3]);
            Symble5.setText(symble[count+4]);
            Symble6.setText(symble[count+5]);
            Symble7.setText(symble[count+6]);
            Symble8.setText(symble[count+7]);
            Symble9.setText(symble[count+8]);
            Element1.setText(name[count]);
            Element2.setText(name[count+1]);
            Element3.setText(name[count+2]);
            Element4.setText(name[count+3]);
            Element5.setText(name[count+4]);
            Element6.setText(name[count+5]);
            Element7.setText(name[count+6]);
            Element8.setText(name[count+7]);
            Element9.setText(name[count+8]);
            mass1.setText(atomic_mass[count]);
            mass2.setText(atomic_mass[count+1]);
            mass3.setText(atomic_mass[count+2]);
            mass4.setText(atomic_mass[count+3]);
            mass5.setText(atomic_mass[count+4]);
            mass6.setText(atomic_mass[count+5]);
            mass7.setText(atomic_mass[count+6]);
            mass8.setText(atomic_mass[count+7]);
            mass9.setText(atomic_mass[count+8]);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Element1;
    private javax.swing.JLabel Element2;
    private javax.swing.JLabel Element3;
    private javax.swing.JLabel Element4;
    private javax.swing.JLabel Element5;
    private javax.swing.JLabel Element6;
    private javax.swing.JLabel Element7;
    private javax.swing.JLabel Element8;
    private javax.swing.JLabel Element9;
    private javax.swing.JLabel Symble1;
    private javax.swing.JLabel Symble2;
    private javax.swing.JLabel Symble3;
    private javax.swing.JLabel Symble4;
    private javax.swing.JLabel Symble5;
    private javax.swing.JLabel Symble6;
    private javax.swing.JLabel Symble7;
    private javax.swing.JLabel Symble8;
    private javax.swing.JLabel Symble9;
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel btn_down;
    private javax.swing.JLabel btn_up;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel level_bg;
    private javax.swing.JLabel mass1;
    private javax.swing.JLabel mass2;
    private javax.swing.JLabel mass3;
    private javax.swing.JLabel mass4;
    private javax.swing.JLabel mass5;
    private javax.swing.JLabel mass6;
    private javax.swing.JLabel mass7;
    private javax.swing.JLabel mass8;
    private javax.swing.JLabel mass9;
    private javax.swing.JLabel serial1;
    private javax.swing.JLabel serial2;
    private javax.swing.JLabel serial3;
    private javax.swing.JLabel serial4;
    private javax.swing.JLabel serial5;
    private javax.swing.JLabel serial6;
    private javax.swing.JLabel serial7;
    private javax.swing.JLabel serial8;
    private javax.swing.JLabel serial9;
    // End of variables declaration//GEN-END:variables
}
