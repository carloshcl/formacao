package br.com.hackccr.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UsuarioEmpresa {
	private int id;
	private String nome;
	private String razaosocial;
	private String CNPJ;
	private Documentos documento;
	private Endereco endereco;
	private Contatos contato;
	private String representante;
	private String email_representante;
	private int qtd_funcionarios;
	private AreaAtuacao area;
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
	public Documentos getDocumento() {
		return documento;
	}
	public void setDocumento(Documentos documento) {
		this.documento = documento;
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
	public AreaAtuacao getArea() {
		return area;
	}
	public void setArea(AreaAtuacao area) {
		this.area = area;
	}
	public boolean isCiencia_dados() {
		return ciencia_dados;
	}
	public void setCiencia_dados(boolean ciencia_dados) {
		this.ciencia_dados = ciencia_dados;
	}

	

	
}
