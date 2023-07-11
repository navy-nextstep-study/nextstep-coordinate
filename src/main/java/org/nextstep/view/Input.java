package org.nextstep.view;

import java.util.Scanner;

public class Input {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputCoordinate() {
        return SCANNER.nextLine();
    }
}
