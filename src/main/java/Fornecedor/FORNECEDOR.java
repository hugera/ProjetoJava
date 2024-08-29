/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fornecedor;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class FORNECEDOR extends javax.swing.JFrame {

    /**
     * Creates new form FORNECEDOR
     */
    public FORNECEDOR() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbNomedaEmpresa = new javax.swing.JLabel();
        txtfNomedaEmpresa = new javax.swing.JTextField();
        lbCNPJ = new javax.swing.JLabel();
        txtfCNPJ = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        txtfTelefone = new javax.swing.JTextField();
        lbEndereco = new javax.swing.JLabel();
        txtfEndereco = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtfEmail = new javax.swing.JTextField();
        lbNomeContato = new javax.swing.JLabel();
        txtfNomeContato = new javax.swing.JTextField();
        lbTipoProduto = new javax.swing.JLabel();
        txtfTipoProduto = new javax.swing.JTextField();
        lbPagamento = new javax.swing.JLabel();
        txtfPagamento = new javax.swing.JTextField();
        lbPrazoEntrega = new javax.swing.JLabel();
        txtfPrazoEntrega = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        lbCodfornecedor = new javax.swing.JLabel();
        txtfCodfornecedor = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnDados = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));

        lbNomedaEmpresa.setText("  Nome da Empresa");

        lbCNPJ.setText("CNPJ");

        lbTelefone.setText("Telefone ");

        lbEndereco.setText("Endereço");

        lbEmail.setText("Email");

        lbNomeContato.setText("Nome Contato");

        lbTipoProduto.setText("Tipo Produto");

        lbPagamento.setText("Pagamento");

        lbPrazoEntrega.setText("Prazo Entrega");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        lbCodfornecedor.setText("Codfornecedor");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jMenu1.setText("relatorio");

        btnDados.setText("Dados");
        btnDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosActionPerformed(evt);
            }
        });
        jMenu1.add(btnDados);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEndereco)
                                    .addComponent(lbEmail)
                                    .addComponent(lbNomeContato)
                                    .addComponent(lbTipoProduto)
                                    .addComponent(lbPagamento)
                                    .addComponent(btnLimpar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(txtfNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbPrazoEntrega)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtfPrazoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtfTipoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtfEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(btnMostrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGravar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAtualizar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExcluir))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(lbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbNomedaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfNomedaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbCodfornecedor)
                .addGap(178, 178, 178)
                .addComponent(txtfCodfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodfornecedor)
                    .addComponent(txtfCodfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomedaEmpresa)
                    .addComponent(txtfNomedaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCNPJ)
                    .addComponent(txtfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefone)
                    .addComponent(txtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(txtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeContato)
                    .addComponent(txtfNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTipoProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfTipoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPagamento)
                    .addComponent(txtfPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrazoEntrega)
                    .addComponent(txtfPrazoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnMostrar)
                    .addComponent(btnGravar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
      Limpar();  
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        fornecedor_ f = this.MontarFornecdor();
        JOptionPane.showMessageDialog(null, "NomedaEmpresa: "+f.getNome_da_Empresa()+"\nCNPJ: "+f.getCNPJ()+
        "\nTelefone: "+f.getTelefone()+"\nEndereco: "+f.getEndereco()+"\nEmail: "+f.getEmail()+
        "\nNomeContato: "+f.getNome_Contato()+"\nTipoProduto: "+f.getTipo_Produto()+"\nPagamento: "+f.getPagamento()+
        "\nPrazoEntrega: "+f.getPrazo_Entrega());
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        fornecedor_ f = this.MontarFornecdor();
        if  (f != null) {
        ForncedorControle fc = new ForncedorControle ();
        fc.insert(f);
         }else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos: ");
        
        }
                
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        fornecedor_ f = this.MontarFornecdor();
          if  (f != null && !txtfCodfornecedor.getText().trim().isEmpty()){
               f.setCodfornecedor_(Integer.parseInt(txtfCodfornecedor.getText()));
               ForncedorControle fc = new ForncedorControle ();
               fc.update(f);
          }else {
              JOptionPane.showMessageDialog(null, "Preencha todos os campos.");    
              
          }
        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ForncedorControle fc = new ForncedorControle ();
        if(!txtfCodfornecedor.getText().trim().isEmpty()){
                int Cod = Integer.parseInt(txtfCodfornecedor.getText());
                fc.delete(Cod);
             }else{
            JOptionPane.showMessageDialog(null,"Informe novamente...");
       }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed
       ForncedorControle fc = new ForncedorControle ();
       fc.selectall();
    }//GEN-LAST:event_btnDadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public void FormFornecedor () {
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
            java.util.logging.Logger.getLogger(FORNECEDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORNECEDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORNECEDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORNECEDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORNECEDOR().setVisible(true);
            }
        });
    }
    
    public fornecedor_ MontarFornecdor() {
        
           if (txtfNomedaEmpresa.getText().trim().isEmpty() || txtfCNPJ.getText().trim().isEmpty() || txtfTelefone.getText().trim().isEmpty() || txtfEndereco.getText().trim().isEmpty() 
               || txtfEmail.getText().trim().isEmpty() || txtfNomeContato.getText().trim().isEmpty() || txtfTipoProduto.getText().trim().isEmpty() 
               || txtfPagamento.getText().trim().isEmpty() || txtfPrazoEntrega.getText().trim().isEmpty())
            
            { JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return null; 
            }    
        
        
     try{              
        fornecedor_ f = new fornecedor_ ();
        f.setNome_da_Empresa(txtfNomedaEmpresa.getText().trim());
        f.setCNPJ(txtfCNPJ.getText().trim());
        f.setTelefone(txtfTelefone.getText().trim());
        f.setEndereco(txtfEndereco.getText().trim());
        f.setEmail(txtfEmail.getText().trim());
        f.setNome_Contato(txtfNomeContato.getText().trim());
        f.setTipo_Produto(txtfTipoProduto.getText().trim());
        f.setPagamento(txtfPagamento.getText().trim());
        f.setPrazo_Entrega(txtfPrazoEntrega.getText().trim());
        
    return f;
    
    }catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, " inválido. Digite.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
 
      }
     
    }    
     
     
     
    
        public void Limpar() {
        txtfCNPJ.setText("");
        txtfEmail.setText("");
        txtfEndereco.setText("");
        txtfNomedaEmpresa.setText("");
        txtfPagamento.setText("");
        txtfPrazoEntrega.setText("");
        txtfTelefone.setText("");
        txtfTipoProduto.setText("");
          
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JMenuItem btnDados;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbCNPJ;
    private javax.swing.JLabel lbCodfornecedor;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNomeContato;
    private javax.swing.JLabel lbNomedaEmpresa;
    private javax.swing.JLabel lbPagamento;
    private javax.swing.JLabel lbPrazoEntrega;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTipoProduto;
    private javax.swing.JTextField txtfCNPJ;
    private javax.swing.JTextField txtfCodfornecedor;
    private javax.swing.JTextField txtfEmail;
    private javax.swing.JTextField txtfEndereco;
    private javax.swing.JTextField txtfNomeContato;
    private javax.swing.JTextField txtfNomedaEmpresa;
    private javax.swing.JTextField txtfPagamento;
    private javax.swing.JTextField txtfPrazoEntrega;
    private javax.swing.JTextField txtfTelefone;
    private javax.swing.JTextField txtfTipoProduto;
    // End of variables declaration//GEN-END:variables
}
