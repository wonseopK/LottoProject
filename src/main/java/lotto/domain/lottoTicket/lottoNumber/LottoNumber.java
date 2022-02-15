package lotto.domain.lottoTicket.lottoNumber;

public class LottoNumber {
    public static final int LOTTO_MIN_NUMBER = 1;
    public static final int LOTTO_MAX_NUMBER = 45;
    public static final String LOTTO_NUMBER_RANGE = String.format("로또번호는 %d~%d자리 숫자여야합니다.", LOTTO_MIN_NUMBER, LOTTO_MAX_NUMBER);

    private final int number;

    public LottoNumber(int number) {
        validateLottoNumber(number);
        this.number = number;
    }

    private void validateLottoNumber(int inputNumber) {
        boolean isNorLottoNumberRange = inputNumber > LOTTO_MAX_NUMBER || inputNumber < LOTTO_MIN_NUMBER;
        if (isNorLottoNumberRange) {
            throw new IllegalArgumentException(LOTTO_NUMBER_RANGE);
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