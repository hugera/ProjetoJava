package Cliente;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ClienteDao implements DAO {

    @Override
    public void insert(Object o) {
        cliente_ c = (cliente_ ) o ;
        
        String sql = "insert into cliente(Nome,CPF,Endereco,Email,Data_Nascimento,Sexo,Estado_Civil,Profissao)"
                + " values (?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getCPF());
            ps.setString(3, c.getEndereco());
            ps.setString(4, c.getEmail());
            ps.setString(5, c.getData_Nascimento());
            ps.setString(6, c.getSexo());
            ps.setString(7, c.getEstado_Civil());
            ps.setString(8, c.getProfissao());
            int atual =ps.executeUpdate();
            if(atual>0){
               JOptionPane.showMessageDialog(null,"Gravado com sucesso!!");  
            }else{
               JOptionPane.showMessageDialog(null,"Não foi Gravado com sucesso!!");
            }

        }catch(SQLException e) {
               JOptionPane.showMessageDialog(null,"error: 448");
        }   
            
    }        
      


    @Override
    public void update(Object o) {
         cliente_ c = (cliente_ ) o ;
        
         String sql = "update cliente set Nome=?, CPF=?, Endereco=?, Email=?, Data_Nascimento=?,"
                + "Sexo=?, Estado_Civil=?, Profissao=? where Codcliente_=?,";
        
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getCPF());
            ps.setString(3, c.getEndereco());
            ps.setString(4, c.getEmail());
            ps.setString(5, c.getData_Nascimento());
            ps.setString(7, c.getSexo());
            ps.setString(8, c.getEstado_Civil());
            ps.setString(9, c.getProfissao());
            ps.setInt(10, c.getCodcliente_());
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
        String sql = "delete from cliente where Codcliente_=?";
              
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
    

    
    public ArrayList<cliente_> selectall() {
        
        ArrayList<cliente_> Arrayc = new ArrayList<>();
        String sql = "Select * from cliente";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                cliente_ c = new cliente_();
                c.setCodcliente_(rs.getInt("CodALunos"));
                c.setNome(rs.getString("Nome"));
                c.setCPF(rs.getString("CPF"));
                c.setEndereco(rs.getString(sql));
                c.setEmail(rs.getString("Email"));
                c.setData_Nascimento(rs.getString(sql));
                c.setSexo(rs.getString("Sexo"));
                c.setEstado_Civil(rs.getString("EstadoCivil"));
                c.setProfissao(rs.getString("Profissao"));
                
                Arrayc.add(c);              
    
            }
            
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 452"); 
        }
        
        return Arrayc;
        
    }
    
}
        
    

