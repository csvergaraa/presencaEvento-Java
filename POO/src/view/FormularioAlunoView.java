package view;

import controller.AlunoControll;
import controller.ValidacaoException;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import vo.AlunoVO;

public class FormularioAlunoView extends javax.swing.JFrame {

    /**
     * Creates new form Aplicacao
     */
    public FormularioAlunoView() {
        initComponents();
        this.setTitle("Cadastro Aluno");
        this.setLocationRelativeTo(null);
        this.editarAluno.setEnabled(false);
        this.inputNome.setBorder(new LineBorder(Color.WHITE, 5, false));
        this.inputRA.setBorder(new LineBorder(Color.WHITE, 5, false));        
        this.inputEMAIL.setBorder(new LineBorder(Color.WHITE, 5, false));
        this.inputTelefone.setBorder(new LineBorder(Color.WHITE, 5, false));
        this.inputCurso.setBorder(new LineBorder(Color.WHITE, 5, false));        
 
    }

        public FormularioAlunoView(HomeAlunoView homeAluno, AlunoVO alunoVO) {

        initComponents();
        this.setTitle("Edição de Registro de Aluno");
        this.saveAluno.setEnabled(false);
        this.inputRA.setEnabled(false);
        this.setLocationRelativeTo(null);
        this.inputNome.setBorder(new LineBorder(Color.WHITE, 5, false));
        this.inputRA.setBorder(new LineBorder(Color.WHITE, 5, false));        
        this.inputEMAIL.setBorder(new LineBorder(Color.WHITE, 5, false));
        this.inputTelefone.setBorder(new LineBorder(Color.WHITE, 5, false));
        this.inputCurso.setBorder(new LineBorder(Color.WHITE, 5, false));        
        
        popularCampos(alunoVO);
    }
    
