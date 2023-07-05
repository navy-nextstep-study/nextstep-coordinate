package com.nextstep.nextstepcoordinate.Console;

import java.util.Scanner;

public class InputView {

    private static Scanner SCANNER = new Scanner(System.in);

    public static String input() {
        return SCANNER.nextLine();
    }
}
