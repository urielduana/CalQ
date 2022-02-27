package calq;

/**
 *
 * @author Uriel Ulises Gustavo
 * @company UPQ
 * @date 2021
 * 
 */
public class EquationLayout extends javax.swing.JFrame {
    
    //Seleccion LABEL
    private int selection;
    private double x1, x2;
    
    
    //Areas y Perimetros | variable *areas*
    AreasPerimetros areas = new AreasPerimetros();
    //Volumenes | variable *volumen*
    Volumenes volumen = new Volumenes();
    //Estadistica y Probabilidad | variable *stats*
    Estadistica_Probabilidad stats = new Estadistica_Probabilidad();
    //Conversiones SMD - Inglés | variable *conversiones*
    Conversiones conversiones = new Conversiones();
    //Pitagoras | variable *pitagoras*
    Pitagoras pitagoras = new Pitagoras();
    
    
    
    public EquationLayout() {
        initComponents();
        setLocationRelativeTo(null);
        
        x1=0;
        x2=0;
        selection = 0;
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuBar8 = new javax.swing.JMenuBar();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenuBar9 = new javax.swing.JMenuBar();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        x1Output = new java.awt.Label();
        aLabel = new java.awt.Label();
        x1Txt = new java.awt.Label();
        ButtonEqua = new javax.swing.JButton();
        ButtonExtra1 = new javax.swing.JButton();
        ButtonAc = new javax.swing.JButton();
        ButtonSeven = new javax.swing.JButton();
        ButtonEight = new javax.swing.JButton();
        ButtonNine = new javax.swing.JButton();
        ButtonLeft = new javax.swing.JButton();
        ButtonOne = new javax.swing.JButton();
        ButtonFour = new javax.swing.JButton();
        ButtonFive = new javax.swing.JButton();
        ButtonSix = new javax.swing.JButton();
        Right = new javax.swing.JButton();
        ButtonTwo = new javax.swing.JButton();
        ButtonThree = new javax.swing.JButton();
        ButtonSubs = new javax.swing.JButton();
        ButtonZero = new javax.swing.JButton();
        ButtonAdd = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        ButtonEquals = new javax.swing.JButton();
        xLabel = new java.awt.Label();
        cLabel = new java.awt.Label();
        x2Label1 = new java.awt.Label();
        bLabel = new java.awt.Label();
        x2Output = new java.awt.Label();
        x2Txt = new java.awt.Label();
        selectionLabel = new java.awt.Label();
        MainMenuBar = new javax.swing.JMenuBar();
        menuAreas = new javax.swing.JMenu();
        menuCuadrado = new javax.swing.JMenuItem();
        menuCirculo = new javax.swing.JMenuItem();
        menuRectangulo = new javax.swing.JMenuItem();
        menuPoligono = new javax.swing.JMenuItem();
        menuTrapecio = new javax.swing.JMenu();
        menuTrapecioArea = new javax.swing.JMenuItem();
        menuTrapecioPerimetro = new javax.swing.JMenuItem();
        menuRombo = new javax.swing.JMenu();
        menuRomboArea = new javax.swing.JMenuItem();
        menuRomboPerimetro = new javax.swing.JMenuItem();
        menuTrianguloMain = new javax.swing.JMenu();
        menuTrianguloSimple = new javax.swing.JMenuItem();
        menuTrianguloHeron = new javax.swing.JMenuItem();
        menuVolumen = new javax.swing.JMenu();
        menuCubo = new javax.swing.JMenuItem();
        menuCilindro = new javax.swing.JMenuItem();
        menuEsfera = new javax.swing.JMenuItem();
        menuCono = new javax.swing.JMenuItem();
        menuPrismas = new javax.swing.JMenuItem();
        menuPiramides = new javax.swing.JMenuItem();
        menuProba = new javax.swing.JMenu();
        menuVarianza = new javax.swing.JMenuItem();
        menuDesviación = new javax.swing.JMenuItem();
        menuPermutacion = new javax.swing.JMenuItem();
        menuCombinacion = new javax.swing.JMenuItem();
        menuMMM = new javax.swing.JMenuItem();
        menuPitagoras = new javax.swing.JMenu();
        menuTrianguloPitagoras = new javax.swing.JMenuItem();
        menuIngles = new javax.swing.JMenu();
        menuInCm = new javax.swing.JMenuItem();
        menuFtCm = new javax.swing.JMenuItem();
        menuYdM = new javax.swing.JMenuItem();
        menuMiKm = new javax.swing.JMenuItem();
        menuLbGr = new javax.swing.JMenuItem();
        menuOzGr = new javax.swing.JMenuItem();
        menuGalLts = new javax.swing.JMenuItem();
        menuQtMl = new javax.swing.JMenuItem();
        menuFtLts = new javax.swing.JMenuItem();
        menuSmd = new javax.swing.JMenu();
        menuCmIn = new javax.swing.JMenuItem();
        menuCmFt = new javax.swing.JMenuItem();
        menuMYd = new javax.swing.JMenuItem();
        menuKmMi = new javax.swing.JMenuItem();
        menuGrLib = new javax.swing.JMenuItem();
        menuGrOz = new javax.swing.JMenuItem();
        menuLtsGal = new javax.swing.JMenuItem();
        menuMlQt = new javax.swing.JMenuItem();
        menuLtsFt = new javax.swing.JMenuItem();
        menuTemp = new javax.swing.JMenu();
        menuKC = new javax.swing.JMenuItem();
        menuKF = new javax.swing.JMenuItem();
        menuCK = new javax.swing.JMenuItem();
        menuCF = new javax.swing.JMenuItem();
        menuFK = new javax.swing.JMenuItem();
        menuFC = new javax.swing.JMenuItem();

        jMenuItem16.setText("jMenuItem16");

        jMenuItem22.setText("jMenuItem22");

        jMenuItem23.setText("jMenuItem23");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        jMenu11.setText("File");
        jMenuBar6.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar6.add(jMenu12);

        jMenu13.setText("File");
        jMenuBar7.add(jMenu13);

        jMenu14.setText("Edit");
        jMenuBar7.add(jMenu14);

        jMenu15.setText("File");
        jMenuBar8.add(jMenu15);

        jMenu16.setText("Edit");
        jMenuBar8.add(jMenu16);

        jMenu17.setText("File");
        jMenuBar9.add(jMenu17);

        jMenu18.setText("Edit");
        jMenuBar9.add(jMenu18);

        jMenuItem30.setText("jMenuItem30");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        x1Output.setAlignment(java.awt.Label.RIGHT);
        x1Output.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 24)); // NOI18N
        x1Output.setForeground(new java.awt.Color(255, 255, 255));
        x1Output.setName(""); // NOI18N

        aLabel.setAlignment(java.awt.Label.RIGHT);
        aLabel.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 45)); // NOI18N
        aLabel.setForeground(new java.awt.Color(255, 255, 255));

        x1Txt.setAlignment(java.awt.Label.RIGHT);
        x1Txt.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 50)); // NOI18N
        x1Txt.setForeground(new java.awt.Color(255, 255, 255));
        x1Txt.setText("x=");

        ButtonEqua.setBackground(new java.awt.Color(165, 0, 16));
        ButtonEqua.setForeground(new java.awt.Color(153, 0, 0));
        ButtonEqua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonCalculadora.png"))); // NOI18N
        ButtonEqua.setBorderPainted(false);
        ButtonEqua.setFocusPainted(false);
        ButtonEqua.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonCalculadora0.png"))); // NOI18N
        ButtonEqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEquaActionPerformed(evt);
            }
        });

        ButtonExtra1.setBackground(new java.awt.Color(165, 0, 16));
        ButtonExtra1.setForeground(new java.awt.Color(153, 0, 0));
        ButtonExtra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        ButtonExtra1.setBorderPainted(false);
        ButtonExtra1.setFocusPainted(false);
        ButtonExtra1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        ButtonExtra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExtra1ActionPerformed(evt);
            }
        });

        ButtonAc.setBackground(new java.awt.Color(26, 26, 26));
        ButtonAc.setForeground(new java.awt.Color(26, 26, 26));
        ButtonAc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonSymbolAc.png"))); // NOI18N
        ButtonAc.setBorderPainted(false);
        ButtonAc.setFocusPainted(false);
        ButtonAc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonSymbolAc0.png"))); // NOI18N
        ButtonAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAcActionPerformed(evt);
            }
        });

        ButtonSeven.setBackground(new java.awt.Color(37, 37, 37));
        ButtonSeven.setForeground(new java.awt.Color(37, 37, 37));
        ButtonSeven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber7.png"))); // NOI18N
        ButtonSeven.setBorderPainted(false);
        ButtonSeven.setContentAreaFilled(false);
        ButtonSeven.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonSeven.setFocusPainted(false);
        ButtonSeven.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber07.png"))); // NOI18N
        ButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSevenActionPerformed(evt);
            }
        });

        ButtonEight.setBackground(new java.awt.Color(37, 37, 37));
        ButtonEight.setForeground(new java.awt.Color(37, 37, 37));
        ButtonEight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber8.png"))); // NOI18N
        ButtonEight.setBorderPainted(false);
        ButtonEight.setFocusPainted(false);
        ButtonEight.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber08.png"))); // NOI18N
        ButtonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEightActionPerformed(evt);
            }
        });

        ButtonNine.setBackground(new java.awt.Color(37, 37, 37));
        ButtonNine.setForeground(new java.awt.Color(37, 37, 37));
        ButtonNine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber9.png"))); // NOI18N
        ButtonNine.setBorderPainted(false);
        ButtonNine.setFocusPainted(false);
        ButtonNine.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber09.png"))); // NOI18N
        ButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNineActionPerformed(evt);
            }
        });

        ButtonLeft.setBackground(new java.awt.Color(26, 26, 26));
        ButtonLeft.setForeground(new java.awt.Color(26, 26, 26));
        ButtonLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonLeft.png"))); // NOI18N
        ButtonLeft.setBorderPainted(false);
        ButtonLeft.setFocusPainted(false);
        ButtonLeft.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonLeft0.png"))); // NOI18N
        ButtonLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLeftActionPerformed(evt);
            }
        });

        ButtonOne.setBackground(new java.awt.Color(37, 37, 37));
        ButtonOne.setForeground(new java.awt.Color(37, 37, 37));
        ButtonOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber1.png"))); // NOI18N
        ButtonOne.setBorderPainted(false);
        ButtonOne.setFocusPainted(false);
        ButtonOne.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber01.png"))); // NOI18N
        ButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOneActionPerformed(evt);
            }
        });

        ButtonFour.setBackground(new java.awt.Color(37, 37, 37));
        ButtonFour.setForeground(new java.awt.Color(37, 37, 37));
        ButtonFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber4.png"))); // NOI18N
        ButtonFour.setBorderPainted(false);
        ButtonFour.setFocusPainted(false);
        ButtonFour.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber04.png"))); // NOI18N
        ButtonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFourActionPerformed(evt);
            }
        });

        ButtonFive.setBackground(new java.awt.Color(37, 37, 37));
        ButtonFive.setForeground(new java.awt.Color(37, 37, 37));
        ButtonFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber5.png"))); // NOI18N
        ButtonFive.setBorderPainted(false);
        ButtonFive.setFocusPainted(false);
        ButtonFive.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber05.png"))); // NOI18N
        ButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFiveActionPerformed(evt);
            }
        });

        ButtonSix.setBackground(new java.awt.Color(37, 37, 37));
        ButtonSix.setForeground(new java.awt.Color(37, 37, 37));
        ButtonSix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber6.png"))); // NOI18N
        ButtonSix.setBorderPainted(false);
        ButtonSix.setFocusPainted(false);
        ButtonSix.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber06.png"))); // NOI18N
        ButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSixActionPerformed(evt);
            }
        });

        Right.setBackground(new java.awt.Color(26, 26, 26));
        Right.setForeground(new java.awt.Color(26, 26, 26));
        Right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonRight.png"))); // NOI18N
        Right.setBorderPainted(false);
        Right.setFocusPainted(false);
        Right.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonRight0.png"))); // NOI18N
        Right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightActionPerformed(evt);
            }
        });

        ButtonTwo.setBackground(new java.awt.Color(37, 37, 37));
        ButtonTwo.setForeground(new java.awt.Color(37, 37, 37));
        ButtonTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber2.png"))); // NOI18N
        ButtonTwo.setBorderPainted(false);
        ButtonTwo.setFocusPainted(false);
        ButtonTwo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber02.png"))); // NOI18N
        ButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTwoActionPerformed(evt);
            }
        });

        ButtonThree.setBackground(new java.awt.Color(37, 37, 37));
        ButtonThree.setForeground(new java.awt.Color(37, 37, 37));
        ButtonThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber3.png"))); // NOI18N
        ButtonThree.setBorderPainted(false);
        ButtonThree.setFocusPainted(false);
        ButtonThree.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber03.png"))); // NOI18N
        ButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThreeActionPerformed(evt);
            }
        });

        ButtonSubs.setBackground(new java.awt.Color(26, 26, 26));
        ButtonSubs.setForeground(new java.awt.Color(26, 26, 26));
        ButtonSubs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonSymbolSubs.png"))); // NOI18N
        ButtonSubs.setBorderPainted(false);
        ButtonSubs.setFocusPainted(false);
        ButtonSubs.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonSymbolSubs0.png"))); // NOI18N
        ButtonSubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSubsActionPerformed(evt);
            }
        });

        ButtonZero.setBackground(new java.awt.Color(37, 37, 37));
        ButtonZero.setForeground(new java.awt.Color(37, 37, 37));
        ButtonZero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber0.png"))); // NOI18N
        ButtonZero.setBorderPainted(false);
        ButtonZero.setFocusPainted(false);
        ButtonZero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonNumber00.png"))); // NOI18N
        ButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonZeroActionPerformed(evt);
            }
        });

        ButtonAdd.setBackground(new java.awt.Color(26, 26, 26));
        ButtonAdd.setForeground(new java.awt.Color(26, 26, 26));
        ButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonSymbolAdd.png"))); // NOI18N
        ButtonAdd.setBorderPainted(false);
        ButtonAdd.setFocusPainted(false);
        ButtonAdd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonSymbolAdd0.png"))); // NOI18N
        ButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddActionPerformed(evt);
            }
        });

        ButtonDelete.setBackground(new java.awt.Color(26, 26, 26));
        ButtonDelete.setForeground(new java.awt.Color(26, 26, 26));
        ButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonSymbolDelete.png"))); // NOI18N
        ButtonDelete.setBorderPainted(false);
        ButtonDelete.setFocusPainted(false);
        ButtonDelete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonSymbolDelete0.png"))); // NOI18N
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        ButtonEquals.setBackground(new java.awt.Color(165, 0, 16));
        ButtonEquals.setForeground(new java.awt.Color(51, 51, 51));
        ButtonEquals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonSymbolEquals.png"))); // NOI18N
        ButtonEquals.setBorderPainted(false);
        ButtonEquals.setFocusPainted(false);
        ButtonEquals.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonSymbolEquals0.png"))); // NOI18N
        ButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEqualsActionPerformed(evt);
            }
        });

        xLabel.setAlignment(java.awt.Label.CENTER);
        xLabel.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 35)); // NOI18N
        xLabel.setForeground(new java.awt.Color(255, 255, 255));
        xLabel.setText("x +");

        cLabel.setAlignment(java.awt.Label.RIGHT);
        cLabel.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 45)); // NOI18N
        cLabel.setForeground(new java.awt.Color(255, 255, 255));

        x2Label1.setAlignment(java.awt.Label.CENTER);
        x2Label1.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 35)); // NOI18N
        x2Label1.setForeground(new java.awt.Color(255, 255, 255));
        x2Label1.setText("x^2 +");

        bLabel.setAlignment(java.awt.Label.RIGHT);
        bLabel.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 45)); // NOI18N
        bLabel.setForeground(new java.awt.Color(255, 255, 255));

        x2Output.setAlignment(java.awt.Label.RIGHT);
        x2Output.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 24)); // NOI18N
        x2Output.setForeground(new java.awt.Color(255, 255, 255));
        x2Output.setName(""); // NOI18N

        x2Txt.setAlignment(java.awt.Label.RIGHT);
        x2Txt.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 50)); // NOI18N
        x2Txt.setForeground(new java.awt.Color(255, 255, 255));
        x2Txt.setText("x =");

        selectionLabel.setAlignment(java.awt.Label.CENTER);
        selectionLabel.setBackground(new java.awt.Color(26, 26, 26));
        selectionLabel.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 36)); // NOI18N
        selectionLabel.setForeground(new java.awt.Color(165, 0, 16));
        selectionLabel.setName(""); // NOI18N
        selectionLabel.setText("A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonEqua, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonExtra1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(selectionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ButtonSubs, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ButtonAc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(x1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(x1Output, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(x2Output, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(x2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x2Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x2Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(x1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x1Output, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x2Output, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(ButtonExtra1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonEqua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ButtonEight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(ButtonSeven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonSubs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonAc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        xLabel.getAccessibleContext().setAccessibleName("     x^2     +");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 380));

        MainMenuBar.setBackground(new java.awt.Color(37, 37, 37));

        menuAreas.setBackground(new java.awt.Color(26, 26, 26));
        menuAreas.setText("Áreas y Perímetros");

        menuCuadrado.setText("Cuadrado");
        menuCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCuadradoActionPerformed(evt);
            }
        });
        menuAreas.add(menuCuadrado);

        menuCirculo.setText("Círculo");
        menuCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCirculoActionPerformed(evt);
            }
        });
        menuAreas.add(menuCirculo);

        menuRectangulo.setText("Rectángulo");
        menuRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRectanguloActionPerformed(evt);
            }
        });
        menuAreas.add(menuRectangulo);

        menuPoligono.setText("Polígono Regular (5+ Lados)");
        menuPoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPoligonoActionPerformed(evt);
            }
        });
        menuAreas.add(menuPoligono);

        menuTrapecio.setText("Trapecio");

        menuTrapecioArea.setText("Area");
        menuTrapecioArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrapecioAreaActionPerformed(evt);
            }
        });
        menuTrapecio.add(menuTrapecioArea);

        menuTrapecioPerimetro.setText("Perimetro");
        menuTrapecioPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrapecioPerimetroActionPerformed(evt);
            }
        });
        menuTrapecio.add(menuTrapecioPerimetro);

        menuAreas.add(menuTrapecio);

        menuRombo.setText("Rombo");

        menuRomboArea.setText("Area");
        menuRomboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRomboAreaActionPerformed(evt);
            }
        });
        menuRombo.add(menuRomboArea);

        menuRomboPerimetro.setText("Perimetro");
        menuRomboPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRomboPerimetroActionPerformed(evt);
            }
        });
        menuRombo.add(menuRomboPerimetro);

        menuAreas.add(menuRombo);

        menuTrianguloMain.setText("Tríangulos");

        menuTrianguloSimple.setText("Base x Altura");
        menuTrianguloSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrianguloSimpleActionPerformed(evt);
            }
        });
        menuTrianguloMain.add(menuTrianguloSimple);

        menuTrianguloHeron.setText("3 Lados");
        menuTrianguloHeron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrianguloHeronActionPerformed(evt);
            }
        });
        menuTrianguloMain.add(menuTrianguloHeron);

        menuAreas.add(menuTrianguloMain);

        MainMenuBar.add(menuAreas);

        menuVolumen.setBackground(new java.awt.Color(26, 26, 26));
        menuVolumen.setText("Volumenes");

        menuCubo.setText("Cubo");
        menuCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCuboActionPerformed(evt);
            }
        });
        menuVolumen.add(menuCubo);

        menuCilindro.setText("Cilindro");
        menuCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCilindroActionPerformed(evt);
            }
        });
        menuVolumen.add(menuCilindro);

        menuEsfera.setText("Esfera");
        menuEsfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEsferaActionPerformed(evt);
            }
        });
        menuVolumen.add(menuEsfera);

        menuCono.setText("Cono");
        menuCono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConoActionPerformed(evt);
            }
        });
        menuVolumen.add(menuCono);

        menuPrismas.setText("Prismas");
        menuPrismas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrismasActionPerformed(evt);
            }
        });
        menuVolumen.add(menuPrismas);

        menuPiramides.setText("Piramides");
        menuPiramides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPiramidesActionPerformed(evt);
            }
        });
        menuVolumen.add(menuPiramides);

        MainMenuBar.add(menuVolumen);

        menuProba.setBackground(new java.awt.Color(26, 26, 26));
        menuProba.setText("Probabilidad y Estadística");

        menuVarianza.setText("Varianza");
        menuVarianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVarianzaActionPerformed(evt);
            }
        });
        menuProba.add(menuVarianza);

        menuDesviación.setText("Desviación Éstandar");
        menuDesviación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDesviaciónActionPerformed(evt);
            }
        });
        menuProba.add(menuDesviación);

        menuPermutacion.setText("Permutación");
        menuPermutacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPermutacionActionPerformed(evt);
            }
        });
        menuProba.add(menuPermutacion);

        menuCombinacion.setText("Combinación");
        menuCombinacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombinacionActionPerformed(evt);
            }
        });
        menuProba.add(menuCombinacion);

        menuMMM.setText("Media Moda Mediana");
        menuMMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMMMActionPerformed(evt);
            }
        });
        menuProba.add(menuMMM);

        MainMenuBar.add(menuProba);

        menuPitagoras.setBackground(new java.awt.Color(26, 26, 26));
        menuPitagoras.setText("Pitagoras");

        menuTrianguloPitagoras.setText("Triangulo de Pitagoras");
        menuTrianguloPitagoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrianguloPitagorasActionPerformed(evt);
            }
        });
        menuPitagoras.add(menuTrianguloPitagoras);

        MainMenuBar.add(menuPitagoras);

        menuIngles.setBackground(new java.awt.Color(26, 26, 26));
        menuIngles.setText("Inglés -> SMD");

        menuInCm.setText("Pulgadas a Centímetros");
        menuInCm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInCmActionPerformed(evt);
            }
        });
        menuIngles.add(menuInCm);

        menuFtCm.setText("Pies a Centímetros");
        menuFtCm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFtCmActionPerformed(evt);
            }
        });
        menuIngles.add(menuFtCm);

        menuYdM.setText("Yardas a Metros");
        menuYdM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuYdMActionPerformed(evt);
            }
        });
        menuIngles.add(menuYdM);

        menuMiKm.setText("Millas a Kilómetros");
        menuMiKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMiKmActionPerformed(evt);
            }
        });
        menuIngles.add(menuMiKm);

        menuLbGr.setText("Libras a Gramos");
        menuLbGr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLbGrActionPerformed(evt);
            }
        });
        menuIngles.add(menuLbGr);

        menuOzGr.setText("Onzas a Gramos");
        menuOzGr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOzGrActionPerformed(evt);
            }
        });
        menuIngles.add(menuOzGr);

        menuGalLts.setText("Galones a Litros");
        menuGalLts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGalLtsActionPerformed(evt);
            }
        });
        menuIngles.add(menuGalLts);

        menuQtMl.setText("Cuartos a Mililitros");
        menuQtMl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQtMlActionPerformed(evt);
            }
        });
        menuIngles.add(menuQtMl);

        menuFtLts.setText("Pies cúbicos a Litros");
        menuFtLts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFtLtsActionPerformed(evt);
            }
        });
        menuIngles.add(menuFtLts);

        MainMenuBar.add(menuIngles);

        menuSmd.setBackground(new java.awt.Color(26, 26, 26));
        menuSmd.setText("SMD -> Inglés");

        menuCmIn.setText("Centímetros a Pulgadas");
        menuCmIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCmInActionPerformed(evt);
            }
        });
        menuSmd.add(menuCmIn);

        menuCmFt.setText("Centímetros a Pies");
        menuCmFt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCmFtActionPerformed(evt);
            }
        });
        menuSmd.add(menuCmFt);

        menuMYd.setText("Metros a Yardas");
        menuMYd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMYdActionPerformed(evt);
            }
        });
        menuSmd.add(menuMYd);

        menuKmMi.setText("Kilómetros a Millas");
        menuKmMi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKmMiActionPerformed(evt);
            }
        });
        menuSmd.add(menuKmMi);

        menuGrLib.setText("Gramos a Libras");
        menuGrLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGrLibActionPerformed(evt);
            }
        });
        menuSmd.add(menuGrLib);

        menuGrOz.setText("Gramos a Onzas");
        menuGrOz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGrOzActionPerformed(evt);
            }
        });
        menuSmd.add(menuGrOz);

        menuLtsGal.setText("Litros a Galones");
        menuLtsGal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLtsGalActionPerformed(evt);
            }
        });
        menuSmd.add(menuLtsGal);

        menuMlQt.setText("Mililitros a Cuartos");
        menuMlQt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMlQtActionPerformed(evt);
            }
        });
        menuSmd.add(menuMlQt);

        menuLtsFt.setText("Litros a Pies cúbicos");
        menuLtsFt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLtsFtActionPerformed(evt);
            }
        });
        menuSmd.add(menuLtsFt);

        MainMenuBar.add(menuSmd);

        menuTemp.setText("Temperaturas");

        menuKC.setText("Kelvin a Celsius");
        menuKC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKCActionPerformed(evt);
            }
        });
        menuTemp.add(menuKC);

        menuKF.setText("Kelvin a Fahrenheit");
        menuKF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKFActionPerformed(evt);
            }
        });
        menuTemp.add(menuKF);

        menuCK.setText("Celsius a Kelvin");
        menuCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCKActionPerformed(evt);
            }
        });
        menuTemp.add(menuCK);

        menuCF.setText("Celsius a Fahrenheit");
        menuCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCFActionPerformed(evt);
            }
        });
        menuTemp.add(menuCF);

        menuFK.setText("Fahrenheit a Kelvin");
        menuFK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFKActionPerformed(evt);
            }
        });
        menuTemp.add(menuFK);

        menuFC.setText("Fahrenheit a Celsius");
        menuFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFCActionPerformed(evt);
            }
        });
        menuTemp.add(menuFC);

        MainMenuBar.add(menuTemp);

        setJMenuBar(MainMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAcActionPerformed
       x1Output.setText("");
       x2Output.setText("");
       aLabel.setText("");
       bLabel.setText("");
       cLabel.setText("");
    }//GEN-LAST:event_ButtonAcActionPerformed

    private void ButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSevenActionPerformed
        addNumber("7");
        
        
    }//GEN-LAST:event_ButtonSevenActionPerformed

    private void ButtonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNineActionPerformed
        addNumber("9");
        
    }//GEN-LAST:event_ButtonNineActionPerformed

    private void ButtonLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLeftActionPerformed
        if (selection == 0) {
            selection = 0;
        }else{
            selection = selection - 1;
        }
        if (selection == 0){
            selectionLabel.setText("A");
        }else if(selection == 1){
            selectionLabel.setText("B");
        }else if (selection == 2) {
            selectionLabel.setText("C");
        }
    }//GEN-LAST:event_ButtonLeftActionPerformed

    private void ButtonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOneActionPerformed
        addNumber("1");
        
    }//GEN-LAST:event_ButtonOneActionPerformed

    private void ButtonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFourActionPerformed
        addNumber("4");
        
    }//GEN-LAST:event_ButtonFourActionPerformed

    private void ButtonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFiveActionPerformed
        addNumber("5");
        
    }//GEN-LAST:event_ButtonFiveActionPerformed

    private void ButtonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSixActionPerformed
        addNumber("6");
        
    }//GEN-LAST:event_ButtonSixActionPerformed

    private void RightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightActionPerformed
        if (selection == 2) {
            selection = 2;
        }else{
            selection = selection + 1;
        }
        if (selection == 0){
            selectionLabel.setText("A");
        }else if(selection == 1){
            selectionLabel.setText("B");
        }else if (selection == 2) {
            selectionLabel.setText("C");
        }
    }//GEN-LAST:event_RightActionPerformed

    private void ButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTwoActionPerformed
        addNumber("2");
    }//GEN-LAST:event_ButtonTwoActionPerformed

    private void ButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThreeActionPerformed
        addNumber("3");
    }//GEN-LAST:event_ButtonThreeActionPerformed

    private void ButtonSubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSubsActionPerformed
        addNumber("-");
    }//GEN-LAST:event_ButtonSubsActionPerformed

    private void ButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonZeroActionPerformed
        addNumber("0");
        
    }//GEN-LAST:event_ButtonZeroActionPerformed

    private void ButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddActionPerformed
        addNumber("+");
    }//GEN-LAST:event_ButtonAddActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        removeNumber(true);
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEqualsActionPerformed
        equation();
        total();
        
        aLabel.setText("");
        bLabel.setText("");
        cLabel.setText("");
    }//GEN-LAST:event_ButtonEqualsActionPerformed

    private void ButtonEquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEquaActionPerformed
        MainLayout mainLayout = new MainLayout();
        mainLayout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonEquaActionPerformed

    private void ButtonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEightActionPerformed
        addNumber("8");
    }//GEN-LAST:event_ButtonEightActionPerformed

    private void menuCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCuadradoActionPerformed
       areas.Cuadrado();
    }//GEN-LAST:event_menuCuadradoActionPerformed

    private void menuTrianguloSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrianguloSimpleActionPerformed
        areas.TrianguloBasico();
    }//GEN-LAST:event_menuTrianguloSimpleActionPerformed

    private void menuCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCirculoActionPerformed
        areas.Circulo();
    }//GEN-LAST:event_menuCirculoActionPerformed

    private void menuInCmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInCmActionPerformed
        conversiones.inAcm();
    }//GEN-LAST:event_menuInCmActionPerformed

    private void menuYdMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuYdMActionPerformed
        conversiones.ydAm();
    }//GEN-LAST:event_menuYdMActionPerformed

    private void menuGrLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGrLibActionPerformed
        conversiones.grAlb();
    }//GEN-LAST:event_menuGrLibActionPerformed

    private void menuKFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKFActionPerformed
        conversiones.kAf();
    }//GEN-LAST:event_menuKFActionPerformed

    private void menuFtCmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFtCmActionPerformed
        conversiones.ftAcm();
    }//GEN-LAST:event_menuFtCmActionPerformed

    private void menuMiKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMiKmActionPerformed
        conversiones.miAkm();
    }//GEN-LAST:event_menuMiKmActionPerformed

    private void menuLbGrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLbGrActionPerformed
        conversiones.lbAgr();
    }//GEN-LAST:event_menuLbGrActionPerformed

    private void menuOzGrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOzGrActionPerformed
        conversiones.ozAgr();
    }//GEN-LAST:event_menuOzGrActionPerformed

    private void menuGalLtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGalLtsActionPerformed
        conversiones.galAl();
    }//GEN-LAST:event_menuGalLtsActionPerformed

    private void menuQtMlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQtMlActionPerformed
        conversiones.qtAml();
    }//GEN-LAST:event_menuQtMlActionPerformed

    private void menuFtLtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFtLtsActionPerformed
        conversiones.ft3Al();
    }//GEN-LAST:event_menuFtLtsActionPerformed

    private void menuCmInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCmInActionPerformed
        conversiones.cmAin();
    }//GEN-LAST:event_menuCmInActionPerformed

    private void menuCmFtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCmFtActionPerformed
        conversiones.cmAft();
    }//GEN-LAST:event_menuCmFtActionPerformed

    private void menuMYdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMYdActionPerformed
        conversiones.mAyd();
    }//GEN-LAST:event_menuMYdActionPerformed

    private void menuKmMiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKmMiActionPerformed
        conversiones.kmAmi();
    }//GEN-LAST:event_menuKmMiActionPerformed

    private void menuGrOzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGrOzActionPerformed
        conversiones.grAoz();
    }//GEN-LAST:event_menuGrOzActionPerformed

    private void menuLtsGalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLtsGalActionPerformed
        conversiones.lAgal();
    }//GEN-LAST:event_menuLtsGalActionPerformed

    private void menuMlQtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMlQtActionPerformed
        conversiones.mlAqt();
    }//GEN-LAST:event_menuMlQtActionPerformed

    private void menuLtsFtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLtsFtActionPerformed
        conversiones.lAft3();
    }//GEN-LAST:event_menuLtsFtActionPerformed

    private void menuKCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKCActionPerformed
        conversiones.kAc();
    }//GEN-LAST:event_menuKCActionPerformed

    private void menuCKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCKActionPerformed
        conversiones.cAk();
    }//GEN-LAST:event_menuCKActionPerformed

    private void menuCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCFActionPerformed
        conversiones.cAf();
    }//GEN-LAST:event_menuCFActionPerformed

    private void menuFKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFKActionPerformed
        conversiones.fAk();
    }//GEN-LAST:event_menuFKActionPerformed

    private void menuFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFCActionPerformed
        conversiones.fAc();
    }//GEN-LAST:event_menuFCActionPerformed

    private void ButtonExtra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExtra1ActionPerformed
        
    }//GEN-LAST:event_ButtonExtra1ActionPerformed

    private void menuCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCuboActionPerformed
        volumen.Cubo();
    }//GEN-LAST:event_menuCuboActionPerformed

    private void menuCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCilindroActionPerformed
        volumen.Cilindro();
    }//GEN-LAST:event_menuCilindroActionPerformed

    private void menuRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRectanguloActionPerformed
        areas.Rectangulo();
    }//GEN-LAST:event_menuRectanguloActionPerformed

    private void menuPoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPoligonoActionPerformed
        areas.PoligonoRegular();
    }//GEN-LAST:event_menuPoligonoActionPerformed

    private void menuTrapecioAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrapecioAreaActionPerformed
        areas.TrapecioArea();
    }//GEN-LAST:event_menuTrapecioAreaActionPerformed

    private void menuTrapecioPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrapecioPerimetroActionPerformed
        areas.TrapecioPerimetro();
    }//GEN-LAST:event_menuTrapecioPerimetroActionPerformed

    private void menuRomboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRomboAreaActionPerformed
        areas.RomboArea();
    }//GEN-LAST:event_menuRomboAreaActionPerformed

    private void menuRomboPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRomboPerimetroActionPerformed
        areas.RomboPerimetro();
    }//GEN-LAST:event_menuRomboPerimetroActionPerformed

    private void menuTrianguloHeronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrianguloHeronActionPerformed
        areas.TrianguloHeron();
    }//GEN-LAST:event_menuTrianguloHeronActionPerformed

    private void menuEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEsferaActionPerformed
        volumen.Esfera();
    }//GEN-LAST:event_menuEsferaActionPerformed

    private void menuConoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConoActionPerformed
        volumen.Cono();
    }//GEN-LAST:event_menuConoActionPerformed

    private void menuPrismasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrismasActionPerformed
        volumen.Prismas();
    }//GEN-LAST:event_menuPrismasActionPerformed

    private void menuPiramidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPiramidesActionPerformed
        volumen.Piramides();
    }//GEN-LAST:event_menuPiramidesActionPerformed

    private void menuTrianguloPitagorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrianguloPitagorasActionPerformed
        pitagoras.Menu();
    }//GEN-LAST:event_menuTrianguloPitagorasActionPerformed

    private void menuVarianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVarianzaActionPerformed
        Estadistica_Probabilidad.varianza();
    }//GEN-LAST:event_menuVarianzaActionPerformed

    private void menuDesviaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDesviaciónActionPerformed
        Estadistica_Probabilidad.desviacion();
    }//GEN-LAST:event_menuDesviaciónActionPerformed

    private void menuPermutacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPermutacionActionPerformed
        Estadistica_Probabilidad.permutacion();
    }//GEN-LAST:event_menuPermutacionActionPerformed

    private void menuCombinacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCombinacionActionPerformed
        Estadistica_Probabilidad.combinacion();
    }//GEN-LAST:event_menuCombinacionActionPerformed

    private void menuMMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMMMActionPerformed
        Estadistica_Probabilidad.tresM();
    }//GEN-LAST:event_menuMMMActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EquationLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EquationLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EquationLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EquationLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EquationLayout().setVisible(false);
