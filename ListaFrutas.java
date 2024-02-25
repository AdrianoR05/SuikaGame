/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.suikagame;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author juans
 */
public class ListaFrutas {
    
      public static void main(String [] args){
       List<Frutas> listaFrutas= new ArrayList<>();
       listaFrutas.add(new Frutas("Datil" ));
       listaFrutas.add(new Frutas("Cotoperi" ));
       listaFrutas.add(new Frutas("Mamey" ));
       listaFrutas.add(new Frutas("Cereza" ));
       listaFrutas.add(new Frutas("Pumalaca" ));
       listaFrutas.add(new Frutas("Kiwi" ));
       listaFrutas.add(new Frutas("Parchita" ));
       listaFrutas.add(new Frutas("Mango"));
       listaFrutas.add(new Frutas("Coco"));
       listaFrutas.add(new Frutas("Patilla"));
       //recorrer por indice 
       for (int i=0; i<listaFrutas.size(); i++){
           System.out.println("prueba:" + listaFrutas.get(i).getNombre());
       }
    
       
    }
}
