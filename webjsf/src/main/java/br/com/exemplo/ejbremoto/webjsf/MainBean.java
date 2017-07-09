package br.com.exemplo.ejbremoto.webjsf;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.exemplo.ejbremoto.ebj_remoto.BeanRemotoTeste;

@ViewScoped
@ManagedBean (name="hello")
public class MainBean {

	String teste = "olaaa porra";

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	@EJB (lookup="ejb.BeanRemotoTeste#br.com.exemplo.ejbremoto.ebj_remoto.BeanRemotoTeste")
	BeanRemotoTeste obj;
	
}
