package FUNCIONARIO;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FuncionarioDao implements DAO{

    @Override
    public void insert(Object o) {
        funcionario_ f = (funcionario_) o;
        
        String sql = "insert into funcionario(Nome,CPF,Endereco,Telefone,Email,Data_Admissao,Cargo,Salario,Departamento)"
                + " values (?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, f.getNome());
            ps.setString(2, f.getCPF());
            ps.setString(3, f.getEndereco());
            ps.setString(4, f.getTelefone());
            ps.setString(5, f.getEmail());
            ps.setString(6, f.getData_Admissao());
            ps.setString(7, f.getCargo());
            ps.setString(8, f.getSalario());
            ps.setString(9, f.getDepartamento());
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
         funcionario_ f = (funcionario_) o;
         
         String sql = "update funcionario set Nome=?, CPF=?, Endereco=?, Telefone=?, Email=?,"
                 +"Data_Admissao=?, Cargo=?, Salario=?, Departamento=? where Codfuncionario_=?"; 
         
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, f.getNome());
            ps.setString(2, f.getCPF());
            ps.setString(3, f.getEndereco());
            ps.setString(4, f.getTelefone());
            ps.setString(5, f.getEmail());
            ps.setString(6, f.getData_Admissao());
            ps.setString(7, f.getCargo());
            ps.setString(8, f.getSalario());
            ps.setString(9, f.getDepartamento());
            ps.setInt(10, f.getCodfuncionario_());
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
         String sql = "delete from funcionario where Codfuncionario_=?";
              
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
    

  
    public ArrayList<funcionario_> selectall() throws SQLException {
        
        ArrayList<funcionario_> Arrayf = new ArrayList<>();
        String sql = "select * from funcionario";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                funcionario_ f = new funcionario_();
                f.setCodfuncionario_(rs.getInt("Codfuncionario_"));
                f.setNome(rs.getString("Nome"));
                f.setCPF(rs.getString("CPF"));
                f.setEndereco(rs.getString("Endereco"));
                f.setTelefone(rs.getString("Telefone"));
                f.setEmail(rs.getString("Email"));
                f.setData_Admissao(rs.getString("Data_Admissao"));
                f.setCargo(rs.getString("Cargo"));
                f.setSalario(rs.getString("Salario"));
                f.setDepartamento(rs.getString("Departamento"));
                
                Arrayf.add(f);
                
            } 
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 452");
        }
            
         return Arrayf;
    
    }
}