package lotto.domain.lottoTicket;

public class LottoNumber {
    private int number;

    public LottoNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    public int getNumber() {
        return number;
    }
}