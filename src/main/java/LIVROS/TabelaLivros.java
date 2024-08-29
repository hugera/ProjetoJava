package LIVROS;

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
public class TabelaLivros {
    
    public static LivrosDao l = new LivrosDao ();
    
    public void exibirtablivros() throws SQLException {
        ArrayList<livros_> Arrayl = new ArrayList<>(); 
        
        Arrayl = l.selectall();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,80,500,200);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Codigo");
        Model.addColumn("Titulo");
        Model.addColumn("Autor");
        Model.addColumn("ISBN");
        Model.addColumn("Editora");
        Model.addColumn("AnoPublicacao");
        Model.addColumn("Genero");
        Model.addColumn("NumerodePaginas");
        Model.addColumn("Idioma");
        Model.addColumn("LocalizacaonaBiblioteca"); 
        
        boolean Parar = true ;
        int i = 0; 
        
        while(Parar){
            if(i<Arrayl.size()){
               livros_ l = new livros_();
               Model.addRow(new Object[]{Arrayl.get(i).getCodlivros_(),Arrayl.get(i).getTitulo(),Arrayl.get(i).getAutor(),
               Arrayl.get(i).getISBN(),Arrayl.get(i).getEditora(),Arrayl.get(i).getAno_Publicacao(),
               Arrayl.get(i).getGenero(),Arrayl.get(i).getNumero_de_Paginas(),Arrayl.get(i).getIdioma(),
               Arrayl.get(i).getLocalizacao_na_Biblioteca()});
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
