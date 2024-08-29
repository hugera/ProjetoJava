
package VEICULOS;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VeiculosDao implements DAO {

    @Override
    public void insert(Object o) {
        veiculos_ v = (veiculos_) o;
        
        String sql = "insert into veiculos(Placa,Marca,Modelo,Ano_Fabricacao,Cor,Tipo_Combustivel,Chassi,KM,Ultima_Revisao)"
                + " values (?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, v.getPlaca());
            ps.setString(2, v.getMarca());
            ps.setString(3, v.getModelo());
            ps.setString(4, v.getAno_Fabricacao());
            ps.setString(5, v.getCor());
            ps.setString(6, v.getTipo_Combustivel());
            ps.setString(7, v.getChassi());
            ps.setString(8, v.getKM());
            ps.setString(9, v.getUltima_Revisao());
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
           veiculos_ v = (veiculos_) o;
           
           String sql = "update veiculos set Placa=?, Marca=?, Modelo=?, Ano_Fabricacao=?,"
                   + "Cor=?, Tipo_Combustivel=?, Chassi=?, KM=?, Ultima_Revisao=?, Codveiculos_=?";
        
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, v.getPlaca());
            ps.setString(2, v.getMarca());
            ps.setString(3, v.getModelo());
            ps.setString(4, v.getAno_Fabricacao());
            ps.setString(5, v.getCor());
            ps.setString(6, v.getTipo_Combustivel());
            ps.setString(7, v.getChassi());
            ps.setString(8, v.getKM());
            ps.setString(9, v.getUltima_Revisao());
            ps.setInt(10, v.getCodveiculos_());
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
        String sql = "delete from veiculos where Codveiculos_=?";
              
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
    


    public ArrayList<veiculos_> selectall() throws SQLException {
        
        ArrayList<veiculos_> Arrayv = new ArrayList<>();
        String sql = "select * from veiculos";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
               
                veiculos_ v = new veiculos_();
                v.setCodveiculos_(rs.getInt("Codveiculos_"));
                v.setPlaca(rs.getString("Placa"));
                v.setMarca(rs.getString("Marca"));
                v.setModelo(rs.getString("Modelo"));
                v.setAno_Fabricacao(rs.getString("Ano_Fabricacao"));
                v.setCor(rs.getString("Cor"));
                v.setTipo_Combustivel(rs.getString("Tipo_Combustivel"));
                v.setChassi(rs.getString("Chassi"));
                v.setKM(rs.getString("KM"));
                v.setUltima_Revisao(rs.getString("Escola_Origem"));
                
                Arrayv .add(v);
            }
         }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 452");
        } 
        
          return Arrayv;
   }

            
}         

