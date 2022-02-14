package lotto.domain.lottoTicket;

import lotto.domain.money.Money;
import lotto.view.OutputView;

public class OrderTicketCount {
    public static final long TICKET_PRICE = 1000;

    private int count;

    private OrderTicketCount(Money money) {
        this.count = (int) (money.getMoney() / TICKET_PRICE);
    }

    public static OrderTicketCount create(Money money) {
        OrderTicketCount orderTicketCount = new OrderTicketCount(money);
        OutputView.println(String.format("%d개를 구매하셨습니다.", orderTicketCount.getCount()));
        OutputView.println(money.changePrint());
        return orderTicketCount;
    }

    public int getCount() {
        return count;
    }
}
