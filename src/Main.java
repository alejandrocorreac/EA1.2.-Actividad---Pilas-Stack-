import java.util.Scanner;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pila pilaAcciones = new Pila(100);
        Pila pilaRedo = new Pila(100);

        int opcion;

        do {

            System.out.println("\n--- EDITOR DE TEXTO ---");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer (Undo)");
            System.out.println("3. Rehacer (Redo)");
            System.out.println("4. Mostrar texto");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Escriba una línea: ");
                    String texto = sc.nextLine();
                    pilaAcciones.push(texto);
                    break;


            }
        }