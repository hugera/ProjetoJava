package VEICULOS;

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
public class TabelaVeiculos {
    
    public static VeiculosDao v = new VeiculosDao ();
    
    public void exibirtabveiculos () throws SQLException {
        ArrayList<veiculos_> Arrayv = new ArrayList<>();
        
        Arrayv = v.selectall();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,80,500,200);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Codigo");
        Model.addColumn("Placa");
        Model.addColumn("Marca");
        Model.addColumn("Modelo");
        Model.addColumn("AnoFabricacao");
        Model.addColumn("Cor");
        Model.addColumn("TipoCombustivel");
        Model.addColumn("Chassi");
        Model.addColumn("KM");
        Model.addColumn("UltimaRevisao");
        
        boolean Parar = true ;
        int i = 0; 
        
        while(Parar){
            if(i<Arrayv.size()){
               veiculos_ v = new veiculos_();
               Model.addRow(new Object[]{Arrayv.get(i).getCodveiculos_(),Arrayv.get(i).getPlaca(),Arrayv.get(i).getMarca(),
               Arrayv.get(i).getModelo(),Arrayv.get(i).getAno_Fabricacao(),Arrayv.get(i).getCor(),
               Arrayv.get(i).getTipo_Combustivel(),Arrayv.get(i).getChassi(),Arrayv.get(i).getKM(),
               Arrayv.get(i).getUltima_Revisao()});
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
