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
    String v1[]={"id","nombre","detalle"};
    public BCDDGU(int estado,SQLclass query) {
        this.estado = estado;
        this.query = query;
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        hijoId3 = new javax.swing.JTextField();
        hijoNom3 = new javax.swing.JTextField();
        hijoDe3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

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

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Detalle:");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id:");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

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

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Detalle:");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre:");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Id:");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

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
        jPanel12.add(hijoId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 120, -1));
        jPanel12.add(hijoNom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 120, -1));
        jPanel12.add(hijoDe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 120, -1));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Detalle:");
        jPanel12.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre:");
        jPanel12.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Id:");
        jPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jButton5.setText("Eliminar");
        jPanel12.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jPanel11.add(jPanel12);

        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.LINE_AXIS));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

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
                if (JOptionPane.showConfirmDialog(null, "¿Confirma insertar al hijo " + campo1.getText() + " con id=" + campo3.getText() + " y padre con id=" + campo2.getText()) == 0) {
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
                    tabla.setModel(query.query("select * from comportamiento",v1));
                    break;
                }
        }
    }//GEN-LAST:event_jButton4MousePressed
    String idTable,nomTable,detalleTable;
    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int seleccionado = tabla1.rowAtPoint(evt.getPoint());
        idTable = String.valueOf(tabla1.getValueAt(seleccionado, 0));
        campo6.setText(idTable);

        nomTable = String.valueOf(tabla1.getValueAt(seleccionado, 1));
        campo4.setText(nomTable);

        detalleTable = String.valueOf(tabla1.getValueAt(seleccionado, 2));
        campo5.setText(detalleTable);
    }//GEN-LAST:event_tabla1MouseClicked

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
    private javax.swing.JTextField hijoDe3;
    private javax.swing.JTextField hijoId3;
    private javax.swing.JTextField hijoNom3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTable jTable3;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
