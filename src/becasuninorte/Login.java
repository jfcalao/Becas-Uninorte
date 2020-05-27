package becasuninorte;

import com.sun.awt.AWTUtilities;
import org.xml.sax.Attributes;
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
        usuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        contraseña = new javax.swing.JPasswordField();
        conectar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 652));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, 190, -1));

        logoUN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logouni (2).png"))); // NOI18N
        getContentPane().add(logoUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 132, 140, 140));

        usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");
        usuario.setBorder(null);
        usuario.setOpaque(false);
        usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioFocusLost(evt);
            }
        });
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioKeyPressed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, 200, 50));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, 190, 20));

        contraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Contraseña");
        contraseña.setBorder(null);
        contraseña.setOpaque(false);
        contraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contraseñaFocusLost(evt);
            }
        });
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraseñaKeyPressed(evt);
            }
        });
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 190, 40));

        conectar.setBackground(new java.awt.Color(204, 204, 204));
        conectar.setText("Iniciar sesión");
        conectar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        conectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                conectarMousePressed(evt);
            }
        });
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });
        getContentPane().add(conectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, 150, 30));

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
        if (conn.st != null) {
            PrincipalGU vs = new PrincipalGU(conn);
            vs.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_conectarMousePressed

    private void usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyPressed
        char validar = evt.getKeyChar();
        if (usuario.getText().equals("Usuario") && (Character.isLetter(validar) || Character.isDigit(validar))) {
            usuario.setText("");
        }
    }//GEN-LAST:event_usuarioKeyPressed

    private void contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyPressed
        char validar = evt.getKeyChar();
        if (contraseña.getText().equals("Contraseña") && (Character.isLetter(validar) || Character.isDigit(validar))) {
            contraseña.setText("");
        }
    }//GEN-LAST:event_contraseñaKeyPressed

    private void usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusLost
        if (usuario.getText().equals("")) {
            usuario.setText("Usuario");
        }
    }//GEN-LAST:event_usuarioFocusLost

    private void contraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseñaFocusLost
        if (contraseña.getText().equals("")) {
            contraseña.setText("Contraseña");
        }
    }//GEN-LAST:event_contraseñaFocusLost
                                    
    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectarActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton conectar;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel fondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoUN;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
