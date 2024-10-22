package model;

import java.util.ArrayList;

public class Estudante extends Usuario{
	private ArrayList<Curso> cursos;
	
	public Estudante(String nome, String email, String senha) {
		super(nome, email, senha);
	}
	
	// Controller
	/*public void comprarCurso(Curso curso) {
		if (curso.getPreco() > 0) {
		System.out.println("Digite o método de pagamento:");
		System.out.println("c para Crédito\n d para Débito");
		// Como receber o dado do usuário?
		//if()
		System.out.println("Pagamento confirmado!");
		}
		
		cursos.add(curso);
		
	}*/
	
	// Controller
	public void cancelarInscricao(Curso curso) {
		int i = cursos.indexOf(curso);
		if(i < 0) {
			System.out.println("Curso não existente. Verifique se digitou corretamente.");
		} else {
			cursos.remove(i);
		}
	}
}
	