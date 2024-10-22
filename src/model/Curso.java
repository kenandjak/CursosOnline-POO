package model;

import java.util.ArrayList;

public class Curso {
	private String nome;
            private String descricao;
	private String id;
	private String preco;
	private ArrayList<Estudante> estudantes;
	private ArrayList<Instrutor> instrutores;
	
	public Curso(String nome, String descricao, String id, String preco) {
		this.nome = nome;
                        this.descricao = descricao;
		this.id = id;
		this.preco = preco;
	}
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
        
            public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	// Controller
	
	public void cadastrarCurso(Curso curso) {
		//
	}
}
