package becasuninorte;

import javax.swing.JOptionPane;

/**
 *
 * @author gguerreroa
 */
public class DocumentoRequerido extends javax.swing.JFrame {

    static SQLclass query;
    String v1[] = {"id", "nombre", "cupos"};
    String v2[] = {"indice", "descripción", "tipo"};
    String v[] = {"id_beca", "indice_documento", "descripcion_documento", "tipo_documento"};
    String idBecaTable, idBeneficioTable, NombreBeca, DesBeneficio;

    public DocumentoRequerido(SQLclass query) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idBeca.setEditable(false);
        this.idPersona.setEditable(false);
        this.query = query;
        Becas_table.setModel(query.query("select * from beca", v1));
        Beneficios_table.setModel(query.query("select * from documento", v2));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Becas_table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idBeca = new javax.swing.JTextField();
        idPersona = new javax.swing.JTextField();
        Join = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Beneficios_table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Beca_beneficios_table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 7, 11));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 7, 11));
        jPanel1.setPreferredSize(new java.awt.Dimension(440, 320));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Becas_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Becas_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Becas_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Becas_table);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Becas");
        jPanel1.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id Beca:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, 20));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id Documento:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 100, -1));
        jPanel4.add(idBeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 100, -1));
        jPanel4.add(idPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 100, -1));

        Join.setText("Unir");
        Join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinActionPerformed(evt);
            }
        });
        jPanel4.add(Join, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 180, -1));

        jPanel2.setBackground(new java.awt.Color(255, 7, 11));
        jPanel2.setPreferredSize(new java.awt.Dimension(440, 320));
        jPanel2.setLayout(new java.awt.BorderLayout());

        Beneficios_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Beneficios_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Beneficios_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Beneficios_table);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Documentos");
        jPanel2.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 11, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 7, 11));
        jPanel3.setLayout(new java.awt.BorderLayout());

        Beca_beneficios_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Beca_beneficios_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Beca_beneficios_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Beca_beneficios_table);

        jPanel3.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Documento de la beca seleccionada");
        jPanel3.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 363, 1100, 290));

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinActionPerformed
        String idbeca = idBeca.getText();
        String idPersona = this.idPersona.getText();
        if (idbeca.equals("") || idPersona.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una beca y un documento");
        } else {
            if (JOptionPane.showConfirmDialog(null, "¿Confirma darle a la beca " + NombreBeca
                    + " con id=" + idbeca + "\n el documento con la descripcion:  " + DesBeneficio) == 0) {
                String comand = "insert into documento_requerido values (" + idbeca + "," + idPersona + ")";
                System.out.println(comand);
                query.ejecutar(comand);
                System.out.println("debug");
                String join = "select b.id, bn.indice, bn.descripcion, bn.tipo from beca b inner join documento_requerido bdb on (b.id = bdb.id_beca)"
                        + " inner join documento bn on (bdb.indice_doc = bn.indice) where b.id = " + idbeca;
                System.out.println(join);
                Beca_beneficios_table.setModel(query.query(join, v));
                idBeca.setText("");
                this.idPersona.setText("");
            }
        }

    }//GEN-LAST:event_JoinActionPerformed

    private void Becas_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Becas_tableMouseClicked
        int seleccionado = Becas_table.rowAtPoint(evt.getPoint());
        idBecaTable = String.valueOf(Becas_table.getValueAt(seleccionado, 0));
        idBeca.setText(idBecaTable);

        NombreBeca = String.valueOf(Becas_table.getValueAt(seleccionado, 1));

        String join = "select b.id, p.indice, p.descripcion, p.tipo from beca b inner join documento_requerido conv on (b.id = conv.id_beca)"
                + " inner join documento p on (conv.indice_doc = p.indice) where b.id = " + idBecaTable;
        Beca_beneficios_table.setModel(query.query(join, v));
    }//GEN-LAST:event_Becas_tableMouseClicked

    private void Beneficios_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Beneficios_tableMouseClicked
        int seleccionado = Beneficios_table.rowAtPoint(evt.getPoint());
        idBeneficioTable = String.valueOf(Beneficios_table.getValueAt(seleccionado, 0));
        idPersona.setText(idBeneficioTable);

        DesBeneficio = String.valueOf(Beneficios_table.getValueAt(seleccionado, 1));
    }//GEN-LAST:event_Beneficios_tableMouseClicked

    private void Beca_beneficios_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Beca_beneficios_tableMouseClicked
       
    }//GEN-LAST:event_Beca_beneficios_tableMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocumentoRequerido(query).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Beca_beneficios_table;
    private javax.swing.JTable Becas_table;
    private javax.swing.JTable Beneficios_table;
    private javax.swing.JButton Join;
    private javax.swing.JTextField idBeca;
    private javax.swing.JTextField idPersona;
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
    // End of variables declaration//GEN-END:variables
}
