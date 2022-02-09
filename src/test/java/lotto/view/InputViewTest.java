package lotto.view;

import lotto.domain.lottoTicket.Money;
import lotto.domain.lottoTicket.TicketGenerateCount;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {
    @DisplayName("금액 입력후 구입 횟수로 변환해주는 테스트")
    @Test
    void createCount(){
        Money inputMoney = Money.create(5000);
        final long ticketMoney = inputMoney.getMoney();

        TicketGenerateCount resultCount = TicketGenerateCount.create(ticketMoney);

        Assertions.assertThat(resultCount.getCount()).isEqualTo(5);
    }
}