package br.com.hackccr.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UsuarioEmpresa implements Serializable {
	private static final long serilVersionUID = 1L;
	
	private int id;
	private String nome;
	private String razaosocial;
	private String CNPJ;
	private String documento;// virar Classe
	private String endereco; // virar Classe
	private String contato; // virar Classe
	private String senha;
	private String representante;
	private String email_representante;
	private int qtd_funcionarios;
	private String area;// virar Classe
	private boolean ciencia_dados;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getEmail_representante() {
		return email_representante;
	}

	public void setEmail_representante(String email_representante) {
		this.email_representante = email_representante;
	}

	public int getQtd_funcionarios() {
		return qtd_funcionarios;
	}

	public void setQtd_funcionarios(int qtd_funcionarios) {
		this.qtd_funcionarios = qtd_funcionarios;
	}

	public boolean isCiencia_dados() {
		return ciencia_dados;
	}

	public void setCiencia_dados(boolean ciencia_dados) {
		this.ciencia_dados = ciencia_dados;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
