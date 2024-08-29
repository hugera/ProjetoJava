package Eventos;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EventosDao implements DAO {

    @Override
    public void insert(Object o) {
        eventos_ e =  (eventos_) o;
        
        String sql = "insert into eventos(Nome_do_Evento,Data_do_Evento,Horario_Inicio,Horario_Termino,Local_do_Evento,Descricao,Publico_Alvo,Capacidade_Maxima,Organizador)"
                + " values (?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, e.getNome_do_Evento());
            ps.setString(2, e.getData_do_Evento());
            ps.setString(3, e.getHorario_Inicio());
            ps.setString(4, e.getHorario_Termino());
            ps.setString(5, e.getLocal_do_Evento());
            ps.setString(6, e.getDescricao());
            ps.setString(7, e.getPublico_Alvo());
            ps.setString(8, e.getCapacidade_Maxima());
            ps.setString(9, e.getOrganizador());
            int atual =ps.executeUpdate();
            if(atual>0){
               JOptionPane.showMessageDialog(null,"Gravado com sucesso!!");  
            }else{
               JOptionPane.showMessageDialog(null,"Não foi Gravado com sucesso!!");
            }
        }catch(SQLException ex) {
              JOptionPane.showMessageDialog(null,"error: 448");
       }
   }


    
    @Override
    public void update(Object o) {
          eventos_ e =  (eventos_) o;
          
          String sql = "update eventos set Nome_do_Evento=?, Data_do_Evento=?, Horario_Inicio=?, Horario_Termino=?,"
                  + "Local_do_Evento=?, Descricao=?, Publico_Alvo=?, Capacidade_Maxima=?,"
                  + "Organizador=? where Codeventos_=?,";
          
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, e.getNome_do_Evento());
            ps.setString(2, e.getData_do_Evento());
            ps.setString(3, e.getHorario_Inicio());
            ps.setString(4, e.getHorario_Termino());
            ps.setString(5, e.getLocal_do_Evento());
            ps.setString(6, e.getDescricao());
            ps.setString(7, e.getPublico_Alvo());
            ps.setString(8, e.getCapacidade_Maxima());
            ps.setString(9, e.getOrganizador());
            ps.setInt(10, e.getCodeventos_());
            int Atual = ps.executeUpdate();
             if (Atual > 0){
                    JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de atualização!");
                }
            ps.close(); 
       
         }catch(SQLException ev){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);          
         }          
                  
    }

    @Override
    public void delete(Object o) {
        String sql = "delete from eventos where Codeventos_=?";
              
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
    

    
    public ArrayList<eventos_> selectall() throws SQLException {
        
        ArrayList<eventos_> Arraye = new ArrayList<>();
        String sql = "select * from eventos";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){   
               
                eventos_ e = new eventos_();
                e.setCodeventos_(rs.getInt("Codeventos_"));
                e.setNome_do_Evento(rs.getString("Nome_do_Evento"));
                e.setData_do_Evento(rs.getString("Data_do_Evento"));
                e.setHorario_Inicio(rs.getString("Horario_Inicio"));
                e.setHorario_Termino(rs.getString("Horario_Termino"));
                e.setLocal_do_Evento(rs.getString("Local_do_Evento"));
                e.setDescricao(rs.getString("Descricao"));
                e.setPublico_Alvo(rs.getString("Publico_Alvo"));
                e.setCapacidade_Maxima(rs.getString("Capacidade_Maxima"));
                e.setOrganizador(rs.getString("Organizador"));
                
          Arraye.add(e);               
            }
            
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 452");
        }
       
        return Arraye;
    }
    
}
            
         
        
    
   

