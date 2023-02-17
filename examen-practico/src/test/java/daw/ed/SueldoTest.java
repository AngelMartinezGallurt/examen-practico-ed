package daw.ed;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SueldoTest {
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("-- Inicio de las pruebas --");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("-- Fin de las pruebas --");
    }

    @Test
    @DisplayName("Primera prueba sueldo")
    void test1Ej9s() {
        assertNotEquals(1000, Sueldo.ej9('N', 1000, 1));
        // El test falla porque devuelve el sueldo sin modificar, cuando debería tener un sueldo diferente al introducido (1000). Esto se debe a que en el switch del comienzo se ejecuta siempre la por defecto, ya que las anteriores no tienen la sentencia break.
    }

    @Test
    @DisplayName("Segunda prueba sueldo")
    void test2Ej9s() {
        assertNotEquals(1001, Sueldo.ej9('E', 1001, 1));
        // El test falla porque devuelve el sueldo sin modificar, cuando debería tener un sueldo diferente al introducido (1001) Esto se debe a que en el switch del comienzo se ejecuta siempre la por defecto, ya que las anteriores no tienen la sentencia break.
    }

    @Test
    @DisplayName("Tercera prueba sueldo")
    void test3Ej9s() {
        assertEquals(1000, Sueldo.ej9('R', 1000, 1));
        // El test es correcto porque el sueldo no cambia
    }

    @Test
    @DisplayName("Cuarta prueba sueldo")
    void test4Ej9s() {
        assertEquals(1000, Sueldo.ej9('N', 1000, 0));
        // El test es correcto porque el sueldo no cambia
    }

    @Test
    @DisplayName("Quinta prueba sueldo")
    void test5Ej9s() {
        assertEquals(999, Sueldo.ej9('N', 999, 0));
        // El test es correcto porque el sueldo no cambia
    }
}
