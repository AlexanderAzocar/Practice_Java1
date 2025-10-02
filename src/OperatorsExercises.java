public class OperatorsExercises {
    public static void main(String[] args) {
        // operacion aritmetica
        var b = 27;
        var c = 58;
        c = b + c;
        System.out.println("El resultado de la suma es: " + c);
        System.out.println(b - c);
        System.out.println(b * c);
        System.out.println(b / c);
        System.out.println(b % c);

        // operacion de asignacion
        var d = 27;
        var e = 04;
        c += b;
        var f = b;
        f += c;

        //comparaciones verdaderas
        System.out.println(d != e);
        System.out.println(d > e);
        System.out.println(d > e || d < e);
        
        //comparaciones falsas
        System.out.println(d == e);
        System.out.println(d < e ||  c < e);
        System.out.println(d > e && f < e);

        // usando and
        System.out.println(c > b && c > e);

        // usando or
        System.out.println(d > e || c < e);

        // combinando operadores logicos
        int nota = 20;
        var asistencia = 90;
        
        if(nota >= 15 || asistencia >= 75 && nota<=17){
            System.out.println("El estudiante esta aprobado");
        } else {
            System.out.println("El estudiante esta reprobado");
        }
    }
}
