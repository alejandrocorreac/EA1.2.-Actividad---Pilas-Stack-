public class Pila {
    private String[] elementos;
    private int tope;
    private int tamaño;

    public Pila(int tamaño) {
        this.tamaño = tamaño;
        elementos = new String[tamaño];
        tope = -1;

    }

    public void push(String dato) {
        if (tope < tamaño - 1) {
            tope++;
            elementos[tope] = dato;
        } else {
            System.out.println("La pila está llena");
        }
    }

    public String pop() {
        if (!isEmpty()) {
            String dato = elementos[tope];
            tope--;
            return dato;
        }
        return null;
    }

    public String peek() {
        if (!isEmpty()) {
            return elementos[tope];
        }
        return null;
    }

}
