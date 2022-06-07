public class Nodo
{
    public Object dato;
    public Nodo siguiente;
    public Nodo(Object d)
    {
        dato=d;
        siguiente=null;
    }
    public void mostrarNodo()
    {
        System.out.print("{"+dato+"}");
    }
}
