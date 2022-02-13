package lotto.domain.lottoTicket;

import lotto.view.OutputView;

public class OrderedTicketCount {
    public static final long TICKET_PRICE = 1000;

    private int count;

    private OrderedTicketCount(Money money) {
        this.count = (int) (money.getMoney() / TICKET_PRICE);
        OutputView.println(String.format("%d개를 구매하셨습니다.", count));
        OutputView.println(money.changePrint());
    }

    public static OrderedTicketCount create(Money money) {
        return new OrderedTicketCount(money);
    }

    public int getCount() {
        return count;
    }
}
