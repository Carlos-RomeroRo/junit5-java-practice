package test;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import main.FunctionalProgramming;

public class FunctionalProgrammingTest {
    // Test #1 -> ObtenerParesDeLista
    @Test
    void shouldReturnTrueWhenPairsOnList(){
        List ListTest = List.of(1,2,3,4,5,6,7,8,9,10);
        List ListWait = List.of(2,4,6,8,10);
        List<Integer> resultado = FunctionalProgramming.ObtenerParesDeLista(ListTest);
        assertEquals(ListWait, resultado);
    }
    @Test
    void shouldReturnFalseWhenPairsOnLists(){
        List ListTest = List.of(1,2,3,4,5,6,7,8,9);
        List ListWait = List.of(1,3,7,9);
        List<Integer> resultado = FunctionalProgramming.ObtenerParesDeLista(ListTest);
        assertNotEquals(ListWait, resultado);
    }
    // Test #2 -> Doblar números en una lista
    @Test
    void shouldReturnTrueDoubleNumber(){
        List ListTest = List.of(1,2,3,4,5);
        List ListWait = List.of(2,4,6,8,10);
        List<Integer> resultado = FunctionalProgramming.doblarNumeros(ListTest);
        assertEquals(ListWait, resultado);
    }
    @Test
    void shouldReturnFalseDoubleNumber(){
        List ListTest = List.of(1,2,3,4,5);
        List ListWait = List.of(1,22,68,83,10);
        List<Integer> resultado = FunctionalProgramming.doblarNumeros(ListTest);
        assertNotEquals(ListWait, resultado);
    }
    // Test #3 -> Suma de números entre 10-50
    @Test
    void shouldReturnTrueSumBetween10and50(){
        List ListTest = List.of(1,22,48,33,9);
        assertEquals(FunctionalProgramming.sumaEntre10y50(ListTest),103);
    }
    @Test
    void shouldReturnFalseSumBetween10and50(){
        List ListTest = List.of(1,22,48,33,9);
        assertNotEquals(FunctionalProgramming.sumaEntre10y50(ListTest),33);
    }
    // Test #4 -> Lista estandarizada
    @Test void shouldReturnTrueStandarizedList(){
        List ListWithOutStandarized = List.of(1,2,3,-1,-2,-3,0,3,3,1,2);
        List ListStandarized = List.of(0,1,2,3);
        assertEquals(ListStandarized, FunctionalProgramming.normalizarLista(ListWithOutStandarized));
    }
    @Test void shouldReturnFalseStandarizedList(){
        List ListWithOutStandarized = List.of(1,2,3,-1,-2,-3,0,3,3,1,2);
        List ListStandarized = List.of(-1,-2,-3,0,1,2,3);
        assertNotEquals(ListStandarized, FunctionalProgramming.normalizarLista(ListWithOutStandarized));
    }
}
