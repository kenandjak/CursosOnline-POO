/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;

/**
 *
 * @author kenandja
 */
public class Inscricao {
    private Date data;
    private Estudante estudante;
    private Curso curso;

    public Inscricao(Estudante estudante, Curso curso) {
        this.data = new Date();
        this.estudante = estudante;
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public Date getData() {
        return data;
    }
} 
