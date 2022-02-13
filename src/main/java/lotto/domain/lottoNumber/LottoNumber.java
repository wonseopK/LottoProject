package lotto.domain.lottoNumber;

public class LottoNumber {
    private int number;

    public LottoNumber(int number) {
        validateLottoNumber(number);
        this.number = number;
    }

    private void validateLottoNumber (int inputNumber) {
        boolean isNorLottoNumberRange = inputNumber > 45 || inputNumber < 1;
        if(isNorLottoNumberRange){
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