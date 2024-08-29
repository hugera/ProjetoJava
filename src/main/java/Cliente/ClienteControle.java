/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import ClassesEspeciais.DAO;

/**
 *
 * @author Senac
 */
public class ClienteControle implements DAO {

    @Override
    public void insert(Object o) {
        ClienteDao c = new ClienteDao ();
        c.insert(o);
    }

    @Override
    public void update(Object o) {
       ClienteDao c = new ClienteDao ();
       c.update(o);
    }

    @Override
    public void delete(Object o) {
        ClienteDao c = new ClienteDao ();
        c.delete(o); 
    }

   
    public void selectall() {
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaCliente().exibirtabcliente();
            }
        });
  
    }
    
}
