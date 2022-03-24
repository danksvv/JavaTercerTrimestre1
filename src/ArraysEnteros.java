import java.util.Arrays;

public class ArraysEnteros {
    public static void main(String[] args) {

        int[] numeros = {12, 1, 42, 32, 43, 53, 121, 4, 94};
        String[] cadenas = {"Zapata", "Gomez", "Alvaro", "Hinostroza", "Sanchez", "Ayuso"};

        for(int enteros: numeros)
            System.out.println(enteros);

        for(String cadena : cadenas)
            System.out.println(cadena);

        // Métodos sort ordena un array
        Arrays.sort(numeros);
        Arrays.sort(cadenas);

        System.out.println("==============================");
        for(int enteros: numeros)
            System.out.println(enteros);

        for(String cadena: cadenas)
            System.out.println(cadena);

        System.out.println("==============================");

        // Metodo clone, clona arrays
        int [] numeros2 = numeros.clone();
        // clone, crea otro nuevo array con otra referencia
        for(int n : numeros2)
            System.out.println(n);

        System.out.println("==============================");
        // Metodo copyOfRange(array, ini, end)
        int[] numero3 = Arrays.copyOfRange(numeros2, 1, 3);

        for(int n : numero3)
            System.out.println(n);

        System.out.println(Arrays.toString(numeros));

    }
}
