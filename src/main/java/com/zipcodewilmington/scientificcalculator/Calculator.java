package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;

public class Calculator {

    private Boolean running;
    private Double lastInput;
    private Double display;
    public static final String[] UNARYOPERATORS = {"sqrt", "sq",
                                        "sin", "cos", "tan", "asin", "acos", "atan",
                                        "exp", "10^", "log", "ln", "!", "inv", "sign"};
    public static final String[] BINARYOPERATORS = {"+", "-", "/", "*", "^"};
    public static final String[] COMMANDS = {"m+", "mc", "mrc", "clear", "deg", "rad", "quit", ""};// still need display modes

    private Memory memory;
    private TrigFunctions trig;


    public Calculator() {
        this.running = false;
        this.lastInput = 0.0;
        this.display = 0.0;
        this.memory = new Memory();
        this.trig = new TrigFunctions();
    }

    // Getters

    public Double getLastInput() {
        return this.lastInput;
    }

    public Double getDisplay() {
        return this.display;
    }

    public TrigFunctions getTrig() { // just for testing, really
        return this.trig;
    }

    // Setters

    public void setLastInput(Double lastInput) {
        this.lastInput = lastInput;
    }

    public void setDisplay(Double display) {
        this.display = display;
    }

    // Helper Methods

    public void throwError() {
        Console.println("ERR");
        this.lastInput = 0.0;
        this.display = 0.0;
    }

    public void clearCalculator() {
        Console.println("0");
        this.lastInput = 0.0;
        this.display = 0.0;
    }

    public void run() {
        this.running = true;
        inputLoop();
    }

    // Input Methods
    private void inputLoop() {
        String input = Console.getInput("");

        while (this.running) {
            if (input.matches("-?\\d+(\\.\\d+)?")) { //regEx to check whether it's a number or not
                this.lastInput = this.display;
                this.display = Double.valueOf(input);
                Console.println("%s (%s)", Double.toString(this.display), Double.toString(this.lastInput));
            } else if (Arrays.asList(Calculator.COMMANDS).contains(input)){
                handleCommands(input);
            } else if (Arrays.asList(Calculator.UNARYOPERATORS).contains(input)) {
                handleOperator(input);
            } else if (Arrays.asList(Calculator.BINARYOPERATORS).contains(input)) {
                handleBinaryOperator(input);
            } else { //error
                this.throwError();
            }
            // need to do this only until the previous input was an operator
            input = Console.getInput("");
        }
    }
    
    public String handleCommands(String command) {
        Console.println("%s (command)", command);
        switch (command) {
            case "quit" :
                this.running = false;
                break;
            case "clear":
                clearCalculator();
                break;
            case "deg":
                this.trig.degreeMode();
                break;
            case "rad":
                this.trig.radianMode();
                break;
            case "m+":
                this.memory.memoryPlus(display);
                break;
            case "mc":
                this.memory.memoryClear();
                break;
            case "mrc":
                this.lastInput = display;
                display = memory.memoryRecall();
                break;
        }
        return "";
    }

    /*,  "log", "ln", "!", "inv", "sign"};*/
    public String handleOperator(String operator) {
        Console.println("%s (%f)", operator, this.display);
        Double result = 0.0;
        switch (operator) {
            case "sin":
                result = this.trig.sin(this.display);
                this.display = result;
                break;
            case "cos":
                result = this.trig.cos(this.display);
                this.display = result;
                break;
            case "tan":
                result = this.trig.tan(this.display);
                this.display = result;
                break;
            case "asin":
                result = this.trig.arcSin(this.display);
                this.display = result;
                break;
            case "acos":
                result = this.trig.arcCos(this.display);
                this.display = result;
                break;
            case "atan":
                result = this.trig.arcTan(this.display);
                this.display = result;
                break;
            case "sqrt":
                result = Math.sqrt(this.display);
                this.display = result;
                break;
            case "sq":
                result = this.display * this.display;
                this.display = result;
                break;
            case "exp":
                result = Math.exp(this.display);
                this.display = result;
                break;
            case "10^":
                result = Math.pow(10, this.display);
                this.display = result;
                break;
        }
        Console.println(Double.toString(this.display));
        return "";
    }

    /* "+", "-", "/", "*", "^"*/
    public String handleBinaryOperator(String operator) {

        switch (operator) {
            case "+" :
                String input = Console.getInput("");
                if (input.matches("-?\\d+(\\.\\d+)?")) { //regEx to check whether it's a number or not
                    this.lastInput = this.display;
                    this.display += Double.valueOf(input);
                    Console.println("%s (%s)", Double.toString(this.display), Double.toString(this.lastInput));
                }
                break;
        }

        return "";
    }
}
