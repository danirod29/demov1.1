/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mover_imagen;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public class MoverMago extends MoverPersonaje{

    public MoverMago(JPanel panel) {
        super(panel);
    }

    

    @Override
    public void moverDerecha() {
        numeroInicial = 1;
        numeroFinal = 3;
    }

    @Override
    public void moverIzquierda() {
        numeroInicial = 3;
        numeroFinal = 5;
    }

    @Override
    public void moverArriba() {
        numeroInicial = 15;
        numeroFinal = 17;
    }

    @Override
    public void moverAbajo() {
        numeroInicial = 13;
        numeroFinal = 15;
    }

    @Override
    public void run() {
    }
    
    @Override
    public MoverPersonaje clone() {
        MoverPersonaje figura = new MoverMago(panel);        
        return figura;
    }
   
}
