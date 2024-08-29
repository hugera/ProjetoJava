/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRODUTOS;

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
public class ProdutosDao implements DAO {

    @Override
    public void insert(Object o) {
        produtos_ p = (produtos_) o;
        
        String sql = "insert into produtos(Nome_Produto,Descricao,Preco,Qnt_Estoque,Categoria,Data_Validade,Fornecedor,Local_Estoque)"
                + " values (?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, p.getNome_Produto());
            ps.setString(2, p.getDescricao());
            ps.setString(3, p.getPreco());
            ps.setString(4, p.getQnt_Estoque());
            ps.setString(5, p.getCategoria());
            ps.setString(6, p.getData_Validade());
            ps.setString(7, p.getFornecedor());
            ps.setString(8, p.getLocal_Estoque());
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
         produtos_ p = (produtos_) o;
         
         String sql = "update produtos set Nome_Produto=?, Descricao=?, Preco=?,"
                    + "Qnt_Estoque=?, Categoria=?, Data_Validade=?, Fornecedor=?, Estoque=? where Codprodutos_=?";
         
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, p.getNome_Produto());
            ps.setString(2, p.getDescricao());
            ps.setString(3, p.getPreco());
            ps.setString(4, p.getQnt_Estoque());
            ps.setString(5, p.getCategoria());
            ps.setString(6, p.getData_Validade());
            ps.setString(7, p.getFornecedor());
            ps.setString(8, p.getLocal_Estoque());
            ps.setInt(9, p.getCodprodutos_());
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public ArrayList<produtos_> selectall() throws SQLException {
        
        ArrayList<produtos_> Arrayp = new ArrayList<>();
        String sql = "select * from produtos";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                produtos_ p = new produtos_();
                p.setCodprodutos(rs.getInt("Codprodutos"));
                p.setNome_Produto(rs.getString("Nome_Produto"));
                p.setDescricao(rs.getString("Descricao"));
                p.setPreco(rs.getString("Preco"));
                p.setQnt_Estoque(rs.getString("Qnt_Estoque"));
                p.setCategoria(rs.getString("Categoria"));
                p.setData_Validade(rs.getString("Data_Validade"));
                p.setFornecedor(rs.getString("Fornecedor"));
                p.setLocal_Estoque(rs.getString("Local_Estoque"));
                
                Arrayp.add(p);              
            }  
        
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 452");
        } 
            
         return Arrayp;
   }

            
}            
            
        
   
    

