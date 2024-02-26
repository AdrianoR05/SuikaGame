
package com.mycompany.suikagame;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Fruta extends Rectangle{
    
    public int x, y;
    public static int tamano = 15;
    private BufferedImage imagen;
    int contadorCaida = 0;
    boolean paredIzquierda, paredDerecha, piso;
    
    public Fruta(String rutaImagen){
        try{
            this.imagen = ImageIO.read(new File(rutaImagen));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void draw(Graphics2D F2){
        Image imagenEsc = this.imagen.getScaledInstance(tamano, tamano, Image.SCALE_SMOOTH);
        
        F2.drawImage(imagenEsc, x, y, null);
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void ColisionMov(){
        paredIzquierda = false;
        paredDerecha = false;
        piso = false;
        
        //Colision de pared izquierda
        if (x + 340 < ManejadorJuego.leftX){
            paredIzquierda = true;
        }
        if (x + 390 > ManejadorJuego.rightX){
            paredDerecha = true;
        }
        if (y + 700 > ManejadorJuego.bottomY){
            piso = true;
        }
    }
    
    

    public void updateXY(int direccion){ }
    
    public void update(){ 
        ColisionMov();
        if (KeyHandler.izquierda){
            if(paredIzquierda == false){
                x -= Fruta.tamano;
            }
            KeyHandler.izquierda = false;
        }
        if (KeyHandler.derecha){
            if(paredDerecha == false){
                x += Fruta.tamano;
            }
            KeyHandler.derecha = false;
        }
        
        contadorCaida++; //El contador aumenta en cada frame
        if(contadorCaida == ManejadorJuego.dropInterval){
            y += Fruta.tamano;
            contadorCaida = 0;
        }
        
    }
    
    
    
}
