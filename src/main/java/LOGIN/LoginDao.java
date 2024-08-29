package LOGIN;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import PRINCIPAL.PrincipalPrincipal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDao implements DAO {

    @Override
    public void insert(Object o) {
        login l = (login) o;
        
        String sql = "insert into login(Usuario,Senha,Status)"
                + "values (?,?,?)";
        
        try{
            PreparedStatement ps = Conexao.getConexao().prepareCall(sql);
            ps.setString(1, l.getUsuario());
            ps.setString(2, l.getSenha());
            ps.setString(3, l.getStatus());
            int atual =ps.executeUpdate();
            if(atual>0){
               JOptionPane.showMessageDialog(null,"Gravado com sucesso!!");  
            }else{
               JOptionPane.showMessageDialog(null,"Não foi Gravado com sucesso!!");
            }
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 450");
        }
    }

    @Override
    public void update(Object o) {
        login l = (login) o;
        
        String sql = "update login set Usuario=?, Senha=?, Status=? where Codlogin=?";  
               
        try{
            PreparedStatement ps = Conexao.getConexao().prepareCall(sql);
            ps.setString(1, l.getUsuario());
            ps.setString(2, l.getSenha());
            ps.setString(3, l.getStatus());
            ps.setInt(4, l.getCodlogin());
            int atual =ps.executeUpdate();
            if(atual>0){
               JOptionPane.showMessageDialog(null,"Gravado com sucesso!!");  
            }else{
               JOptionPane.showMessageDialog(null,"Não foi Gravado com sucesso!!");
            }
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 451");
        }
    }

    

    @Override
    public void delete(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    
    public void logar(login user) {
        login l = (login) user;
        
        String sql = "select Usuario,Senha from login where Usuario=? and Senha=? ";
        
         try{
            PreparedStatement ps = Conexao.getConexao().prepareCall(sql);
            ps.setString(1, l.getUsuario());
            ps.setString(2, l.getSenha());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
              PrincipalPrincipal p = new PrincipalPrincipal ();
              p.MenuPrincipal();
            }else{JOptionPane.showMessageDialog(null,"Dados invalidos!");
    } 
            }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);    
        }          
  }

}