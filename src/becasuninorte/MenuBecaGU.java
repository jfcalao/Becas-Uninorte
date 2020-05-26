package becasuninorte;

/**
 *
 * @author gguerreroa
 */
public class MenuBecaGU extends javax.swing.JFrame {

    static SQLclass DB;
    
    public MenuBecaGU(SQLclass database) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        DB = database;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextArea12 = new javax.swing.JTextArea();
        jTextArea13 = new javax.swing.JTextArea();
        jButton13 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        beneficios1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextArea9 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 7, 11));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 30, 460));

        jTextArea12.setEditable(false);
        jTextArea12.setColumns(20);
        jTextArea12.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea12.setRows(5);
        jTextArea12.setText("Crea,actualiza y \nelimina una beca. ");
        jTextArea12.setOpaque(false);
        jPanel1.add(jTextArea12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 40));

        jTextArea13.setEditable(false);
        jTextArea13.setColumns(20);
        jTextArea13.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea13.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea13.setRows(5);
        jTextArea13.setText("  Crea, actualiza o\n   borra una beca");
        jTextArea13.setOpaque(false);
        jPanel1.add(jTextArea13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivos-y-carpetas.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setFocusPainted(false);
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 150, 130));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Documentos");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 110, -1));

        beneficios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contabilidad.png"))); // NOI18N
        beneficios1.setBorder(null);
        beneficios1.setBorderPainted(false);
        beneficios1.setContentAreaFilled(false);
        beneficios1.setFocusPainted(false);
        jPanel1.add(beneficios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 140, 150));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Beneficios");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 110, -1));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista-de-verificacion.png"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setFocusPainted(false);
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 260, 130, 120));

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Requisito");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 230, 100, -1));

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea9.setRows(5);
        jTextArea9.setText("Relaciona una beca con \nDOCUMENTOS,BENEFICIOS \n     y REQUISITOS.");
        jTextArea9.setOpaque(false);
        jPanel1.add(jTextArea9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 190, 80));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        BecaGU visual = new BecaGU(DB);
        visual.setVisible(true);
    }//GEN-LAST:event_jButton1MousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBecaGU(DB).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beneficios1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea9;
    // End of variables declaration//GEN-END:variables
}
