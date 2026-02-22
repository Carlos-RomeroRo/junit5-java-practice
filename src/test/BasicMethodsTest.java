package test;

import main.BasicMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*; // importar todos los métodos de prueba que trae la clase Asertions

public class BasicMethodsTest {
    // Test #1 -> capicua
    @Test
    void shouldReturnTrueWhenNumberIsCapicua(){
        assertTrue(BasicMethods.capicua(11));
        assertTrue(BasicMethods.capicua(123321));
    }
    // Special Cases
    @Test
    void shouldReturnTrueForSingleDigit() {
        assertTrue(BasicMethods.capicua(7));
    }
    @Test
    void shouldHandleZero() {
        assertTrue(BasicMethods.capicua(0));
    }
    @Test
    void shouldReturnFalseWhenNumberIsNotCapicua(){
        assertFalse(BasicMethods.capicua(12));
        assertFalse(BasicMethods.capicua(98765400));
        assertFalse(BasicMethods.capicua(-121));
    }

    // Test #2 -> palindormo
    @Test
    void shouldReturnTrueWhenWordIsPalindorme(){
        assertTrue(BasicMethods.palindormo("anita lava la tina"));
        assertTrue(BasicMethods.palindormo("yo hago yoga hoy"));
    }
    // Special cases
    @Test
    void shouldReturnTrueWhenPalindromeSpecial(){
        assertTrue(BasicMethods.palindormo("AnitA Lava La tInA"));
        assertTrue(BasicMethods.palindormo("Dábale arroz a la zorra el abad"));
    }
    @Test
    void shouldReturnTrueIgnoringPunctuation() {
        assertTrue(BasicMethods.palindormo("¿Acaso hubo búhos acá?"));
    }
    // Exceptions
    @Test
    void shouldThrowExceptionWhenNull() {
        assertThrows(IllegalArgumentException.class,
                () -> BasicMethods.palindormo(null));
    }
    // Cases where it should come out as false
    @Test
    void shouldReturnFalseWhenWordIsPalindorme(){
        assertFalse(BasicMethods.palindormo("anita lavaba la tina"));
        assertFalse(BasicMethods.palindormo("yo iba a hacer yoga hoy"));
    }

}
