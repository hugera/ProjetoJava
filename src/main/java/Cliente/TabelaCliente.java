package Cliente;

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
public class TabelaCliente {
    
    public static ClienteDao c = new ClienteDao();
    
    public void exibirtabcliente (){
        ArrayList<cliente_> Arrayc = new ArrayList<>();
        
        Arrayc = c.selectall();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,80,500,200);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
         DefaultTableModel Model = new DefaultTableModel();
         
         
         JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Codigo");
        Model.addColumn("Nome");
        Model.addColumn("CPF");
        Model.addColumn("Endereço");
        Model.addColumn("Email");
        Model.addColumn("DataNascimento");
        Model.addColumn("Sexo");
        Model.addColumn("EstadoCivil");
        Model.addColumn("Profissao");
        
        boolean Parar = true ;
        int i = 0; 
        
        while(Parar){
            if(i<Arrayc.size()){
               cliente_ c = new cliente_();
               Model.addRow(new Object[]{Arrayc.get(i).getCodcliente_(),Arrayc.get(i).getNome(),Arrayc.get(i).getCPF(),
               Arrayc.get(i).getEndereco(),Arrayc.get(i).getEndereco(),Arrayc.get(i).getEmail(),
               Arrayc.get(i).getEmail(),Arrayc.get(i).getData_Nascimento(),Arrayc.get(i).getSexo(),
               Arrayc.get(i).getEstado_Civil(),Arrayc.get(i).getProfissao()});
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
