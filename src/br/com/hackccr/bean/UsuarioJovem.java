package br.com.hackccr.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


public class UsuarioJovem implements Serializable{
	private static final long serilVersionUID = 1L;

	private int id;
	private String nome;
	private String CPF;
	private String endereco;
	private String email;
	private String senha;
	private String telefone;	
	private String escolaridade;
	private String socioeconomico;
	private String raca;
	private Date datanasc;
	private int idade;
	private String genero;
	private String pne;
	private boolean ciencia_dados;
	private List<Cursos> listaCursos;
	
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

	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String Email) {
		this.email = Email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEscolaridade() {
		return escolaridade;
	}


	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}


	public String getSocioeconomico() {
		return socioeconomico;
	}


	public void setSocioeconomico(String socioeconomico) {
		this.socioeconomico = socioeconomico;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public Date getDatanasc() {
		return datanasc;
	}


	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getPne() {
		return pne;
	}


	public void setPne(String pne) {
		this.pne = pne;
	}


	public boolean isCiencia_dados() {
		return ciencia_dados;
	}


	public void setCiencia_dados(boolean ciencia_dados) {
		this.ciencia_dados = ciencia_dados;
	}

	
	
}
