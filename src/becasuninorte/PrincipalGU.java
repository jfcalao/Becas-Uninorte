package becasuninorte;

import static becasuninorte.Principal.DB;
import java.awt.CardLayout;

/**
 *
 * @author jfcal
 */
public class PrincipalGU extends javax.swing.JFrame {

    static SQLclass DB;
    CardLayout cardLayout;
    
    public PrincipalGU(SQLclass query) {
        initComponents();
        this.DB=query;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        cardLayout = (CardLayout)(cards.getLayout());
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea3.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea4.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea5.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea6.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea7.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea8.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea9.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea10.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea11.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea12.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea13.setFont(new java.awt.Font("Monospaced", 0, 13));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        cards = new javax.swing.JPanel();
        gestion = new javax.swing.JPanel();
        convocatoria = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        becas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        beneficios = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        comportamiento = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextArea4 = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextArea5 = new javax.swing.JTextArea();
        jTextArea6 = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jTextArea7 = new javax.swing.JTextArea();
        jTextArea8 = new javax.swing.JTextArea();
        jButton12 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        seleccionar = new javax.swing.JPanel();
        beneficios1 = new javax.swing.JButton();
        becas1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comportamiento1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextArea9 = new javax.swing.JTextArea();
        jTextArea10 = new javax.swing.JTextArea();
        jTextArea11 = new javax.swing.JTextArea();
        asignar = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextArea12 = new javax.swing.JTextArea();
        comportamiento2 = new javax.swing.JButton();
        jTextArea13 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        opciones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1100, 652));

        cards.setLayout(new java.awt.CardLayout());

        gestion.setBackground(new java.awt.Color(255, 7, 11));
        gestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        convocatoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/evento-para-ninos.png"))); // NOI18N
        convocatoria.setBorder(null);
        convocatoria.setBorderPainted(false);
        convocatoria.setContentAreaFilled(false);
        convocatoria.setFocusPainted(false);
        convocatoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                convocatoriaMousePressed(evt);
            }
        });
        gestion.add(convocatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 140, 140));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Crea,actualiza y \nelimina un beneficio. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea1.setOpaque(false);
        gestion.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Convocatoria");
        gestion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 140, -1));

        becas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/beca (2).png"))); // NOI18N
        becas.setBorder(null);
        becas.setBorderPainted(false);
        becas.setContentAreaFilled(false);
        becas.setFocusPainted(false);
        becas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                becasMousePressed(evt);
            }
        });
        gestion.add(becas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 140, 130));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Becas");
        gestion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("Crea,actualiza y \nelimina una beca. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea2.setOpaque(false);
        gestion.add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 190, 160, -1));

        beneficios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contabilidad.png"))); // NOI18N
        beneficios.setBorder(null);
        beneficios.setBorderPainted(false);
        beneficios.setContentAreaFilled(false);
        beneficios.setFocusPainted(false);
        beneficios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                beneficiosMousePressed(evt);
            }
        });
        gestion.add(beneficios, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 140, 130));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Beneficios");
        gestion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 110, -1));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jTextArea3.setText("Crea,actualiza y \nelimina un beneficio. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea3.setOpaque(false);
        gestion.add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        comportamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        comportamiento.setBorder(null);
        comportamiento.setBorderPainted(false);
        comportamiento.setContentAreaFilled(false);
        comportamiento.setFocusPainted(false);
        comportamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comportamientoMousePressed(evt);
            }
        });
        gestion.add(comportamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 150, 130));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Comportamiento");
        gestion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 160, -1));

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea4.setRows(5);
        jTextArea4.setText("Crea,actualiza y \nelimina un beneficio. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea4.setOpaque(false);
        gestion.add(jTextArea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grabar.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusPainted(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
        });
        gestion.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 150, 140));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Diagnosticos");
        gestion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea5.setRows(5);
        jTextArea5.setText("Crea,actualiza y \nelimina una beca. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea5.setOpaque(false);
        gestion.add(jTextArea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea6.setRows(5);
        jTextArea6.setText("Crea,actualiza y \nelimina un beneficio. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea6.setOpaque(false);
        gestion.add(jTextArea6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivos-y-carpetas.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusPainted(false);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        gestion.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 160, 150));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Documentos");
        gestion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 110, -1));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Personas");
        gestion.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 90, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setFocusPainted(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
        });
        gestion.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 160, 150));

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea7.setRows(5);
        jTextArea7.setText("Crea,actualiza y \nelimina un beneficio. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea7.setOpaque(false);
        gestion.add(jTextArea7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, -1, -1));

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea8.setRows(5);
        jTextArea8.setText("Crea,actualiza y \nelimina un beneficio. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea8.setOpaque(false);
        gestion.add(jTextArea8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, -1, -1));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista-de-verificacion.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setFocusPainted(false);
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton12MousePressed(evt);
            }
        });
        gestion.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 150, 140));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Requisito");
        gestion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 100, -1));
        gestion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 810, 10));

        cards.add(gestion, "gestionar");

        seleccionar.setBackground(new java.awt.Color(255, 7, 11));
        seleccionar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        beneficios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/humano.png"))); // NOI18N
        beneficios1.setBorder(null);
        beneficios1.setBorderPainted(false);
        beneficios1.setContentAreaFilled(false);
        beneficios1.setFocusPainted(false);
        beneficios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                beneficios1MousePressed(evt);
            }
        });
        seleccionar.add(beneficios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 150, 130));

        becas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/candidato.png"))); // NOI18N
        becas1.setBorder(null);
        becas1.setBorderPainted(false);
        becas1.setContentAreaFilled(false);
        becas1.setFocusPainted(false);
        becas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                becas1MousePressed(evt);
            }
        });
        seleccionar.add(becas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 170, 130));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Preseleccionados");
        seleccionar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 180, -1));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Candidatos");
        seleccionar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 110, -1));

        comportamiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/colegio.png"))); // NOI18N
        comportamiento1.setBorder(null);
        comportamiento1.setBorderPainted(false);
        comportamiento1.setContentAreaFilled(false);
        comportamiento1.setFocusPainted(false);
        comportamiento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comportamiento1MousePressed(evt);
            }
        });
        seleccionar.add(comportamiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 160, 130));

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Becados");
        seleccionar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 80, -1));

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea9.setRows(5);
        jTextArea9.setText("Crea,actualiza y \nelimina un beneficio. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea9.setOpaque(false);
        seleccionar.add(jTextArea9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 190, -1));

        jTextArea10.setEditable(false);
        jTextArea10.setColumns(20);
        jTextArea10.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea10.setRows(5);
        jTextArea10.setText("Crea,actualiza y \nelimina un beneficio. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea10.setOpaque(false);
        seleccionar.add(jTextArea10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 190, -1));

        jTextArea11.setEditable(false);
        jTextArea11.setColumns(20);
        jTextArea11.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea11.setRows(5);
        jTextArea11.setText("Crea,actualiza y \nelimina una beca. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea11.setOpaque(false);
        seleccionar.add(jTextArea11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 180, -1));

        cards.add(seleccionar, "seleccionar");

        asignar.setBackground(new java.awt.Color(255, 7, 11));
        asignar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grabar.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setFocusPainted(false);
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
        });
        asignar.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 150, 140));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Diagnosticos");
        asignar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jTextArea12.setEditable(false);
        jTextArea12.setColumns(20);
        jTextArea12.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea12.setRows(5);
        jTextArea12.setText("Crea,actualiza y \nelimina una beca. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea12.setOpaque(false);
        asignar.add(jTextArea12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        comportamiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        comportamiento2.setBorder(null);
        comportamiento2.setBorderPainted(false);
        comportamiento2.setContentAreaFilled(false);
        comportamiento2.setFocusPainted(false);
        comportamiento2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comportamiento2MousePressed(evt);
            }
        });
        asignar.add(comportamiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 150, 130));

        jTextArea13.setEditable(false);
        jTextArea13.setColumns(20);
        jTextArea13.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea13.setRows(5);
        jTextArea13.setText("Crea,actualiza y \nelimina un beneficio. \nAsigna un requisito,\ndocumento,beneficio \na una beca.");
        jTextArea13.setOpaque(false);
        asignar.add(jTextArea13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Comportamiento");
        asignar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 160, -1));

        cards.add(asignar, "asignar");

        jSplitPane1.setRightComponent(cards);

        opciones.setBackground(new java.awt.Color(23, 18, 17));
        opciones.setPreferredSize(new java.awt.Dimension(500, 650));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Gestionar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Seleccionar");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Asignar");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagenes.png"))); // NOI18N

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(344, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(opciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        cardLayout.show(cards, "gestionar");
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
         cardLayout.show(cards, "seleccionar");
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
         cardLayout.show(cards, "asignar");
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void becasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_becasMousePressed
         MenuBecaGU vista1 = new MenuBecaGU(DB);
         vista1.setVisible(true);
    }//GEN-LAST:event_becasMousePressed

    private void beneficiosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beneficiosMousePressed
        Beneficios vista2 = new Beneficios(DB);
        vista2.setVisible(true);
    }//GEN-LAST:event_beneficiosMousePressed

    private void comportamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comportamientoMousePressed
        BCDDGU vista3 = new BCDDGU(1,DB);
        vista3.setVisible(true);
    }//GEN-LAST:event_comportamientoMousePressed

    private void convocatoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convocatoriaMousePressed
        MenuConvocatoriaGU vista4 = new MenuConvocatoriaGU(DB);
        vista4.setVisible(true);
    }//GEN-LAST:event_convocatoriaMousePressed

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
        Diagnostico vista5 = new Diagnostico(DB);
        vista5.setVisible(true);
    }//GEN-LAST:event_jButton9MousePressed

    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MousePressed
        Documento vista6 = new Documento(DB);
        vista6.setVisible(true);
    }//GEN-LAST:event_jButton10MousePressed

    private void jButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MousePressed
        IngresaPersonaGU vista7 = new IngresaPersonaGU(DB);
        vista7.setVisible(true);
    }//GEN-LAST:event_jButton11MousePressed

    private void jButton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MousePressed
        Requisitos vista8 = new Requisitos(DB);
        vista8.setVisible(true);
    }//GEN-LAST:event_jButton12MousePressed

    private void beneficios1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beneficios1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_beneficios1MousePressed

    private void becas1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_becas1MousePressed
        Seleccion vista = new Seleccion(DB,"Preseleccionados");
        vista.setVisible(true);
    }//GEN-LAST:event_becas1MousePressed

    private void comportamiento1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comportamiento1MousePressed
        
    }//GEN-LAST:event_comportamiento1MousePressed

    private void jButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MousePressed
        PerDiagnostico vista = new PerDiagnostico(DB);
        vista.setVisible(true);
    }//GEN-LAST:event_jButton13MousePressed

    private void comportamiento2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comportamiento2MousePressed
        PerComp vista = new PerComp(DB);
        vista.setVisible(true);
    }//GEN-LAST:event_comportamiento2MousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalGU(DB).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel asignar;
    private javax.swing.JButton becas;
    private javax.swing.JButton becas1;
    private javax.swing.JButton beneficios;
    private javax.swing.JButton beneficios1;
    private javax.swing.JPanel cards;
    private javax.swing.JButton comportamiento;
    private javax.swing.JButton comportamiento1;
    private javax.swing.JButton comportamiento2;
    private javax.swing.JButton convocatoria;
    private javax.swing.JPanel gestion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JPanel opciones;
    private javax.swing.JPanel seleccionar;
    // End of variables declaration//GEN-END:variables
}
