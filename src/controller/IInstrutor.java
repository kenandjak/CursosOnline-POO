/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;
import model.Instrutor;
import java.util.List;
//import model.Curso;

/**
 *
 * @author kenandja
 */
public interface IInstrutor {
            public boolean cadastrarInstrutor(String nome, String email, String senha, String cpf, String telefone, String formacao);
            public List <Instrutor> listarInstrutores ();
            public Instrutor obterInstrutor(String cpf);
            
}
