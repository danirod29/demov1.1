
package Vistas;

import fabricaAnimacion.Animacion;
import fabricaAnimacion.AnimacionMago;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import mover_imagen.GolpeMago;
import mover_imagen.GolpePersonaje;
import mover_imagen.MoverPersonaje;
import mover_imagen.MoverMago;
import mover_imagen.MuerteMago;
import mover_imagen.MuertePersonaje;


public class Ventana extends javax.swing.JFrame {
    Animacion miAnimacion = null;
    
    MoverPersonaje miMoverPer = null;  
    GolpePersonaje miGolpe = null;
    MuertePersonaje miMuerte = null; 
    
    GolpeMago miGolMag = null;
    MoverMago miMovMag = null;
    MuerteMago miMuerMag = null;
    
    
    public Ventana() 
    {
        initComponents();
       
        
        jPpanel1.setVisible(true);
        jPpanel1.setFocusable(true);
        
        jPpanel2.setVisible(true);
        jPpanel2.setFocusable(true);
        
        //Para crear las partes por fabrica abstracta
        miAnimacion = new AnimacionMago(jPpanel1);       
     }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        jPpanel1 = new javax.swing.JPanel();
        jPpanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(205, 255, 255));

        panelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        panelGeneral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPpanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPpanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPpanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPpanel1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPpanel1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPpanel1Layout = new javax.swing.GroupLayout(jPpanel1);
        jPpanel1.setLayout(jPpanel1Layout);
        jPpanel1Layout.setHorizontalGroup(
            jPpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPpanel1Layout.setVerticalGroup(
            jPpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );

        jPpanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPpanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPpanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPpanel2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPpanel2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPpanel2Layout = new javax.swing.GroupLayout(jPpanel2);
        jPpanel2.setLayout(jPpanel2Layout);
        jPpanel2Layout.setHorizontalGroup(
            jPpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
        jPpanel2Layout.setVerticalGroup(
            jPpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPpanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPpanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPpanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPpanel1KeyPressed

        jPpanel1.removeAll(); 
        jPpanel2.removeAll();
        
        if(evt.getExtendedKeyCode() == KeyEvent.VK_LEFT || evt.getExtendedKeyCode() == KeyEvent.VK_RIGHT
                || evt.getExtendedKeyCode() == KeyEvent.VK_UP || evt.getExtendedKeyCode() == KeyEvent.VK_DOWN){
            //Se crea el objeto por Fabrica abstracta solo se mueve  
            miMoverPer = miAnimacion.moverPersonaje();
            
            //Se inicializa el objeto para crear bjetos a clonar
            miGolMag = new GolpeMago(jPpanel2);
            //Se clona el objeto para que golpee
            miGolpe = miGolMag.clone();
                
                switch(evt.getExtendedKeyCode()){
                    case KeyEvent.VK_LEFT:                
                        miMoverPer.moverIzquierda();
                        //Se inicializa la imagen  del clone
                        miGolpe.golpeConArmaIz();
                    break;          
                    case KeyEvent.VK_RIGHT : 
                        miMoverPer.moverDerecha();
                        //Se inicializa la imagen  del clone
                        miGolpe.golpeConArmaDe();
                    break; 
                    case KeyEvent.VK_UP : 
                        miMoverPer.moverArriba();
                        //Se inicializa la imagen  del clone
                        miGolpe.golpeConArmaEspalda();
                        
                    break;
                    case KeyEvent.VK_DOWN : 
                        miMoverPer.moverAbajo();
                        //Se inicializa la imagen  del clone
                        miGolpe.golpeConArmaFrontal();
                    break;
                }
                //La animacion para la fabrica
                jPpanel1.add(miMoverPer);               
                miMoverPer.mover();
                //La animacion para el clone
                jPpanel2.add(miGolpe);
                miGolpe.mover();
                
        } else if(evt.getExtendedKeyCode() == KeyEvent.VK_A || evt.getExtendedKeyCode() == KeyEvent.VK_W
                || evt.getExtendedKeyCode() == KeyEvent.VK_S || evt.getExtendedKeyCode() == KeyEvent.VK_Z){
            //Se crea por Fabrica abstracta solo va a Golpear       
            miGolpe = miAnimacion.golperPersonaje();
            
            //Para crear bjetos a clonar
            miMovMag = new MoverMago(jPpanel2);
            //Se clona el objeto para que se mueva
            miMoverPer = miMovMag.clone();
            
                    switch(evt.getExtendedKeyCode()){            
                                case KeyEvent.VK_A :
                                     miGolpe.golpeConArmaIz();
                                     //Se inicializa la imagen  del clone
                                     miMoverPer.moverIzquierda();
                                break;
                                case KeyEvent.VK_S :
                                     miGolpe.golpeConArmaDe();
                                     //Se inicializa la imagen  del clone
                                     miMoverPer.moverDerecha();
                                break;
                                case KeyEvent.VK_W :
                                     miGolpe.golpeConArmaEspalda();
                                     //Se inicializa la imagen  del clone
                                     miMoverPer.moverArriba();
                                break;
                                case KeyEvent.VK_Z :
                                     miGolpe.golpeConArmaFrontal();
                                     //Se inicializa la imagen  del clone
                                     miMoverPer.moverAbajo();
                                break;
                                
                            }
                         //La animacion para la fabrica
                         jPpanel1.add(miGolpe);
                         miGolpe.mover();
                         //La animacion para el clon
                         jPpanel2.add(miMoverPer);
                         miMoverPer.mover();
        }else if(evt.getExtendedKeyCode() == KeyEvent.VK_X){
            //Se crea por fabrica abstracta la muerte del personaje
            miMuerte = miAnimacion.muerePersonaje();
            miMuerte.aniMuertePer();
            jPpanel1.add(miMuerte);
            miMuerte.mover();
        }else if(evt.getExtendedKeyCode() == KeyEvent.VK_C){
            //Se clona la muerte del personaje
            
            //Se inicializa el objeto para crear bjetos a clonar
            miMuerMag = new MuerteMago(jPpanel2);  
            //Se clona el objeto para la animacion de muerte
            miMuerte = miMuerMag.clone();
            //Se inicializa las imagenes del hilo
            miMuerte.aniMuertePer();
            jPpanel2.add(miMuerte);
            //Se mueve el hilo
            miMuerte.mover();
        }
 
            /*
            GolpeMago circulo = new GolpeMago(panel2);
            GolpePersonaje figura;
            
            
            figura = circulo.clonar();
            panel2.add(figura);
            figura.mover();
            */
            
           
    }//GEN-LAST:event_jPpanel1KeyPressed

    private void jPpanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPpanel1KeyReleased
       char letra = evt.getKeyChar();
       System.out.println(letra);
    }//GEN-LAST:event_jPpanel1KeyReleased

    private void jPpanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPpanel2KeyPressed

    }//GEN-LAST:event_jPpanel2KeyPressed

    private void jPpanel2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPpanel2KeyReleased

    }//GEN-LAST:event_jPpanel2KeyReleased

    public static void main(String args[]) {
        
      
        new Ventana().setVisible(true);
            
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPpanel1;
    private javax.swing.JPanel jPpanel2;
    private javax.swing.JPanel panelGeneral;
    // End of variables declaration//GEN-END:variables
}
