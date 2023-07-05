package view;

import domain.Figure;

public class OutputView {

    private OutputView(){
    }

    static class OutputViewLazyHolder {
        public static final OutputView INSTANCE = new OutputView();
    }

    public static OutputView getInstance() {
        return OutputViewLazyHolder.INSTANCE;
    }

    public void displayInputCoordinateMsg() {
        System.out.println("좌표를 입력하세요.");
    }

    public void displayErrorMsg(String message) {
        System.out.println(message);
    }

    public void displayResult(Figure figure) {
        System.out.println(figure.getResult());
    }
}
