import java.util.Scanner;
public class ListaEnlazadaSimple 
{
    private Nodo primero;
    public static void main(String[] args) 
    {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        //Scanner leer=new Scanner(System.in);
        /*boolean i=true;
        while(i==true)
        {
            System.out.println("\nBuenas buenas xd");
            System.out.println("Control");
            System.out.println("1) Insertar Cabeza Lista "
                    + "\n2) Insertar\n3) Eliminar\n4) Eliminar Cabeza Lista"
                    + "\n5) Vacia\n6) Buscar Lista\n7) Mostrar Lista"
                    + "\n8) Salir");
            int m=leer.nextInt();
            switch(m)
            {
                case 1:
                    System.out.println("Ingresa el dato:");
                    Object icl=leer.next();
                    lista.insertarCabezaLista(icl);
                    break;
                case 2:
                    System.out.println("Ingresa el dato existente y el valor a sustituir:");
                    Object ie=leer.next();
                    Object in=leer.next();
                    lista.insertar(ie, in);
                    break;
                case 3:
                    System.out.println("Ingresa valor a eliminar:");
                    Object e=leer.next();
                    lista.eliminar(e);
                    break;
                case 4:
                    System.out.println("El valor de la cabeza se eliminará");
                    lista.eliminarCabezaLista();
                    break;
                case 5:
                    System.out.println("Está vacia la lista?");
                    lista.vacia();
                    break;
                case 6:
                    System.out.println("Ingrese el elemento a buscar:");
                    Object b=leer.next();
                    lista.buscarLista(b);
                    break;
                case 7:
                    System.out.println("El contenido de la lista es el siguiente:\n");
                    lista.mostrarlista();
                    break;
                case 8:
                    System.out.println("\nAdios uwu");
                    System.exit(0);
                    break;
            }
        }*/
        
        System.out.println("Se insertó Verde, Azul, Amarillo");
        lista.insertarCabezaLista("Verde");
        lista.insertarCabezaLista("Azul");
        lista.insertarCabezaLista("Amarillo");
        
        lista.mostrarlista();
        
        System.out.println("\nSe eliminó el elemento Verde");
        lista.eliminar("Verde");
        
        lista.mostrarlista();
        
        System.out.println("\nSe insertó Rojo, Morado");
        lista.insertarCabezaLista("Rojo");
        lista.insertarCabezaLista("Morado");
        
        lista.mostrarlista();
        System.out.println(lista.buscarLista("Morado"));
        System.out.println("\nSe eliminó Rojo");
        lista.eliminar("Rojo");
        lista.mostrarlista();
        
        System.out.println("\nSe insertó Amarillo");
        lista.insertarCabezaLista("Amarillo 1");
        lista.mostrarlista();
        
    }
    public ListaEnlazadaSimple()
    {
        primero=null;
    }
    public boolean vacia()
    {
        return (primero==null);
    }
    public void insertarCabezaLista(Object d)
    {
        Nodo nuevoNodo=new Nodo(d);
        nuevoNodo.siguiente=primero;
        primero=nuevoNodo;
    }
    public Nodo eliminarCabezaLista()
    {
        Nodo temp=primero;
        primero=primero.siguiente;
        return temp;
    }
    public void mostrarlista()
    {
        System.out.print("Lista(primero -> ultimo): ");
        Nodo nodoActual=primero;
        while(nodoActual!=null)
        {
            nodoActual.mostrarNodo();
            nodoActual=nodoActual.siguiente;
        }
        System.out.println("");
    }
    public Nodo buscarLista(Object dato)
    {
        Nodo nodoActual=primero;
        while(!nodoActual.dato.equals(dato))
        {
            if(nodoActual.siguiente==null)
            {
                return null;
            }else{
                nodoActual=nodoActual.siguiente;
            }
        }
        return nodoActual;
    }
    public Nodo eliminar(Object dato)
    {
        Nodo nodoActual=primero;
        Nodo nodoAnterior=primero;
        while(!nodoActual.dato.equals(dato))
        {
            if(nodoActual.siguiente==null)
            {
                return null;
            }else{
                nodoAnterior=nodoActual;
                nodoActual=nodoActual.siguiente;
            }
        }
        if(nodoActual==primero)
        {
            primero=primero.siguiente;
        }else{
            nodoAnterior.siguiente=nodoActual.siguiente;
        }
        return nodoActual;
    }
    public Nodo insertar(Object valorExistente, Object valorNuevo)
    {
        Nodo nuevoNodo=new Nodo(valorNuevo);
        Nodo nodoActual=primero;
        while(!nodoActual.dato.equals(valorExistente))
        {
            if(nodoActual.siguiente==null)
            {
                return null;
            }else{
                nodoActual=nodoActual.siguiente;
            }
        }
        nuevoNodo.siguiente=nodoActual.siguiente;
        nodoActual.siguiente=nuevoNodo;
        return nuevoNodo;
    }
}
