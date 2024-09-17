import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import stringCalculator.StringCalculator;
import static org.assertj.core.api.Assertions.*;


public class StringCalculatorTest extends IOTest {

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

        assertThat(inputs).isEqualTo(expected);

    }


    @DisplayName("문자열 배열내의 숫자와 연산자 분리")
    @ParameterizedTest
    @ValueSource(strings = {"1 + 2 + 3"})
        // 공백으로 구분된 문자열 전달
    void seperateNumbersAndOperator(String expression) {
        String[] expressionArray = expression.split(" ");

        Object[] result = stringCalculator.separateNumbersAndOperators(expressionArray);
        Integer[] resultNumbers = (Integer[]) result[0];
        String[] resultOperators = (String[]) result[1];

        Integer[] expectedNumbers = {1, 2, 3};
        String[] expectedOperators = {"+", "+"};

        assertThat(resultNumbers).isEqualTo(expectedNumbers);
        assertThat(resultOperators).isEqualTo(expectedOperators);


    }

    @DisplayName("실제 계산 처리")
    @ParameterizedTest
    @CsvSource({
            "'1 + 2 + 3', 6",
            "'10 - 5', 5",
            "'4 * 2', 8",
            "'20 / 4', 5",
            "'2 + 2 * 2', 8",
            "'1 + 2 * 3 / 3', 3"
    })
    void calculate(String expression,int expected) {
        systemIn(expression);
        String[] inputs = stringCalculator.inputExpression();
        Object[] seperated = stringCalculator.separateNumbersAndOperators(inputs);

        int result = stringCalculator.calculate(seperated);

        assertThat(result).isEqualTo(expected);


    }

}
