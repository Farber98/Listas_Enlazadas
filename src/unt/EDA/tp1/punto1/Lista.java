/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.EDA.tp1.punto1;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Lista 
{
    int tamaño;
    protected Nodo inicio; 
    protected Nodo fin;             //Punteros para saber donde esta el inicio y el fin.

    public Lista() 
    {
        inicio = null;       //Apunto los punteros a null.
        fin = null;
        tamaño = 0;
    }
    
    
    public void agregarNodoAlInicio(int dato)    
    {
        if(listaVacia())
        {
            inicio = new Nodo (dato, inicio);       // Inicio ya no apunta a null sino al nuevo nodo. 
            fin = inicio;                           // Fin apunta al mismo nodo al ser el unico.
        }
        else
        {
            inicio = new Nodo (dato, inicio);       //Inicio apunta al nuevo nodo.
        }
        tamaño++;
        
    }
    
    public void agregarNodoAlFinal(int dato)
    {
        if(listaVacia())                      
        {
            inicio=fin=new Nodo(dato);      //Si la lista esta vacia, incio y fin apuntan al mismo nodo.
            
        }
        else
        {
           fin.siguiente = new Nodo (dato);   //Creamos un nuevo nodo y enlazamos con fin.
           fin = fin.siguiente;               //Asignamos a fin en nuestro nuevo nodo.
        }
        tamaño++;
    }
    
    public int contarNodos()       
    {
        return tamaño;
    }
    
    public int eliminarNodoAlInicio()
    {
        int datoEliminado = inicio.dato;
        if(tamaño == 1)
        {
            inicio = null;      //Si la lista tiene solo un dato, lo asignamos en null.
        }
        else
        {
            inicio = inicio.siguiente;      //Accedemos al siguiente del nodo al cual apunta inicio.
        }
        tamaño--;
        return datoEliminado;
    }
    
    public int eliminarNodoAlFinal()        
    {
        int eliminarDato = fin.dato;        //Asignamos el dato del final a un entero para despues retornarlo y poder decir cual fue el eliminado.
        if(tamaño == 1)
        {
            inicio = fin = null;      //Al ser un unico dato, lo asignamos a null. Inicio y fin apuntan a lo mismo.
        }
        else
        {
           Nodo temporal = inicio;              //Creamos un nodo temporal en el inicio para recorrer nuestos nodos.
           while(temporal.siguiente != fin)     //Iteramos hasta que nuestro nodo temporal situado en el inicio llega hasta el nodo anterior a fin.
           {
               temporal = temporal.siguiente;   //Manera de recorrer la lista mediante los enlaces.
           }
           fin = temporal;              //Situamos a fin en una posicion antes de la que estaba
           fin.siguiente = null;        //Situamos el siguiente de fin en null.
        }
        tamaño--;
        return eliminarDato;            //Retornamos el dato eliminado
    }
    public void modificarNodo(int posicion,int modificacion)    //El metodo recibe la posicion a modificar y el dato de modificacion.
    {
          int contador=0;
        Nodo actual = new Nodo(modificacion);            //Creamos un nodo auxiliar con el dato de la modificacion.
        actual = inicio;
        while(contador<posicion)                                  
        {
            actual = actual.siguiente;                //Recorremos nuestra lista hasta apuntar a la posicion deseada.
            contador++;
        }
        actual.dato = modificacion;                  //Cuando llegamos a la posicion deseada, modificamos el dato que habia por la nueva modificacion.
                
    }
    
    
    public int obtener(int indice)      //Funcion recibe la posicion que deseamos devolver.
    {
        int contador = 0;           
        Nodo temporal = inicio;         //Apuntamos un nodo temporal en el inicio
        while(contador < indice)        
        {
            temporal = temporal.siguiente;      //Recorremos la lista hasta que apuntamos a la posicion deseada
            contador ++;
        }
        return temporal.dato;                  //Devolvemos el dato deseado.
    }
    
    public void eliminarNodosPorValor(int dato)            //Ver como hacer para eliminar varios a la vez.
    {
        if(!listaVacia())
        {
            if(inicio == fin && dato == inicio.dato)
                inicio=fin=null;
            else if(dato == inicio.dato)
                inicio = inicio.siguiente;
            else
            {
                Nodo anterior,temporal;
                anterior = inicio;
                temporal = inicio.siguiente;
                while(temporal != null && temporal.dato != dato)
                {
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                if(temporal != null)
                {
                    anterior.siguiente = temporal.siguiente;
                    if(temporal == fin)
                    {
                        fin = anterior;
                    }
                }   
            }
                
        }
        
    }
    
    public int eliminarNodoPorPosicion(int posicion)  //DUDA: CORREGIR, MUESTRA BIEN PERO NO REALIZA BIEN LA OP.    
    {
        int datoARetornar;
        int contador = 0;
        Nodo auxiliar = inicio;         //Apunto el nodo auxiliar a inicio
        if(tamaño == 1)
        {
            datoARetornar = inicio.dato;    //Almaceno el valor antes de desapuntarlo.
            inicio=fin=null;
            return datoARetornar;           //Devuelvo el valor eliminado
        }
        else
        {
            while(contador<posicion)      
            {
                auxiliar = auxiliar.siguiente;       //Recorro la lista hasta posicionarme en la posicion anterior.
                contador++;
            }
            datoARetornar = auxiliar.dato;  //Agarro el dato que tenia auxiliar para mostrarlo luego.
            auxiliar.siguiente = null;      //Lo saco de la direccion de memoria y el garbage collector lo retira.
            return datoARetornar;           //Devuelvo el valor eliminado.
        }
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
    
    public boolean listaVacia()
    {
        if(inicio==null)
            return true;        //Verifico si la lista esta vacia.
        return false;
    }
    
    
}
