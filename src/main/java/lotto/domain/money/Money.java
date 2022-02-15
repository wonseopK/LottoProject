package lotto.domain.money;

public class Money {
    public static final int TICKET_PRICE = 1000;

    private long money;
    private long totalSpendmoney;

    private Money(final long money) {
        MoneyValidator.validateMoney(money);
        this.money = money;
        this.totalSpendmoney = money;
    }

    public static Money create(final long inputMoney) {
        return new Money(inputMoney);
    }

    public String changePrint() {
        return String.format("거스름돈은 %d원 입니다.", money % TICKET_PRICE);
    }

    public long getTicketCount() {
        return this.money / TICKET_PRICE;
    }

    public void useMoneyToBuyOneTicket(long manualOrderCount) {
        this.money -= TICKET_PRICE * manualOrderCount;
    }

    public long getMoney() {
        return money;
    }

    public long getTotalSpendmoney() {
        return totalSpendmoney;
    }
}
