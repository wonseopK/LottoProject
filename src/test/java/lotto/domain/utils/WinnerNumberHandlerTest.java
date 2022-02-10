package lotto.domain.utils;

import lotto.domain.lottoResult.WinnerNumber;
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
    @DisplayName("당첨 번호를 입력받아 당첨번호 객체를 만드는 기능 테스트")
    @Test
    void name2() {
        //given
        String inputNumbers = "1,2,3,4,5,6";
        //when
        WinnerNumber winnerNumber = WinnerNumberHandler.winnerNumberSaver(inputNumbers);

        //then
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(0)).isEqualTo(1);
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(1)).isEqualTo(2);
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(2)).isEqualTo(3);
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(3)).isEqualTo(4);
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(4)).isEqualTo(5);
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(5)).isEqualTo(6);
    }
}