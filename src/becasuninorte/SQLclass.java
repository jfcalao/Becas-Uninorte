/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becasuninorte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jfcal
 */
public class SQLclass {
    public SQLclass() {
    }
    
    public String user, password;
    Statement st;

    public SQLclass(String user, String password) {
        this.user = user;
        this.password = password;
        this.st=conn();
    }
    public Statement conn(){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Conectando a la base de datos...");
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //COMO SEGUNDO Y TERCER PARAMETRO SE DEBE PONER EL USUARIO Y CLAVE DE TU 
            //BASES DE DATOS PARA PODER ESTABLECER UNA CORRECTA CONEXION
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,password);
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            Statement statement= connection.createStatement();
            return statement;
        } catch (Exception e) {
            System.out.println("El error es: "+e);
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos: "+ e);
            return null;
        }
    
    }

public DefaultTableModel query(String from, String v[]) {
        try {
            DefaultTableModel model = new DefaultTableModel(v, 0);

            int n = v.length;
            ResultSet resultset = st.executeQuery(from);
            String result[] = new String[n];
            while (resultset.next()) {
                for (int i = 1; i <= n; i++) {
                    result[i - 1] = resultset.getString(i);
                }
                model.addRow(result);
            }
            return model;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Error ejecucion query: " + e);
            System.out.println("Error ejecucion query: " + e);
            return null;
        }
    }
    
    public void ejecutar(String from){
        try {
            
            st.execute(from);
            System.out.println("Ejecutado bien");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error ejecucion query: "+ e);
            System.out.println("Error ejecucion query: "+e);
            
        }
    }
}
