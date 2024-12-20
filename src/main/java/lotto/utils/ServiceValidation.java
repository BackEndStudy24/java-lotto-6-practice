package lotto.utils;

import lotto.constants.ErrorMessageType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class ServiceValidation {

    private static final Pattern NUMBER_PATTERN = Pattern.compile("-?\\d+");

    public static void validateNull(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_NULL.getMessage());
        }
    }

    public static void validateIsNumeric(String input) {
        if (!NUMBER_PATTERN.matcher(input).matches()) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_NUMBER_FORMAT.getMessage());
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

    public static void validateDuplicateLottoNumbers(List<Integer> lottoNumbers) {
        Set<Integer> integerSet = new HashSet<>(lottoNumbers);

        if (integerSet.size() != lottoNumbers.size()) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_DUPLICATE_LOTTO_NUMBER.getMessage());
        }
    }

    public static void validateLottoNumberCount(List<Integer> lottoNumbers) {
        if (lottoNumbers.size() != 6) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_LOTTO_NUMBER_COUNT.getMessage());
        }
    }

    public static void validateDuplicateBonusNumber(List<Integer> lottoNumbers, int bonusNumber) {
        if (lottoNumbers.contains(bonusNumber)) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_DUPLICATE_BONUS_NUMBER.getMessage());
        }
    }

    public static void validateLottoNumberRange(List<Integer> lottoNumbers) {
        for (int num : lottoNumbers) {
            if (num < 1 || num > 45) {
                throw new IllegalArgumentException(ErrorMessageType.ERROR_LOTTO_NUMBER_RANGE.getMessage());
            }
        }
    }

    public static void validateBonusNumberRange(int bonusNumber) {
        if (bonusNumber < 1 || bonusNumber > 45) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_LOTTO_NUMBER_RANGE.getMessage());
        }
    }

    public static void validateDivided1000(int money) {
        if(money % 1000 != 0) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_MONEY_DIVIDED.getMessage());
        }
    }


}
