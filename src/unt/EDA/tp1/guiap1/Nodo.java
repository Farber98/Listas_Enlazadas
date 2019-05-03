/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.EDA.tp1.guiap1;

import unt.EDA.tp1.punto1.*;

/**
 *
 * @author juan
 */
public class Nodo 
{
    private int dato;
    private Nodo siguiente;      //Puntero para enlazar nuestros diferentes nodos.

    public Nodo(int dato)       //Constructor para insertar al final.
    {
        this.dato = dato;   
        this.siguiente = null;
    }

    public Nodo(int dato, Nodo siguiente)   //Constructor para insertar al inicio.
    {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
}
