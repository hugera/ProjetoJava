/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fornecedor;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class FornecedorDao implements DAO {

    @Override
    public void insert(Object o) {
        fornecedor_ f = (fornecedor_) o;
        
        String sql = "insert into fornecedor(Nome_da_Empresa,CNPJ,Telefone,Endereco,Email,Nome_Contato,Tipo_Produto,Pagamento,Prazo_Entrega)"
                + " values (?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, f.getNome_da_Empresa());
            ps.setString(2, f.getCNPJ());
            ps.setString(3, f.getTelefone());
            ps.setString(4, f.getEndereco());
            ps.setString(5, f.getEmail());
            ps.setString(6, f.getNome_Contato());
            ps.setString(7, f.getTipo_Produto());
            ps.setString(8, f.getPagamento());
            ps.setString(9, f.getPrazo_Entrega());
            int atual =ps.executeUpdate();
            if(atual>0){
               JOptionPane.showMessageDialog(null,"Gravado com sucesso!!");  
            }else{
               JOptionPane.showMessageDialog(null,"Não foi Gravado com sucesso!!");
            }
            
            
        }catch(SQLException e) {
      }
    }
   
    
    @Override
    public void update(Object o) {
         fornecedor_ f = (fornecedor_) o;
         
         String sql ="update fornecedor set Nome_da_Empresa=?, CNPJ=?, Telefone=?, Endereco=?,"
                 + "Email=?, Nome_Contato=?, Tipo_Produto=?, Pagamento=?,"
                 + "Prazo_Entrega=? where Codfornecedor_=?";
       try{
           PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
           ps.setString(1, f.getNome_da_Empresa());
           ps.setString(2, f.getCNPJ());
           ps.setString(3, f.getTelefone());
           ps.setString(4, f.getEndereco());
           ps.setString(5, f.getEmail());
           ps.setString(6, f.getNome_Contato());
           ps.setString(7, f.getTipo_Produto());
           ps.setString(8, f.getPagamento());
           ps.setString(9, f.getPrazo_Entrega());
           ps.setInt(10, f.getCodfornecedor_());
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
        String sql = "delete from fornecedor where Codfornecedor_=?";
              
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
    

  
    public ArrayList<fornecedor_> selectall() {
         
        ArrayList<fornecedor_> Arrayfu = new ArrayList<>();
        String sql = "select * from fornecedor";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                fornecedor_ f = new fornecedor_();
                f.setCodfornecedor_(rs.getInt("Codfornecedor_"));
                f.setNome_da_Empresa(rs.getString("Nome_da_Empresa"));
                f.setCNPJ(rs.getString("CNPJ"));
                f.setTelefone(rs.getString("Telefone"));
                f.setEndereco(rs.getString("Endereco"));
                f.setEmail(rs.getString("Email"));
                f.setNome_Contato(rs.getString("Nome_Contato"));
                f.setTipo_Produto(rs.getString("Tipo_Produto"));
                f.setPagamento(rs.getString("Pagamento"));
                f.setPrazo_Entrega(rs.getString("Prazo_Entrega"));
                
                Arrayfu.add(f);    
            }
            
          }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 452");
        }
        
            return Arrayfu;
    }
    
}
    
    
