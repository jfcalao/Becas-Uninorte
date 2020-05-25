package becasuninorte;

import com.sun.awt.AWTUtilities;

/**
 *
 * @author gguerreroa
 */
public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        this.setResizable(false);
        AWTUtilities.setWindowOpaque(this, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        logoUN = new javax.swing.JLabel();
        contraseña = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        conectar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 652));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, 190, -1));

        logoUN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logouni (2).png"))); // NOI18N
        getContentPane().add(logoUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 100, 140, 140));

        contraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Contraseña");
        contraseña.setBorder(null);
        contraseña.setOpaque(false);
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 200, 50));
        contraseña.getAccessibleContext().setAccessibleName("");

        usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");
        usuario.setBorder(null);
        usuario.setOpaque(false);
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 200, 50));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, 190, 10));

        conectar.setText("Iniciar Seccion");
        conectar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        conectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                conectarMousePressed(evt);
            }
        });
        getContentPane().add(conectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 90, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLogin.gif"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));
        fondo.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void conectarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conectarMousePressed
        String user = usuario.getText();
        String password = contraseña.getText();
        SQLclass conn = new SQLclass(user,password);
        RequisitoDeBeca vista = new RequisitoDeBeca(conn);
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_conectarMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton conectar;
    private javax.swing.JTextField contraseña;
    private javax.swing.JLabel fondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoUN;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
