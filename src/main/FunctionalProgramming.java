package main;

import java.util.List;

public class FunctionalProgramming {
    public static List<Integer> ObtenerParesDeLista(List<Integer> listaNumeros){
        return listaNumeros.stream().filter(n -> n%2==0).toList();
    }
    public static List<Integer> doblarNumeros(List<Integer> listaNumeros) {
        return listaNumeros.stream().map(l -> l * 2).toList();
    }
    public static int sumaEntre10y50(List<Integer> listaNumeros){
        return listaNumeros.stream().filter(n-> n>=10 && n<=50).mapToInt(Integer::intValue).sum();
    }
    public static List<Integer> normalizarLista(List<Integer> listaNumeros){
        return listaNumeros.stream().map(Math::abs).distinct().sorted().toList();
    }

}
