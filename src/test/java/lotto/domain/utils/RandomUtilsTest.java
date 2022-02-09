package lotto.domain.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomUtilsTest {
    @DisplayName("로또 숫자발생하는 메서드 테스트")
    @RepeatedTest(100)
    void name() {
        int maxLimit = 45;
        int minLimit = 1;

        Assertions.assertThat(RandomUtils.lottoNumberGenerator()).isBetween(minLimit, maxLimit);

    }
}