package lotto.domain.utils;

public class RandomUtils {
    private static int LOTTO_NUMBER_MAX_LIMIT = 45;
    private static int LOTTO_NUMBER_MIN_LIMIT = 1;

    public static int lottoNumberGenerator(){
        int lottoNumber = (int) ((Math.random()*LOTTO_NUMBER_MIN_LIMIT+LOTTO_NUMBER_MIN_LIMIT));
        return lottoNumber;
    }
}
