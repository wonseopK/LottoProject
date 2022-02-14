package lotto.view;

import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;
import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.money.Money;
import lotto.domain.lottoTicket.OrderTicketCount;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;


class InputViewTest {
    final Scanner scanner = new Scanner(System.in);

    @DisplayName("금액 입력후 구입 횟수로 변환해주는 테스트")
    @Test
    void createCount() {
        Money inputMoney = Money.create(5000);

        OrderTicketCount resultCount = OrderTicketCount.create(inputMoney);

        Assertions.assertThat(resultCount.getTotalTicketCount()).isEqualTo(5);
    }

    @DisplayName("보너스 볼 생성 테스트")
    @Test
    void createBonusBall() {
        //given
        int input = 1;

        //when
        BonusNumber bonusNumber = new BonusNumber(LottoNumberBox.getLottoNumber(1));

        //then
        Assertions.assertThat(bonusNumber.getBonusNumber()).isEqualTo(1);
    }

    @DisplayName("수동 로또번호가 0이ㅌ 수인지 검사하는 기능 테스트")
    @Test
    void positiveTest(){
        int input = -1;

        Assertions.assertThatThrownBy(()->InputView.validatePositiveNumber(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}