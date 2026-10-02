public class Recursion {

    /** Calcula n! (n factorial). */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n no puede ser negativo.");
        }
        if (n <= 1) {          // caso base: 0! = 1 y 1! = 1
            return 1;
        }
        return n * factorial(n - 1);
    }

    /** Suma los dígitos de un número entero no negativo. */
    public static int sumaDigitos(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n no puede ser negativo.");
        }
        if (n < 10) {          // caso base: un solo dígito
            return n;
        }
        return (n % 10) + sumaDigitos(n / 10);
    }

    /** Devuelve el texto invertido. */
    public static String invertirTexto(String s) {
        if (s.length() <= 1) { // caso base: "" o un solo carácter
            return s;
        }
        return invertirTexto(s.substring(1)) + s.charAt(0);
    }
}

