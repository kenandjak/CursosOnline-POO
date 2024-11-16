package controller;
import model.Curso;
import java.util.List;

public interface ICursos {
            //private List <Curso> cursosCadastrados;
	public boolean cadastrarCurso(String nome,String descricao, String id, String preco, String cpfInstrutor);
            public List <Curso> listarCursos();
            public Curso obterCurso(String id);
            public void adicionarCurso(Curso curso);
            public void atualizarCurso(Curso curso);
	public void removerCurso(Curso curso);
}
