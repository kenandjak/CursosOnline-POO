package controller;
import java.util.ArrayList;
import java.util.List;
import model.Curso;
import model.Instrutor;

public class ControleCursos implements ICursos{
            private IInstrutor controleInstrutor;
            private List<Curso> cursosCadastrados;

            public ControleCursos(IInstrutor controleInstrutor) {
                this.controleInstrutor = controleInstrutor;
                this.cursosCadastrados = new ArrayList<Curso>();
                cursosCadastrados.add(new Curso("Pandas", "Dados, python", "100", "25", new Instrutor("Abel","e@mail","#$%","998","44-55","Cientista de Dados")));
                cursosCadastrados.add(new Curso("React", "Front-end", "101", "30", new Instrutor("Aline","n@mail","abc","112","22-33","Engenheira de Software")));
                cursosCadastrados.add(new Curso("C++", "Back-end", "102", "22", new Instrutor("Ângela","g@mail","a33","964","47-69","Analista de Sistemas")));
            }
               
            // Método para salvar o curso na View
            
	public boolean cadastrarCurso(String nome, String descricao, String id, String preco, String cpfInstrutor) {
		if(nome != null && nome.length() > 0 && descricao != null && descricao.length() > 0 && 
                        id != null && id.length() > 0 && preco != null && preco.length() > 0 && cpfInstrutor != null
                        && cpfInstrutor.length() > 0) {
			Instrutor instrutor = this.controleInstrutor.obterInstrutor(cpfInstrutor);
                                    Curso curso = new Curso(nome, descricao, id, preco, instrutor);
			
                                    int indice = this.cursosCadastrados.indexOf(curso);
                                    if(indice == -1){
                                        this.cursosCadastrados.add(curso);
                                        return true;
                                    }
                                    else{
                                        this.cursosCadastrados.set(indice, curso);
                                        return true;
                                    }
		}
		return false; 
	}
            public List<Curso> listarCursos() {
                return this.cursosCadastrados;
            }
            
            public Curso obterCurso(String id) {
                for(Curso curso : this.cursosCadastrados) {
                    if (curso != null && curso.getId().equals(id)) {
                        return curso;
                    }
                }
                return null;
            }
            
            public void adicionarCurso(Curso curso) {
                // Os cursos são definidos pelo ID, que é único
                int indice = cursosCadastrados.indexOf(curso);
                if (indice < 0) {
                    cursosCadastrados.add(curso);
                } else {
                    cursosCadastrados.set(indice, curso);
                }
            }
            
            public void atualizarCurso(Curso curso) {
                int indice = this.cursosCadastrados.indexOf(curso);
                if(indice != -1){
                    this.cursosCadastrados.set(indice, curso);
                }
            }
            
            public void removerCurso(Curso curso) {
                cursosCadastrados.remove(curso);
            }
}
	
	//System.err.println()
	
	