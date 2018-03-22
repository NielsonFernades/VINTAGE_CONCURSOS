package com.srcsoftware.vintage.concursos.entidades;

import java.sql.Date;

public class Professores {

	private Integer id;
	private String nome;
	private Date data_nascimento;
	private String e_mail;
	private String celular;
	private String senha;

	private Date data_cadastro;

	public Professores() {
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
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

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	@Override
	public String toString() {
		return "Professores [codigo=" + id + ", nome=" + nome + ", data_nascimento=" + data_nascimento + ", e_mail="
				+ e_mail + ", celular=" + celular + ", senha=" + senha + ", data_cadastro=" + data_cadastro
				+ ", getId()=" + getId() + ", getNome()=" + getNome() + ", getData_nascimento()=" + getData_nascimento()
				+ ", getE_mail()=" + getE_mail() + ", getCelular()=" + getCelular() + ", getSenha()=" + getSenha()
				+ ", getData_cadastro()=" + getData_cadastro() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
