package br.com.hackccr.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.hackccr.bean.UsuarioJovem;

@ManagedBean
@SessionScoped
public class UsuarioJovemBean implements Serializable{
	private List<UsuarioJovem> listaUsuario;
	private UsuarioJovem user;
	private boolean novoCadastro;
	
	public UsuarioJovemBean() {
		listaUsuario = new ArrayList<UsuarioJovem>();
		user = new UsuarioJovem();
	}
	
	public String criarUser() {
		listaUsuario.add(user);
		user = new UsuarioJovem();
		return "areaLogadaJovem";
	}
	
	public String retornaUser() {
		String nome = listaUsuario.get(listaUsuario.size()-1).getNome();
		return nome;
	}

	public List<UsuarioJovem> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<UsuarioJovem> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public UsuarioJovem getUser() {
		return user;
	}

	public void setUser(UsuarioJovem user) {
		this.user = user;
	}

	public boolean isNovoCadastro() {
		return novoCadastro;
	}

	public void setNovoCadastro(boolean novoCadastro) {
		this.novoCadastro = novoCadastro;
	}
	
}
