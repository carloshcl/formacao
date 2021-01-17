package br.com.hackccr.negocio;

import br.com.hackccr.modelo.UsuarioJovemBean;

public class LogarJovem extends UsuarioJovemBean{
	public boolean ok;
		
	public boolean logar(String email, String senha) {
		if (getListaUsuario().contains(email))
			ok = true;
		else {
			ok = false;
		}
		return ok;
	}
}
