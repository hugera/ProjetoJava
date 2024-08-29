package PRODUTOS;

import java.awt.FlowLayout;
import java.sql.SQLException;
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
public class TabelaProdutos {
    
    public static ProdutosDao p = new ProdutosDao();
    
    public void exibirtabprodutos () throws SQLException {
        ArrayList<produtos_> Arrayp = new ArrayList<>();
        
        Arrayp = p.selectall();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,80,500,200);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Codigo");
        Model.addColumn("NomeProduto");
        Model.addColumn("Descricao");
        Model.addColumn("Preco");
        Model.addColumn("QntEstoque");
        Model.addColumn("Categoria");
        Model.addColumn("DataValidade");
        Model.addColumn("Fornecedor");
        Model.addColumn("LocalEstoque");
        
        boolean Parar = true ;
        int i = 0; 
        
        while(Parar){
            if(i<Arrayp.size()){
              produtos_ p = new produtos_();
               Model.addRow(new Object[]{Arrayp.get(i).getCodprodutos(),Arrayp.get(i).getNome_Produto(),Arrayp.get(i).getDescricao(),
               Arrayp.get(i).getPreco(),Arrayp.get(i).getQnt_Estoque(),Arrayp.get(i).getCategoria(),
               Arrayp.get(i).getData_Validade(),Arrayp.get(i).getFornecedor(),Arrayp.get(i).getLocal_Estoque(),});
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
