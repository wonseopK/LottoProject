package lotto.domain.lottoTicket;

import lotto.view.OutputView;

public class OrderTicketCount {
    public static final long TICKET_PRICE = 1000;

    private int count;

    private OrderTicketCount(Money money) {
        this.count = (int) (money.getMoney() / TICKET_PRICE);
        OutputView.println(String.format("%d개를 구매하셨습니다.", count));
        OutputView.println(money.changePrint());
    }

    public static OrderTicketCount create(Money money) {
        return new OrderTicketCount(money);
    }

    public int getCount() {
        return count;
    }
}
