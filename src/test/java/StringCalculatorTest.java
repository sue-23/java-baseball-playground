import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import stringCalculator.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringCalculatorTest extends IOTest{

    private StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();

    }

    @DisplayName("input 값이 공백 기준으로 문자열 배열로 저장")
    @ParameterizedTest
    @ValueSource(strings = {"1 + 2 + 3"})
    void splitInput(String input) {
        systemIn(input);
        String[] inputs = stringCalculator.inputExpression();
        String[] expected = {"1", "+", "2", "+", "3"};

        assertArrayEquals(expected, inputs);

    }

}
