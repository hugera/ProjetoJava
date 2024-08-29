/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import ClassesEspeciais.DAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Senac
 */
public class EventosControle implements DAO {

    @Override
    public void insert(Object o) {
        EventosDao e = new EventosDao ();
        e.insert(o);
    }

    @Override
    public void update(Object o) {
        EventosDao e = new EventosDao ();
        e.update(o);
    }

    @Override
    public void delete(Object o) {
        EventosDao e = new EventosDao ();
        e.delete(o);
    }

 
    public void selectall() {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TabelaEventos().exibirtabeventos();
                } catch (SQLException ex) {
                    Logger.getLogger(EventosControle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
