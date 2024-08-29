
package ALUNO;

import ClassesEspeciais.DAO;


public class AlunoControle implements DAO {

    @Override
    public void insert(Object o) {
        AlunoDao a = new AlunoDao();
        a.insert(o);
    }

    @Override
    public void update(Object o) {
      AlunoDao a = new AlunoDao();
      a.update(o);
    }

    @Override
    public void delete(Object o) {
        AlunoDao a = new AlunoDao();
        a.delete(o);
    }

   
    public void selectall() {
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaAlunos().exibirtabalunos();
            }
        });
    }
    
}