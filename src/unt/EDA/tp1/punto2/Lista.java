package unt.EDA.tp1.punto2;

/**
 *
 * @author juan
 */
public class Lista 
{
    protected Nodo inicio; 
    protected Nodo fin;             //Punteros para saber donde esta el inicio y el fin.

    public Lista() 
    {
        inicio = null;       //Apunto los punteros a null.
        fin = null;
    }
    
    public boolean esPar(int dato)
    {
        if((dato%2)==0)
            return true;
        return false;
    }
     public void agregarNodoAlInicio(int dato)    
    {
        Nodo unNodo = new Nodo(dato);        //Creamos un nodo al inicio
        unNodo.setSiguiente(this.inicio);
        this.inicio = unNodo;
    }
        
    public void discriminoParidad(int dato, Lista listaImpar, Lista listaPar)       //VER COMO HACER PARA MANDAR SOLO LAS DOS LISTAS.
    {
        Nodo unNodo = new Nodo(dato);
        if(esPar(dato))
            listaPar.agregarNodoAlInicio(dato);
        else
            listaImpar.agregarNodoAlInicio(dato);
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
}