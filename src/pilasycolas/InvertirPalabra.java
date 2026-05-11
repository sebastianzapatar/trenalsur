package pilasycolas;

import java.util.Stack;

public class InvertirPalabra {
    public String invertirPalabra(String palabra) {
        Stack<Character> stack = new Stack<>();
        char[] letras = palabra.toCharArray();
        String invertirPalabra = "";
        for (int i = 0; i < letras.length; i++) {
            stack.push(letras[i]);
        }
        while (!stack.isEmpty()) {
            invertirPalabra += stack.pop();
        }
        return invertirPalabra;

    }
}
