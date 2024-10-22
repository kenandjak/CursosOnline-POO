package controller;
import model.Curso;

public class CursosController {
	//private 
	
            // Método para salvar o curso na View
	public boolean cadastrarCurso(String nome, String descricao, String id, String preco) {
		if(nome != null && nome.length() > 0 && descricao != null && descricao.length() > 0 && 
                        id != null && id.length() > 0 && preco != null && preco.length() > 0) {
			Curso curso = new Curso(nome, descricao, id, preco);
			curso.cadastrarCurso(curso);
			return true;
		}
		return false; 
	}
}
	
	//System.err.println()
	
	/*public void removerCurso(Curso curso) {
		cursos.remove(curso);
	}*/

/*
 * Começa não havendo cursos, estudantes, instrutores
 * Se digitar uma opção errada - no início ou durante uma operação
 * Tratamento de erros
 * */