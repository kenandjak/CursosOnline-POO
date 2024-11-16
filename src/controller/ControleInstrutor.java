/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import java.util.List;
import model.Instrutor;
//import model.Curso;

/**
 *
 * @author kenandja
 */
public class ControleInstrutor implements IInstrutor {
            // Agora é definido apenas 1 instrutor por curso; não precisa mais da lista
            // Espera ... precisa sim; para os instrutores cadastrados na plataforma
            private List<Instrutor> instrutoresCadastrados;

            public ControleInstrutor() {
                this.instrutoresCadastrados = new ArrayList<Instrutor>();
            }

            public boolean cadastrarInstrutor(String nome, String email, String senha, String cpf, String telefone, String formacao) {
                if (nome != null && nome.length() > 0 && email != null && email.length() > 0
                        && senha != null && senha.length() > 0 && cpf != null && cpf.length() >= 0
                        && telefone != null && telefone.length() >= 0 && formacao != null && formacao.length() > 0) {
                                Instrutor instrutor = new Instrutor(nome, email, senha, cpf, telefone, formacao);
                                this.instrutoresCadastrados.add(instrutor);
                                return true;
                }
                return false;
    }
            public List <Instrutor> listarInstrutores () {
                        return this.instrutoresCadastrados;
                    }
            public Instrutor obterInstrutor(String cpf) {
                for(Instrutor instrutor : this.instrutoresCadastrados) {
                    if(instrutor != null && instrutor.getCpf().equals(cpf)) {
                        return instrutor;
                    }
                }
                return null;
            }
          
}
