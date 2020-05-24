/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becasuninorte;

import javax.swing.JOptionPane;

/**
 *
 * @author JONATHAN
 */
public class Beca extends javax.swing.JFrame {

    String idTable, nomTable, cuposTable;
    static SQLclass query;
    String v[] = {"id", "nombre", "cupos"};

    public Beca(SQLclass query) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.query = query;
        Becas_table.setModel(query.query("select * from beca", v));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inserción = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IdBeca = new javax.swing.JTextField();
        NombreBeca = new javax.swing.JTextField();
        Insertar_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CuposBeca = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Becas_table = new javax.swing.JTable();
        idNew = new javax.swing.JTextField();
        cuposNew = new javax.swing.JTextField();
        Actualizar_button = new javax.swing.JButton();
        Borrar_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nombreNew = new javax.swing.JTextField();
        Return = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Inserción.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Insertar un beca");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        IdBeca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdBecaKeyTyped(evt);
            }
        });

        Insertar_button.setText("Insertar");
        Insertar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insertar_buttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cupos:");

        CuposBeca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CuposBecaKeyTyped(evt);
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
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(CuposBeca, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InserciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(InserciónLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(IdBeca, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(InserciónLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(NombreBeca, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(InserciónLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(Insertar_button)))
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
                    .addComponent(IdBeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InserciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NombreBeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InserciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CuposBeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Insertar_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Becas");

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

        idNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idNewKeyTyped(evt);
            }
        });

        cuposNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuposNewKeyTyped(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(182, 182, 182))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idNew, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nombreNew)
                                .addGap(18, 18, 18)
                                .addComponent(cuposNew, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Actualizar_button)
                                .addGap(18, 18, 18)
                                .addComponent(Borrar_button)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(171, Short.MAX_VALUE))))
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
                    .addComponent(cuposNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizar_button)
                    .addComponent(Borrar_button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Return)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inserción, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Return)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdBecaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdBecaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_IdBecaKeyTyped

    private void Insertar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insertar_buttonActionPerformed
        String id = IdBeca.getText();
        String nombre = "'" + NombreBeca.getText() + "'";
        String cupos = CuposBeca.getText();
        if (nombre.equals("''") || id.equals("") || cupos.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");
        } else {
            if (JOptionPane.showConfirmDialog(null, "¿Confirma insertar la beca " + NombreBeca.getText()
                    + " con id=" + IdBeca.getText() + " y " + CuposBeca.getText() + " cupos") == 0) {
                String comand = "insert into beca values (" + id + "," + nombre + "," + cupos + ")";
                System.out.println(comand);
                query.ejecutar(comand);
                Becas_table.setModel(query.query("select * from beca", v));
                IdBeca.setText("");
                NombreBeca.setText("");
                CuposBeca.setText("");
            }
        }


    }//GEN-LAST:event_Insertar_buttonActionPerformed

    private void Becas_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Becas_tableMouseClicked

        jLabel6.setVisible(true);
        int seleccionado = Becas_table.rowAtPoint(evt.getPoint());
        idTable = String.valueOf(Becas_table.getValueAt(seleccionado, 0));
        idNew.setText(idTable);

        nomTable = String.valueOf(Becas_table.getValueAt(seleccionado, 1));
        nombreNew.setText(nomTable);

        cuposTable = String.valueOf(Becas_table.getValueAt(seleccionado, 2));
        cuposNew.setText(cuposTable);
    }//GEN-LAST:event_Becas_tableMouseClicked

    private void Actualizar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_buttonActionPerformed
        String id = idNew.getText();
        String nombre = "'" + nombreNew.getText() + "'";
        String cupos = cuposNew.getText();

        if (idTable == null) {
            JOptionPane.showMessageDialog(null, "Debe elegir una beca a actualizar");
        } else {
            if (nombre.equals("''") || id.equals("") || cupos.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");
            } else {
                if (idTable.equals(id) && nomTable.equals(nombreNew.getText()) && cuposTable.equals(cupos)) {
                    JOptionPane.showMessageDialog(null, "Lo digitado en los campos de texto es igual"
                            + "a los valores registrados dentro de la base de datos");

                } else {
                    if (JOptionPane.showConfirmDialog(null, "¿Confirma actualizar la beca " + nomTable
                            + " con id=" + idTable + " y " + cuposTable + " cupos") == 0) {
                        String p = "update beca set id=" + id + ", nombre=" + nombre + ", cupos= " + cupos + " where id=" + idTable;
                        System.out.println(p);
                        query.ejecutar(p);
                        System.out.println("Ejecutado ");
                        Becas_table.setModel(query.query("select * from beca", v));
                        idNew.setText("");
                        nombreNew.setText("");
                        cuposNew.setText("");
                    }
                }
            }
        }


    }//GEN-LAST:event_Actualizar_buttonActionPerformed

    private void Borrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar_buttonActionPerformed
        if (idTable == null) {
            JOptionPane.showMessageDialog(null, "Debe elegir una beca a borrar");
        } else {
            if (JOptionPane.showConfirmDialog(null, "¿Confirma borrar la beca " + nomTable
                    + " con id=" + idTable + " y " + cuposTable + " cupos") == 0) {
                query.ejecutar("delete from beca where id=" + idTable);
                Becas_table.setModel(query.query("select * from beca", v));
            } else {
                System.out.println("No borro");
            }
        }
    }//GEN-LAST:event_Borrar_buttonActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        GestionBecas ini = new GestionBecas(query);
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnActionPerformed

    private void CuposBecaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CuposBecaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_CuposBecaKeyTyped

    private void idNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idNewKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_idNewKeyTyped

    private void cuposNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuposNewKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_cuposNewKeyTyped

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
            java.util.logging.Logger.getLogger(Beca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beca(query).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_button;
    private javax.swing.JTable Becas_table;
    private javax.swing.JButton Borrar_button;
    private javax.swing.JTextField CuposBeca;
    private javax.swing.JTextField IdBeca;
    private javax.swing.JPanel Inserción;
    private javax.swing.JButton Insertar_button;
    private javax.swing.JTextField NombreBeca;
    private javax.swing.JButton Return;
    private javax.swing.JTextField cuposNew;
    private javax.swing.JTextField idNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreNew;
    // End of variables declaration//GEN-END:variables
}
