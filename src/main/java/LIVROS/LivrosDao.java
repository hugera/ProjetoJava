/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LIVROS;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class LivrosDao implements DAO {

    @Override
    public void insert(Object o) {
        livros_ l = (livros_) o;
        
        String sql = "insert into livros(Titulo,Autor,ISBN,Editora,Ano_Publicacao,Genero,Numero_de_Paginas,Idioma,Localizacao_na_Biblioteca)"
                + " values (?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, l.getTitulo());
            ps.setString(2, l.getAutor());
            ps.setString(3, l.getISBN());
            ps.setString(4, l.getEditora());
            ps.setString(5, l.getAno_Publicacao());
            ps.setString(6, l.getGenero());
            ps.setString(7, l.getNumero_de_Paginas());
            ps.setString(8, l.getIdioma());
            ps.setString(9, l.getLocalizacao_na_Biblioteca());
            int atual =ps.executeUpdate();
            if(atual>0){
               JOptionPane.showMessageDialog(null,"Gravado com sucesso!!");  
            }else{
               JOptionPane.showMessageDialog(null,"Não foi Gravado com sucesso!!");
            }
            
                 
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 448");
        }
    }

    @Override
    public void update(Object o) {
         livros_ l = (livros_) o;
         
         String sql = "update livros set Titulo=?, Autor=?, ISBN=?, Editora=?, Ano_Publicacao=?,"
                 + "Genero=?, Numero_de_Paginas=?, Idioma=?,"
                 + "Localizacao_na_Biblioteca=? where Codlivros_=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, l.getTitulo());
            ps.setString(2, l.getAutor());
            ps.setString(3, l.getISBN());
            ps.setString(4, l.getEditora());
            ps.setString(5, l.getAno_Publicacao());
            ps.setString(6, l.getGenero());
            ps.setString(7, l.getNumero_de_Paginas());
            ps.setString(8, l.getIdioma());
            ps.setString(9, l.getLocalizacao_na_Biblioteca());
            ps.setInt(10, l.getCodlivros_());
            int Atual = ps.executeUpdate();
             if (Atual > 0){
                    JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de atualização!");
                }
             ps.close();
             
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);     
             
            
        } 
         
         
         
    }

    @Override
    public void delete(Object o) {
        String sql = "delete from livros where Codlivros_=?";
              
       try{
           PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
           ps.setInt(1, (Integer)o);
           int atual = ps.executeUpdate();
          
           if(atual >0){
              JOptionPane.showMessageDialog(null,"Exlusão com sucesso!");  
           }else{
                JOptionPane.showMessageDialog(null,"Não houve a Exlusão");
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"error: 450");
       } 
    }
    

   
    public ArrayList<livros_> selectall() throws SQLException {
        
        ArrayList<livros_> Arrayl = new ArrayList<> ();
        String sql = "select * from livros";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); 
            
            while(rs.next()){
                
               livros_ l = new livros_ ();
               l.setCodlivros_(rs.getInt("Codlivros_"));
               l.setTitulo(rs.getString("Titulo"));
               l.setAutor(rs.getString("Autor"));
               l.setISBN(rs.getString("ISBN"));
               l.setEditora(rs.getString("Editora"));
               l.setAno_Publicacao(rs.getString("Ano_Publicacao"));
               l.setGenero(rs.getString("Genero"));
               l.setNumero_de_Paginas(rs.getString("Numero_de_Paginas"));
               l.setIdioma(rs.getString("Idioma"));
               l.setLocalizacao_na_Biblioteca(rs.getString("Localizacao_na_Biblioteca"));
                
               Arrayl.add(l);   
                   
            }
            
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 452");
        }    
          
         return Arrayl;
        }
         
       
    }
                
                
     
            
               

        

    

