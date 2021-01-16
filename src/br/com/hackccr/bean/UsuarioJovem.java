package br.com.hackccr.bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UsuarioJovem {
	private int id;
	private String nome;
	private Endereco endereco;
	private Contatos contato;
	private String escolaridade;
	private PerfilSocioEconomico socioeconomico;
	private String raca;
	private Date datanasc;
	private int idade;
	private String genero;
	private String pne;
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


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Contatos getContato() {
		return contato;
	}


	public void setContato(Contatos contato) {
		this.contato = contato;
	}


	public String getEscolaridade() {
		return escolaridade;
	}


	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}


	public PerfilSocioEconomico getSocioeconomico() {
		return socioeconomico;
	}


	public void setSocioeconomico(PerfilSocioEconomico socioeconomico) {
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


	public ConexaoKit getConkit() {
		return conkit;
	}


	public void setConkit(ConexaoKit conkit) {
		this.conkit = conkit;
	}
	
	
	
}
