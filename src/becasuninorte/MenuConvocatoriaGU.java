package becasuninorte;

/**
 *
 * @author Daniel Porto / MODIFY: GGUERREROA
 */
public class MenuConvocatoriaGU extends javax.swing.JFrame {
    
    static SQLclass DB;
    public MenuConvocatoriaGU(SQLclass database) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        DB = database;
        jTextArea9.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea12.setFont(new java.awt.Font("Monospaced", 0, 13));
        jTextArea13.setFont(new java.awt.Font("Monospaced", 1, 18));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextArea13 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jTextArea12 = new javax.swing.JTextArea();
        jTextArea9 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 7, 11));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/beca (2).png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 10, 460));

        jTextArea13.setEditable(false);
        jTextArea13.setColumns(20);
        jTextArea13.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea13.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea13.setRows(5);
        jTextArea13.setText("  Crea,actualiza o \n       borra");
        jTextArea13.setOpaque(false);
        jPanel1.add(jTextArea13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Beca");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 50, -1));

        jTextArea12.setEditable(false);
        jTextArea12.setColumns(20);
        jTextArea12.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea12.setRows(5);
        jTextArea12.setText("Crea o modifica una \n   convocatoria. ");
        jTextArea12.setOpaque(false);
        jPanel1.add(jTextArea12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, 40));

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea9.setRows(5);
        jTextArea9.setText("Inscribe becas a una\nconvocatoria");
        jTextArea9.setOpaque(false);
        jPanel1.add(jTextArea9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 190, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
//        Convocatoria vista=new Convocatoria(DB);
        BCDDGU vista=new BCDDGU(7,DB);
        vista.setVisible(true);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        BecasConvocatoria vista=new BecasConvocatoria(DB);
        vista.setVisible(true);
    }//GEN-LAST:event_jButton2MousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConvocatoriaGU(DB).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea9;
    // End of variables declaration//GEN-END:variables
}
