/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becasuninorte;

import javax.swing.JOptionPane;

/**
 *
 * @author jfcal
 */
public class BecasUninorte {

    /**
     * @param args the command line arguments
     */
    static String uu, pp;
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hola mundoooo");
        String user= JOptionPane.showInputDialog("Digite el usuario de la base de datos:");
        String password=JOptionPane.showInputDialog("Digite contraseña de la base de datos:");
        SQLclass conn=new SQLclass(user,password);
        Inicial vista=new Inicial(conn);
        vista.setVisible(true);
    }
    
}
