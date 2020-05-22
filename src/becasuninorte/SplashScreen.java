package becasuninorte;

import com.sun.awt.AWTUtilities;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gguerreroa
 */
public class SplashScreen extends javax.swing.JFrame {
    
    Login lg = new Login();
     
    public SplashScreen() throws InterruptedException {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        iniciarHilo();
    }
    
    public void iniciarHilo(){
        Thread hilo = new Thread(new Runnable(){
            int x = 0;
            @Override
            public void run() {
                try{
                    while(x <= 100){
                        progressBar.setValue(x);
                        x++;
                        Thread.sleep(150);
                        if (x == 100) {
                            lg.setVisible(true);
                            rootPane.setVisible(false);
                        }
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            } 
        });
        hilo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        text = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(490, 310));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(490, 310));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 470, -1));

        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setText("Becas Universidad Del Norte 1.0");
        jPanel2.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/propuesta.png"))); // NOI18N
        jPanel2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 310));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SplashScreen().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
