package lotto.model;

import java.util.List;

public class WinnerNumber {

    private List<Integer> lottoNumbers;
    private int bonusNumber;


    public void inputWinnerBonusNumber(int bonusNumber) {
        this.bonusNumber = bonusNumber;
    }

    public void inputWinnerLottoNumbers(List<Integer> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }

    public List<Integer> getLottoNumbers() {
        return lottoNumbers;
    }
}
