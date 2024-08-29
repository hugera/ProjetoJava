package Eventos;

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
public class TabelaEventos {
    
    public static EventosDao e = new EventosDao();
    
    public void exibirtabeventos () throws SQLException{
        ArrayList<eventos_> Arraye = new ArrayList<>();
        
        Arraye = e.selectall();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,80,500,200);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Codigo");
        Model.addColumn("Nome_doEvento");
        Model.addColumn("Data_doEvento");
        Model.addColumn("HorarioInicio");
        Model.addColumn("HorarioTermino");
        Model.addColumn("LocaldoEvento");
        Model.addColumn("Descricao");
        Model.addColumn("PublicoAlvo");
        Model.addColumn("CapacidadeMaxima");
        Model.addColumn("Organizador");
        
        boolean Parar = true ;
        int i = 0; 
        
         while(Parar){
            if(i<Arraye.size()){
               eventos_ e  = new eventos_();
               Model.addRow(new Object[]{Arraye.get(i).getCodeventos_(),Arraye.get(i).getNome_do_Evento(),Arraye.get(i).getData_do_Evento(),
               Arraye.get(i).getHorario_Inicio(),Arraye.get(i).getHorario_Termino(),Arraye.get(i).getLocal_do_Evento(),
               Arraye.get(i).getDescricao(),Arraye.get(i).getPublico_Alvo(),Arraye.get(i).getCapacidade_Maxima(),
               Arraye.get(i).getOrganizador()});
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