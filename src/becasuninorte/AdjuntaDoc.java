/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becasuninorte;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JONATHAN
 */
public class AdjuntaDoc extends javax.swing.JFrame {

    static SQLclass query;
    String[] v1 = {"Indice","Descripción","Tipo"};
    String[] v2 = {"id","Identificación","Nombre","Primer apellido","Segundo apellido"};
    String idps,idds;
    //String idBecaTable, idBeneficioTable, NombreBeca, DesBeneficio;

    public AdjuntaDoc(SQLclass query) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idpersona.setEditable(false);
        this.iddocumento.setEditable(false);
        this.query = query;
        personas.setModel(query.query("SELECT id,identificacion,nombre,apellido1,apellido2 FROM persona", v2));
        DefaultTableModel m = query.query("select * from documento", v1);
        m.addColumn("Adjuntar");
        documentos.setModel(m);
        documentos.getColumnModel().getColumn(3).setCellEditor(documentos.getDefaultEditor(Boolean.class));
        documentos.getColumnModel().getColumn(3).setCellRenderer(documentos.getDefaultRenderer(Boolean.class));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        documentos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        personas_documentos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idpersona = new javax.swing.JTextField();
        iddocumento = new javax.swing.JTextField();
        Join = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel4.setBackground(new java.awt.Color(255, 7, 11));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 7, 11));
        jPanel1.setPreferredSize(new java.awt.Dimension(512, 309));
        jPanel1.setLayout(new java.awt.BorderLayout());

        personas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        personas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personas);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Personas");
        jPanel1.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 440, 320));

        jPanel2.setBackground(new java.awt.Color(255, 7, 11));
        jPanel2.setPreferredSize(new java.awt.Dimension(512, 309));
        jPanel2.setLayout(new java.awt.BorderLayout());

        documentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        documentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                documentosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(documentos);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Documentos");
        jPanel2.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 11, 450, 309));

        jPanel3.setBackground(new java.awt.Color(255, 7, 11));
        jPanel3.setLayout(new java.awt.BorderLayout());

        personas_documentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        personas_documentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personas_documentosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(personas_documentos);

        jPanel3.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Documentos adjuntos por la persona seleccionada");
        jPanel3.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 345, 1100, 310));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id persona:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, 20));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id documento:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, 20));

        idpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpersonaActionPerformed(evt);
            }
        });
        jPanel4.add(idpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 72, -1));
        jPanel4.add(iddocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 72, -1));

        Join.setText("Unir");
        Join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinActionPerformed(evt);
            }
        });
        jPanel4.add(Join, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 170, -1));

        getContentPane().add(jPanel4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinActionPerformed
        String idper = idpersona.getText();
        //String iddoc = iddocumento.getText();
       
            for (int i = 0; i < documentos.getRowCount(); i++) {
                String iddoc = documentos.getValueAt(i,0).toString();
                if(documentos.getValueAt(i,3) != null){
                String comand = "insert into adjunta_doc values (" + idper + "," + iddoc + ")";
                System.out.println(comand);
                query.ejecutar(comand);
                DefaultTableModel m = query.query("SELECT doc.indice,doc.descripcion,doc.tipo FROM documento doc INNER JOIN adjunta_doc ad ON (doc.indice=ad.indice_doc) where ad.id_persona="+idps, v1);
                personas_documentos.setModel(m);
                idpersona.setText("");
                iddocumento.setText("");
                }
            }
//            if (JOptionPane.showConfirmDialog(null, "¿Confirma adjuntarle a la persona con id=" + idps + "\n el documento:  " + idds) == 0) {
//                String comand = "insert into adjunta_doc values (" + idper + "," + iddoc + ")";
//                System.out.println(comand);
//                query.ejecutar(comand);
//                String join = "select b.id, nombre, descripcion from beca b inner join beneficio_de_beca bdb on (b.id = bdb.id_beca)"
//                        + " inner join beneficio bn on (bdb.id_beneficio = bn.id) where b.id = " + idbeca;
//                personas_documentos.setModel(query.query(join, v));
//                idpersona.setText("");
//                iddocumento.setText("");
//            }
        

    }//GEN-LAST:event_JoinActionPerformed

    private void personasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personasMouseClicked
        idps = personas.getValueAt(personas.getSelectedRow(), 0).toString();
        idpersona.setText(idps);
        //NombreBeca = String.valueOf(personas.getValueAt(seleccionado, 1));
        //String join = "select b.id, nombre, descripcion from beca b inner join beneficio_de_beca bdb on (b.id = bdb.id_beca)"
                //+ " inner join beneficio bn on (bdb.id_beneficio = bn.id) where b.id = " + idBecaTable;
        DefaultTableModel m = query.query("SELECT doc.indice,doc.descripcion,doc.tipo FROM documento doc INNER JOIN adjunta_doc ad ON (doc.indice=ad.indice_doc) where ad.id_persona="+idps, v1);
        personas_documentos.setModel(m);
    }//GEN-LAST:event_personasMouseClicked

    private void documentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_documentosMouseClicked
        idds = documentos.getValueAt(documentos.getSelectedRow(), 0).toString();
        iddocumento.setText(idds);
    }//GEN-LAST:event_documentosMouseClicked

    private void personas_documentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personas_documentosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_personas_documentosMouseClicked

    private void idpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpersonaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdjuntaDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdjuntaDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdjuntaDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdjuntaDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdjuntaDoc(query).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Join;
    private javax.swing.JTable documentos;
    private javax.swing.JTextField iddocumento;
    private javax.swing.JTextField idpersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable personas;
    private javax.swing.JTable personas_documentos;
    // End of variables declaration//GEN-END:variables
}