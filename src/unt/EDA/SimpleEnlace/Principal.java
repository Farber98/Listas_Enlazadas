/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.EDA.SimpleEnlace;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Principal {
    
        public static void main(String[] args) {
   Lista unaLista = new Lista();
   
   int opcion = 0;
   int elemento, cantidad;
   int auxiliar;
   int modificacion;
   
        
   do{
       try
       {
           opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar un elemento al inicio.\n"
                   + "2. Mostrar los datos de la lista.\n"
                   + "3. Agregar un elemento al final\n"
                   + "4. Verificar si esta vacia\n"
                   + "5. Contar nodos\n"
                   + "6. Borrar nodo del inicio\n"
                   + "7. Borrar nodo al final\n"
                   + "8. Borrar nodo especifico\n"
                   + "9. Obtener nodo segun posicion\n"
                   + "10. Modificar nodo\n"
                   + "11. Borrar nodo por posicion\n"
                   + "12. Salir","Menu de opciones",3));
       
       switch(opcion)
       {
           case 1:
               try
               {
                   elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: ", "Agregar un elemento al inicio",3));
                   unaLista.agregarAlInicio(elemento);        //Agregamos al nodo.
               }
               catch(NumberFormatException num)
               {
                   JOptionPane.showMessageDialog(null,"Error" + num.getMessage() );
               }
               
               break;
           case 2:
               unaLista.mostrarLista();
               break;
           case 3:
               elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: ","Agregar un elemento al final",3));
               unaLista.agregarAlFinal(elemento);
               break;
           case 4:
               if(unaLista.estaVacia())
               {
                   JOptionPane.showMessageDialog(null,"La lista esta vacia","Verificar lista vacia",JOptionPane.INFORMATION_MESSAGE);
                   break;
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"La lista no esta vacia","Verificar lista vacia",JOptionPane.INFORMATION_MESSAGE);
                   break;
               }
           case 5:
               cantidad = unaLista.contarNodos();
               JOptionPane.showMessageDialog(null,"La cantidad de nodos en la lista es: "+ cantidad, "Contar nodos", JOptionPane.INFORMATION_MESSAGE);
               break;
           case 6:
               elemento = unaLista.eliminarAlInicio();
               JOptionPane.showMessageDialog(null,"El nodo eliminado es: "+ elemento,"Borrar nodo al inicio", JOptionPane.INFORMATION_MESSAGE);
               break;
           case 7:
               elemento = unaLista.eliminarAlFinal();
               JOptionPane.showMessageDialog(null, "El nodo eliminado es: "+ elemento, "Borrar nodo al final", JOptionPane.INFORMATION_MESSAGE);
               break;
//           case 8:
//               elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar elemento a eliminar: ", "Eliminar nodo en especifico", JOptionPane.QUESTION_MESSAGE));
//               unaLista.eliminarNodosPorValor(elemento);
//               JOptionPane.showMessageDialog(null, "El nodo eliminado es: "+ elemento, "Borrar nodo especifico", JOptionPane.INFORMATION_MESSAGE);
//               break;
//           case 9:
//               elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar posicion a retornar: ","Obtener nodo especifico", JOptionPane.INFORMATION_MESSAGE));
//               auxiliar = unaLista.obtener(elemento);
//               JOptionPane.showMessageDialog(null,"El nodo en la posicion "+ (elemento) + " es: " + auxiliar,"Obtener nodo especifico", JOptionPane.INFORMATION_MESSAGE );
//               break;
//           case 10:
//               elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar posicion a modificar: ","Modificar nodo", JOptionPane.INFORMATION_MESSAGE));
//               modificacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar nuevo elemento: ","Modificar nodo", JOptionPane.INFORMATION_MESSAGE));
//               unaLista.modificarNodo(elemento, modificacion);
//               break;
//          case 11:
//               elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar posicion a eliminar: ","Eliminar nodo", JOptionPane.INFORMATION_MESSAGE));
//               auxiliar = unaLista.eliminarNodoPorPosicion(elemento);
//               JOptionPane.showMessageDialog(null,"El nodo eliminado es: "+ auxiliar,"Eliminar nodo especifico", JOptionPane.INFORMATION_MESSAGE);
//                
//           case 12:
//               break;
           default:
               JOptionPane.showMessageDialog(null,"Opcion incorrecta");
       }
               
       }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error" + e.getMessage() );    
            
        }
   }while(opcion != 12);

    
}
}
