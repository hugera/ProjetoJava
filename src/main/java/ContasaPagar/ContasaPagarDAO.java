
package ContasaPagar;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ContasaPagarDAO implements DAO {

    @Override
    public void insert(Object o) {
        contaapagar_ c = (contaapagar_) o;
        
        String sql = "insert into contasapagar(Descricao_da_Conta,Valor,Data_Vencimento,Data_Pagamento,Fornecedor,Categoria,Status_Pagamento,Metodo_Pagamento,Observacoes)"
        + " values (?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, c.getDescricao_da_Conta());
            ps.setString(2, c.getValor());
            ps.setString(3, c.getData_Vencimento());
            ps.setString(4, c.getData_Pagamento());
            ps.setString(5, c.getFornecedor());
            ps.setString(6, c.getCategoria());
            ps.setString(7, c.getStatus_Pagamento());
            ps.setString(8, c.getMetodo_Pagamento());
            ps.setString(9, c.getObservacoes());
            int atual =ps.executeUpdate();
            if(atual>0){
               JOptionPane.showMessageDialog(null,"Gravado com sucesso!!");  
            }else{
               JOptionPane.showMessageDialog(null,"Não foi Gravado com sucesso!!");
            }
            
        }catch(SQLException e ){
               JOptionPane.showMessageDialog(null,"error: 448");
      }
    }
    @Override
    public void update(Object o) {
         contaapagar_ c = (contaapagar_) o;
         
         String sql = "update contasapagar set Descricao_da_Conta=?, Valor=?, Data_Vencimento=?, Data_Pagamento=?,"
                 + "Fornecedor=?, Categoria=?, Status_Pagamento=?, Metodo_Pagamento=?,"
                 + "Observacoes=? where Codcontasapagar_=?,";
         
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, c.getDescricao_da_Conta());
            ps.setString(2, c.getValor());
            ps.setString(3, c.getData_Vencimento());
            ps.setString(4, c.getData_Pagamento());
            ps.setString(5, c.getFornecedor());
            ps.setString(6, c.getCategoria());
            ps.setString(7, c.getStatus_Pagamento());
            ps.setString(8, c.getMetodo_Pagamento());
            ps.setString(9, c.getObservacoes());
            ps.setInt(10, c.getCodcontaapagar_());
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
        String sql = "delete from contasapagar where Codcontasapagar_=?";
              
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
    

    
    public ArrayList<contaapagar_> selectall() throws SQLException {
        
        ArrayList<contaapagar_> Arrayco = new ArrayList<>();
        String sql = "select * from contasapagar";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                contaapagar_ c = new contaapagar_();
                c.setCodcontaapagar_(rs.getInt("Codcontaapagar_"));
                c.setDescricao_da_Conta (rs.getString("Nome"));
                c.setValor(rs.getString("CPF"));
                c.setData_Vencimento(rs.getString("Endereco"));
                c.setData_Pagamento(rs.getString("Telefone"));
                c.setFornecedor(rs.getString("Email"));
                c.setCategoria(rs.getString("Data_Nascimento"));
                c.setStatus_Pagamento(rs.getString("Serie"));
                c.setMetodo_Pagamento(rs.getString("Responsavel"));
                c.setObservacoes(rs.getString("Escola_Origem"));
                
                Arrayco.add(c);
            }
            
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 452");
        }
       
            return Arrayco;
    }
                          
   
}