//            }
//        });
//    }
    
    
    public void removeNumber(boolean change){
        
        if (selection == 0) {
            
            String txt = aLabel.getText();
        
        if(txt != null && !txt.isEmpty()) {
        aLabel.setText(txt.substring(0, txt.length()-1));}
        
        }else if (selection == 1) {
            
            String txt = bLabel.getText();
        
        if(txt != null && !txt.isEmpty()) {
        bLabel.setText(txt.substring(0, txt.length()-1));}
        
        }else if (selection == 2) {
            
            String txt = cLabel.getText();
        
        if(txt != null && !txt.isEmpty()) {
        cLabel.setText(txt.substring(0, txt.length()-1));}
        
        }
        
    }
    
    public void total(){
        try {
            //Math.round -> Limitar decimales
            String resultado1 = String.valueOf(Math.round(x1*100000d)/100000d);
            String resultado2 = String.valueOf(Math.round(x2*100000d)/100000d);
            x1Output.setText(resultado1);
            x2Output.setText(resultado2);
        } catch (Exception e) {        }
        
    }
    
    public void equation(){
        x1 = 0; x2 = 0;
        
        String q="", w="", f="";
        double a=0, b=0, c=0;
        
        if (aLabel.getText().isEmpty()) {
            a=0;
        }else{
            q = aLabel.getText();
            a = Double.parseDouble(q);
        }
        if (bLabel.getText().isEmpty()) {
            b=0;
        }else{
            w = bLabel.getText();
            b = Double.parseDouble(w);
        }
        if (cLabel.getText().isEmpty()) {
            c=0;
        }else{
            f = cLabel.getText();
            c = Double.parseDouble(f);
        }
        
        x1= b;
        x2 = c;
        
        //esta mal
        
        double raiz = ((b*b)-(4*a*c));
        
        x1 = (((-(b))+(Math.sqrt(raiz)))/(2 * a));
        //x1 = raiz;
        x2 = (((-(b))-(Math.sqrt(((b*b)-(4*a*c)))))/(2 * a));
    }
    
    
    public void addNumber(String digito){
        
        if (selection == 0) {
            aLabel.setText(aLabel.getText() + digito);
        }else if (selection == 1) {
            bLabel.setText(bLabel.getText() + digito);
        }else if (selection == 2) {
            cLabel.setText(cLabel.getText() + digito);
        }
        
    } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAc;
    private javax.swing.JButton ButtonAdd;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonEight;
    private javax.swing.JButton ButtonEqua;
    private javax.swing.JButton ButtonEquals;
    private javax.swing.JButton ButtonExtra1;
    private javax.swing.JButton ButtonFive;
    private javax.swing.JButton ButtonFour;
    private javax.swing.JButton ButtonLeft;
    private javax.swing.JButton ButtonNine;
    private javax.swing.JButton ButtonOne;
    private javax.swing.JButton ButtonSeven;
    private javax.swing.JButton ButtonSix;
    private javax.swing.JButton ButtonSubs;
    private javax.swing.JButton ButtonThree;
    private javax.swing.JButton ButtonTwo;
    private javax.swing.JButton ButtonZero;
    private javax.swing.JMenuBar MainMenuBar;
    private javax.swing.JButton Right;
    private java.awt.Label aLabel;
    private java.awt.Label bLabel;
    private java.awt.Label cLabel;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuBar jMenuBar8;
    private javax.swing.JMenuBar jMenuBar9;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAreas;
    private javax.swing.JMenuItem menuCF;
    private javax.swing.JMenuItem menuCK;
    private javax.swing.JMenuItem menuCilindro;
    private javax.swing.JMenuItem menuCirculo;
    private javax.swing.JMenuItem menuCmFt;
    private javax.swing.JMenuItem menuCmIn;
    private javax.swing.JMenuItem menuCombinacion;
    private javax.swing.JMenuItem menuCono;
    private javax.swing.JMenuItem menuCuadrado;
    private javax.swing.JMenuItem menuCubo;
    private javax.swing.JMenuItem menuDesviación;
    private javax.swing.JMenuItem menuEsfera;
    private javax.swing.JMenuItem menuFC;
    private javax.swing.JMenuItem menuFK;
    private javax.swing.JMenuItem menuFtCm;
    private javax.swing.JMenuItem menuFtLts;
    private javax.swing.JMenuItem menuGalLts;
    private javax.swing.JMenuItem menuGrLib;
    private javax.swing.JMenuItem menuGrOz;
    private javax.swing.JMenuItem menuInCm;
    private javax.swing.JMenu menuIngles;
    private javax.swing.JMenuItem menuKC;
    private javax.swing.JMenuItem menuKF;
    private javax.swing.JMenuItem menuKmMi;
    private javax.swing.JMenuItem menuLbGr;
    private javax.swing.JMenuItem menuLtsFt;
    private javax.swing.JMenuItem menuLtsGal;
    private javax.swing.JMenuItem menuMMM;
    private javax.swing.JMenuItem menuMYd;
    private javax.swing.JMenuItem menuMiKm;
    private javax.swing.JMenuItem menuMlQt;
    private javax.swing.JMenuItem menuOzGr;
    private javax.swing.JMenuItem menuPermutacion;
    private javax.swing.JMenuItem menuPiramides;
    private javax.swing.JMenu menuPitagoras;
    private javax.swing.JMenuItem menuPoligono;
    private javax.swing.JMenuItem menuPrismas;
    private javax.swing.JMenu menuProba;
    private javax.swing.JMenuItem menuQtMl;
    private javax.swing.JMenuItem menuRectangulo;
    private javax.swing.JMenu menuRombo;
    private javax.swing.JMenuItem menuRomboArea;
    private javax.swing.JMenuItem menuRomboPerimetro;
    private javax.swing.JMenu menuSmd;
    private javax.swing.JMenu menuTemp;
    private javax.swing.JMenu menuTrapecio;
    private javax.swing.JMenuItem menuTrapecioArea;
    private javax.swing.JMenuItem menuTrapecioPerimetro;
    private javax.swing.JMenuItem menuTrianguloHeron;
    private javax.swing.JMenu menuTrianguloMain;
    private javax.swing.JMenuItem menuTrianguloPitagoras;
    private javax.swing.JMenuItem menuTrianguloSimple;
    private javax.swing.JMenuItem menuVarianza;
    private javax.swing.JMenu menuVolumen;
    private javax.swing.JMenuItem menuYdM;
    private java.awt.Label selectionLabel;
    private java.awt.Label x1Output;
    private java.awt.Label x1Txt;
    private java.awt.Label x2Label1;
    private java.awt.Label x2Output;
    private java.awt.Label x2Txt;
    private java.awt.Label xLabel;
    // End of variables declaration//GEN-END:variables
}