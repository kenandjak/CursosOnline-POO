/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;
import model.Estudante;
import java.util.List;
import model.Curso;

/**
 *
 * @author kenandja
 */
public interface IEstudante {
            public boolean cadastrarEstudante(String nome, String email, String senha);
            public List <Estudante> listarEstudantes ();
            public Estudante obterEstudante(String email);
            public void matricularEstudanteCurso(Estudante estudante, Curso curso);
            public void atualizarEstudante(Estudante estudante); // tava dando erro como private
            public void desmatricularEstudanteCurso(Estudante estudante, Curso curso);
            
}
