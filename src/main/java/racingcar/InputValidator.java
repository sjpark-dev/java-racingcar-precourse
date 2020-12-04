package racingcar;

public class InputValidator {
    private static final int MAXIMUM_LENGTH = 5;

    public static void checkEachCarNameLength(String[] carNames) {
        for (String carName : carNames) {
            if (carName.length() <= MAXIMUM_LENGTH) {
                continue;
            }

            UserScreen.showNameLengthError();
            System.exit(0);
        }
    }

    public static void checkIfSplitterAtStartOrEnd(String userString, String nameSplitter) {
        if (userString.charAt(0) == nameSplitter.charAt(0)
                || userString.charAt(userString.length() - 1) == nameSplitter.charAt(0)) {

            UserScreen.splitterStartOrEndError();
            System.exit(0);
        }
    }
}
