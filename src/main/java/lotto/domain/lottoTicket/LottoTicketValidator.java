package lotto.domain.lottoTicket;

import lotto.domain.lottoTicket.lottoNumber.LottoNumber;

import java.util.List;

public class LottoTicketValidator {
    public static final int LOTTO_NUMBER_SIZE = 6;
    public static final String OVER_NUMBER_SIZE = String.format("로또 번호 길이가 %d자리가 아닙니다.", LOTTO_NUMBER_SIZE);
    public static final String DUPLICATE_NUMBERS = "로또 번호는 중복 될수 없습니다.";


    public static void validateSize(List<LottoNumber> lottoNumbers) {
        boolean isNotValidNumbers = lottoNumbers.size() != LOTTO_NUMBER_SIZE;
        if (isNotValidNumbers) {
            throw new IllegalArgumentException(OVER_NUMBER_SIZE);
        }
    }

    public static void validateDuplicate(List<LottoNumber> lottoNumbers) {
        long nonDuplicateNumbers = lottoNumbers
                .stream()
                .distinct()
                .count();
        boolean isDuplictednumbers = nonDuplicateNumbers != LOTTO_NUMBER_SIZE;

        if (isDuplictednumbers) {
            throw new IllegalArgumentException(DUPLICATE_NUMBERS);
        }
    }
}
