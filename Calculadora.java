import java.util.Scanner;

public class Calculadora {
    public static Scanner t = new Scanner(System.in);

    public static void Menu(){
        System.out.println("====  MENU   ====");
        System.out.println("1. Suma          ");
        System.out.println("2. Resta         ");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division      ");
        System.out.println("5. Salir         ");
        System.out.print("- Opcion: ");
    }
    public static void Suma(){
        int a, b, respuesta;
        System.out.print("Ingrese el primer numero: ");
        a = Integer.valueOf(t.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        b = Integer.valueOf(t.nextLine());
        respuesta = a + b;
        System.out.println("Respuesta: "+ respuesta);
    }
    public static void Resta(){
        int a, b, respuesta;
        System.out.print("Ingrese el primer numero: ");
        a = Integer.valueOf(t.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        b = Integer.valueOf(t.nextLine());
        respuesta = a - b;
        System.out.println("Respuesta: "+ respuesta);
    }
    public static void Multiplicacion(){
        int a, b, respuesta;
        System.out.print("Ingrese el primer numero: ");
        a = Integer.valueOf(t.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        b = Integer.valueOf(t.nextLine());
        respuesta = a * b;
        System.out.println("Respuesta: "+ respuesta);
    }
    public static void Division(){
        int a, b; 
        double respuesta;
        System.out.print("Ingrese el primer numero: ");
        a = Integer.valueOf(t.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        b = Integer.valueOf(t.nextLine());
        respuesta = a / b;
        System.out.println("Respuesta: "+ respuesta);
    }
    public static void Salir(){
        System.out.println("Gracias por usar el programa");
    }
    public static void Error(){
        System.out.println("Ingrese una opcion entre 1 a 5...");
    }
    public static void Inicio(){
        int op;
        do {
            Menu();
            op = Integer.valueOf(t.nextLine());
            switch (op) {
                case 1: Suma();
                    
                    break;
                case 2: Resta();

                    break;
                case 3:Multiplicacion();

                    break;
                case 4:Division();

                    break;
                case 5: Salir();
                    break;
                default: Error();
                    break;
            }

        } while (op!=5);
    }
    public static void main(String[] args) throws Exception {
       Inicio();
    }
}