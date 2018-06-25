/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AlunoControll;
import controller.AlunoEventoControll;
import controller.EventoControll;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;
import vo.AlunoVO;
import vo.EventoVO;

/**
 *
 * @author cesarvergara
 */
public class FormularioPresencaView extends javax.swing.JFrame {

    /**
     * Creates new form Aplicacao
     */
    public FormularioPresencaView() {
        initComponents();
//      this.setTitle("Cadastro de Presença");
        this.setLocationRelativeTo(null);
        this.inputRA.setSelected(true);
        this.inputAluno.setBorder(new LineBorder(Color.WHITE, 5, false));
        this.inputEvento.setBorder(new LineBorder(Color.WHITE, 5, false));
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputNome4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        escolhaBusca = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputEvento = new javax.swing.JTextField();
        inputAluno = new javax.swing.JTextField();
        buttonPresenca = new javax.swing.JLabel();
        buttonBuscarEvento = new javax.swing.JLabel();
        textEvento = new javax.swing.JLabel();
        textAluno = new javax.swing.JLabel();
        inputRA = new javax.swing.JRadioButton();
        inputNome = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

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

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Curso:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(44, 62, 80));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(358, 356));

        Title.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Controle de Presenças");

        buttonVoltar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        buttonVoltar.setForeground(new java.awt.Color(244, 67, 54));
        buttonVoltar.setText("VOLTAR");
        buttonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVoltarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome do Evento:");

        inputEvento.setBorder(null);
        inputEvento.setMargin(new java.awt.Insets(0, 10, 0, 0));

        inputAluno.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        inputAluno.setMargin(new java.awt.Insets(10, 10, 10, 10));
        inputAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAlunoActionPerformed(evt);
            }
        });

        buttonPresenca.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        buttonPresenca.setForeground(new java.awt.Color(255, 179, 0));
        buttonPresenca.setText("DAR PRESENÇA");
        buttonPresenca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPresencaMouseClicked(evt);
            }
        });

        buttonBuscarEvento.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        buttonBuscarEvento.setForeground(new java.awt.Color(255, 255, 255));
        buttonBuscarEvento.setText("BUSCAR");
        buttonBuscarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBuscarEventoMouseClicked(evt);
            }
        });

        textEvento.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textEvento.setForeground(new java.awt.Color(51, 255, 51));

        textAluno.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textAluno.setForeground(new java.awt.Color(255, 255, 255));

        escolhaBusca.add(inputRA);
        inputRA.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        inputRA.setForeground(new java.awt.Color(255, 255, 255));
        inputRA.setText("RA");
        inputRA.setToolTipText("");
        inputRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRAActionPerformed(evt);
            }
        });

        escolhaBusca.add(inputNome);
        inputNome.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        inputNome.setForeground(new java.awt.Color(255, 255, 255));
        inputNome.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscar Aluno por:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAluno)
                    .addComponent(Title)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonBuscarEvento))
                    .addComponent(textEvento)
                    .addComponent(buttonVoltar)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputRA)
                        .addGap(18, 18, 18)
                        .addComponent(inputNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonPresenca)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscarEvento))
                .addGap(26, 26, 26)
                .addComponent(textEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputRA)
                    .addComponent(inputNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPresenca))
                .addGap(26, 26, 26)
                .addComponent(textAluno)
                .addGap(29, 29, 29)
                .addComponent(buttonVoltar)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void inputNome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNome4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNome4ActionPerformed

    private void inputRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRAActionPerformed

    private void buttonPresencaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPresencaMouseClicked

        try {
        
            String text = this.inputAluno.getText();
            AlunoControll alunoControl = new AlunoControll();
            AlunoVO alunoVO;
            if(this.inputNome.isSelected()){
                ArrayList<AlunoVO> aluno = alunoControl.buscarNome(text);
                alunoVO = aluno.get(0);
            } else {
               alunoVO = alunoControl.buscarRA(text);
            }
            
            String evento = this.inputEvento.getText();
            EventoControll eventoControl = new EventoControll();
            ArrayList<EventoVO> event = eventoControl.buscarNome(evento);
            EventoVO eventoVO = event.get(0);
            
            AlunoEventoControll alunoEventoControl = new AlunoEventoControll(alunoVO, eventoVO);
            alunoEventoControl.cadastrar();
            
            this.textAluno.setForeground(Color.green);
            this.textAluno.setText("Presença do aluno '" + alunoVO.getNome() + "' inserida com sucesso.");
            
        } catch (SQLException ex) {
        
            this.textAluno.setForeground(Color.red);
            this.textAluno.setText("ERRO!");
            
        } catch (Exception ex) {
            
            this.textAluno.setForeground(Color.red);
            this.textAluno.setText("ERRO!");
            
        }
                
        inputAluno.setText("");
        inputAluno.requestFocus();
    }//GEN-LAST:event_buttonPresencaMouseClicked

    private void inputAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAlunoActionPerformed

    private void buttonVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarMouseClicked
        HomeProgramaView home = new HomeProgramaView();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonVoltarMouseClicked

    private void buttonBuscarEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarEventoMouseClicked

        try {
        
            String nome = this.inputEvento.getText();
            
            EventoControll eventoControl = new EventoControll();
            ArrayList<EventoVO> evento = eventoControl.buscarNome(nome);
            
            EventoVO eventoVO = evento.get(0);
            String texto = "Evento '" + eventoVO.getNome()+ "' selecionado com sucesso.";
            this.textEvento.setText(texto);
            this.inputEvento.setText(eventoVO.getNome());
            
        } catch (SQLException ex) {
        
            Logger.getLogger(HomeEventoView.class.getName()).log(Level.SEVERE, null, ex);
       
        } catch (Exception ex) {
            
            Logger.getLogger(HomeEventoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_buttonBuscarEventoMouseClicked

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
            java.util.logging.Logger.getLogger(FormularioPresencaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPresencaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPresencaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPresencaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPresencaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel buttonBuscarEvento;
    private javax.swing.JLabel buttonPresenca;
    private javax.swing.JLabel buttonVoltar;
    private javax.swing.ButtonGroup escolhaBusca;
    private javax.swing.JTextField inputAluno;
    private javax.swing.JTextField inputEvento;
    private javax.swing.JRadioButton inputNome;
    private javax.swing.JTextField inputNome4;
    private javax.swing.JRadioButton inputRA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textAluno;
    private javax.swing.JLabel textEvento;
    // End of variables declaration//GEN-END:variables
}