/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EventoControll;
import controller.ValidacaoException;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cesarvergara
 */
public class FormularioEventoView extends javax.swing.JFrame {

    /**
     * Creates new form Aplicacao
     */
    public FormularioEventoView() {
        initComponents();
        this.setTitle("Cadastro de Evento");
        
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputNome4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        deleteEvent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        inputData = new javax.swing.JTextField();
        inputHoraInicial = new javax.swing.JTextField();
        inputHoraFinal = new javax.swing.JTextField();
        inputTipoEvento = new javax.swing.JComboBox<>();
        salvarEvento = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora Inicial:");

        inputNome4.setBackground(new java.awt.Color(44, 62, 80));
        inputNome4.setForeground(new java.awt.Color(255, 255, 255));
        inputNome4.setText("Hora Final");
        inputNome4.setBorder(null);
        inputNome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNome4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(44, 62, 80));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        Title.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Editar Evento");

        deleteEvent.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        deleteEvent.setForeground(new java.awt.Color(244, 67, 54));
        deleteEvent.setText("CANCELAR");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data:");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora Inicial:");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hora Final:");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de Evento:");

        inputNome.setForeground(new java.awt.Color(0, 0, 0));
        inputNome.setBorder(null);

        inputData.setForeground(new java.awt.Color(0, 0, 0));
        inputData.setBorder(null);
        inputData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataActionPerformed(evt);
            }
        });

        inputHoraInicial.setForeground(new java.awt.Color(0, 0, 0));
        inputHoraInicial.setBorder(null);
        inputHoraInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHoraInicialActionPerformed(evt);
            }
        });

        inputHoraFinal.setForeground(new java.awt.Color(0, 0, 0));
        inputHoraFinal.setBorder(null);
        inputHoraFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHoraFinalActionPerformed(evt);
            }
        });

        inputTipoEvento.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        inputTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Palestra", "Minicurso", "Mesa redonda", "Oficina" }));
        inputTipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTipoEventoActionPerformed(evt);
            }
        });

        salvarEvento.setBackground(new java.awt.Color(44, 62, 80));
        salvarEvento.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        salvarEvento.setForeground(new java.awt.Color(0, 204, 204));
        salvarEvento.setText("SALVAR EVENTO");
        salvarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inputTipoEvento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Title)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteEvent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salvarEvento)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteEvent)
                    .addComponent(salvarEvento))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataActionPerformed

    private void inputHoraInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHoraInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHoraInicialActionPerformed

    private void inputHoraFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHoraFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHoraFinalActionPerformed

    private void inputNome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNome4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNome4ActionPerformed

    private void inputTipoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTipoEventoActionPerformed

    private void salvarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarEventoActionPerformed

        try {            
            EventoControll eventoControl = new EventoControll();
            eventoControl.cadastrarEvento(this.inputNome.getText(), 
                    this.inputTipoEvento.getSelectedItem().toString(), 
                    this.inputData.getText(), 
                    this.inputHoraInicial.getText(), 
                    this.inputHoraFinal.getText());
 
            //this.buscaAlunoView.buscarAlunos();
            
            JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso!", "Cadastro Evento", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose();
            
        } catch (ValidacaoException validacaoException) {
            
            JOptionPane.showMessageDialog(rootPane, validacaoException.getMessage(), "Cadastro Evento", JOptionPane.WARNING_MESSAGE);
        
        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar o cadastro!", "Cadastro Evento", JOptionPane.ERROR_MESSAGE);
        
        }

    }//GEN-LAST:event_salvarEventoActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioEventoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEventoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEventoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEventoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioEventoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel deleteEvent;
    private javax.swing.JTextField inputData;
    private javax.swing.JTextField inputHoraFinal;
    private javax.swing.JTextField inputHoraInicial;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputNome4;
    private javax.swing.JComboBox<String> inputTipoEvento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salvarEvento;
    // End of variables declaration//GEN-END:variables
}
