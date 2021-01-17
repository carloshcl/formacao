package br.com.hackccr.bean;

public class Vagas {
	private int id;
	private String titulo;
	private String descricao;
	private String empresa;
	
	public Vagas(String titulo, String descricao, String empresa) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.empresa = empresa;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}
