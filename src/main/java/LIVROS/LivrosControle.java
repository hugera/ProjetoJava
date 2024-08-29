
package LIVROS;

import ClassesEspeciais.DAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


    public class LivrosControle implements DAO {

    @Override
    public void insert(Object o) {
        LivrosDao l = new LivrosDao ();
        l.insert(o);
    }

    @Override
    public void update(Object o) {
        LivrosDao l = new LivrosDao ();
        l.update(o);
    }

    @Override
    public void delete(Object o) {
       LivrosDao l = new LivrosDao ();
        l.delete(o); 
    }

  
    public void selectall() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TabelaLivros().exibirtablivros();
                } catch (SQLException ex) {
                    Logger.getLogger(LivrosControle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
