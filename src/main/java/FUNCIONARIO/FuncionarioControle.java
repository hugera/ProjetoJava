package FUNCIONARIO;

import ClassesEspeciais.DAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioControle implements DAO {

    @Override
    public void insert(Object o) {
        FuncionarioDao f = new FuncionarioDao ();
        f.insert(o);
    }

    @Override
    public void update(Object o) {
         FuncionarioDao f = new FuncionarioDao ();
         f.update(o);
    }

    @Override
    public void delete(Object o) {
        FuncionarioDao f = new FuncionarioDao ();
         f.delete(o);
    }

   
    public void selectall() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TabelaFuncionario().exibirtabfuncionario();
                } catch (SQLException ex) {
                    Logger.getLogger(FuncionarioControle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
