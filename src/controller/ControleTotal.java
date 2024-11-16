/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

public class ControleTotal implements ITotal{
    private static ControleTotal onlyOne;
    private ICursos cursosController;
    private IEstudante estudantesController;
    private IInstrutor instrutoresController;
    
    // Mudei a visibilidade do construtor
    private ControleTotal (ICursos cursosController, IEstudante estudantesController, IInstrutor instrutoresController) {
      this.cursosController = cursosController;
      this.estudantesController = estudantesController;
      this.instrutoresController = instrutoresController;
    }
    
    public static ControleTotal getInstance(ICursos cursosController, IEstudante estudantesController, IInstrutor instrutoresController){
        if(ControleTotal.onlyOne == null){
            ControleTotal.onlyOne = new ControleTotal(cursosController, estudantesController, instrutoresController);
        }
        return ControleTotal.onlyOne;
    }
    
    // Cursos
    @Override
    public boolean cadastrarCurso(String nome,String descricao, String id, String preco, String cpfInstrutor) {
        return this.cursosController.cadastrarCurso(nome, descricao, id, preco, cpfInstrutor);
    }
    @Override
    public List <Curso> listarCursos() {
        return this.cursosController.listarCursos();
    }
    @Override
    public Curso obterCurso(String id) {
        return this.cursosController.obterCurso(id);
    }
    @Override
    public void adicionarCurso(Curso curso) {
        this.cursosController.adicionarCurso(curso);
    }
    @Override
    public void atualizarCurso(Curso curso) {
        this.cursosController.atualizarCurso(curso);
    }
    @Override
    public void removerCurso(Curso curso) {
        this.cursosController.removerCurso(curso);
    }
    
    // Estudantes
    @Override
    public boolean cadastrarEstudante(String nome, String email, String senha) {
        return this.estudantesController.cadastrarEstudante(nome, email, senha);
    }
    
    @Override
    public List <Estudante> listarEstudantes () {
        return this.estudantesController.listarEstudantes();
    }
    
    @Override
    public Estudante obterEstudante(String email) {
        return this.estudantesController.obterEstudante(email);
    }
    
    @Override
    public void matricularEstudanteCurso(Estudante estudante, Curso curso) {
        this.estudantesController.matricularEstudanteCurso(estudante, curso);
    }
    
    @Override
    public void atualizarEstudante(Estudante estudante) {
        this.estudantesController.atualizarEstudante(estudante);
    }
    
    @Override
    public void desmatricularEstudanteCurso(Estudante estudante, Curso curso) {
        this.estudantesController.desmatricularEstudanteCurso(estudante, curso);
    }
    
    // Instrutores
    @Override
    public boolean cadastrarInstrutor(String nome, String email, String senha, String cpf, String telefone, String formacao) {
        return this.instrutoresController.cadastrarInstrutor(nome, email, senha, cpf, telefone, formacao);
    }   
    
    @Override
    public List <Instrutor> listarInstrutores () {
        return this.instrutoresController.listarInstrutores();
    }
    
    @Override
    public Instrutor obterInstrutor(String cpf) {
        return this.instrutoresController.obterInstrutor(cpf);
    }
}
