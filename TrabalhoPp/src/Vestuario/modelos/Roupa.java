package Vestuario.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Vestuario.enums.Situacao;

public class Roupa {
	private String cor;
	private Integer Num_roupa;
	private String Tecido;
	private Double Preco;
	private Situacao situacaoRoupa;
	public List<Roupa> vestimentas = new ArrayList<>();
	public List<Roupa> lavanderia = new ArrayList<>();
	public List<Roupa> guarda = new ArrayList<>();
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getNum_roupa() {
		return this.Num_roupa;
	}
	public void setNum_roupa(Integer num_roupa) {
		this.Num_roupa = num_roupa;
	}
	public String getTecido() {
		return this.Tecido;
	}
	public void setTecido(String tecido) {
		this.Tecido = tecido;
	}
	public Double getPreco() {
		return this.Preco;
	}
	public void setPreco(double d) {
		this.Preco = d;
	}
	public void setSituacao (Situacao situ ) {
		this.situacaoRoupa=situ;
	}
	public Situacao getSituacao () {
		return this.situacaoRoupa;
	}
	public void colocarNaLista(Roupa roupa){
		vestimentas.add(roupa);
	}
	public void colocarNaListaLavanderia(Roupa roupa){
		lavanderia.add(roupa);
	}
	public void excluirNaLista() {
		Scanner sc = new Scanner(System.in);
		int index = 1;
		for (Roupa roupa:vestimentas ) {
			System.out.println(index+roupa.getCor() +" - "+ roupa.getNum_roupa()+" - "
					+roupa.getTecido()+" - "+ roupa.getPreco()+" - "+roupa.getSituacao());
		index++;
		}
		System.out.println("Indique o indice de exclusão: ");
		Integer ind = sc.nextInt();
		sc.close();
		
		vestimentas.remove(ind);
	}
	public void ListarLavanderia() {
		for (Roupa roupa:lavanderia ) {
			System.out.println(roupa.getCor() +" - "+ roupa.getNum_roupa()+" - "
					+roupa.getTecido()+" - "+ roupa.getPreco()+" - "+roupa.getSituacao());
		}
	}
	public void ListarGuarda() {
		for (Roupa roupa:guarda ) {
			System.out.println(roupa.getCor() +" - "+ roupa.getNum_roupa()+" - "
					+roupa.getTecido()+" - "+ roupa.getPreco()+" - "+roupa.getSituacao());
		}
	}
	public void ListaCor() {
		int a=0,b=0,c=0;
		for (Roupa roupa:vestimentas ) {
			roupa.getCor();
			if(roupa.getCor().toLowerCase().equals("preto")) {
				a++;
			}else if(roupa.getCor().toLowerCase().equals("branco")){
				b++;
			}else {
				c++;
			};
			if(a>b && a>c) {
				System.out.println("Cor predominante Preto");
			}else if (b>a && b>c) {
				System.out.println("Cor predominante Branco");
			}else {
				System.out.println("Cor predominante Azul");
			}
			
		}
	}
	
	
};

