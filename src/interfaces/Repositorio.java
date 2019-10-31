package interfaces;

import java.util.List;

public interface Repositorio<Contato> {
	
	Contato cadastrar();
	
	void deletar();
	
	List<Contato> Listar();
	
	void atualizar();
	
	List<Contato> pesquisa();
	
	

}
