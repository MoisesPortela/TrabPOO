package Vestuario.modelos;

import Vestuario.enums.Situacao;

public class Roupa {
	private String cor;
	private Integer num_roupa;
	private String tecido;
	private Double preco;
	private Situacao situacaoRoupa;
	private String tipo;
	private String i;

	public Roupa(String i,String cor, Integer num, String tecido, Double valor, Situacao situacao, String tipo) {
		this.setIndex(i);
		this.cor=cor;
		this.num_roupa=num;
		this.tecido=tecido;
		this.preco=valor;
		this.situacaoRoupa=situacao;
		this.tipo=tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getNum_roupa() {
		return this.num_roupa;
	}
	public void setNum_roupa(Integer num_roupa) {
		this.num_roupa = num_roupa;
	}
	public String getTecido() {
		return this.tecido;
	}
	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	public Double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setSituacao (Situacao situ ) {
		this.situacaoRoupa=situ;
	}
	public Situacao getSituacao () {
		return this.situacaoRoupa;
	}
	public String getTipo() {
		return tipo;
	}
	public boolean setTipo(String tipo) {
		boolean a;
		tipo.toLowerCase();
		if (tipo.equals("esporte")||tipo.equals("esporte fino")||tipo.equals("social")) {
			this.tipo = tipo;
			a=true;
		}else {
			a=false;
		}
		return a;
	}
	public String getIndex() {
		return i;
	}
	public void setIndex(String i) {
		this.i = i;
	}
};

