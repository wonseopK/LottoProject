package lotto.domain.lottoResult;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


class LottoResultTest {
    @DisplayName("당첨 결과를 스트링으로 반환하는 테스트")
    @Test
    void name() {
        //given
        Map<Rank, Long> map = new HashMap<>();
        map.put(Rank.THIRD, 2L);
        map.put(Rank.SECOND, 3L);
        map.put(Rank.BONUS, 1L);
        LottoResult lottoResult = new LottoResult(map,4000);

        //when
        String result = lottoResult.toString();

        //then
        Assertions.assertThat(result).isEqualTo("3개 일치 (5000원)- 0개\n" +
                "4개 일치 (50000원)- 2개\n" +
                "5개 일치 (1500000원)- 3개\n" +
                "5개 일치, 보너스 볼 일치(30000000원) - 1개\n" +
                "6개 일치 (2000000000원)- 0개");
    }

}