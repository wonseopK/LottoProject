package lotto.domain.validator.lottoTicket;

import lotto.domain.lottoNumber.LottoNumber;

import java.util.List;

public class LottoTicketValidator {
    public static final int LOTTO_NUMBER_SIZE = 6;

    public static void validateSize(List<LottoNumber> lottoNumbers) {
        boolean isNotValidNumbers = lottoNumbers.size() != LOTTO_NUMBER_SIZE;
        if (isNotValidNumbers) {
            throw new IllegalArgumentException("로또 번호 길이가 6자리가 아닙니다.");
        }
    }

    public static void validateDuplicate(List<LottoNumber> lottoNumbers) {
        long nonDuplicateNumbers = lottoNumbers
                .stream()
                .distinct()
                .count();
        boolean isDuplictednumbers = nonDuplicateNumbers != LOTTO_NUMBER_SIZE;

        if (isDuplictednumbers) {
            throw new IllegalArgumentException("로또 번호는 중복 될수 없습니다.");
        }
    }
}
