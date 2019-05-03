/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.EDA.tp1.punto2;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        Lista listaPar = new Lista();
        Lista listaImpar = new Lista();
        Lista listaAuxiliar = new Lista();
        int opcion=0, elemento, auxiliar;
    
   
      
   do{
       try
       {
           opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar un elemento al inicio.\n"
                   + "2. Mostrar lista impar.\n"
                   + "3. Mostrar lista par.\n"
                   + "4. Salir","Menu de opciones",3));
       
       switch(opcion)
       {
           case 1:
               try
               {
                   elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: ", "Agregar un elemento al inicio",3));
                   listaAuxiliar.discriminoParidad(elemento,listaImpar,listaPar);        //Agregamos al nodo.
               }
               catch(NumberFormatException num)
               {
                   JOptionPane.showMessageDialog(null,"Error" + num.getMessage() );
               }
               
               break;
           case 2:
               listaImpar.mostrarLista();
               break;
           case 3:
               listaPar.mostrarLista();
               break;
           case 4:
               break;
           default:
               JOptionPane.showMessageDialog(null,"Opcion incorrecta");
       }
               
       }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error" + e.getMessage() );    
            
        }
   }while(opcion != 4);
}
}