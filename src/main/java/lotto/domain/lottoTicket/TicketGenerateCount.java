package lotto.domain.lottoTicket;

public class TicketGenerateCount {
    public static final long TICKET_PRICE = 1000;

    private int count;

    private TicketGenerateCount(final long money) {
        this.count = (int) (money / TICKET_PRICE);
    }

    public static TicketGenerateCount create(final long ticketMoney) {
        return new TicketGenerateCount(ticketMoney);
    }

    public int getCount() {
        return count;
    }
}
