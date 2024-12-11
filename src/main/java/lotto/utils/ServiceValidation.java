package lotto.utils;

import lotto.constants.ErrorMessageType;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ServiceValidation {

    private static final Pattern NUMBER_PATTERN = Pattern.compile("-?\\d+");

    public static void validateNull(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_NULL.getMessage());
        }
    }

    public static void validateIsNumericBonusNumber(String input) {
        if (!NUMBER_PATTERN.matcher(input).matches()) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_BONUS_NUMBER_FORMAT.getMessage());
        }
    }

    public static List<Integer> validateIsNumericLottoNumbers(String rawInput) {
        try {
            List<Integer> lottoNumbers = Arrays.stream(rawInput.split(","))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .toList();

            return lottoNumbers;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_LOTTO_NUMBER_FORMAT.getMessage());
        }
    }



}
