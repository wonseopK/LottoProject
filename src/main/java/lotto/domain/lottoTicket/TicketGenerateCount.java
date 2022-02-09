package lotto.domain.lottoTicket;

import lotto.view.OutputView;

public class TicketGenerateCount {
    public static final long TICKET_PRICE = 1000;

    private int count;

    private TicketGenerateCount(final long money) {

        OutputView.println(String.format("%d개를 구매하셨습니다.", count));
    }

    public static TicketGenerateCount create(final long ticketMoney) {
        return new TicketGenerateCount(ticketMoney);
    }

    public int getCount() {
        return count;
    }
}
