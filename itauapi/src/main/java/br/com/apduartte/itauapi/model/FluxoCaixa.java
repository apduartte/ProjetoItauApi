package br.com.apduartte.itauapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//criamos uma anotação para armazenamento e a outra para será a tabela em uso
@Entity
@Table(name= "fluxo_caixa")

public class FluxoCaixa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")

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

	public int getFluxo() {
		return fluxo;
	}

	public void setFluxo(int fluxo) {
		this.fluxo = fluxo;
	}

	public double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public double getSaida() {
		return saida;
	}

	public void setSaida(double saida) {
		this.saida = saida;
	}

	//definir através de uma anotação os campos existentes na nossa tabela
	@Id
	
	//iremos criar todos os campos referenciadas e existentes na nossa tabela
	
	@Column(name="ag")//nome do campo
	private int ag;//tipo do campo
	
	@Column(name="conta")
	private int conta;
	
	
	@Column(name="fluxo")
	private int fluxo;
	
	@Column(name="entrada")
	private double entrada;
	
	@Column(name="saida")
	private double saida;
	
}
