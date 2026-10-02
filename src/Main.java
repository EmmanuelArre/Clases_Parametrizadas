public class Main {
    public static void main(String[] args) {
        Boveda<Integer> numeros = new BovedaArreglo<>(3);
        Boveda<String> textos = new BovedaArreglo<>(3);

        numeros.guardar(Recursion.factorial(5));       // 120
        numeros.guardar(Recursion.sumaDigitos(493));   // 16
        textos.guardar(Recursion.invertirTexto("boveda")); // "adevob"

        System.out.println(numeros.sacar()); // 16
        System.out.println(numeros.sacar()); // 120
        System.out.println(textos.sacar());  // adevob
    }
}

