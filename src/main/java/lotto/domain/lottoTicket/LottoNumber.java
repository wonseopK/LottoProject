package lotto.domain.lottoTicket;

public class LottoNumber {
    private int number;

    public LottoNumber(int number) {
        validateLottoNumber(number);
        this.number = number;
    }

    private void validateLottoNumber (int inputNumber) {
        boolean isNorLottoNumberRange = inputNumber > 45 || inputNumber < 1;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    public int getNumber() {
        return number;
    }
}