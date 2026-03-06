public class Pila {
    private String[] elementos;
    private int tope;
    private int tamaño;

    public Pila(int tamaño) {
        this.tamaño = tamaño;
        elementos = new String[tamaño];
        tope = -1;
    }
}
