package main;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Método 1: Revisar si un número es o no es capicúa
        int numero = 12345;
        if(BasicMethods.capicua(numero)) {
            System.out.println("Son números capicúa");
        }else{
            System.out.println("NO Son números capicúa");
        }

        //Método 2: Revisar una frase clasifica como PALINDROMO
        if(BasicMethods.palindormo("Anita lava la tina")){
            System.out.println("La frase enviada es un PALINDROMO");
        }else{
            System.out.println("La frase enviada NO ES UN PALINDROMO");
        }

        // Método 3: Sumar los digitos que se encuentra en un número N pasado por parametros
        System.out.println("La suma de los numeros es : "+ BasicMethods.sumaNumeros(11122113));

        // Método 4: Dada una lista de enteros ver cuantas veces se repite un número N
        //definimos la lista y numero de reps
        List<Integer> listaNumeros = List.of(1, 5, 3, 4, 5, 5, 7);
        int n = 4;
        System.out.println("El número de veces que sale el "+n+" es: "+ BasicMethods.conteoRepsEnLista(listaNumeros,n));

        // Método 5: Dada una lista de números retornar otra lista pero con los números pares (programación funcional)
        List<Integer> listaInicial= List.of(1, 5, 3, 4, 5, 5, 2);
        List<Integer> listaPares =  FunctionalProgramming.ObtenerParesDeLista(listaInicial);
        System.out.println("Lista inicia: "+listaInicial);
        System.out.println("Los pares encontrados fueron: "+listaPares);

          // Método 6: Dada una lista de enteros, devolver una nueva lista con cada número multiplicado por 2. (programación funcional)
          List<Integer> listaBase = List.of(1, 5, 3, 4, 5, 5, 2);
          System.out.println("Lista base: "+listaBase);
          System.out.println("Los pares encontrados fueron: "+ FunctionalProgramming.doblarNumeros(listaBase));

          // Método 7: Sumar solo los números: mayores que 10 menores que 50 (programación funcional)
          List<Integer> listaRango = List.of(12,20,9,8,22,55,45); // 99
          System.out.println("Lista base: "+listaRango);
          System.out.println("Sumatoria de números dentro del rango (10-50): "+ FunctionalProgramming.sumaEntre10y50(listaRango));

        // Método 8: pasar todos los números a su valor absoluto y eliminar duplicados (programación funcional)
        List<Integer> numeroSinNormalizar = List.of(1,2,-1,0,4,10,1,-3,-2);
        System.out.println("Lista base: "+numeroSinNormalizar);
        System.out.println("Lista de número normalizados: "+ FunctionalProgramming.normalizarLista(numeroSinNormalizar));

    }

}
