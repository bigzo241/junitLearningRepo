import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MathsCalculTest {

    private static MathsCalcul mathsCalcul;

    @BeforeAll
    public static void init() {
        MathsCalculTest.mathsCalcul = new MathsCalcul();
    }

    @ParameterizedTest(name = "factoriel de {0} : {1}")
    @CsvSource({"0, 1", "1, 1", "4, 24"})
    public void testFact(int x, long y) {
//        Arrange

//        Act
        long result = MathsCalculTest.mathsCalcul.fact(x);

//        Assert
        Assertions.assertThat(result).isEqualTo(y);
    }
}
