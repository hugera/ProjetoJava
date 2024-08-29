package ClassesEspeciais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    
    public static final String URL = "jdbc:mysql://localhost:3306/objeto";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String CLASS_FOR_NAME = "com.mysql.cj.jdbc.Driver";
    public static Connection conexao;
    
    public static Connection getConexao() {
        
     try{
           
            if(conexao==null||conexao.isClosed()){
            Class.forName(CLASS_FOR_NAME);
            conexao = DriverManager.getConnection(URL,USER,PASSWORD);
            JOptionPane.showMessageDialog(null,"Deu Certo");
            }   
       }catch(ClassNotFoundException e){
           JOptionPane.showMessageDialog(null,"O erro 1: ");
           
       }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"O erro 2: ");
       }
       return conexao;
    }
  
    public static void FecharConexao(){
         
        if(conexao!=null){
            try{
            conexao.close();
            
            }catch(SQLException ex){
              JOptionPane.showMessageDialog(null,"erro");
            }
         }
        
    }
}
    



