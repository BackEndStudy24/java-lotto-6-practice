package lotto.controller;

import lotto.model.Lottos;
import lotto.model.WinnerNumber;
import lotto.utils.ServiceValidation;
import lotto.view.InputView;

import java.util.List;

public class Controller {

    final Lottos lottos = new Lottos();
    final WinnerNumber winnerNumber = new WinnerNumber();

    public void start(){
        clientInput_Money();
        clientInput_LottoNumbers();
        clientInput_BonusNumber();
    }

    private void clientInput_Money() {
        String rawMoney = InputView.getBuyMoneyMessage();
        ServiceValidation.validateNull(rawMoney);
        ServiceValidation.validateIsNumeric(rawMoney);
        int money = Integer.parseInt(rawMoney);
        lottos.buyLotto(money);
    }

    private void clientInput_LottoNumbers() {
        List<Integer> rawLottoNumbers = InputView.getStringsUsingDelimiter();
        winnerNumber.inputWinnerLottoNumbers(rawLottoNumbers);
    }

    private void clientInput_BonusNumber() {
        String rawBonusNumber = InputView.getBonusNumber();
        int bonusNumber = Integer.parseInt(rawBonusNumber);
        winnerNumber.inputWinnerBonusNumber(bonusNumber);
    }


}
