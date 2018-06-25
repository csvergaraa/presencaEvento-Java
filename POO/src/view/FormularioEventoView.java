package view;

import controller.EventoControll;
import controller.ValidacaoException;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import vo.EventoVO;

public class FormularioEventoView extends javax.swing.JFrame {

    public FormularioEventoView() {
        initComponents();
        this.setTitle("Cadastro de Evento");
        this.setLocationRelativeTo(null);
        this.editarEvento.setEnabled(false);
        this.inputNome.setBorder(new LineBorder(Color.WHITE, 5, false));
        this.inputData.setBorder(new LineBorder(Color.WHITE, 5, false));        
        this.inputHoraInicial.setBorder(new LineBorder(Color.WHITE, 5, false));
        this.inputHoraFinal.setBorder(new LineBorder(Color.WHITE, 5, false));

    }

     public FormularioEventoView(HomeEventoView homeEvento, EventoVO eventoVO) {

        initComponents();
        this.setTitle("Edição de Registro de Evento");
        this.saveEvent.setEnabled(false);
        this.inputNome.setEnabled(false);
        this.setLocationRelativeTo(null);
        this.inputNome.setBorder(new LineBorder(Color.WHITE, 5, false));
        this.inputData.setBorder(new LineBorder(Color.WHITE, 5, false));        
        this.inputHoraInicial.setBorder(new LineBorder(Color.WHITE, 5, false));
        this.inputHoraFinal.setBorder(new LineBorder(Color.WHITE, 5, false));


        
        popularCampos(eventoVO);
    }
    
    public void popularCampos(EventoVO eventoVO) {
        
        this.inputNome.setText(eventoVO.getNome());
        this.inputData.setText(eventoVO.getData());
        this.inputHoraInicial.setText(eventoVO.getHoraInicial());
        this.inputHoraFinal.setText(eventoVO.getHoraFinal());
        this.inputTipoEvento.setSelectedItem(eventoVO.getTipoEvento());
        this.inputHoras.setValue(eventoVO.getHoras());
    }

       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputNome4 = new javax.swing.JTextField();
        textData = new javax.swing.JPanel();
        textEditar = new javax.swing.JLabel();
        deleteEvent = new javax.swing.JLabel();
        textNome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textHoraInicial = new javax.swing.JLabel();
        textHoraFInal = new javax.swing.JLabel();
        textTipoEvento = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        inputTipoEvento = new javax.swing.JComboBox<>();
        saveEvent = new javax.swing.JLabel();
        inputData = new javax.swing.JFormattedTextField();
        inputHoraInicial = new javax.swing.JFormattedTextField();
        inputHoraFinal = new javax.swing.JFormattedTextField();
        editarEvento = new javax.swing.JLabel();
        textTipoEvento1 = new javax.swing.JLabel();
        inputHoras = new javax.swing.JSpinner();

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

        textData.setBackground(new java.awt.Color(44, 62, 80));

        textEditar.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        textEditar.setForeground(new java.awt.Color(255, 255, 255));
        textEditar.setText("Editar Evento");

