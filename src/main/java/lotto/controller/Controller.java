package lotto.controller;

import lotto.view.InputView;

import java.util.List;

public class Controller {

    public void start(){
        clientInput_Money();
        clientInput_LottoNumbers();
        clientInput_BonusNumber();
    }

    private void clientInput_Money() {
        String rawMoney = InputView.getBuyMoneyMessage();
    }

    private void clientInput_LottoNumbers() {
        List<String> rawLottoNumbers = InputView.getStringsUsingDelimiter();
        System.out.println(rawLottoNumbers);
    }

    private void clientInput_BonusNumber() {
        String rawBonusNumber = InputView.getBonusNumber();
    }


}
