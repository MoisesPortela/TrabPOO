package Vestuario.main;

import java.util.Scanner;

import Vestuario.Service.RoupasService;
import Vestuario.modelos.Roupa;

public class Main {

	public static void main(String[] args) {
		RoupasService serv= new RoupasService();
		
		int opcao=100;
		while(opcao!=0) {
		serv.menu();
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja fazer outra opera��o: [1]Sim [0]N�o ");
		Integer resp= sc.nextInt();
		opcao=resp;
		}

	}

}
