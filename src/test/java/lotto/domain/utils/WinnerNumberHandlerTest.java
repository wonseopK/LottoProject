package lotto.domain.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class WinnerNumberHandlerTest {
    @DisplayName(",로 구분하여 입력한숫자를 List로 반환해주는 기능")
    @Test
    void name() {
        //given
        String inputNumbers = "1,2,3,4,5";

        //when
        List<Integer> winNumbers = WinnerNumberHandler.splitResultNumbers(inputNumbers);
        WinnerNumberHandler.splitResultNumbers(inputNumbers);
        //then
        Assertions.assertThat(winNumbers.get(0)).isEqualTo(1);
        Assertions.assertThat(winNumbers.get(1)).isEqualTo(2);
        Assertions.assertThat(winNumbers.get(2)).isEqualTo(3);
        Assertions.assertThat(winNumbers.get(3)).isEqualTo(4);
        Assertions.assertThat(winNumbers.get(4)).isEqualTo(5);


    }
}