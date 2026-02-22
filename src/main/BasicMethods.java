package main;

import java.util.List;
import java.text.Normalizer;

public class BasicMethods {

    public static boolean capicua(int numero){
        int numeroAComparar = 0, ultimaUnidad=0;
        int numeroAux = numero;
        while(numeroAux >= 1){
            ultimaUnidad = numeroAux % 10;
            numeroAux /=10;
            numeroAComparar = (numeroAComparar*10)+ultimaUnidad;
        }
        if(numero == numeroAComparar) {
            return true;
        }
        return false;
    }
    public static Boolean palindormo (String frase){
        if (frase == null){
            throw new IllegalArgumentException("La frase no puede ser NULL");
        }
        // 1). Elimina tildes
        String sinTildes = Normalizer.normalize(frase,Normalizer.Form.NFD) // Separa las letras del acento, por ejemplo "a" + "´"
                .replaceAll("\\p{InCombiningDiacriticalMarks}+",""); // InCombiningDiacriticalMarks, es una EXP regular regex

        // 2). Quitar todo lo que no sea letra o número
        String limpio = sinTildes
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        // 3). Invertir la frase
        String invertido = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(invertido);
    }
    public static int sumaNumeros(int n){ // solamente usando operaciones matemamticas
        int aux = n, acumulador = 0;
        while(aux > 0){
            acumulador += aux % 10;
            aux/=10;
        }
        return acumulador;
    }
    public static int conteoRepsEnLista(List<Integer> listaNumeros, int n){
        // Contar cuantas veces aparece N en un arreglo
        int contador=0;
        for(int i=0; i<listaNumeros.size(); i++){
            if(listaNumeros.get(i)==n){
                contador++;
            }
        }
        return contador;
    }
}
