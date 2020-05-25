
package com.cesumar.eventosweb.util;

import com.cesumar.eventosweb.usuario.UsuarioDAO;
import com.cesumar.eventosweb.usuario.UsuarioDAOHibernate;

/**
 *
 * @author julianacostasilva
 */
public class DAOFactory {
    
     public static UsuarioDAO criarUsuarioDAO(){
        UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
        usuarioDAO.setSession(
                HibernateUtil.getSessionFactory().getCurrentSession());
        return usuarioDAO;
    }        
            
}
