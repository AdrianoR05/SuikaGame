
package com.mycompany.suikagame;

//PlayManager dibujar contenedor, mover piezas, fusionar piezas, mostrar puntaje y movimiento

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;

public class ManejadorJuego {
    //Area de juego
    final int ancho = 360;
    final int largo = 600;
    public static int leftX;
    public static int rightX;
    public static int topY;
    public static int bottomY;
    private static Random rand = new Random();
    
    Fruta frutaActual;
    final int inicioFrutaX;
    final int inicioFrutaY;
    
    public static int dropInterval = 60; //FPS

    //Puntuacion
    int Puntuacion;
    int contadorCaida = 0;
   
    public ManejadorJuego() {
        //Area de juego frame
        leftX = (PanelJuego.ancho/2) - (ancho/2);
        rightX = leftX + ancho;
        topY= 50;
        bottomY = topY + largo;
        //Generar frutas mitad del contenedor y arriba
        inicioFrutaX = leftX - 165 - Fruta.tamano;
        inicioFrutaY = topY + Fruta.tamano;
        
        //Configurar fruta de inicio
        frutaActual = escogerFruta();
        frutaActual.setXY(inicioFrutaX, inicioFrutaY);
        
    }
    
    private Fruta escogerFruta(){
        //Elegir una frutica
        Fruta fruta = null;
        
        int i = rand.nextInt(5);
        
        switch(i) {
            case 0: fruta = new Datil("C:\\Users\\titor\\Documents\\Java\\SuikaGame\\src\\main\\java\\imagenes\\Datilcute.png"); break;
            case 1: fruta = new Cotoperi("C:\\Users\\titor\\Documents\\Java\\SuikaGame\\src\\main\\java\\imagenes\\Cotoperi.png"); break;
            case 2: fruta = new Mamey("C:\\Users\\titor\\Documents\\Java\\SuikaGame\\src\\main\\java\\imagenes\\Mamey.png"); break;
            case 3: fruta = new Cereza("C:\\Users\\titor\\Documents\\Java\\SuikaGame\\src\\main\\java\\imagenes\\cerezita.png"); break;
            case 4: fruta = new Pumalaca("C:\\Users\\titor\\Documents\\Java\\SuikaGame\\src\\main\\java\\imagenes\\Pumalaquita.png"); break;
        }
        return fruta;
    }
    public void update(){
        frutaActual.update();
        
    }
    
    
    public void draw(Graphics2D F2){
        //Dibujando el frame del area de juego
        F2.setColor(Color.red);
        F2.setStroke(new BasicStroke(5F));
        F2.drawRect(leftX-350, topY-4, ancho+8, largo+8);
        
        //Dibujar frame ciclo de frutas
        int x = rightX + 100;
        int y = bottomY - 200;
        F2.drawRect(x - 150, y, 450, 200);
        F2.setFont(new Font ("Arial", Font.PLAIN, 30));
        F2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        F2.drawString("CICLO DE FRUTAS", x - 45, y - 10);
        
        //Dibujar frame puntuacion
        F2.drawRect(x - 50, topY + 45, 200, 100);
        F2.drawString("PUNTUACIÓN", x - 50, y - 365);
        
        //Dibujar frame Siguiente fruta
        F2.drawRect( x - 50, topY + 200, 200, 150);
        F2.drawString("SIG. FRUTA", x - 40, y - 210);
        
        //Dibujar Fruta Actual
        if(frutaActual != null){
            frutaActual.draw(F2);
        }
    }
}
