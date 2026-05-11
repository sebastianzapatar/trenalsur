package pilasycolas;

import java.util.Stack;

public class Balanceado {
    public static boolean balenceado(String w){
        char[] simbolos = w.toCharArray();
        Stack<Character> paren = new Stack<>();
        Stack<Character> brackets = new Stack<>();
        Stack<Character> nfi = new Stack<>();
        for(int i = 0; i<simbolos.length; i++){
            if(simbolos[i] == '('){
                paren.push(simbolos[i]);
            }
            else if(simbolos[i] == ')'){
                if(paren.isEmpty()){
                    return false;
                }
                paren.pop();
            }
            else if(simbolos[i] == '['){
                brackets.push(simbolos[i]);

            }
            else if(simbolos[i] == ']'){
                if(brackets.isEmpty()){
                    return false;
                }
                brackets.pop();
            }
            else if(simbolos[i] == '{'){
                nfi.push(simbolos[i]);
            }
            else if(simbolos[i] == '}'){
                if(nfi.isEmpty()){
                    return false;
                }
                nfi.pop();
            }

        }
        return paren.isEmpty() &&
                brackets.isEmpty() &&
                nfi.isEmpty();
    }
}
