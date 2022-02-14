package lotto.domain.lottoTicket.lottoNumber;

public class LottoNumber {
    public static final int LOTTO_MIN_NUMBER = 1;
    public static final int LOTTO_MAX_NUMBER = 45;


    private int number;

    public LottoNumber(int number) {
        validateLottoNumber(number);
        this.number = number;
    }

    private void validateLottoNumber(int inputNumber) {
        boolean isNorLottoNumberRange = inputNumber > LOTTO_MAX_NUMBER || inputNumber < LOTTO_MIN_NUMBER;
        if (isNorLottoNumberRange) {
            throw new IllegalArgumentException("로또번호는 1~45자리 숫자여야합니다.");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    public int getNumber() {
        return number;
    }
}