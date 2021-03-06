package becasuninorte;

import javax.swing.JOptionPane;

/**
 *
 * @author gguerreroa
 */
public class Requisitos extends javax.swing.JFrame {

    String idTable, descripTable;
    static SQLclass query;
    String v[] = {"id", "descripción"};

    public Requisitos(SQLclass query) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.query = query;
        Beneficios_table.setModel(query.query("select * from beneficio", v));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inserción = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ID_bene = new javax.swing.JTextField();
        Desc_bene = new javax.swing.JTextField();
        Insertar_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Beneficios_table = new javax.swing.JTable();
        idNew = new javax.swing.JTextField();
        DescripcionNew = new javax.swing.JTextField();
        Actualizar_button = new javax.swing.JButton();
        Borrar_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Return = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Inserción.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Insertar un requisito");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Descripción:");

        ID_bene.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ID_beneKeyTyped(evt);
            }
        });

        Insertar_button.setText("Insertar");
        Insertar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insertar_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InserciónLayout = new javax.swing.GroupLayout(Inserción);
        Inserción.setLayout(InserciónLayout);
        InserciónLayout.setHorizontalGroup(
            InserciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InserciónLayout.createSequentialGroup()
                .addGroup(InserciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InserciónLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1))
                    .addGroup(InserciónLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(InserciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(InserciónLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(ID_bene, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InserciónLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(InserciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Desc_bene, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(InserciónLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(Insertar_button)))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        InserciónLayout.setVerticalGroup(
            InserciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InserciónLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(InserciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ID_bene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InserciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Desc_bene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(Insertar_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Requisito");

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
        jScrollPane1.setViewportView(Beneficios_table);

        idNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idNewKeyTyped(evt);
            }
        });

        Actualizar_button.setText("Actualizar");
        Actualizar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_buttonActionPerformed(evt);
            }
        });

        Borrar_button.setText("Borrar");
        Borrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar_buttonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 0));
        jLabel6.setText("Edite estos campos y pulse actualizar si desea cambiar datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(idNew, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DescripcionNew, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Actualizar_button)
                                .addGap(18, 18, 18)
                                .addComponent(Borrar_button)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescripcionNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizar_button)
                    .addComponent(Borrar_button))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Return.setText("Regresar");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Inserción, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Return)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inserción, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Return)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ID_beneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_beneKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_ID_beneKeyTyped

    private void Insertar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insertar_buttonActionPerformed
        String id = ID_bene.getText();
        String descripcion = "'" + Desc_bene.getText() + "'";
        if (descripcion.equals("''") || id.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe rellenar ambos campos");
        } else {
            if (JOptionPane.showConfirmDialog(null, "¿Confirma insertar el requisito con id=" + ID_bene.getText()
                    + " y descripción: " + Desc_bene.getText()) == 0) {
                String comand = "insert into requisito values (" + id + "," + descripcion + ")";
                System.out.println(comand);
                query.ejecutar(comand);
                Beneficios_table.setModel(query.query("select * from requisito", v));
                ID_bene.setText("");
                Desc_bene.setText("");
            }
        }

    }//GEN-LAST:event_Insertar_buttonActionPerformed


    private void Beneficios_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Beneficios_tableMouseClicked
        jLabel6.setVisible(true);
        int seleccionado = Beneficios_table.rowAtPoint(evt.getPoint());
        idTable = String.valueOf(Beneficios_table.getValueAt(seleccionado, 0));
        idNew.setText(idTable);
        descripTable = String.valueOf(Beneficios_table.getValueAt(seleccionado, 1));
        DescripcionNew.setText(descripTable);
    }//GEN-LAST:event_Beneficios_tableMouseClicked

    private void Actualizar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_buttonActionPerformed
        String id = idNew.getText();
        String descripcion = "'" + DescripcionNew.getText() + "'";
        if (idTable == null) {
            JOptionPane.showMessageDialog(null, "Debe elegir un requisito a actualizar");
        } else {
            if (descripcion.equals("''") || id.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe rellenar ambos campos");
            } else {
                if (idTable.equals(id) && descripTable.equals(DescripcionNew.getText())) {
                    JOptionPane.showMessageDialog(null, "Lo digitado en los campos de texto es igual"
                            + "a los valores registrados dentro de la base de datos");
                } else {
                    if (JOptionPane.showConfirmDialog(null, "¿Confirma actualizar el requisito con id=" + idTable
                            + " y descripción: " + descripTable) == 0) {
                        String p = "update requisito set id=" + id + ", descripcion=" + descripcion + " where id=" + idTable;
                        System.out.println(p);
                        query.ejecutar(p);
                        System.out.println("Ejecutado ");
                        Beneficios_table.setModel(query.query("select * from requisito", v));
                        idNew.setText("");
                        DescripcionNew.setText("");
                    }
                }
            }
        }


    }//GEN-LAST:event_Actualizar_buttonActionPerformed

    private void Borrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar_buttonActionPerformed
        if (idTable == null) {
            JOptionPane.showMessageDialog(null, "Debe elegir un requisito a borrar");
        } else {
            if (JOptionPane.showConfirmDialog(null, "¿Confirma borrar el requisito con id=" + idTable
                    + " y descripción: " + descripTable) == 0) {
                query.ejecutar("delete from requisito where id=" + idTable);
                Beneficios_table.setModel(query.query("select * from requisito", v));
            } else {
                System.out.println("No borro");
            }
        }

    }//GEN-LAST:event_Borrar_buttonActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        Principal ini = new Principal(query);
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnActionPerformed

    private void idNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idNewKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_idNewKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Requisitos(query).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_button;
    private javax.swing.JTable Beneficios_table;
    private javax.swing.JButton Borrar_button;
    private javax.swing.JTextField Desc_bene;
    private javax.swing.JTextField DescripcionNew;
    private javax.swing.JTextField ID_bene;
    private javax.swing.JPanel Inserción;
    private javax.swing.JButton Insertar_button;
    private javax.swing.JButton Return;
    private javax.swing.JTextField idNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