        deleteEvent.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        deleteEvent.setForeground(new java.awt.Color(244, 67, 54));
        deleteEvent.setText("VOLTAR");
        deleteEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteEventMouseClicked(evt);
            }
        });

        textNome.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textNome.setForeground(new java.awt.Color(255, 255, 255));
        textNome.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data:");

        textHoraInicial.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textHoraInicial.setForeground(new java.awt.Color(255, 255, 255));
        textHoraInicial.setText("Hora Inicial:");

        textHoraFInal.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textHoraFInal.setForeground(new java.awt.Color(255, 255, 255));
        textHoraFInal.setText("Hora Final:");

        textTipoEvento.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textTipoEvento.setForeground(new java.awt.Color(255, 255, 255));
        textTipoEvento.setText("Total Horas:");

        inputNome.setBorder(null);

        inputTipoEvento.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        inputTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Palestra", "Minicurso", "Mesa redonda", "Oficina" }));
        inputTipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTipoEventoActionPerformed(evt);
            }
        });

        saveEvent.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        saveEvent.setForeground(new java.awt.Color(3, 218, 198));
        saveEvent.setText("CADASTRAR");
        saveEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveEventMouseClicked(evt);
            }
        });

        inputData.setBorder(null);
        try {
            inputData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputData.setToolTipText("");

        inputHoraInicial.setBorder(null);
        try {
            inputHoraInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        inputHoraFinal.setBorder(null);
        try {
            inputHoraFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        editarEvento.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        editarEvento.setForeground(new java.awt.Color(3, 218, 198));
        editarEvento.setText("CONCLUIR EDIÇÃO");
        editarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarEventoMouseClicked(evt);
            }
        });

        textTipoEvento1.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        textTipoEvento1.setForeground(new java.awt.Color(255, 255, 255));
        textTipoEvento1.setText("Tipo de Evento:");

        javax.swing.GroupLayout textDataLayout = new javax.swing.GroupLayout(textData);
        textData.setLayout(textDataLayout);
        textDataLayout.setHorizontalGroup(
            textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textDataLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(textDataLayout.createSequentialGroup()
                        .addGroup(textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textEditar)
                            .addGroup(textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(textDataLayout.createSequentialGroup()
                                    .addGroup(textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textHoraFInal)
                                        .addComponent(textHoraInicial)
                                        .addComponent(jLabel4)
                                        .addComponent(textNome))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(textDataLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textTipoEvento1)
                                        .addComponent(inputTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(textDataLayout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(inputHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(textTipoEvento)))
                                .addGroup(textDataLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(inputHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textDataLayout.createSequentialGroup()
                        .addComponent(deleteEvent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarEvento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveEvent)
                        .addGap(15, 15, 15))))
            .addGroup(textDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        textDataLayout.setVerticalGroup(
            textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textEditar)
                .addGap(18, 18, 18)
                .addComponent(textNome)
                .addGap(11, 11, 11)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(textHoraInicial)
                .addGap(18, 18, 18)
                .addComponent(inputHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(textHoraFInal)
                .addGap(17, 17, 17)
                .addComponent(inputHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTipoEvento)
                    .addComponent(textTipoEvento1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(textDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteEvent)
                    .addComponent(saveEvent)
                    .addComponent(editarEvento))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNome4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNome4ActionPerformed

    private void inputTipoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTipoEventoActionPerformed

    private void saveEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveEventMouseClicked
        
        try {            
            EventoControll eventoControl = new EventoControll();
            eventoControl.cadastrarEvento(this.inputNome.getText(), 
                    this.inputTipoEvento.getSelectedItem().toString(), 
                    this.inputData.getText(), 
                    this.inputHoraInicial.getText(), 
                    this.inputHoraFinal.getText(),
                    this.inputHoras.getValue().toString());
 
            
            JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso!", "Cadastro Evento", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (ValidacaoException validacaoException) {
            
            JOptionPane.showMessageDialog(rootPane, validacaoException.getMessage(), "Cadastro Evento", JOptionPane.WARNING_MESSAGE);
        
        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar o cadastro!", "Cadastro Evento", JOptionPane.ERROR_MESSAGE);
        
        }
          HomeEventoView form = new HomeEventoView();
          form.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_saveEventMouseClicked

    private void deleteEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteEventMouseClicked
        HomeEventoView form = new HomeEventoView();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_deleteEventMouseClicked

    private void editarEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarEventoMouseClicked

        try {
            
            EventoControll eventoControl = new EventoControll();
            
            eventoControl.editar(this.inputNome.getText(), 
                    this.inputData.getText(), 
                    this.inputHoraInicial.getText(), 
                    this.inputHoraFinal.getText(), 
                    this.inputTipoEvento.getSelectedItem().toString(),
                    this.inputHoras.getValue().toString());
             
            JOptionPane.showMessageDialog(rootPane, "Edição realizada com sucesso!", "Editar Evento", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose();
            
        } catch (ValidacaoException validacaoException) {
            
            JOptionPane.showMessageDialog(rootPane, validacaoException.getMessage(), "Editar Evento", JOptionPane.WARNING_MESSAGE);
        
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar a edição!", "Editar Evento", JOptionPane.ERROR_MESSAGE);
        
        }
                

    }//GEN-LAST:event_editarEventoMouseClicked

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
    private javax.swing.JLabel deleteEvent;
    private javax.swing.JLabel editarEvento;
    private javax.swing.JFormattedTextField inputData;
    private javax.swing.JFormattedTextField inputHoraFinal;
    private javax.swing.JFormattedTextField inputHoraInicial;
    private javax.swing.JSpinner inputHoras;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputNome4;
    private javax.swing.JComboBox<String> inputTipoEvento;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel saveEvent;
    private javax.swing.JPanel textData;
    private javax.swing.JLabel textEditar;
    private javax.swing.JLabel textHoraFInal;
    private javax.swing.JLabel textHoraInicial;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textTipoEvento;
    private javax.swing.JLabel textTipoEvento1;
    // End of variables declaration//GEN-END:variables
}
