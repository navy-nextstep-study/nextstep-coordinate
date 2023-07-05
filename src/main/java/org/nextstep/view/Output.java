package org.nextstep.view;

import org.nextstep.domain.ShapeType;

import java.text.MessageFormat;

public class Output {
    public static void printIntroMessage(){
        System.out.println("좌표를 입력하세요.");
    }
    public static void printResult(ShapeType shapeType, double result){
        switch (shapeType){
            case LINE -> System.out.println(MessageFormat.format("두 점 사이 거리는 {0}",result));
            case TRIANGLE -> System.out.println(MessageFormat.format("삼각형의 넓이는 {0}",result));
            case RECTANGLE -> System.out.println(MessageFormat.format("사각형의 넓이는 {0}",result));
        }
    }
}
