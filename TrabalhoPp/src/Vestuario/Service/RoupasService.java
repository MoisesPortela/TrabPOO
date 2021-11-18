package Vestuario.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import Vestuario.datasource.RoupaDAO;
import Vestuario.enums.Situacao;
import Vestuario.modelos.Roupa;

public class RoupasService {
	static boolean t;
	private static int i=0;
	public static List<Roupa> vestimentas = new ArrayList<>();
	public static List<Roupa> lavanderia = new ArrayList<>();
	public static List<Roupa> guarda = new ArrayList<>();
	public static List<String> cores= new ArrayList<>();
	public void menu() {
		RoupaDAO dao = new RoupaDAO();
		dao.menu();
	}
	
	public static void criar() {		
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print("Cadastro de Roupa\n\n");
			int resposta;
			do {
			System.out.print("Digite o tipo da roupa: \n-Esporte\n-Esporte Fino\n"
					+ "-Social\n-Trabalho\n");
			String tipo= sc.next();
			System.out.println("Digite a cor: ");
			String cor= sc.next();
			System.out.println("Digite a Número da roupa :");
			Integer num= sc.nextInt();
			System.out.println("Digite o tecido da roupa:");
			String tecido= sc.next();
			System.out.println("Digite o preço da roupa:");
			Double valor= sc.nextDouble();
			System.out.println("Digite o status da roupa\n[1]Uso\n[2]Lavanderia\n[3]Guarda_roupa");
			Integer situacaoRoupa=sc.nextInt();														
			if(situacaoRoupa==1) {
				vestimentas.add(new Roupa(String.valueOf(i),cor,num,tecido,valor,Situacao.USO,tipo));
				cores.add(cor.toLowerCase());
			}else if (situacaoRoupa==2) {
				lavanderia.add(new Roupa(String.valueOf(i),cor,num,tecido,valor,Situacao.LAVANDERIA,tipo));
				vestimentas.add(new Roupa(String.valueOf(i),cor,num,tecido,valor,Situacao.LAVANDERIA,tipo));
				cores.add(cor.toLowerCase());
			}else {
				guarda.add(new Roupa(String.valueOf(i),cor,num,tecido,valor,Situacao.GUARDA_ROUPA,tipo));
				vestimentas.add(new Roupa(String.valueOf(i),cor,num,tecido,valor,Situacao.GUARDA_ROUPA,tipo));
				cores.add(cor.toLowerCase());
			}
				i++;
				System.out.print("Deseja realizar outra inclusão?\n[1]Sim\n[2]Não\n");
				resposta= sc.nextInt();
			}while(resposta!=2);			
}
		public static void excluir() {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if(vestimentas.size()>0) {	
			System.out.println("Lista de vestimentas");
			for (Roupa roupa:vestimentas )
				System.out.println("Indice: "+roupa.getIndex()+" - "+roupa.getCor() +" - "+ roupa.getNum_roupa()+" - "
						+roupa.getTecido()+" - "+ roupa.getPreco()+" - "+roupa.getSituacao());	
			System.out.print("Indique o indice de exclusão da lista:\n ");
			i = sc.nextInt();
			System.out.println(vestimentas.size());
			if(i<=(vestimentas.size()-1)) {	
				System.out.println(vestimentas.remove(i));
			}else {
				System.out.println("Falha");
			}
			}else {
				System.out.println("Lista "+vestimentas+" está vazia");
			}
			if(lavanderia.size()>0) {	
				Integer indiceLav=0;
			System.out.print("Lista de Lavanderia\n");
			for (Roupa roupa:lavanderia ) {
				System.out.println("Indice: "+ indiceLav +" - "+roupa.getCor() +" - "+ roupa.getNum_roupa()+" - "
						+roupa.getTecido()+" - "+ roupa.getPreco()+" - "+roupa.getSituacao());
			indiceLav++;
			}
			System.out.print("Indique o indice de exclusão da lista:\n ");
			i = sc.nextInt();
			lavanderia.size();
			if(i<=(lavanderia.size()-1)) {	
				System.out.println(lavanderia.remove(i));
			}else {
				System.out.println("Falha");
			}
			}else {
				System.out.println("Lista "+lavanderia+" está vazia");
			}
			if(guarda.size()>0) {
				Integer indiceGuard=0;
				System.out.println("Lista de guarda-roupa");
			for (Roupa roupa:guarda ) {
				System.out.println("Indice: "+indiceGuard+" - "+roupa.getCor() +" - "+ roupa.getNum_roupa()+" - "
						+roupa.getTecido()+" - "+ roupa.getPreco()+" - "+roupa.getSituacao());
				indiceGuard++;
			}
			System.out.print("Indique o indice de exclusão da lista:\n ");
			i = sc.nextInt();
			guarda.size();
			if(i<=(guarda.size()-1)) {	
				System.out.println(guarda.remove(i));
			}else {
				System.out.println("Falha");
			}
			}else {
				System.out.println("Lista "+guarda+" está vazia");
			}
		}
			
		public static void listarLav() {
			System.out.print("Lavanderia:\n");
			for(Roupa roupa:lavanderia) {
				System.out.println("Tipo: "+roupa.getTipo()+" Cor: "+roupa.getCor()+" - Número: "+roupa.getNum_roupa()
				+" - Tecido: "+roupa.getTecido()+" - Preço"+roupa.getPreco()+ " - Se encontra na " +
						roupa.getSituacao()+"\n");
			}
			System.out.println("Totalizando "+ lavanderia.size()+" roupas na lavanderia");
			
		}
		
		public static void listarGuard() {
			System.out.print("Guarda-Roupa:\n");
			for(Roupa roupa:guarda) {
				System.out.println("Cor: "+roupa.getCor()+" - Número: "+roupa.getNum_roupa()
				+" - Tecido: "+roupa.getTecido()+" - Preço"+roupa.getPreco()+ " - Se encontra na " +
						roupa.getSituacao()+"\n");
			}
			System.out.println("Totalizando "+ guarda.size()+" roupas no guarda-roupas");

		}
		
		public static void listarVestimentas() {
			System.out.print("Total de vestimentas:\n");
			for(Roupa roupa:vestimentas) {
				System.out.println("Cor: "+roupa.getCor()+" - Número: "+roupa.getNum_roupa()
				+" - Tecido: "+roupa.getTecido()+" - Preço"+roupa.getPreco()+ " - Se encontra na " +
						roupa.getSituacao()+"\n");
			}
			System.out.println("Totalizando "+ vestimentas.size()+" roupas");
		}

		public static void cor() {
			int maiorValor=0;
			String cor="";
			Set<String> distinct = new HashSet<>(cores);
	        for (String s: distinct) {
	        	if(maiorValor<Collections.frequency(cores, s)) {
					maiorValor=Collections.frequency(cores, s);
					cor=s;		
				}
	        }
	        System.out.println("A cor que mais se repete é: "+cor+ " com um total de " + maiorValor+" repetições");			
		}	
	};
		
