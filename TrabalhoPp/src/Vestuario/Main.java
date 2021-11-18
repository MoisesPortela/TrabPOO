package Vestuario;

import java.util.Scanner;

import Vestuario.Service.RoupasService;

public class Main {

	public static void main(String[] args) {
		RoupasService serv= new RoupasService();
		Scanner sc = new Scanner(System.in);
		
		int i;
		do{
			
		serv.menu();
		System.out.println("Deseja fazer outra operação: [1]Sim [0]Não ");
		i = sc.nextInt();
		sc.nextLine();
		}while(i!=0);
		sc.close();

	}

}
