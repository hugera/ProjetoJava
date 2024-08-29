/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRODUTOS;

import ClassesEspeciais.DAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hugao
 */
public class ProdutosControle implements DAO{

    @Override
    public void insert(Object o) {
        ProdutosDao p = new ProdutosDao ();
        p.insert(o);
    }

    @Override
    public void update(Object o) {
       ProdutosDao p = new ProdutosDao ();
       p.update(o);
    }

    @Override
    public void delete(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    public void selectall() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TabelaProdutos().exibirtabprodutos();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutosControle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
