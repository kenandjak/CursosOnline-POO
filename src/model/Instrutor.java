package model;
import java.util.ArrayList;

public class Instrutor extends Usuario{
	private String cpf; 
	private String telefone;
	private String formacao;
	private ArrayList<Curso> cursos;
	
	public Instrutor(String nome, String email, String senha, 
		String cpf, String telefone, String formacao) {
		super(nome, email, senha);
		this.cpf = cpf;
		this.telefone = telefone;
		this.formacao = formacao;
		cursos = new ArrayList<Curso>();
	}
	
            public boolean equals(Object obj) {
                if(obj instanceof Instrutor && ((Instrutor)obj).getCpf().equals(this.cpf)) {
                    return true;
                }
                return false;
            }
            
	// Getters and Setters
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	// Controller
	public void adicionarCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public void removerCurso(Curso curso) {
		cursos.remove(curso);
	}
}


