package lotto.domain.lottoTicket;

import lotto.domain.money.Money;
import lotto.view.OutputView;

public class OrderTicketCount {
    public static final long TICKET_PRICE = 1000;

    private final long totalTicketCount;

    private OrderTicketCount(Money money) {
        this.totalTicketCount = money.getTicketCount();
    }

    public static OrderTicketCount create(Money money) {
        OrderTicketCount orderTicketCount = new OrderTicketCount(money);
        OutputView.println(String.format("%d개를 구매하셨습니다.", money.getTicketCount()));
        OutputView.println(money.changePrint());
        return orderTicketCount;
    }

    public long getTotalTicketCount() {
        return totalTicketCount;
    }

}
