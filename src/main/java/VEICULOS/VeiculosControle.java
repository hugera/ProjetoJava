
package VEICULOS;

import ClassesEspeciais.DAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VeiculosControle implements DAO {

    @Override
    public void insert(Object o) {
        VeiculosDao v = new VeiculosDao ();
        v.insert(o);
    }

    @Override
    public void update(Object o) {
        VeiculosDao v = new VeiculosDao ();
        v.update(o);
    }

    @Override
    public void delete(Object o) {
         VeiculosDao v = new VeiculosDao ();
         v.delete(o);
    }

  
    public void selectall() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TabelaVeiculos().exibirtabveiculos();
                } catch (SQLException ex) {
                    Logger.getLogger(VeiculosControle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
