package lotto.view;

import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.lottoTicket.Money;
import lotto.domain.lottoTicket.TicketGenerateCount;
import lotto.domain.utils.WinnerNumberHandler;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {
    final Scanner scanner = new Scanner(System.in);

    @DisplayName("금액 입력후 구입 횟수로 변환해주는 테스트")
    @Test
    void createCount() {
        Money inputMoney = Money.create(5000);
        final long ticketMoney = inputMoney.getMoney();

        TicketGenerateCount resultCount = TicketGenerateCount.create(ticketMoney);

        Assertions.assertThat(resultCount.getCount()).isEqualTo(5);
    }

    @DisplayName("보너스 볼 생성 테스트")
    @Test
    void createBonusBall() {
        //given
        int input = 1;

        //when
        BonusNumber bonusNumber = new BonusNumber(input);

        //then
        Assertions.assertThat(bonusNumber.getBonusNumber()).isEqualTo(1);
    }
}