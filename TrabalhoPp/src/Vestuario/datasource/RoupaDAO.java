package Vestuario.datasource;

import java.util.Scanner;

import Vestuario.Service.RoupasService;


public class RoupaDAO {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		RoupasService serv = new RoupasService();
		System.out.println("Opções do menu: \n[1]-Adicionar roupa\n[2]-Remover Roupas\n"
				+ "[3]-Listar roupas na lavanderia\n[4]-Listar roupas no guarda-roupas\n"
				+ "[5]-Qual cor predominante no guarda-roupas");
		int chave= sc.nextInt();
		
		switch (chave) {
		case 1: {
			serv.criar();
			break;
		}
		case 2:{
			serv.excluir();
			break;
		}
		case 3:{
			serv.listarLav();
			break;
		}
		case 4:{
			serv.listarGuard();
			break;
		}
		case 5:{
			serv.cor();
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + chave);
		}
		}
	

}
