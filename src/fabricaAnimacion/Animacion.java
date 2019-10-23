/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAnimacion;

import javax.swing.JComponent;
import mover_imagen.*;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public interface Animacion  {
    
    
    MoverPersonaje moverPersonaje();
    
    GolpePersonaje golperPersonaje();
    
    MuertePersonaje muerePersonaje();
    
    public Animacion clonarMoverPersonaje();
    
    
}
