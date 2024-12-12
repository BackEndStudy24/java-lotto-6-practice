package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.constants.ErrorMessageType;
import lotto.utils.ServiceValidation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    private static final String COMMA = ",";

    public static String getBuyMoneyMessage() {
        System.out.println("구입금액을 입력해 주세요.");
        return Console.readLine().trim();
    }

    public static List<String> getStringsUsingDelimiter() {
        System.out.println("당첨 번호를 입력해 주세요.");
        String input = Console.readLine();
        validateNotEndDelimiter(input);
        List<String> inputs = Arrays.stream(input.split(COMMA))
                .map(String::trim)
                .collect(Collectors.toList());
        inputs.forEach(ServiceValidation::validateNull);
        return inputs;
    }


    private static void validateNotEndDelimiter(String input) {
        if (input.endsWith(COMMA)) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_END_COMMA.getMessage());
        }
    }

    public static String getBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
        return Console.readLine().trim();
    }

}
