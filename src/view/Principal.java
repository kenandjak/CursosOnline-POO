/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ControleCursos;
import controller.ControleEstudante;
import controller.ControleInstrutor;
import controller.ControleTotal;
import controller.IInstrutor;
import controller.IEstudante;
import controller.ICursos;
import controller.ITotal;

/**
 *
 * @author kenandja
 */
public class Principal {
    public static void main(String[] args) {    
        
        IInstrutor controleInstrutor = new ControleInstrutor();
        ICursos controleCurso = new ControleCursos(controleInstrutor);
        IEstudante controleEstudante = new ControleEstudante(controleCurso);
        
        //ControleCursos cursosController = new ControleCursos(controleInstrutor);
        //ControleEstudante estudantesController = new ControleEstudante(controleCurso);
        //ControleInstrutor instrutorController = new ControleInstrutor();
        
        ITotal controleTotal = ControleTotal.getInstance(controleCurso, controleEstudante, controleInstrutor);
        new MainView(controleTotal).setVisible(true);
    }
}
