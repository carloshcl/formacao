package br.com.hackccr.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.hackccr.bean.UsuarioEmpresa;
import br.com.hackccr.bean.UsuarioJovem;

@ManagedBean
@SessionScoped
public class EmpresaBean implements Serializable{
	private List<UsuarioEmpresa> listaEmpresa;
	private UsuarioEmpresa user;
	private boolean novoCadastro;
	
	public EmpresaBean() {
		listaEmpresa = new ArrayList<UsuarioEmpresa>();
		user = new UsuarioEmpresa();
	}
	
	public String criarUser() {
		listaEmpresa.add(user);
		user = new UsuarioEmpresa();
		return "areaEmpresa";
	}
	
	public String retornaUser() {
		String nome = listaEmpresa.get(listaEmpresa.size()-1).getNome();
		return nome;
	}

	public List<UsuarioEmpresa> getlistaEmpresa() {
		return listaEmpresa;
	}

	public void setlistaEmpresa(List<UsuarioEmpresa> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

	public UsuarioEmpresa getUser() {
		return user;
	}

	public void setUser(UsuarioEmpresa user) {
		this.user = user;
	}

	public boolean isNovoCadastro() {
		return novoCadastro;
	}

	public void setNovoCadastro(boolean novoCadastro) {
		this.novoCadastro = novoCadastro;
	}
	
}
