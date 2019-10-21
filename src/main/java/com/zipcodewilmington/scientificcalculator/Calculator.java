package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Calculator {
    private Scanner scanner = new Scanner(System.in);
    //create an array that includes all of the available operators
    private String[] operators = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "11", "12", "13,", "14", "15", "16",
            "17", "18", "19", "20", "return"};
    //turn that array into a string
    private List<String> operatorsList = Arrays.asList(operators);
    //create an array of each operation that requires two values
    private String[] need2Values = {"1", "2", "3", "4", "5"};
    //turn that array into a string
    private List<String> need2ValuesList = Arrays.asList(need2Values);
    private Integer pageNumber = 1;

    void runCalculator() {
        while (true) {
            System.out.println("Choose your Operator\nType \"cmd\" for commands.");
            String userOperator = scanner.nextLine();
            //ask the user for a operator
            while (!operatorsList.contains(userOperator)) {
                //provide a list of commands
                if (userOperator.equals("cmd")) {
                    System.out.println("\"1\" - + - Addition");
                    System.out.println("\"2\" - - - Subtraction");
                    System.out.println("\"3\" - * - Multiplication");
                    System.out.println("\"4\" - / - Division");
                    System.out.println("\"5\" - x^y - Exponential");
                    System.out.println("\"6\" - x^2 - Squared");
                    System.out.println("\"7\" - √ -Square Root");
                    System.out.println("\"8\" - !x - Factorial");
                    System.out.println("\"9\" - 1/x - Inverse");
                    System.out.println("\"10\" - +- - Invert");
                    System.out.println("\"11\" - sin(x) - Sine");
                    System.out.println("\"12\" - cos(x) - Cosine");
                    System.out.println("\"13\" - tan(x) - Tangent");
                    System.out.println("\"14\" - sin(x)^-1 - Inverse Sine");
                    System.out.println("\"15\" - cos(x)^-1 - Inverse Cosine");
                    System.out.println("\"16\" - tan(x)^-1 - Inverse Tangent");
                    System.out.println("\"17\" - log(x) - Logarithm");
                    System.out.println("\"18\" - 10^x - Inverse Logarithm");
                    System.out.println("\"19\" - ln(x) - Natural Logarithm");
                    System.out.println("\"20\" - e^x - Inverse Natural Logarithm");
                    //give an option to exit the calculator and go back to the main menu
                    System.out.println("****\"return\" - Return to Main Menu");
                    //check if operator is correct, and break the loop
                } else if (operatorsList.contains(userOperator)) {
                    break;
                    //return an error if operator is not correct, and return to top of loop
                } else {
                    System.out.println("ERROR: Invalid command\n");
                }
                System.out.println("Choose your Operator\nType \"cmd\" for commands.");
                userOperator = scanner.nextLine();
            }
            if(userOperator.equals("return")){
                break;
            }


                //ask the user for a value
                System.out.println("Enter your value");
                String userValueAsString = scanner.nextLine();
                boolean correctInput;
                //run a while loop that checks if a proper number was entered
                while (true) {
                    correctInput = InputChecker.isNumeric(userValueAsString);
                    if (correctInput) break;
                    System.out.println("Enter your value");
                    userValueAsString = scanner.nextLine();

                }
                double userValue1 = Double.parseDouble(userValueAsString);

                if (need2ValuesList.contains(userOperator)) {
                    //ask for a second value
                    System.out.println("Enter your second value");
                    String userValue2AsString = scanner.nextLine();
                    //run a while loop that checks if a proper number was entered
                    while(true) {
                        correctInput = InputChecker.isNumeric(userValueAsString);
                        if(correctInput) break;
                        System.out.println("Enter your second value");
                        userValueAsString = scanner.nextLine();
                    }
                    double userValue2 = Double.parseDouble(userValue2AsString);

                    //run the need2value operators INSIDE the if statement
                    switch (userOperator) {
                        case "1":
                            Addition add = new Addition();
                            double sum = add.add(userValue1, userValue2);
                            System.out.println(userValue1 + " + " + userValue2 + " = " + sum + "\n");
                            break;
                        case "2":
                            Subtraction subtract = new Subtraction();
                            Double difference = subtract.subtract(userValue1, userValue2);
                            System.out.println(userValue1 + " - " + userValue2 + " = " + difference + "\n");
                            break;
                        case "3":
                            Multiplication multiply = new Multiplication();
                            Double product = multiply.multiply(userValue1, userValue2);
                            System.out.println(userValue1 + " * " + userValue2 + " = " + product + "\n");
                            break;
                        case "4":
                            Division divide = new Division();
                            Double quotient = divide.divide(userValue1, userValue2);
                            if (quotient != null) {
                                System.out.println(userValue1 + " / " + userValue2 + " = " + quotient + "\n");
                            }
                            break;
                        case "5":
                            Exponent exponent = new Exponent();
                            Double powerOf = exponent.exponent(userValue1, userValue2);
                            System.out.println(userValue1 + " ^ " + userValue2 + " = " + powerOf + "\n");
                            break;
                    }
                } else if (!need2ValuesList.contains(userOperator)) {
                    switch (userOperator) {
                        case "6":
                            Squared squared = new Squared();
                            Double powerOf = squared.squared(userValue1);
                            System.out.println(userValue1 + " ^2 = " + powerOf + "\n");
                            break;
                        case "7":
                            Sqrt sqrt = new Sqrt();
                            Double squareRoot = sqrt.sqrt(userValue1);
                            if (squareRoot != null)
                                System.out.println("√" + userValue1 + " = " + squareRoot + "\n");
                            break;
                        case "8":
                            Factorial factorial = new Factorial();
                            Double facto = factorial.factorial(userValue1);
                            System.out.println("!" + userValue1 + " = " + facto + "\n");
                            break;
                        case "9":
                            Inverse inverse = new Inverse();
                            Double inversed = inverse.inverse(userValue1);
                            if (inversed != null)
                                System.out.println("1/" + userValue1 + " = " + inversed + "\n");
                            break;
                        case "10":
                            Invert invert = new Invert();
                            Double inverted = invert.invert(userValue1);
                            System.out.println(userValue1 + " inverted = " + inverted + "\n");
                            break;
                        case "11":
                            Sine sine = new Sine();
                            Double sin = sine.sine(userValue1);
                            System.out.println("sin(" + userValue1 + ") = " + sin + "\n");
                            break;
                        case "12":
                            Cosine cosine = new Cosine();
                            Double cos = cosine.cosine(userValue1);
                            System.out.println("cos(" + userValue1 + ") = " + cos + "\n");
                            break;
                        case "13":
                            Tangent tangent = new Tangent();
                            Double tan = tangent.tangent(userValue1);
                            System.out.println("tan(" + userValue1 + ") = " + tan + "\n");
                            break;
                        case "14":
                            InverseSine inverseSine = new InverseSine();
                            Double inverseSin = inverseSine.inverseSine(userValue1);
                            System.out.println("sin(" + userValue1 + ")^-1 = " + inverseSin + "\n");
                            break;
                        case "15":
                            InverseCosine inverseCosine = new InverseCosine();
                            Double inverseCos = inverseCosine.inverseCosine(userValue1);
                            System.out.println("cos(" + userValue1 + ")^-1 = " + inverseCos + "\n");
                            break;
                        case "16":
                            InverseTangent inverseTangent = new InverseTangent();
                            Double inverseTan = inverseTangent.inverseTangent(userValue1);
                            System.out.println("tan(" + userValue1 + ")^-1 = " + inverseTan + "\n");
                            break;
                        case "17":
                            Logarithm logarithm = new Logarithm();
                            Double log = logarithm.logarithm(userValue1);
                            if (log != null)
                                System.out.println("Log(" + userValue1 + ") = " + log + "\n");
                            break;
                        case "18":
                            InverseLogarithm inverseLogarithm = new InverseLogarithm();
                            Double inverseLog = inverseLogarithm.inverseLogarithm(userValue1);
                            if (inverseLog != null)
                                System.out.println("10^" + userValue1 + " = " + inverseLog + "\n");
                            break;
                        case "19":
                            NaturalLogarithm naturalLogarithm = new NaturalLogarithm();
                            Double naturalLog = naturalLogarithm.naturalLogarithm(userValue1);
                            if(naturalLog != null)
                                System.out.println("ln(" + userValue1 + ") = " + naturalLog + "\n");
                            break;
                        case "20":
                            InverseNaturalLogarithm inverseNaturalLogarithm = new InverseNaturalLogarithm();
                            Double inverseNatLog = inverseNaturalLogarithm.inverseNaturalLogarithm(userValue1);
                            System.out.println("e^" + userValue1 + " = " + inverseNatLog + "\n");
                            break;

                    }
                }
            }
        }
    }