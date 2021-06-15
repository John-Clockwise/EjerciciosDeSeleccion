package codigomorse;

import java.util.ArrayList;
import java.util.Scanner;

public class CodigoMorse {

    public static void main(String[] args) {
        ListaMorse alfabetoMorse = new ListaMorse();
        ArrayList<String> letras = new ArrayList<>();
        ArrayList<String> Codigo = new ArrayList<>();

        Scanner leer = new Scanner(System.in);

        try {
            System.out.println("Convertir el texto en clave morse presione 1");
            System.out.println("Convertir clave morse en texto presione 2");
            int opcion = leer.nextInt();

            //System.out.println("Se escogio la opcion "+opcion);
            switch (opcion) {
                case 1:
                    System.out.println("Escriba el texto a convertir a clave morse");
                    leer.nextLine();
                    String texto = leer.nextLine();
                    // separar la cadena de texto en caracteres
                    for (int i = 0; i < texto.length(); i++) {
                        letras.add(i, String.valueOf(texto.charAt(i)).toUpperCase());
                    }
                    // convertir en clave morse 
                    String palabramorse = "";
                    for (int i = 0; i < letras.size(); i++) {

                        palabramorse += " " + String.valueOf(alfabetoMorse.lista.get(letras.get(i)));

                    }

                    System.out.println("La palabra en morse es : " + palabramorse);
                    break;
                case 2:
                    System.out.println("Escriba la clave morse para convertir a texto");
                    leer.nextLine();
                    String morse = leer.nextLine();

                    String[] codigos = morse.split(" ");

                    for (int i = 0; i < codigos.length; i++) {
                        Codigo.add(codigos[i]);
                    }
                    // convertir en texto
                    String palabratexto = "";
                    for (int i = 0; i < Codigo.size(); i++) {
                        palabratexto += String.valueOf(alfabetoMorse.listaalfabeto.get(Codigo.get(i)));
                    }
                    System.out.println("La palabra en texto es : " + palabratexto);

                    break;
                default:
                    System.out.println("Opcion no encontrada");
                    break;
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Se espera un dato numérico");
        }

    }

}
