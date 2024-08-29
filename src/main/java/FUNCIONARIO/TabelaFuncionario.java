package FUNCIONARIO;

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
public class TabelaFuncionario {
    
    public static FuncionarioDao f = new FuncionarioDao();
    
    public void exibirtabfuncionario () throws SQLException{
        ArrayList<funcionario_> Arrayf = new ArrayList<>();
        
        Arrayf = f.selectall();
        
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
        Model.addColumn("Telefone");
        Model.addColumn("Email");
        Model.addColumn("Data_Admissao");
        Model.addColumn("Cargo");
        Model.addColumn("Salario");
        Model.addColumn("Departamento");
        
        boolean Parar = true ;
        int i = 0; 
        
         while(Parar){
            if(i<Arrayf.size()){
              funcionario_ f  = new funcionario_();
               Model.addRow(new Object[]{Arrayf.get(i).getCodfuncionario_(),Arrayf.get(i).getNome(),Arrayf.get(i).getCPF(),
               Arrayf.get(i).getEndereco(),Arrayf.get(i).getEndereco(),Arrayf.get(i).getTelefone(),
               Arrayf.get(i).getEmail(),Arrayf.get(i).getData_Admissao(),Arrayf.get(i).getCargo(),
               Arrayf.get(i).getSalario(),Arrayf.get(i).getDepartamento()});
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