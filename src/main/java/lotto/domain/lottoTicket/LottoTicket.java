package lotto.domain.lottoTicket;

import java.util.List;

public class LottoTicket {
    public  static final int LOTTO_NUMBER_SIZE = 6;

    private final List<Integer> lottoNumbers;

    public LottoTicket(List<Integer> lottoNumbers) {
        validateSize(lottoNumbers);
        validateDuplicate(lottoNumbers);
        this.lottoNumbers = lottoNumbers;
    }

    private void validateSize(List<Integer> lottoNumbers){
        boolean isValidNumbers = lottoNumbers.size() == LOTTO_NUMBER_SIZE;
        if(!isValidNumbers){
            throw new IllegalArgumentException("로또 번호 길이가 6자리가 아닙니다.");
        }
    }

    private void validateDuplicate(List<Integer> lottoNumbers){
        int nonDuplicateNumbers = (int) lottoNumbers
                .stream()
                .distinct()
                .count();
        boolean isDuplictednumbers = nonDuplicateNumbers == LOTTO_NUMBER_SIZE;
        if(!isDuplictednumbers){
            throw new IllegalArgumentException("로또 번호는 중복 될수 없습니다.");
        }
    }
}