    public void popularCampos(AlunoVO alunoVO) {
        
        this.inputRA.setText(String.valueOf(alunoVO.getRA()));
        this.inputNome.setText(alunoVO.getNome());
        this.inputCurso.setText(alunoVO.getCurso());
        this.inputPeriodo.setSelectedItem(alunoVO.getPeriodo());
        this.inputTelefone.setText(alunoVO.getTelefone());
        this.inputEMAIL.setText(alunoVO.getEmail());
        this.inputTurno.setSelectedItem(alunoVO.getTurno());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputNome4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textCadastro = new javax.swing.JLabel();
        textNome = new javax.swing.JLabel();
        textRA = new javax.swing.JLabel();
        textCurso = new javax.swing.JLabel();
        textEMAIL = new javax.swing.JLabel();
        textTurno = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        inputRA = new javax.swing.JTextField();
        inputCurso = new javax.swing.JTextField();
        inputEMAIL = new javax.swing.JTextField();
        inputTurno = new javax.swing.JComboBox<>();
        textPeriodo = new javax.swing.JLabel();
        inputPeriodo = new javax.swing.JComboBox<>();
        textTelefone = new javax.swing.JLabel();
        saveAluno = new javax.swing.JLabel();
        inputTelefone = new javax.swing.JFormattedTextField();
        cancelar = new javax.swing.JLabel();
        editarAluno = new javax.swing.JLabel();

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

        textCadastro.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        textCadastro.setForeground(new java.awt.Color(255, 255, 255));
        textCadastro.setText("Cadastro de Alunos");

        textNome.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textNome.setForeground(new java.awt.Color(255, 255, 255));
        textNome.setText("Nome:");

        textRA.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textRA.setForeground(new java.awt.Color(255, 255, 255));
        textRA.setText("RA:");

        textCurso.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textCurso.setForeground(new java.awt.Color(255, 255, 255));
        textCurso.setText("Curso:");

        textEMAIL.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textEMAIL.setForeground(new java.awt.Color(255, 255, 255));
        textEMAIL.setText("E-mail:");

        textTurno.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textTurno.setForeground(new java.awt.Color(255, 255, 255));
        textTurno.setText("Turno:");

        inputNome.setBorder(null);
        inputNome.setMargin(new java.awt.Insets(0, 10, 0, 0));

        inputRA.setBorder(null);
        inputRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRAActionPerformed(evt);
            }
        });

        inputCurso.setBorder(null);
        inputCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCursoActionPerformed(evt);
            }
        });

        inputEMAIL.setBorder(null);
        inputEMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEMAILActionPerformed(evt);
            }
        });

        inputTurno.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        inputTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino", "Noturno", "Integral" }));
        inputTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTurnoActionPerformed(evt);
            }
        });

        textPeriodo.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        textPeriodo.setText("Período:");

        inputPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        inputPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPeriodoActionPerformed(evt);
            }
        });

        textTelefone.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textTelefone.setForeground(new java.awt.Color(255, 255, 255));
        textTelefone.setText("Telefone:");

        saveAluno.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        saveAluno.setForeground(new java.awt.Color(3, 218, 198));
        saveAluno.setText("CADASTRAR");
        saveAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveAlunoMouseClicked(evt);
            }
        });

        inputTelefone.setBorder(null);
        try {
            inputTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(244, 67, 54));
        cancelar.setText("VOLTAR");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });

        editarAluno.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        editarAluno.setForeground(new java.awt.Color(3, 218, 198));
        editarAluno.setText("CONCLUIR EDIÇÃO");
        editarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarAlunoMouseClicked(evt);
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
                        .addComponent(textCadastro)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTurno)
                            .addComponent(inputTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textCurso))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(textPeriodo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(inputPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inputNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputRA, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(textEMAIL, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textRA, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textNome, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(textTelefone)
                                            .addGap(326, 326, 326))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(cancelar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(editarAluno)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(saveAluno))))))
                        .addGap(0, 26, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(inputTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(inputEMAIL, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textCadastro)
                .addGap(18, 18, 18)
                .addComponent(textNome)
                .addGap(8, 8, 8)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(textRA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputRA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textEMAIL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(textTelefone)
                .addGap(17, 17, 17)
                .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCurso)
                    .addComponent(textPeriodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(textTurno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveAluno)
                    .addComponent(cancelar)
                    .addComponent(editarAluno))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRAActionPerformed

    private void inputCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCursoActionPerformed

    private void inputEMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEMAILActionPerformed

    private void inputNome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNome4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNome4ActionPerformed

    private void inputTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTurnoActionPerformed

    private void inputPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPeriodoActionPerformed

    private void saveAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveAlunoMouseClicked
      
        try {            
            AlunoControll alunoControl = new AlunoControll();
            alunoControl.cadastrar(this.inputRA.getText(),
                    this.inputNome.getText(),
                    this.inputCurso.getText(),
                    this.inputPeriodo.getSelectedItem().toString(),
                    this.inputTurno.getSelectedItem().toString(),
                    this.inputEMAIL.getText(), 
                    this.inputTelefone.getText());
 
            //this.buscaAlunoView.buscarAlunos();
            
            JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso!", "Cadastro Aluno", JOptionPane.INFORMATION_MESSAGE);
           
            
            this.dispose();
            
        } catch (ValidacaoException validacaoException) {
            
            JOptionPane.showMessageDialog(rootPane, validacaoException.getMessage(), "Cadastro Aluno", JOptionPane.WARNING_MESSAGE);
        
        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar o cadastro!", "Cadastro Aluno", JOptionPane.ERROR_MESSAGE);
        
        }
        HomeAlunoView form = new HomeAlunoView();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_saveAlunoMouseClicked

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        HomeAlunoView form = new HomeAlunoView();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarMouseClicked

    private void editarAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarAlunoMouseClicked

        try {
            
            AlunoControll alunoControl = new AlunoControll();
            alunoControl.editar(this.inputRA.getText(), 
                    this.inputNome.getText(), 
                    this.inputCurso.getText(), 
                    this.inputPeriodo.getSelectedItem().toString(), 
                    this.inputTurno.getSelectedItem().toString(), 
                    this.inputEMAIL.getText(),
                    this.inputTelefone.getText());
            
          //  this.buscaAlunoView.buscarAlunos();
            
            JOptionPane.showMessageDialog(rootPane, "Edição realizada com sucesso!", "Editar Cliente", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose();
            
        } catch (ValidacaoException validacaoException) {
            
            JOptionPane.showMessageDialog(rootPane, validacaoException.getMessage(), "Editar Aluno", JOptionPane.WARNING_MESSAGE);
        
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar a edição!", "Editar Aluno", JOptionPane.ERROR_MESSAGE);
        
        }
        HomeAlunoView form = new HomeAlunoView();
        form.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_editarAlunoMouseClicked

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
            java.util.logging.Logger.getLogger(FormularioAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FormularioAlunoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelar;
    private javax.swing.JLabel editarAluno;
    private javax.swing.JTextField inputCurso;
    private javax.swing.JTextField inputEMAIL;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputNome4;
    private javax.swing.JComboBox<String> inputPeriodo;
    private javax.swing.JTextField inputRA;
    private javax.swing.JFormattedTextField inputTelefone;
    private javax.swing.JComboBox<String> inputTurno;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel saveAluno;
    private javax.swing.JLabel textCadastro;
    private javax.swing.JLabel textCurso;
    private javax.swing.JLabel textEMAIL;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textPeriodo;
    private javax.swing.JLabel textRA;
    private javax.swing.JLabel textTelefone;
    private javax.swing.JLabel textTurno;
    // End of variables declaration//GEN-END:variables
}
