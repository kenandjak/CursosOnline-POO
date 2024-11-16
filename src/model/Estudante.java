package model;
import java.util.ArrayList;

public class Estudante extends Usuario{
	private ArrayList<Inscricao> inscricoes;
	
	public Estudante(String nome, String email, String senha) {
		super(nome, email, senha);
                        this.inscricoes = new ArrayList<>();
	}
            
            @Override
            public boolean equals(Object obj) {
                // Alterei a visiblidade de email para protected
                if(obj instanceof Estudante && ((Estudante)obj).getEmail().equals(this.email)) {
                    return true;
                }
                return false;
            }            
            
            public void adicionarInscricao(Inscricao inscricao){
                if(this.inscricoes.indexOf(inscricao) == -1)
                    this.inscricoes.add(inscricao);
            }
        
	public void removerInscricao(Curso curso){
//                if(this.inscricoes.indexOf(inscricao) != -1)
//                    this.inscricoes.remove(inscricao);
                this.inscricoes.removeIf(inscricao -> (inscricao.getCurso().equals(curso)));
            }
        
            public ArrayList <Curso> getCursosEstudante() {
                ArrayList<Curso> listaCursos = new ArrayList<>();
                for(Inscricao inscricao : inscricoes) {
                    listaCursos.add(inscricao.getCurso());
                }
                return listaCursos;
            }
        
            
}
	