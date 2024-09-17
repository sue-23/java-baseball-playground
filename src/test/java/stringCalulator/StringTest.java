package stringCalulator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }


    @Test
    void replace2(){
        //"1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
        //"1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다

        String actual = "1,2";
        String[] array1 = actual.split(",");
        assertThat(array1).contains("1");

        String actual2 = "1";
        String[] array2 = actual2.split(",");
        assertThat(array2).containsExactly("1");

    }

    @Test
    void replace3(){
//        "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.

        String actual = "(1,2)";
        String result = actual.substring(1,4);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("특정 위치 문자 가져오기")
    void replace4() {
//        "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
//        String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
//        JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.

        String actual = "abc";
        //범위 안의 인덱스 문자 추출
        char result = actual.charAt(2);
        assertThat(result).isEqualTo('c');
//        //볌위 밖의 인덱스 문자 추출
        assertThatThrownBy(() -> {
            actual.charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("index out of range");

//        assertThat(result).isEqualTo('c');


    }
}
