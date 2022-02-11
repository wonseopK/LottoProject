package lotto.domain.lottoResult;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumPracticeTest {
    @DisplayName("당첨번호 일치갯수를 확인하고 일치하는 Rank 객체를 돌려주는지 확인하는 기능 테스트")
    @Test
    void name(){
        int matchNum = 5;
        boolean bonusNumber = true;

        EnumPractice.Rank rank = EnumPractice.valueOf(matchNum, bonusNumber);

        Assertions.assertThat(rank).isEqualTo(EnumPractice.Rank.BONUS);
    }

}