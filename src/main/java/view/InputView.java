package view;

import java.util.Scanner;

public class InputView {
    private final static Scanner SCANNER = new Scanner(System.in);

    private InputView(){
    }

    static class InputViewLazyHolder {
        public static final InputView INSTANCE = new InputView();
    }

    public static InputView getInstance() {
        return InputViewLazyHolder.INSTANCE;
    }

    public String inputCoordinate() {
        return SCANNER.nextLine();
    }
}
