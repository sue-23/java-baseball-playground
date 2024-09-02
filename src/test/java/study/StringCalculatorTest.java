package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {


    private StringSplitter splitter = new StringSplitter();

    @DisplayName("공백 기준으로 문자열 쪼개기")
    @ParameterizedTest
    @CsvSource("1 + 2 + 3")
    void split_String(String input) {
        String[] splitOutput = splitter.split_input(input);
        String[] expectOutput = {"1", "+", "2", "+", "3"};
        assertThat(splitOutput).isEqualTo(expectOutput);
    }
}
