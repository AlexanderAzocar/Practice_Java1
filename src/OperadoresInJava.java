public class OperadoresInJava {

    public static void main(String[] args) {

        // Operadores Aritmeticos
        var a = 15;
        var b = 27;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));
        System.out.println("Incremento: " + (++a));
        System.out.println("Decremento: " + (--b));

        // operadores de Asignacion
        var c = 27;
        var d = 04;

        c += d; // c = c + d
        System.out.println("Resultado de la suma: " + c);
        c -= d; // c = c - d
        System.out.println("Resultado de la resta: " + c);
        c *= d; // c = c * d
        System.out.println("Resultado de la multiplicacion: " + c);
        c /= d; // c = c / d
        System.out.println("Resultado de la division: " + c);
        c %= d; // c = c % d
        System.out.println("Resultado del modulo: " + c);

        // operadores de Comparacion
        var e = 10;
        var f = 6;

        System.out.println("e es igual a f: " + (e == f));
        System.out.println("e es diferente a f: " + (e != f));
        System.out.println("e es mayor a f: " + (e > f));
        System.out.println("e es menor a f: " + (e < f));
        System.out.println("e es mayor o igual a f: " + (e >= f));
        System.out.println("e es menor o igual a f: " + (e <= f));

        // operadores Logicos son expresiones booleanas
        var g = 27;
        var h = 9;

        System.out.println(true && true);
        System.out.println(true && false);
        /*
         Puerta logica "AND" o "Y", los dos tienen que ser verdaderos 
         a ser verdad de lo contrario es False*/

        System.out.println(true || false);
        System.out.println(false || false);

        /*
         Puerta logica "OR" o "O", con que uno sea verdadero es verdad
         a ser falso de lo contrario es False
         */
        System.out.println( 3 > 2 && 3 == 5);
        System.out.println(3 > 2 || 3 == 5);

        /* puerta logica "No" o "Not" es que diga que es diferente 
        del valor original ejemplo */ 
    
        System.out.println(!true);
        System.out.println(!false);

        //Operadores Unarios
        var i = 3;
        var j = -4;

        System.out.println(+j);
        System.out.println(-j);

        System.out.println(--i); // se resta antes de imprimir
        System.out.println(++i); // se suma antes de imprimir 
        System.out.println(i++); // se imprime el valor de i y luego se suma
        System.out.println(i--); // se imprime el valor de i y luego se resta  
    
    }

}
