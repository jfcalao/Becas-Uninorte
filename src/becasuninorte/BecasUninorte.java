package becasuninorte;

import javax.swing.JOptionPane;

/**
 *
 * @author jfcal
 */
public class BecasUninorte {

    static String uu, pp;
    
    public static void main(String[] args) throws InterruptedException {
        SplashScreen lg = new SplashScreen();
        lg.setVisible(true);
        String user= JOptionPane.showInputDialog("Digite el usuario de la base de datos:");
        String password=JOptionPane.showInputDialog("Digite contraseña de la base de datos:");
        //String personaId=JOptionPane.showInputDialog("Digite id de la persona:");
        SQLclass conn=new SQLclass(user,password);
        BecasPersona vista = new BecasPersona(conn);
    }
    
}
