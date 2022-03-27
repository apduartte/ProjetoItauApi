package br.com.apduartte.itauapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//criamos uma anotação para armazenamento e a outra para será a tabela em uso
@Entity
@Table(name="correntistas")

public class Correntistas {
	//definir através de uma anotação os campos existentes na nossa tabela
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	
	//iremos criar todos os campos referenciadas e existentes na nossa tabela
	
	@Column(name="ag")//nome do campo
	private int ag;//tipo do campo
	
	@Column(name="conta")
	private int conta;
	
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="saldo")
	private double saldo;
	
	@Column(name="cpf")
	private String cpf;

	public int getAg() {
		return ag;
	}

	public void setAg(int ag) {
		this.ag = ag;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
