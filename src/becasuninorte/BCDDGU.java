package becasuninorte;

import static becasuninorte.Comportamiento.query;
import javax.swing.JOptionPane;


/**
 *
 * @author Gguerreroa
 */
public class BCDDGU extends javax.swing.JFrame {
    static int estado;
    static SQLclass query;
    /// Comportamiento: 1
    String idTable,nomTable,detalleTable;
    String v1[]={"id","nombre","detalle"};
    /// Beca: 2
    String v2[] = {"id", "nombre", "cupos"};
    String cuposTable;
    /// Diagnostico: 3
    
    public BCDDGU(int estado,SQLclass query) {
        this.estado = estado;
        this.query = query;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        switch(this.estado){
            /// comportamiento
            case 1:
                tabla.setModel(query.query("select * from comportamiento",v1));
                tabla1.setModel(query.query("select * from comportamiento",v1));
                tabla2.setModel(query.query("select * from comportamiento",v1));
                label1.setText("Nombre:");
                label2.setText("Detalle:");
                label3.setText("Id:");
                label4.setText("Nombre:");
                label5.setText("Detalle:");
                label6.setText("Id:");
                label7.setText("Nombre:");
                label8.setText("Detalle:");
                label9.setText("Id:");
            break;    
            /// Beca
            case 2:
                tabla.setModel(query.query("select * from beca",v2));
                tabla1.setModel(query.query("select * from beca",v2));
                tabla2.setModel(query.query("select * from beca",v2));
                label1.setText("Id:");
                label2.setText("Nombre:");
                label3.setText("Cupos:");
                label4.setText("Id:");
                label5.setText("Nombre:");
                label6.setText("Cupos:");
                label7.setText("Id:");
                label8.setText("Nombre:");
                label9.setText("Cupos:");
            break;
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campo3 = new javax.swing.JTextField();
        campo1 = new javax.swing.JTextField();
        campo2 = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        campo6 = new javax.swing.JTextField();
        campo4 = new javax.swing.JTextField();
        campo5 = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        campo9 = new javax.swing.JTextField();
        campo7 = new javax.swing.JTextField();
        campo8 = new javax.swing.JTextField();
        label8 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 7, 11));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setBackground(new java.awt.Color(255, 7, 11));
        jPanel6.setPreferredSize(new java.awt.Dimension(310, 350));
        jPanel6.setVerifyInputWhenFocusTarget(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Insertar");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 110, 119, 33));
        jPanel6.add(campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 120, -1));
        jPanel6.add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 120, -1));
        jPanel6.add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 120, -1));

        label2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Detalle:");
        jPanel6.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        label1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Nombre:");
        jPanel6.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        label3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Id:");
        jPanel6.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jButton2.setText("Insertar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jPanel3.add(jPanel6);

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel7.add(jScrollPane1);

        jPanel3.add(jPanel7);

        jTabbedPane1.addTab("Crea", jPanel3);

        jPanel8.setBackground(new java.awt.Color(255, 7, 11));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setBackground(new java.awt.Color(255, 7, 11));
        jPanel9.setPreferredSize(new java.awt.Dimension(310, 350));
        jPanel9.setVerifyInputWhenFocusTarget(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Actualizar");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 110, 119, 33));
        jPanel9.add(campo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 120, -1));
        jPanel9.add(campo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 120, -1));
        jPanel9.add(campo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 120, -1));

        label5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Detalle:");
        jPanel9.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        label4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Nombre:");
        jPanel9.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        label6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Id:");
        jPanel9.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jButton4.setText("Actualizar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jPanel9.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jPanel8.add(jPanel9);

        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla1);

        jPanel10.add(jScrollPane2);

        jPanel8.add(jPanel10);

        jTabbedPane1.addTab("Actualizar", jPanel8);

        jPanel11.setBackground(new java.awt.Color(255, 7, 11));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jPanel12.setBackground(new java.awt.Color(255, 7, 11));
        jPanel12.setPreferredSize(new java.awt.Dimension(310, 350));
        jPanel12.setVerifyInputWhenFocusTarget(false);
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Eliminar");
        jPanel12.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 110, 119, 33));
        jPanel12.add(campo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 120, -1));
        jPanel12.add(campo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 120, -1));
        jPanel12.add(campo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 120, -1));

        label8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Detalle:");
        jPanel12.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        label7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Nombre:");
        jPanel12.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        label9.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("Id:");
        jPanel12.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jButton5.setText("Eliminar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });
        jPanel12.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jPanel11.add(jPanel12);

        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.LINE_AXIS));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla2);

        jPanel13.add(jScrollPane3);

        jPanel11.add(jPanel13);

        jTabbedPane1.addTab("Elimina", jPanel11);

        getContentPane().add(jTabbedPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        switch(this.estado){
            // Comportamiento
            case 1:
                if (JOptionPane.showConfirmDialog(null, "¿Confirma insertar al comportamiento " + campo1.getText() + " con id=" + campo3.getText() + " y detalle:" + campo2.getText()) == 0) {
                String id = campo3.getText();
                String nom = "'"+campo1.getText()+"'";
                String detalle = "'"+campo2.getText()+"'";
                if (nom.equals("")) {
                    nom = null;

                }
                if (detalle.equals("")) {
                    detalle = null;
                }
                if(id.equals("")){
                    id=null;
                }
                String comand = "insert into comportamiento (id,nombre,detalle) values (" + id + ", " + nom + "," + detalle + ")";
                System.out.println(comand);
                query.ejecutar(comand);
                tabla.setModel(query.query("select * from comportamiento", v1));
                campo3.setText("");
                campo1.setText("");
                campo2.setText("");
                }
            break;
            /// Beca
            case 2:
                String id = campo1.getText();
                String nombre = "'" + campo2.getText() + "'";
                String cupos = campo3.getText();
                if (nombre.equals("''") || id.equals("") || cupos.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");
                } else {
                    if (JOptionPane.showConfirmDialog(null, "¿Confirma insertar la beca " + campo2.getText()
                            + " con id=" + campo1.getText() + " y " + campo3.getText() + " cupos") == 0) {
                        String comand = "insert into beca values (" + id + "," + nombre + "," + cupos + ")";
                        System.out.println(comand);
                        query.ejecutar(comand);
                        tabla.setModel(query.query("select * from beca", v2));
                        campo1.setText("");
                        campo2.setText("");
                        campo3.setText("");
                    }
                }
            break;
        }
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        switch(this.estado){
            // Comportamiento
            case 1:
                if (JOptionPane.showConfirmDialog(null, "¿Confirma actualizar el comportamiento: " + nomTable + " con id=" + idTable + " y descripción" + detalleTable) == 0) {
                    String p = "update comportamiento set detalle=" + campo5.getText() + ", nombre=" + campo4.getText() + "where id=" + idTable;
                    System.out.println(p);
                    String id=campo6.getText();
                    String detalle="'"+campo5.getText()+"'";
                    String nom="'" + campo4.getText() + "'";
                    if(id.equals("")){
                        id=null;
                    }if(detalle.equals("")){
                        detalle=null;
                    }if(nom.equals("")){
                        nom=null;
                    }
                    query.ejecutar("update comportamiento set id=" + id + ", nombre=" + nom + ", detalle=" + detalle + " where id=" + idTable);
                    System.out.println("Ejecutado ");
                    //id="+idNew.getText()+",
                    tabla1.setModel(query.query("select * from comportamiento",v1));
                }
            break;
            /// Beca
            case 2:
                String id = campo4.getText();
                String nombre = "'" + campo5.getText() + "'";
                String cupos = campo6.getText();
                if (idTable == null) {
                    JOptionPane.showMessageDialog(null, "Debe elegir una beca a actualizar");
                } else {
                    if (nombre.equals("''") || id.equals("") || cupos.equals("")) {
                        JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");
                    } else {
                        if (idTable.equals(id) && nomTable.equals(campo5.getText()) && cuposTable.equals(cupos)) {
                            JOptionPane.showMessageDialog(null, "Lo digitado en los campos de texto es igual"
                                    + "a los valores registrados dentro de la base de datos");
                        } else {
                            if (JOptionPane.showConfirmDialog(null, "¿Confirma actualizar la beca " + nomTable
                                    + " con id=" + idTable + " y " + cuposTable + " cupos") == 0) {
                                String p = "update beca set id=" + id + ", nombre=" + nombre + ", cupos= " + cupos + " where id=" + idTable;
                                System.out.println(p);
                                query.ejecutar(p);
                                System.out.println("Ejecutado ");
                                tabla1.setModel(query.query("select * from beca", v1));
                                campo4.setText("");
                                campo5.setText("");
                                campo6.setText("");
                            }
                        }
                    }
                }
            break;
        }
    }//GEN-LAST:event_jButton4MousePressed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int seleccionado;
        switch(estado){
            /// Comportamiento
            case 1:
                seleccionado = tabla1.rowAtPoint(evt.getPoint());
                idTable = String.valueOf(tabla1.getValueAt(seleccionado, 0));
                campo6.setText(idTable);
                nomTable = String.valueOf(tabla1.getValueAt(seleccionado, 1));
                campo4.setText(nomTable);
                detalleTable = String.valueOf(tabla1.getValueAt(seleccionado, 2));
                campo5.setText(detalleTable);
            break;
            case 2:
                seleccionado = tabla1.rowAtPoint(evt.getPoint());
                idTable = String.valueOf(tabla1.getValueAt(seleccionado, 0));
                campo4.setText(idTable);
                nomTable = String.valueOf(tabla1.getValueAt(seleccionado, 1));
                campo5.setText(nomTable);
                cuposTable = String.valueOf(tabla1.getValueAt(seleccionado, 2));
                campo6.setText(cuposTable);
            break;
        }
    }//GEN-LAST:event_tabla1MouseClicked

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        switch(estado){
            /// Comportamiento
            case 1:
                if (JOptionPane.showConfirmDialog(null, "¿Confirma borrar el comportamiento " + nomTable + " con id=" + idTable + " y detalle: " + detalleTable) == 0) {
                query.ejecutar("delete from comportamiento where id=" + idTable);
                tabla2.setModel(query.query("select * from comportamiento", v1));
                } else {
                    JOptionPane.showMessageDialog(this, "No elimino el comportamiento correctamente");
                }
            break;
            /// Beca
            case 2:
                if (idTable == null) {
                    JOptionPane.showMessageDialog(null, "Debe elegir una beca a borrar");
                } else {
                    if (JOptionPane.showConfirmDialog(null, "¿Confirma borrar la beca " + nomTable
                            + " con id=" + idTable + " y " + cuposTable + " cupos") == 0) {
                        query.ejecutar("delete from beca where id=" + idTable);
                        tabla2.setModel(query.query("select * from beca", v2));
                    } else {
                        System.out.println("No borro");
                    }
                }
            break;
        }
    }//GEN-LAST:event_jButton5MousePressed

    private void tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla2MouseClicked
        int seleccionado;
        switch(estado){
            case 1:
                seleccionado = tabla2.rowAtPoint(evt.getPoint());
                idTable = String.valueOf(tabla2.getValueAt(seleccionado, 0));
                campo6.setText(idTable);
                nomTable = String.valueOf(tabla2.getValueAt(seleccionado, 1));
                campo4.setText(nomTable);
                detalleTable = String.valueOf(tabla2.getValueAt(seleccionado, 2));
                campo5.setText(detalleTable);
            break;
            case 2:
                seleccionado = tabla1.rowAtPoint(evt.getPoint());
                idTable = String.valueOf(tabla1.getValueAt(seleccionado, 0));
                campo7.setText(idTable);
                nomTable = String.valueOf(tabla1.getValueAt(seleccionado, 1));
                campo8.setText(nomTable);
                cuposTable = String.valueOf(tabla1.getValueAt(seleccionado, 2));
                campo9.setText(cuposTable);
            break;
        }
        
        
        
        
    }//GEN-LAST:event_tabla2MouseClicked

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
        switch(estado){
            /// comportamiento
            case 1:
                tabla.setModel(query.query("select * from comportamiento", v1));
                tabla1.setModel(query.query("select * from comportamiento", v1));
                tabla2.setModel(query.query("select * from comportamiento", v1));
            break;
            case 2:
                tabla.setModel(query.query("select * from beca",v2));
                tabla1.setModel(query.query("select * from beca",v2));
                tabla2.setModel(query.query("select * from beca",v2));
            break;
        }
        
    }//GEN-LAST:event_jTabbedPane1MousePressed
       
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BCDDGU(estado,query).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JTextField campo3;
    private javax.swing.JTextField campo4;
    private javax.swing.JTextField campo5;
    private javax.swing.JTextField campo6;
    private javax.swing.JTextField campo7;
    private javax.swing.JTextField campo8;
    private javax.swing.JTextField campo9;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
