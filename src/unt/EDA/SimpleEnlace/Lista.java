/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.EDA.SimpleEnlace;

/**
 *
 * @author juan
 */
public class Lista 
{
    protected Nodo inicio;
    int tamaño;

   public void agregarAlInicio(int dato)
   {
       inicio = new Nodo(dato, inicio);
       tamaño++;
   }
   
   public int eliminarAlInicio()
   {
       int retornarDato = inicio.getDato();
       if(estaVacia())
           inicio = null;
       else
       {
           inicio = inicio.getSiguiente();
           tamaño--; 
       }
       return retornarDato;
   }
    
   public void agregarAlFinal(int dato)
   {
       if(estaVacia())
       {
           agregarAlInicio(dato);
       }
       else
       { 
            Nodo auxiliar = new Nodo(dato, inicio);
            while(auxiliar.getSiguiente() != null)
            {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(new Nodo((dato), null));
            tamaño++;
       }
       
   }
   
   public int eliminarAlFinal()
   {
       int retornarDato = 0;
       if(estaVacia())
           inicio = null;
       else
       {
           Nodo temporal = inicio;
           Nodo auxiliar = inicio;
           while(auxiliar.getSiguiente() != null)
           {
               auxiliar = auxiliar.getSiguiente();
           }
           while(temporal.getSiguiente() != auxiliar)
           {
               temporal = temporal.getSiguiente();
           }
           retornarDato = auxiliar.getDato();
           temporal.setSiguiente(null);
           tamaño--;
       
       }
       return retornarDato;
      
   }
   
   public int contarNodos()
   {
       return tamaño; 
   }
   public void mostrarLista()
   {
        Nodo auxiliar = this.inicio;
        while(auxiliar != null)
        {
            System.out.print("[" + auxiliar.getDato()+ "]" + "---->");
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("");
   }
   
   public boolean estaVacia()
   {
       if (inicio == null)
           return true;
       return false;
   }
    
}
