import java.util.HashMap;
import java.util.Map;

public class IsAnagramReto {

    // Función para comprobar si `X` e `Y` son anagramas o no
    public static boolean isAnagram(String X, String Y)
    {
        // caso base
        if (X == null || Y == null) {
            return false;
        }

        // si la longitud de X no es la misma que la de Y, no pueden ser un anagrama
        if (X.length() != Y.length()) {
            return false;
        }

        // crea un mapa vacio
        Map<Character, Integer> freq = new HashMap<>();

        // mantener un conteo de cada carácter de `X` en el mapa
        for (char c: X.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // hacer para cada caracter `y` de `Y`
        for (char c: Y.toCharArray())
        {
            // si `y` no se encuentra en el mapa, es decir, `y` no está presente
            // en la string `X` o tiene más ocurrencias en la string `Y`
            if (!freq.containsKey(c)) {
                return false;
            }

            // disminuye la frecuencia de `y` en el mapa
            freq.put(c, freq.get(c) - 1);

            // si su frecuencia se vuelve 0, lo borra del mapa
            if (freq.get(c) == 0) {
                freq.remove(c);
            }
        }

        // devuelve verdadero si el mapa se vacía
        return freq.isEmpty();
    }

    public static void main(String[] args) {

        String X = "tommarvoloriddle";        // Tom Sorvolo Acertijo
        String Y = "iamlordvoldemort";        // Soy Lord Voldemort

        if (isAnagram(X, Y)) {
            System.out.print("Anagram");
        }
        else {
            System.out.print("Not an Anagram");
        }

    }


}
