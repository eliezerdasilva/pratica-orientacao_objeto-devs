
package org.example.view;

import javax.swing.JFrame;

/**
 *
 * @author eliez
 */
public class TelaCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaCadastroCliente() {
     
        initComponents();
         setSize(800, 900);
        grupo.add(jRadioButtonInativo);
        grupo.add(jRadioButtonAtivo);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCep = new javax.swing.JTextField();
        txRua = new javax.swing.JTextField();
        comboBoxEstado = new javax.swing.JComboBox<>();
        comboBoxCidade = new javax.swing.JComboBox<>();
        txtBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonBuscar = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jRadioButtonInativo = new javax.swing.JRadioButton();
        jRadioButtonAtivo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        txtObservacao = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jRadioButtonVip = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        buttonTelaPedidoComanda = new javax.swing.JButton();
        buttonVoltar1 = new javax.swing.JButton();

        setBounds(new java.awt.Rectangle(500, 100, 0, 0));
        setSize(new java.awt.Dimension(8, 8));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jRadioButtonInativoComponentResized(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Cadastrar Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 250, 30));

        txRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txRuaActionPerformed(evt);
            }
        });
        jPanel1.add(txRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 250, 30));

        jPanel1.add(comboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, 30));

        jPanel1.add(comboBoxCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 250, 30));
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 250, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Rua");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Cep");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Estado");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Cidade");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Bairro");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel4.setBackground(new java.awt.Color(153, 51, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Endereço");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 170, -1));

        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 310, 520));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Cpf");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
        jPanel2.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 170, 30));

        jRadioButtonInativo.setText("Inativo");
        jRadioButtonInativo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jRadioButtonInativoComponentResized(evt);
            }
        });
        jRadioButtonInativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonInativoActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonInativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        jRadioButtonAtivo.setText("Ativo");
        jRadioButtonAtivo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jRadioButtonInativoComponentResized(evt);
            }
        });
        jPanel2.add(jRadioButtonAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Data Nascimento");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Alergias");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Status");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Telefone");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, 30));
        jPanel2.add(txtDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 30));
        jPanel2.add(txtObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 170, 30));
        jPanel2.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 170, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Observação");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jRadioButtonVip.setText("Vip");
        jPanel2.add(jRadioButtonVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Nome");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 170, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 300, 520));

        buttonTelaPedidoComanda.setText("Pedido");
        buttonTelaPedidoComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTelaPedidoComandaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonTelaPedidoComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 743, 150, 30));

        buttonVoltar1.setText("Voltar");
        buttonVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltar1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 743, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonInativoComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jRadioButtonInativoComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonInativoComponentResized

    private void jRadioButtonInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonInativoActionPerformed
   
    }//GEN-LAST:event_jRadioButtonInativoActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
    
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonTelaPedidoComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTelaPedidoComandaActionPerformed
               TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal();
                telaMenuPrincipal.setVisible(true);
                dispose();
                                      
    }//GEN-LAST:event_buttonTelaPedidoComandaActionPerformed

    private void txRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txRuaActionPerformed

    private void buttonVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltar1ActionPerformed
        TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal();
                // Torna a outra janela visível
                telaMenuPrincipal.setVisible(true);
                dispose();
    }//GEN-LAST:event_buttonVoltar1ActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        String nome = txtNome.getText();
    }//GEN-LAST:event_buttonCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonTelaPedidoComanda;
    private javax.swing.JButton buttonVoltar1;
    private javax.swing.JComboBox<String> comboBoxCidade;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonAtivo;
    private javax.swing.JRadioButton jRadioButtonInativo;
    private javax.swing.JRadioButton jRadioButtonVip;
    private javax.swing.JTextField txRua;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObservacao;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
