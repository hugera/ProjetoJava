/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fornecedor;

import ClassesEspeciais.DAO;
import java.util.ArrayList;

/**
 *
 * @author Senac
 */
public class ForncedorControle implements DAO{

    @Override
    public void insert(Object o) {
       FornecedorDao f = new FornecedorDao ();
       f.insert(o);
       
    }

    @Override
    public void update(Object o) {
        FornecedorDao f = new FornecedorDao ();
        f.update(o);
    }

    @Override
    public void delete(Object o) {
       FornecedorDao f = new FornecedorDao ();
        f.delete(o); 
    }

   
    public void selectall() {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaFornecedor().exibirtabfornecedor();
            }
        });
    }
    
    
}
