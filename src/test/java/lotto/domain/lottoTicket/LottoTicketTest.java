package lotto.domain.lottoTicket;

import lotto.domain.lottoNumber.LottoNumber;
import lotto.domain.lottoNumber.LottoNumberBox;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class LottoTicketTest {
    @DisplayName("로또티켓 중복 검사 테스트")
    @Test
    void checkDuplicate() {
        List<LottoNumber> duplicatedLottoNumbers =  Arrays.asList(
                LottoNumberBox.getLottoNumber(1),
                LottoNumberBox.getLottoNumber(2),
                LottoNumberBox.getLottoNumber(3),
                LottoNumberBox.getLottoNumber(5),
                LottoNumberBox.getLottoNumber(5),
                LottoNumberBox.getLottoNumber(6)
        );

        Assertions.assertThatThrownBy(() -> new LottoTicket(duplicatedLottoNumbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("로또 번호는 중복 될수 없습니다.");


    }
    @DisplayName("로또티켓 사이즈 검사")
    @Test
    void checkSize(){
        List<LottoNumber> notEnoughSizeNumbers =  Arrays.asList(
                LottoNumberBox.getLottoNumber(1),
                LottoNumberBox.getLottoNumber(2),
                LottoNumberBox.getLottoNumber(3),
                LottoNumberBox.getLottoNumber(4),
                LottoNumberBox.getLottoNumber(5)
        );

        Assertions.assertThatThrownBy(() -> new LottoTicket(notEnoughSizeNumbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("로또 번호 길이가 6자리가 아닙니다.");
    }


    @DisplayName("로또티켓 toString내용이 [숫자,숫자,숫자,숫자,숫자,숫자] 형태인지 테스트")
    @Test
    void name() {
        List<LottoNumber> sixRandomLottoNumbers = Arrays.asList(
                new LottoNumber(1),
                new LottoNumber(2),
                new LottoNumber(3),
                new LottoNumber(4),
                new LottoNumber(5),
                new LottoNumber(6)
                );
        String expectedResult = "[1,2,3,4,5,6]";

        LottoTicket lottoTicket = new LottoTicket(sixRandomLottoNumbers);

        System.out.println(lottoTicket.toString());
        Assertions.assertThat(lottoTicket.toString()).isEqualTo(expectedResult);
    }
}