package com.srcsoftware.vintage.concursos.entidades;

public class Administrador {

	private Integer id;
	private String nome;
	private String e_mail;
	private String celular;
	private String senha;

	public Administrador(Integer id, String nome, String e_mail, String celular, String senha) {
		this.id = id;
		this.nome = nome;
		this.e_mail = e_mail;
		this.celular = celular;
		this.senha = senha;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer codigo) {
		this.id = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Administrador [nome=" + nome + ", e_mail=" + e_mail + ", celular=" + celular + ", senha=" + senha
				+ ", getId=" + id + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getE_mail()=" + getE_mail()
				+ ", getCelular()=" + getCelular() + ", getSenha()=" + getSenha() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
