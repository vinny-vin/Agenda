package contato;

import java.util.ArrayList;
import java.util.List;

public class Contato {
		
		@Override
	public String toString() {
		return "Contato [nome=" + nome + ", dataNas=" + dataNas + ", email=" + email + ", numero=" + numero
				;
	}

		private String nome;
		private String dataNas;
		private String email;
		private long numero;
		
		public Contato (String nome, String dataNas, String email, long numero) {
			this.nome = nome;
			this.dataNas = dataNas;
			this.email = email;
			this.numero = numero;
			
		}			

		public Contato() {
			
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDataNas() {
			return dataNas;
		}

		public void setDataNas(String dataNas) {
			this.dataNas = dataNas;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public long getNumero() {
			return numero;
		}

		public void setNumero(long numero) {
			this.numero = numero;
		}
		
		public List<Contato> contatos = new ArrayList<Contato>();
		
		
	}


