/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContasaPagar;

import ClassesEspeciais.DAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Senac
 */
public class ContasaPagarControle implements DAO {

    @Override
    public void insert(Object o) {
        ContasaPagarDAO c = new ContasaPagarDAO ();
        c.insert(o);
    }

    @Override
    public void update(Object o) {
        ContasaPagarDAO c = new ContasaPagarDAO ();
        c.update(o);
    }

    @Override
    public void delete(Object o) {
        ContasaPagarDAO c = new ContasaPagarDAO ();
        c.delete(o); 
    }

  
    public void selectall() {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TabelaContaaPagar().exibirtabcontasapagar();
                } catch (SQLException ex) {
                    Logger.getLogger(ContasaPagarControle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
    }
}
    

