package lotto.domain.lottoTicket;

import lotto.view.OutputView;

public class TicketGenerateCount {
    public static final long TICKET_PRICE = 1000;

    private int count;

    private TicketGenerateCount(Money money) {
        this.count = (int) (money.getMoney() / TICKET_PRICE);
        OutputView.println(String.format("%d개를 구매하셨습니다.", count));
        //OutputView.println(String.format("거스름돈은 d%",));
    }

    public static TicketGenerateCount create(Money money) {
        return new TicketGenerateCount(money);
    }

    public int getCount() {
        return count;
    }
}
