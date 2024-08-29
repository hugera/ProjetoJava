/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ALUNO;

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
public class AlunoDao implements DAO {

    @Override
    public void insert(Object o) {
        alunos_ a = (alunos_) o;
        
        String sql = "insert into alunos(Nome,CPF,Endereco,Telefone,Email,Data_Nascimento,Serie,Responsavel,Escola_Origem)"
                + "   values (?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getCPF());
            ps.setString(3, a.getEndereco());
            ps.setString(4, a.getTelefone());
            ps.setString(5, a.getEmail());
            ps.setString(6, a.getData_Nascimento());
            ps.setString(7, a.getSerie());
            ps.setString(8, a.getResponsavel());
            ps.setString(9, a.getEscola_Origem());
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
         alunos_ a = (alunos_) o;
         
         String sql = "update alunos set Nome=?, CPF=?, Endereco=?, Telefone=?, Email=?,"
                 + "Data_Nascimento=?, Serie=?, Responsavel=?, Escola_Origem=? where CodAlunos_=?";     
        
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getCPF());
            ps.setString(3, a.getEndereco());
            ps.setString(4, a.getTelefone());
            ps.setString(5, a.getEmail());
            ps.setString(6, a.getData_Nascimento());
            ps.setString(7, a.getSerie());
            ps.setString(8, a.getResponsavel());
            ps.setString(9, a.getEscola_Origem());
            ps.setInt (10, a.getCodalunos_());
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
         String sql = "delete from alunos where CodAlunos_=?";
              
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

    

   
    public ArrayList<alunos_> Selectall() {
        
        ArrayList<alunos_> Arraya = new ArrayList<>();
        String sql = "select * from alunos";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
               
                alunos_ a = new alunos_();
                a.setCodalunos_(rs.getInt("Codalunos_"));
                a.setNome(rs.getString("Nome"));
                a.setCPF(rs.getString("CPF"));
                a.setEndereco(rs.getString("Endereco"));
                a.setTelefone(rs.getString("Telefone"));
                a.setEmail(rs.getString("Email"));
                a.setData_Nascimento(rs.getString("Data_Nascimento"));
                a.setSerie(rs.getString("Serie"));
                a.setResponsavel(rs.getString("Responsavel"));
                a.setEscola_Origem(rs.getString("Escola_Origem"));
                
                Arraya.add(a);               
            }
            
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 452");
        }
       
        return Arraya;
    }
    
}
