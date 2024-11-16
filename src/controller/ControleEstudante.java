/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import java.util.List;
import model.Estudante;
import model.Curso;
import model.Inscricao;

/**
 *
 * @author kenandja
 */
public class ControleEstudante implements IEstudante {
            private ICursos controleCursos;
            private List<Estudante> estudantesCadastrados;
            //private List<Inscricao> lista;
            
            public ControleEstudante(ICursos controleCursos) {
                this.controleCursos = controleCursos;
                this.estudantesCadastrados = new ArrayList<Estudante>();
                estudantesCadastrados.add(new Estudante("Willow", "www@email.com", "salgueiro"));
                estudantesCadastrados.add(new Estudante("Xanadu", "xana@email.com", "1234456"));
                estudantesCadastrados.add(new Estudante("Yanka", "yumi@email.com", "grata#35"));
                estudantesCadastrados.add(new Estudante("Zayn", "zzz@email.com", "#$%%&%%$#"));
            }
            
            public boolean cadastrarEstudante(String nome, String email, String senha) {
                        if( nome != null && nome.length() > 0 && email != null && email.length() > 0 && 
                                senha != null && senha.length() > 0){
                                    Estudante estudante  = new Estudante(nome, email, senha);
                                    
                                    int indice = this.estudantesCadastrados.indexOf(estudante);
                                    if(indice == -1){
                                        this.estudantesCadastrados.add(estudante);
                                        return true;
                                    }
                                    else{
                                        this.estudantesCadastrados.set(indice, estudante);
                                        return true;
                                    }
                        }
                        return false;
            }
            public List <Estudante> listarEstudantes () {
                return this.estudantesCadastrados;
            }
            
            public Estudante obterEstudante(String email) {
                for(Estudante estudante : this.estudantesCadastrados) {
                    if(estudante != null && estudante.getEmail().equals(email) /*estudante.getEmail() == email*/) {
                        return estudante;
                    }
                }
                return null;
            }
            public void matricularEstudanteCurso(Estudante estudante, Curso curso) {
                // se tiver o curso estiver contido na lista de curso do estudante, retorna vazio
                if(estudante.getCursosEstudante().contains(curso)){
                    return;
                }
                if(this.obterEstudante(estudante.getEmail())==null){
                    this.cadastrarEstudante(estudante.getNome(), estudante.getEmail(), "123456");
                }
                if(this.controleCursos.obterCurso(curso.getId())==null){
                    this.controleCursos.cadastrarCurso(curso.getNome(), curso.getDescricao(),curso.getId(),curso.getPreco(),curso.getCpf());
                    // Tentei com instrutor.getCpf, mas não deu certo
                    // Então criei o método getCpf em Cursos que chama o getCpf de Instrutor
                }
                Inscricao inscricao = new Inscricao(estudante, curso);
                estudante.adicionarInscricao(inscricao);
                curso.adicionarInscricao(inscricao);
                this.atualizarEstudante(estudante);
                this.controleCursos.atualizarCurso(curso);
            }
            // alterei de private para public para tirar o erro
            public void atualizarEstudante(Estudante estudante){
                int indice = this.estudantesCadastrados.indexOf(estudante);
                if(indice != -1){
                    this.estudantesCadastrados.set(indice, estudante);
                }
            }
            
            public void desmatricularEstudanteCurso(Estudante estudante, Curso curso) {
                //Curso.removerEstudante(estudante);
                //Inscricao inscricao = new Inscricao(estudante, curso);
                estudante.removerInscricao(curso);
                curso.removerInscricao(estudante);
                this.atualizarEstudante(estudante);
                this.controleCursos.atualizarCurso(curso);
            }
            /*public void cadastrarEstudantePlataforma(Estudante estudante)
            public void descadastrarEstudantePlataforma(Estudante estudante)
            public List<Curso>listarCursosEstudante()
            */
}
