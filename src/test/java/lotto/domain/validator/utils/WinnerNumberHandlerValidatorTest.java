package lotto.domain.validator.utils;

import lotto.domain.utils.WinnerNumberHandler;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class WinnerNumberHandlerValidatorTest {
    @DisplayName("스플릿한 숫자의 유효성 검사")
    @Test
    void name() {
        //given
        String case1 = "1,d,2,3,4,5";
        String case3 = "1,2,3,4,5,6";

        WinnerNumberHandler.winnerNumberSaver(case3);

        //then
        Assertions.assertThatThrownBy(() -> WinnerNumberHandler.winnerNumberSaver(case1))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("숫자만 입력해주세요");
    }
}