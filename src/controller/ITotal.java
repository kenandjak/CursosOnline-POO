/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;
import model.Curso;
import model.Estudante;
import model.Instrutor;

/**
 *
 * @author kenandja
 */
public interface ITotal extends ICursos, IEstudante, IInstrutor {
            // Cursos
            public boolean cadastrarCurso(String nome,String descricao, String id, String preco, String cpfInstrutor);
            public List <Curso> listarCursos();
            public Curso obterCurso(String id);
            public void adicionarCurso(Curso curso);
            public void atualizarCurso(Curso curso);
	public void removerCurso(Curso curso);
            // Estudantes
            public boolean cadastrarEstudante(String nome, String email, String senha);
            public List <Estudante> listarEstudantes ();
            public Estudante obterEstudante(String email);
            public void matricularEstudanteCurso(Estudante estudante, Curso curso);
            public void atualizarEstudante(Estudante estudante);
            public void desmatricularEstudanteCurso(Estudante estudante, Curso curso);
            // Instrutores
            public boolean cadastrarInstrutor(String nome, String email, String senha, String cpf, String telefone, String formacao);
            public List <Instrutor> listarInstrutores ();
            public Instrutor obterInstrutor(String cpf);
            
}
