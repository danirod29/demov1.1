/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mover_imagen;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public class GolpeMago extends GolpePersonaje{

    public GolpeMago(JPanel panel) {
        super(panel); 
    }
    
    
  
    @Override
    public void golpeConArmaIz() {
        numeroInicial = 7;
        numeroFinal = 9;
    }

    @Override
    public void golpeConArmaDe() {
        numeroInicial = 5;
        numeroFinal = 7;
    }

    @Override
    public void golpeConArmaEspalda() {
        numeroInicial = 11;
        numeroFinal = 13;

    }

    @Override
    public void golpeConArmaFrontal() {
        numeroInicial = 9;
        numeroFinal = 11;
    }

    @Override
    public void run() {
    }
    
    @Override
    public GolpePersonaje clone() {
        GolpePersonaje figura = new GolpeMago(panel);        
        return figura;
    }
    
  
}
