package codigomorse;

import java.util.Hashtable;

public class ListaMorse {

    Hashtable lista = new Hashtable();
    Hashtable listaalfabeto = new Hashtable();

    public ListaMorse() {
        // morse
        lista.put("A", ".-");
        lista.put("B", "-...");
        lista.put("C", "-.-.");
        lista.put("D", "-..");
        lista.put("E", ".");
        lista.put("F", "..-.");
        lista.put("G", "--.");
        lista.put("H", "....");
        lista.put("I", "..");
        lista.put("J", ".---");
        lista.put("K", "-.-");
        lista.put("L", ".-..");
        lista.put("M", "--");
        lista.put("N", "-.");
        lista.put("O", "---");
        lista.put("P", ".--.");
        lista.put("Q", "--.-");
        lista.put("R", ".-.");
        lista.put("S", "...");
        lista.put("T", "-");
        lista.put("U", "..-");
        lista.put("V", "...-");
        lista.put("W", ".--");
        lista.put("X", "-..-");
        lista.put("Y", "-.--");
        lista.put("Z", "--..");
        lista.put(" ", "/");
        // Numeros
        lista.put("1", ".----");
        lista.put("2", "..---");
        lista.put("3", "...--");
        lista.put("4", "....-");
        lista.put("5", ".....");
        lista.put("6", "-....");
        lista.put("7", "--...");
        lista.put("8", "---..");
        lista.put("9", "----.");
        lista.put("0", "-----");

        listaalfabeto.put(".-", "A");
        listaalfabeto.put("-...", "B");
        listaalfabeto.put("-.-.", "C");
        listaalfabeto.put("-..", "D");
        listaalfabeto.put(".", "E");
        listaalfabeto.put("..-.", "F");
        listaalfabeto.put("--.", "G");
        listaalfabeto.put("....", "H");
        listaalfabeto.put("..", "I");
        listaalfabeto.put(".---", "J");
        listaalfabeto.put("-.-", "K");
        listaalfabeto.put(".-..", "L");
        listaalfabeto.put("--", "M");
        listaalfabeto.put("-.", "N");
        listaalfabeto.put("---", "O");
        listaalfabeto.put(".--.", "P");
        listaalfabeto.put("--.-", "Q");
        listaalfabeto.put(".-.", "R");
        listaalfabeto.put("...", "S");
        listaalfabeto.put("-", "T");
        listaalfabeto.put("..-", "U");
        listaalfabeto.put("...-", "V");
        listaalfabeto.put(".--", "W");
        listaalfabeto.put("-..-", "X");
        listaalfabeto.put("-.--", "Y");
        listaalfabeto.put("--..", "Z");
        listaalfabeto.put("/", " ");
        listaalfabeto.put(" ", " ");

        // Numeros
        listaalfabeto.put(".----", "1");
        listaalfabeto.put("..---", "2");
        listaalfabeto.put("...--", "3");
        listaalfabeto.put("....-", "4");
        listaalfabeto.put(".....", "5");
        listaalfabeto.put("-....", "6");
        listaalfabeto.put("--...", "7");
        listaalfabeto.put("---..", "8");
        listaalfabeto.put("----.", "9");
        listaalfabeto.put("-----", "0");

    }

}
