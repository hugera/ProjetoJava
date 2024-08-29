package ContasaPagar;

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
public class TabelaContaaPagar {
    
    public static ContasaPagarDAO c = new ContasaPagarDAO();
    
    public void exibirtabcontasapagar () throws SQLException{
        ArrayList<contaapagar_> Arrayco = new ArrayList<>();
        
        Arrayco = c.selectall();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,80,500,200);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Codigo");
        Model.addColumn("DescricaodaConta");
        Model.addColumn("Valor");
        Model.addColumn("DataVencimento");
        Model.addColumn("DataPagamento");
        Model.addColumn("Fornecedor");
        Model.addColumn("Categoria");
        Model.addColumn("StatusPagamento");
        Model.addColumn("MetodoPagamento");
        Model.addColumn("Observacoes");
        
        boolean Parar = true ;
        int i = 0; 
        
        while(Parar){
            if(i<Arrayco.size()){
               contaapagar_ c  = new contaapagar_();
               Model.addRow(new Object[]{Arrayco.get(i).getCodcontaapagar_(),Arrayco.get(i).getDescricao_da_Conta(),Arrayco.get(i).getValor(),
               Arrayco.get(i).getData_Vencimento(),Arrayco.get(i).getData_Pagamento(),Arrayco.get(i).getFornecedor(),
               Arrayco.get(i).getCategoria(),Arrayco.get(i).getStatus_Pagamento(),Arrayco.get(i).getMetodo_Pagamento(),
               Arrayco.get(i).getObservacoes(),Arrayco.get(i)});
               i++;
               
            }else{
                Parar = false;
            }
            
        JTable Tabela = new JTable(Model);
        Tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane Scroll = new JScrollPane(Tabela);
        Painel.add(Scroll);
        Frame.add(Painel);
        Frame.setVisible(true);    
      }
    }
}

