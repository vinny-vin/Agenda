package terminal;
import java.io.IOException;
 import java.util.Scanner;

import DAO.ContatoDAO;
 

public class terminal {
	
	public static ContatoDAO teste = new ContatoDAO();
	public static terminal app = new terminal();
	public static void main(String[] args) throws IOException   {
		
		
		
		System.out.println("Bem vindo a sua agenda pessoal \r\n" );
		
			app.menu();
		
	}
	
	public void menu() throws IOException {
		 Scanner ler = new Scanner(System.in);

		
		 int resp;
		System.out.println("\n O que deseja fazer? \n 1. Cadatrar    2.Listar   3.Deletar 4.Atualizar 5.Sair");
		resp = ler.nextInt();
		switch (resp) {
			case 1:
				teste.cadastrar();
				break;
			case 2:
				teste.Listar();
				break;
			case 3:
				teste.deletar();
				break;
			case 4: 
				teste.atualizar();
				break;
			case 5:
				System.exit(0);	
			default:
				System.out.println("Numero incorreto");
					
		}
	this.menu();
	}

}
