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

                case 2:
                    if (!pilaAcciones.isEmpty()) {
                        String deshacer = pilaAcciones.pop();
                        pilaRedo.push(deshacer);
                        System.out.println("Se deshizo: " + deshacer);
                    } else {
                        System.out.println("No hay acciones para deshacer");
                    }
                    break;

                case 3:
                    if (!pilaRedo.isEmpty()) {
                        String rehacer = pilaRedo.pop();
                        pilaAcciones.push(rehacer);
                        System.out.println("Se rehizo: " + rehacer);
                    } else {
                        System.out.println("No hay acciones para rehacer");
                    }
                    break;

                case 4:
                    System.out.println("\nTexto actual:");
                    pilaAcciones.mostrar();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);

        sc.close();
    }