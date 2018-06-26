package view;

import controller.AlunoControll;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import vo.AlunoVO;

public class HomeAlunoView extends javax.swing.JFrame {

    public HomeAlunoView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.buscarAlunos();
        this.inputBuscarAluno.setBorder(new LineBorder(Color.WHITE, 5, false));
    }

    public void buscarAlunos() {
        try {

            AlunoControll alunoControl = new AlunoControll();
            ArrayList<AlunoVO> alunos = alunoControl.buscar();
            this.popularTabelaAluno(alunos);

        } catch (Exception ex) {

            Logger.getLogger(HomeEventoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void popularTabelaAluno(ArrayList<AlunoVO> alunos) {

        try {

            DefaultTableModel table = (DefaultTableModel) tableAluno.getModel();
            table.fireTableDataChanged();
            table.setRowCount(0);

            for (AlunoVO alunoVO : alunos) {

                table.addRow(new Object[]{alunoVO.getRA(), alunoVO.getNome(), alunoVO.getCurso(), alunoVO.getPeriodo(), alunoVO.getTurno(), alunoVO.getEmail(), alunoVO.getTelefone()});
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a tabela.", "Buscar Alunos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textAluno = new javax.swing.JLabel();
        textBuscarAluno = new javax.swing.JLabel();
        voltar = new javax.swing.JLabel();
        editAluno = new javax.swing.JLabel();
        deleteAluno = new javax.swing.JLabel();
        newAluno = new javax.swing.JLabel();
        inputBuscarAluno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAluno = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(728, 346));

        textAluno.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        textAluno.setForeground(new java.awt.Color(255, 255, 255));
        textAluno.setText("Alunos");

        textBuscarAluno.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        textBuscarAluno.setForeground(new java.awt.Color(255, 255, 255));
        textBuscarAluno.setText("Buscar Aluno:");

        voltar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        voltar.setForeground(new java.awt.Color(244, 67, 54));
        voltar.setText("VOLTAR");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });

        editAluno.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        editAluno.setForeground(new java.awt.Color(3, 218, 198));
        editAluno.setText("EDITAR");
        editAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editAlunoMouseClicked(evt);
            }
        });

        deleteAluno.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        deleteAluno.setForeground(new java.awt.Color(244, 67, 54));
        deleteAluno.setText("EXCLUIR");
        deleteAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAlunoMouseClicked(evt);
            }
        });

        newAluno.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        newAluno.setForeground(new java.awt.Color(3, 218, 198));
        newAluno.setText("+ NOVO ALUNO");
        newAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newAlunoMouseClicked(evt);
            }
        });

        inputBuscarAluno.setBorder(null);
        inputBuscarAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputBuscarAlunoKeyReleased(evt);
            }
        });

        tableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "RA", "Nome", "Curso", "Periodo", "Turno", "E-mail", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableAluno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAluno)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textBuscarAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputBuscarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteAluno)
                        .addGap(54, 54, 54)
                        .addComponent(editAluno)
                        .addGap(42, 42, 42)
                        .addComponent(newAluno)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textAluno)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBuscarAluno)
                    .addComponent(inputBuscarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(deleteAluno)
                    .addComponent(editAluno)
                    .addComponent(newAluno))
                .addContainerGap(16, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newAlunoMouseClicked
        FormularioAlunoView form = new FormularioAlunoView();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newAlunoMouseClicked

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        HomeProgramaView form = new HomeProgramaView();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMouseClicked

    private void inputBuscarAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBuscarAlunoKeyReleased
        try {
        
            String nome = this.inputBuscarAluno.getText();
            
            AlunoControll alunoControl = new AlunoControll();
            ArrayList<AlunoVO> alunos = alunoControl.buscarNome(nome);
            
            this.popularTabelaAluno(alunos);
       
        } catch (SQLException ex) {
        
            Logger.getLogger(HomeEventoView.class.getName()).log(Level.SEVERE, null, ex);
       
        } catch (Exception ex) {
            
            Logger.getLogger(HomeEventoView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_inputBuscarAlunoKeyReleased

    private void deleteAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAlunoMouseClicked

        try {

            AlunoVO alunoVO = new AlunoVO();
            alunoVO.setRA(Integer.parseInt(this.tableAluno.getValueAt(this.tableAluno.getSelectedRow(), 0).toString()));
            alunoVO.setNome(this.tableAluno.getValueAt(this.tableAluno.getSelectedRow(), 1).toString());
            
            int op = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir permanentemente o aluno " + alunoVO.getNome() + "?", "Exclusão de Evento", JOptionPane.YES_NO_CANCEL_OPTION);
            AlunoControll alunoControl = new AlunoControll(alunoVO);

            if (op == 0) {

                alunoControl.excluir();
                JOptionPane.showMessageDialog(rootPane, "Aluno excluído com sucesso!", "Exclusão de Evento", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (ArrayIndexOutOfBoundsException ex) {

            JOptionPane.showMessageDialog(rootPane, "Selecione um aluno na tabela", "Exclusão de Aluno", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, "ERRO! Aluno está vinculado há algum evento!", "Exclusão de Aluno", JOptionPane.ERROR_MESSAGE);

        } finally {
            
            this.buscarAlunos();
        }

    }//GEN-LAST:event_deleteAlunoMouseClicked

    private void editAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAlunoMouseClicked
            try {

            AlunoVO alunoVO = new AlunoVO();

            alunoVO.setRA(Integer.parseInt(this.tableAluno.getValueAt(this.tableAluno.getSelectedRow(), 0).toString()));
            alunoVO.setNome((String) this.tableAluno.getValueAt(this.tableAluno.getSelectedRow(), 1));
            alunoVO.setCurso((String) this.tableAluno.getValueAt(this.tableAluno.getSelectedRow(), 2));
            alunoVO.setPeriodo(Integer.parseInt(this.tableAluno.getValueAt(this.tableAluno.getSelectedRow(), 3).toString()));
            alunoVO.setTurno((String) this.tableAluno.getValueAt(this.tableAluno.getSelectedRow(), 4).toString());
            alunoVO.setEmail((String) this.tableAluno.getValueAt(this.tableAluno.getSelectedRow(), 5));
            alunoVO.setTelefone((String) this.tableAluno.getValueAt(this.tableAluno.getSelectedRow(), 6));
            
            FormularioAlunoView form = new FormularioAlunoView(this, alunoVO);
            form.setVisible(true);

        } catch (ArrayIndexOutOfBoundsException ex) {

            JOptionPane.showMessageDialog(rootPane, "Selecione um registro na tabela", "Edição de Registro", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_editAlunoMouseClicked

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
            java.util.logging.Logger.getLogger(HomeAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAlunoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deleteAluno;
    private javax.swing.JLabel editAluno;
    private javax.swing.JTextField inputBuscarAluno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel newAluno;
    private javax.swing.JTable tableAluno;
    private javax.swing.JLabel textAluno;
    private javax.swing.JLabel textBuscarAluno;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
