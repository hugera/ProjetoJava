/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ALUNO;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabelaAlunos {
    
    public static  AlunoDao a = new AlunoDao();
   
    public void exibirtabalunos (){ 
        ArrayList<alunos_> Arraya = new ArrayList<>();
        
        Arraya = a.Selectall();
        
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
        Model.addColumn("DataNascimento");
        Model.addColumn("Serie");
        Model.addColumn("Responsavel");
        Model.addColumn("EscolaOrigem");
        
        boolean Parar = true ;
        int i = 0; 
        
        while(Parar){
            if(i<Arraya.size()){
               alunos_ a = new alunos_();
               Model.addRow(new Object[]{Arraya.get(i).getCodalunos_(),Arraya.get(i).getNome(),Arraya.get(i).getCPF(),
               Arraya.get(i).getEndereco(),Arraya.get(i).getEndereco(),Arraya.get(i).getTelefone(),
               Arraya.get(i).getEmail(),Arraya.get(i).getData_Nascimento(),Arraya.get(i).getSerie(),
               Arraya.get(i).getResponsavel(),Arraya.get(i).getEscola_Origem()});
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
