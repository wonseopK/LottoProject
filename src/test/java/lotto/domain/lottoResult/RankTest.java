package lotto.domain.lottoResult;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class RankTest {
    @DisplayName("보너스 번호가 없을 경우 출련되는 랭크를 확인하는 테스트")
    @Test
    void name() {
        //given
        int matchNumber = 4;
        int matchNumber2 = 5;

        boolean bonus = false;

        //when
        Rank rank = Rank.valueOf(matchNumber, bonus);
        Rank rank2 = Rank.valueOf(matchNumber2, bonus);

        //then
        Assertions.assertThat(rank).isEqualTo(Rank.THIRD);
        Assertions.assertThat(rank2).isEqualTo(Rank.SECOND);

    }

    @DisplayName("당첨번호가 5개이고 보너스번호가 매치됬을때 나오는 랭크를 확인하는 테스트")
    @Test
    void name2() {
        //given
        int matchNumber = 5;
        boolean bonus = true;

        //when
        Rank rank = Rank.valueOf(matchNumber, bonus);

        //then
        Assertions.assertThat(rank).isEqualTo(Rank.BONUS);
    }
}