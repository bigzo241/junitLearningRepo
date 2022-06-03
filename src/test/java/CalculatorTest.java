import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private static Instant startedAt;
    private Calculator calculatorUnderTest;

    @BeforeEach
    public void initCalculator() {
        System.out.println("Appel avant chaque test");
        this.calculatorUnderTest= new Calculator();
    }

    @AfterEach
    public void afterRunningTest() {
        System.out.println("Appel apres chaque test");
    }

    @BeforeAll
    static public void initStartingTime() {
        System.out.println("Appel avant tous les tests");
        startedAt = Instant.now();
    }

    @AfterAll
    static public void showTestDuration() {
        System.out.println("Appel après tous les tests");
        Instant endedAt = Instant.now();
        long duration = Duration.between(startedAt, endedAt).toMillis();
        System.out.println(MessageFormat.format("Durée des tests : {0} ms", duration));
    }

    @Test
    public void testAddTwoPositiveNumbers() {
//        Initialisation des parametres
        int a = 3;
        int b = 2;

//        Agir
        int result = calculatorUnderTest.add(a, b);

//        Verification
//        assertEquals(5, result);
        assertThat(result).isEqualTo(5);
    }

    @ParameterizedTest(name = "{0} + {1} est égale à {2}")
    @CsvSource({"1, 2, 3", "50, 75, 125", "0, 0, 0", "1255, 7943, 9198"})
    public void testAddWithParameterized(int a, int b, int expectedResult) {
//        Arrange: geja fait
//        Act
        int result = calculatorUnderTest.add(a, b);

//        Assert
//        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void testMultiplyTwoNumbers() {
        //        Initialisation des parametres
        int a = 3;
        int b = 2;

//        Agir
        int result = calculatorUnderTest.multiply(a, b);

//        Verification
//        assertEquals(6, result);
        assertThat(result).isEqualTo(6);
    }

    @ParameterizedTest(name = "{0} * 0 doit être égal à 0")
    @ValueSource(ints = {1, 2, 42, 1000, 123})
    public void testMultiplyByZero(int arg) {
//        Arrange : déjà fait

//        Agir
        int result = calculatorUnderTest.multiply(arg, 0);

//        Vérification
        assertEquals(0, result);
        assertThat(result).isEqualTo(0);
    }

//    @Test
//    public void listDigits_shouldReturnsTheListOfDigits_ofPositiveInteger() {
//        // GIVEN
//        int number = 95897;
//
//        // WHEN
//        Set<Integer> actualDigits = calculatorUnderTest.digitsSet(number);
//
//        // THEN
//        assertThat(actualDigits).containsExactlyInAnyOrder(5, 7, 8, 9);
//    }

}
