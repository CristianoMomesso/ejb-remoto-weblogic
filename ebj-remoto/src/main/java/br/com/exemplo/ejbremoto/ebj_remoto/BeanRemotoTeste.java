package br.com.exemplo.ejbremoto.ebj_remoto;

import javax.ejb.Remote;

@Remote
public interface BeanRemotoTeste {
	void businessMethod();
}
