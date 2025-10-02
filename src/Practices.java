import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {
        // imprime En la consola hola mundo
        System.out.println("Hello, World!");
        // imprime en la consola mi nombre
        System.out.println("Alexander Azocar");
        // imprime en la consola mi edad
        System.out.println("Mi Edad es de " + "22 " + "años");
        /*
         * Esta es mi practica 1
         */
        System.out.println("Color favorito" + " Verde" + " ACaracas");
        System.err.println("Este mensaje es de Error");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Hola " + nombre + ", Bienvenido a Java");
        entrada.close();
        System.out.println(":" + "-" + ")");
    }
}
