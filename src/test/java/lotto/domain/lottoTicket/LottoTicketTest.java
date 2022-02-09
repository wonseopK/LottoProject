package lotto.domain.lottoTicket;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LottoTicketTest {
    @DisplayName("로또티켓 생성 테스트")
    @Test
    void createTicket() {
        List<Integer> duplicatedLottoNumbers = Arrays.asList(2, 2, 3, 4, 5, 6);
        List<Integer> notEnoughSizeNumbers = Arrays.asList(1, 2, 3, 4, 5);


        Assertions.assertThatThrownBy(() -> new LottoTicket(duplicatedLottoNumbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("로또 번호는 중복 될수 없습니다.");

        Assertions.assertThatThrownBy(() -> new LottoTicket(notEnoughSizeNumbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("로또 번호 길이가 6자리가 아닙니다.");
    }
}