package lotto.domain.lottoTicket;

public class TicketOrderType {
    private int totalTicketCount;
    private int manualTicketCount;
    private int autoTicketCount;

    private TicketOrderType(int totalTicketCount, int manualTicketCount) {
        this.totalTicketCount = totalTicketCount;
        this.manualTicketCount = manualTicketCount;
        this.autoTicketCount = totalTicketCount - manualTicketCount;
    }

    public static TicketOrderType of(int totalTicketCount, int manualTicketCount){
        boolean isNotValidManualNumber = totalTicketCount < manualTicketCount;
        if(isNotValidManualNumber){
           
        }
        return new TicketOrderType(totalTicketCount,manualTicketCount);
    }

    public int getTotalTicketCount() {
        return totalTicketCount;
    }

    public int getManualTicketCount() {
        return manualTicketCount;
    }

    public int getAutoTicketCount() {
        return autoTicketCount;
    }
}
