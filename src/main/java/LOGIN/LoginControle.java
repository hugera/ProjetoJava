package LOGIN;

import ClassesEspeciais.DAO;


public class LoginControle implements DAO {

    @Override
    public void insert(Object o) {
        LoginDao l = new LoginDao ();
        l.insert(o);
    }

    @Override
    public void update(Object o) {
        LoginDao l = new LoginDao ();
        l.update(o);
    }

    @Override
    public void delete(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void logar (login user) {
         LoginDao l = new LoginDao ();
         l.logar(user);
    }
}
