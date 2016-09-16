package leczner.jon.Calculator;

import java.util.Scanner;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class Display {
    private String state;
    private String displayState;
    private int significantDigits;

    public enum Mode {DECIMAL, HEX, BINARY, OCTAL}
    private Mode mode;
    private Scanner scanner;

    public Display() {
        state = "0";
        displayState = state;
        significantDigits = 6;
        mode = Mode.DECIMAL;
        scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getState() {
        return state;
    }

    public String getDisplayState() {
        switch (mode) {
            case DECIMAL:
                displayState = state;
                break;
            case HEX:
                displayState = Integer.toString(Integer.valueOf(state), 16);
                break;
            case BINARY:
                displayState = Integer.toString(Integer.valueOf(state), 2);
                break;
            case OCTAL:
                displayState = Integer.toString(Integer.valueOf(state), 8);
                break;
        }
        return displayState;
    }

    public void setState(String state) {
        this.state = state;
        displayState = state;
    }

    public void clear() {
        state = "0";
    }

    public void showState() {
//        formatState();
        System.out.println(getDisplayState());
    }

    public void switchDisplayMode() {
        switch (mode) {
            case DECIMAL:
                mode = Mode.HEX;
                break;
            case HEX:
                mode = Mode.BINARY;
                break;
            case BINARY:
                mode = Mode.OCTAL;
                break;
            case OCTAL:
                mode = Mode.DECIMAL;
                break;
            default:
                System.out.println("How did it come to this? (no mode available)");
                break;
        }
    }

    public void switchDisplayMode(Mode mode) {
        this.mode = mode;
    }

//    public void setSignificantDigits(int digits) {
//        significantDigits = digits;
//    }

//    public void formatState() {
//        trueState = state;
//        int trueDigits = state.length();
//        if (state.contains("."))
//            trueDigits--;
//        if (state.contains("-"))
//            trueDigits--;
//
//        if (trueDigits > significantDigits) {
//            state = state.substring(0, significantDigits + 1); // trim to significantDigit total + "."
//            if (state.endsWith("."))
//                state = state.substring(0, state.length() - 1);
//        }
//        else
//            return;
//    }

}
