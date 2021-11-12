package Vestuario.Service;

import java.util.Scanner;
import Vestuario.datasource.RoupaDAO;
import Vestuario.enums.Situacao;
import Vestuario.modelos.Esporte;
import Vestuario.modelos.EsporteFino;
import Vestuario.modelos.Roupa;
import Vestuario.modelos.Social;
import Vestuario.modelos.Trabalho;

public class RoupasService {
	public void menu() {
		RoupaDAO dao = new RoupaDAO();
		dao.menu();
	}

	public static void criar() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Cadastro de Roupa\n\n");
			System.out.println("Digite o tipo da roupa: \n(1)-Esporte\n(2)-Esporte Fino\n"
					+ "(3)-Social\n(4)-Trabalho ");
			int tipo= sc.nextInt();
			System.out.println("Digite a cor: ");
			String cor= sc.next();
			System.out.println("Digite a Número da roupa (Preto, Azul, Branco):");
			Integer num= sc.nextInt();
			System.out.println("Digite o tecido da roupa:");
			String tecido= sc.next();
			System.out.println("Digite o preço da roupa:");
			Double valor= sc.nextDouble();
			System.out.println("Digite o status da roupa\n [1]Uso\n[2]Lavanderia\n[3]Guarda_roupa");
			String situacaoRoupa= sc.next();
			
			sc.close();
			
			
			switch (tipo) {
			case 1: {
				Esporte roupa = new Esporte();
				roupa.setCor(cor);
				roupa.setNum_roupa(num);
				roupa.setTecido(tecido);
				roupa.setPreco(valor);
				if(situacaoRoupa.equals("a")) {
				roupa.setSituacao(Situacao.USO);
				}else if (situacaoRoupa.equals("b")) {
					roupa.setSituacao(Situacao.LAVANDERIA);
				}else {
					roupa.setSituacao(Situacao.GUARDA_ROUPA);
				}
			}
			case 2: {
				EsporteFino roupa = new EsporteFino();
				roupa.setCor(cor);
				roupa.setNum_roupa(num);
				roupa.setTecido(tecido);
				roupa.setPreco(valor);
				
				if (situacaoRoupa.equals("a")) {
					roupa.setSituacao(Situacao.USO);
				}else if(situacaoRoupa.equals("b")) {
					roupa.setSituacao(Situacao.LAVANDERIA);
				}else {
					roupa.setSituacao(Situacao.GUARDA_ROUPA);
				}
				roupa.colocarNaLista(roupa);
				
			}
			case 3: {
				Social roupa = new Social();
				roupa.setCor(cor);
				roupa.setNum_roupa(num);
				roupa.setTecido(tecido);
				roupa.setPreco(valor);
				
				if (situacaoRoupa.equals("a")) {
					roupa.setSituacao(Situacao.USO);
				}else if(situacaoRoupa.equals("b")) {
					roupa.setSituacao(Situacao.LAVANDERIA);
				}else {
					roupa.setSituacao(Situacao.GUARDA_ROUPA);
				}
				roupa.colocarNaLista(roupa);
			}
			case 4: {
				Trabalho roupa = new Trabalho();
				roupa.setCor(cor);
				roupa.setNum_roupa(num);
				roupa.setTecido(tecido);
				roupa.setPreco(valor);
				
				if (situacaoRoupa.equals("a")) {
					roupa.setSituacao(Situacao.USO);
				}else if(situacaoRoupa.equals("b")) {
					roupa.setSituacao(Situacao.LAVANDERIA);
				}else {
					roupa.setSituacao(Situacao.GUARDA_ROUPA);
				}
				roupa.colocarNaLista(roupa);
			}
//			default:
//				throw new IllegalArgumentException("Unexpected value: " + tipo);
			}
		}
		public static void excluir() {
			Roupa roupa = new Roupa();
			roupa.excluirNaLista();
		}
		public static void listarLav() {
			Roupa roupa = new Roupa();
			roupa.ListarLavanderia();
		}
		public static void listarGuard() {
			Roupa roupa = new Roupa();
			roupa.ListarLavanderia();
		}
		public static void cor() {
			Roupa roupa = new Roupa();
			roupa.ListaCor();
		}
			
			
			
		};
		
