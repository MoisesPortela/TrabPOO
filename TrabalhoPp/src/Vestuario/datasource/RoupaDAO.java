package Vestuario.datasource;

import java.util.Scanner;
import Vestuario.Service.RoupasService;


public class RoupaDAO {
	public void menu() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Opções do menu: \n[1]-Adicionar roupa\n[2]-Remover Roupas\n"
				+ "[3]-Listar roupas na lavanderia\n[4]-Listar roupas no guarda-roupas\n"
				+ "[5]-Qual cor predominante no guarda-roupas");
		int chave= scanner.nextInt();
		
		switch (chave) {
		case 1: {
			RoupasService.criar();
			break;
		}
		case 2:{
			RoupasService.excluir();
			break;
		}
		case 3:{
			RoupasService.listarLav();
			break;
		}
		case 4:{
			RoupasService.listarGuard();
			break;
		}
		case 5:{
			RoupasService.cor();
			break;
		}
		
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + chave);
		}
//		scanner.close();
		}
	

}
