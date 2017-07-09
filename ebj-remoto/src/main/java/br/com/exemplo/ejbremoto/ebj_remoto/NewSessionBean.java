/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exemplo.ejbremoto.ebj_remoto;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author martin
 */
@Stateless (name="BeanRemotoTeste", mappedName="ejb/BeanRemotoTeste")
public class NewSessionBean implements BeanRemotoTeste{

    public void businessMethod() {
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
