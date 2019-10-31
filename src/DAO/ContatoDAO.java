package DAO;

import contato.Contato;
import interfaces.Repositorio;

import java.util.List;
import java.util.Scanner;

public class ContatoDAO extends Contato implements Repositorio<Contato> {

	private	Scanner ler = new Scanner(System.in);
	
	
	


	@Override
	public Contato cadastrar() {
		Contato contato = new Contato();
		
		System.out.println("Digite respectivamente o nome, data de nascimento, email e numero");
		contato.setNome(ler.next());
		contato.setDataNas(ler.next());
		contato.setEmail(ler.next());
		contato.setNumero(ler.nextLong());
		
		contatos.add(contato);
		
		return contato;
	}



	@Override
	public void deletar() {
		
		String delnome;
		System.out.println("Digite o nome do contato que deseja apagar");
		delnome = ler.next();
		
		
		 for(int i = 0; i < contatos.size(); i++)
		    {
		        Contato p = contatos.get(i);

		        if(p.getNome().equals(delnome))
		        {
		            // Encontrou uma pessoa cadastrada com nome "Pedro".

		            // Remove.
		            contatos.remove(p);

		            // Sai do loop.
		            break;
		        }
		    }
	}



	@Override
	public List<Contato> Listar() {
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
		return contatos;
	}



	@Override
	public void atualizar() {
		String nomeatual;
		System.out.println("Digite o nome do contato que deseja atualizar");
		nomeatual = ler.next();
		
		for (Contato contato2 : contatos) {
			if(contato2.getNome().equals(nomeatual)) {
				String resp;
				System.out.println("O que deseja alterar?");
				resp = ler.next();
				
				switch (resp) {
				case "nome":
					String newnome;
					System.out.println("Qual o nome que deseja inserir");
					newnome = ler.next();
					contato2.setNome(newnome);
					break;

				case "data de Nascimento":
					String newdata;
					System.out.println("Qual a data que deseja inserir");
					newdata = ler.next();
					contato2.setNome(newdata);
					break;
					
				case "email":
					String newemail;
					System.out.println("Qual a data que deseja inserir");
					newemail = ler.next();
					contato2.setEmail(newemail);
					break;
				
				case "numero":
					Long newnumero;
					System.out.println("Qual o numero que deseja inserir");
					newnumero = ler.nextLong();
					contato2.setNumero(newnumero);
					break;
					}
				}
			}
		
	}



	@Override
	public List<Contato> pesquisa() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
