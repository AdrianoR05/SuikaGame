
package com.mycompany.suikagame;

import com.jogamp.newt.event.KeyEvent;
import java.awt.event.KeyListener;



public class KeyHandler implements KeyListener {
    
    public static boolean izquierda, derecha;

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_A){
            izquierda = true;
        }
        if(code == KeyEvent.VK_D){
            derecha = true;
        }
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
}
