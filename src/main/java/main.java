import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        short choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\u001B[33m\u001B[44m¿Qué desea calcular?\n 1.- Sumar\n 2.- Restar\n 3.- Multiplicar\n 4.- Dividir\n 5.- Raiz Cuadrada\n 6.- Potenciar\n\n\n\n");
        choice = scanner.nextShort();
    }
}
