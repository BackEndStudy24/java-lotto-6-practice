package lotto.controller;

import lotto.view.InputView;

import java.util.List;

public class Controller {

    public void start(){
        clientInput_Money();
        clientInput_LottoNumbers();
    }


    private void clientInput_Money() {
        String rawMoney = InputView.inputBuyMoneyMessage();
    }

    private void clientInput_LottoNumbers() {
        List<String> rawLottoNumbers = InputView.getStringsUsingDelimiter();
        System.out.println(rawLottoNumbers);
    }
}
