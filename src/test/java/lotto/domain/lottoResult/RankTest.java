package lotto.domain.lottoResult;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {
    @DisplayName("매치 갯수에 맞는 랭크를 반환해주는 기능 테스트")
    @Test
    void name() {
        //given
        int matchNumber = 4;
        int matchNumber2 = 5;
        boolean bonus = true;

        //when
        Rank rank = Rank.valueOf(matchNumber, bonus);

        //then
        Assertions.assertThat(rank).isEqualTo(Rank.THIRD);

    }
}