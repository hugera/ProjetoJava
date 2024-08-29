package Fornecedor;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hugao
 */
public class TabelaFornecedor {
    
    public static FornecedorDao f = new FornecedorDao();
    
    public void exibirtabfornecedor() {
        ArrayList<fornecedor_> Arrayfu = new ArrayList<>();
        
        Arrayfu = f.selectall();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,80,500,200);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Codigo");
        Model.addColumn("NomedaEmpresa");
        Model.addColumn("CNPJ");
        Model.addColumn("Telefone");
        Model.addColumn("Endereco");
        Model.addColumn("Email");
        Model.addColumn("NomeContato");
        Model.addColumn("TipoProduto");
        Model.addColumn("Pagamento");
        Model.addColumn("PrazoEntrega");
        
        boolean Parar = true ;
        int i = 0; 
        
        while(Parar){
            if(i<Arrayfu.size()){
               fornecedor_ f = new fornecedor_();
               Model.addRow(new Object[]{Arrayfu.get(i).getCodfornecedor_(),Arrayfu.get(i).getNome_da_Empresa(),Arrayfu.get(i).getCNPJ(),
               Arrayfu.get(i).getTelefone(),Arrayfu.get(i).getEndereco(),Arrayfu.get(i).getEmail(),
               Arrayfu.get(i).getNome_Contato(),Arrayfu.get(i).getTipo_Produto(),Arrayfu.get(i).getPagamento(),
               Arrayfu.get(i).getPrazo_Entrega()});
               i++;
               
             }else{
                Parar = false;
            }       
          
    }
    
        JTable Tabela = new JTable(Model);
        Tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane Scroll = new JScrollPane(Tabela);
        Painel.add(Scroll);
        Frame.add(Painel);
        Frame.setVisible(true);
    }
}
