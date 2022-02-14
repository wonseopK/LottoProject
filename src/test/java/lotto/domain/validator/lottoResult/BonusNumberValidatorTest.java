package lotto.domain.validator.lottoResult;

import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;
import lotto.domain.lottoResult.BonusNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class BonusNumberValidatorTest {
    @DisplayName("보너스볼에 대한 유효성 검사")
    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 46})
    void name(int number) {
        Assertions.assertThatThrownBy(() -> new BonusNumber(LottoNumberBox.getLottoNumber(number)))
                .isInstanceOf(IllegalArgumentException.class);
    }
}