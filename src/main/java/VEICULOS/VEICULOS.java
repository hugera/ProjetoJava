/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VEICULOS;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class VEICULOS extends javax.swing.JFrame {

    /**
     * Creates new form VEÍCULOS
     */
    public VEICULOS() {
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

        lbPlaca = new javax.swing.JLabel();
        lbMarca = new javax.swing.JLabel();
        lbModelo = new javax.swing.JLabel();
        lbAnoFabricacao = new javax.swing.JLabel();
        lbCor = new javax.swing.JLabel();
        lbTipoCombustivel = new javax.swing.JLabel();
        lbChassi = new javax.swing.JLabel();
        lbKM = new javax.swing.JLabel();
        lbUltimaRevisao = new javax.swing.JLabel();
        txtfPlaca = new javax.swing.JTextField();
        txtfMarca = new javax.swing.JTextField();
        txtfModelo = new javax.swing.JTextField();
        txtfAnoFabricacao = new javax.swing.JTextField();
        txtfCor = new javax.swing.JTextField();
        txtfTipoCombustivel = new javax.swing.JTextField();
        txtfChassi = new javax.swing.JTextField();
        txtfKM = new javax.swing.JTextField();
        txtfUltimaRevisao = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        lbCodveiculos = new javax.swing.JLabel();
        txtfCodveiculos = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnDados = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbPlaca.setText("Placa");

        lbMarca.setText("Marca");

        lbModelo.setText("Modelo");

        lbAnoFabricacao.setText("Ano Fabricação");

        lbCor.setText("Cor");

        lbTipoCombustivel.setText("Tipo Combustível");

        lbChassi.setText("Chassi");

        lbKM.setText("KM");

        lbUltimaRevisao.setText("Última Revisão");

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

        lbCodveiculos.setText("Codveiculos");

        btnFechar.setText("Excluir");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jMenu1.setText("Relatorio");

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
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbUltimaRevisao)
                            .addComponent(lbKM)
                            .addComponent(lbChassi)
                            .addComponent(lbTipoCombustivel)
                            .addComponent(lbCor)
                            .addComponent(lbAnoFabricacao)
                            .addComponent(lbModelo)
                            .addComponent(lbMarca)
                            .addComponent(lbPlaca)
                            .addComponent(lbCodveiculos))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfPlaca)
                            .addComponent(txtfMarca)
                            .addComponent(txtfModelo)
                            .addComponent(txtfAnoFabricacao)
                            .addComponent(txtfCor)
                            .addComponent(txtfTipoCombustivel)
                            .addComponent(txtfChassi)
                            .addComponent(txtfKM)
                            .addComponent(txtfUltimaRevisao, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(txtfCodveiculos)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGravar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCodveiculos)
                    .addComponent(txtfCodveiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAnoFabricacao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfAnoFabricacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTipoCombustivel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfTipoCombustivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbChassi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfChassi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbKM)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtfKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbUltimaRevisao)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtfUltimaRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnMostrar)
                    .addComponent(btnGravar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnFechar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        Limpar();
        
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
       veiculos_ v = this.MontarVeiculos();
       JOptionPane.showMessageDialog(null, "Placa: "+v.getPlaca()+"\nMarca: "+v.getMarca()+"\nModelo: "+v.getModelo()+
       "\nAno_Fabricacao: "+v.getAno_Fabricacao()+"\nCor: "+v.getCor()+"\nTipo_Combustivel: "+v.getTipo_Combustivel()+
       "\nChassi: "+v.getChassi()+"\nKM: "+v.getKM()+"\nUltima_Revisao: "+v.getUltima_Revisao());
               
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        veiculos_ v = this.MontarVeiculos();
        if  (v != null) {
        VeiculosControle vi = new VeiculosControle();
        vi.insert(v);
         }else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos: ");
        
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
         veiculos_ v = this.MontarVeiculos();
            if  (v != null && !txtfCodveiculos.getText().trim().isEmpty()){
                 v.setCodveiculos_(Integer.parseInt(txtfCodveiculos.getText()));
                 VeiculosControle vi = new VeiculosControle();
                 vi.update(v);
            }else {
              JOptionPane.showMessageDialog(null, "Preencha todos os campos.");    
            }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
         VeiculosControle vi = new VeiculosControle();
         if(!txtfCodveiculos.getText().trim().isEmpty()){
                int Cod = Integer.parseInt(txtfCodveiculos.getText());
                vi.delete(Cod);
             }else{
            JOptionPane.showMessageDialog(null,"Informe novamente...");
       }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed
        VeiculosControle vi = new VeiculosControle();
        vi.selectall();
    }//GEN-LAST:event_btnDadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public void FormVeiculos () {
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
            java.util.logging.Logger.getLogger(VEICULOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEICULOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEICULOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEICULOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VEICULOS().setVisible(true);
            }
        });
    }

    public veiculos_ MontarVeiculos() {
         
           if (txtfPlaca.getText().trim().isEmpty() || txtfMarca.getText().trim().isEmpty() || txtfModelo.getText().trim().isEmpty() || txtfAnoFabricacao.getText().trim().isEmpty() 
               || txtfCor.getText().trim().isEmpty() || txtfTipoCombustivel.getText().trim().isEmpty() || txtfChassi.getText().trim().isEmpty() 
               || txtfKM.getText().trim().isEmpty() || txtfUltimaRevisao.getText().trim().isEmpty())
               
            { JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return null; 
            }
        
        try{
            veiculos_ v = new veiculos_ ();
            v.setPlaca(txtfPlaca.getText().trim());
            v.setMarca(txtfMarca.getText().trim());
            v.setModelo(txtfModelo.getText().trim());
            v.setAno_Fabricacao(txtfAnoFabricacao.getText().trim());
            v.setCor(txtfCor.getText().trim());
            v.setTipo_Combustivel(txtfTipoCombustivel.getText().trim());
            v.setChassi(txtfChassi.getText().trim());
            v.setKM(txtfKM.getText().trim());
            v.setUltima_Revisao(txtfUltimaRevisao.getText().trim());
        
        return v;
        
        }catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, " inválido. Digite.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        
       }
    } 
 
    
    
    
    
    public void Limpar() {
        txtfAnoFabricacao.setText("");
        txtfChassi.setText("");
        txtfCor.setText("");
        txtfKM.setText("");
        txtfKM.setText("");
        txtfMarca.setText("");
        txtfModelo.setText("");
        txtfPlaca.setText("");
        txtfTipoCombustivel.setText("");
        txtfUltimaRevisao.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JMenuItem btnDados;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbAnoFabricacao;
    private javax.swing.JLabel lbChassi;
    private javax.swing.JLabel lbCodveiculos;
    private javax.swing.JLabel lbCor;
    private javax.swing.JLabel lbKM;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbTipoCombustivel;
    private javax.swing.JLabel lbUltimaRevisao;
    private javax.swing.JTextField txtfAnoFabricacao;
    private javax.swing.JTextField txtfChassi;
    private javax.swing.JTextField txtfCodveiculos;
    private javax.swing.JTextField txtfCor;
    private javax.swing.JTextField txtfKM;
    private javax.swing.JTextField txtfMarca;
    private javax.swing.JTextField txtfModelo;
    private javax.swing.JTextField txtfPlaca;
    private javax.swing.JTextField txtfTipoCombustivel;
    private javax.swing.JTextField txtfUltimaRevisao;
    // End of variables declaration//GEN-END:variables
}
