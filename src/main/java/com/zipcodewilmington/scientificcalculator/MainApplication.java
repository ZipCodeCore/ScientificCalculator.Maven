package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {


        Features f = new Features();
        SciFeatures sf = new SciFeatures();
        sf.displayMode = "decimal";
        sf.unitsMode = "Degrees";

        Console.println("Welcome to my calculator!");

        String s = Console.getStringInput("Please enter your name?");

        int display = 0;
        int r = 1;
        do {
            try {
                Double calcDouble = Console.getDoubleInput("Press 1 for base calculator and 2 for scientific calculator. ");

                if (calcDouble == 1) {
                    Console.println("Current number is :" + display);

                    //Double i = Console.getDoubleInput("Please enter another number if you want:");

                    boolean check = true;
                    while (check) {
                        do {
                            try {
                                r = 1;
                                Double i = Console.getDoubleInput("Please enter another number if you want:");
                                String op = Console.getOperationInput("Enter an operation : +, - , *, /, ^2, ^y, inverse, sqrt, invert, c, end : ");
                                if (op.equals("+")) {
                                    Double i1 = Console.getDoubleInput("Please enter next number:");
                                    Console.println("New Value is: " + f.add(i, i1));
                                    i = f.add(i, i1);
                                } else if (op.equals("-")) {
                                    Double i1 = Console.getDoubleInput("Please enter next number:");
                                    Console.println("New Value is: " + f.subtract(i, i1));
                                } else if (op.equals("*")) {
                                    Double i1 = Console.getDoubleInput("Please enter next number:");
                                    Console.println("New Value is: " + f.multiply(i, i1));
                                } else if (op.equals("/")) {
                                    Double i1 = Console.getDoubleInput("Please enter next number:");
                                    if (i1 == 0) {
                                        Console.println("Err");
                                    } else {
                                        Console.println("New Value is: " + f.divide(i, i1));
                                    }
                                } else if (op.equals("^y")) {
                                    Double i1 = Console.getDoubleInput("Please enter next number:");
                                    Console.println("New Value is: " + f.exponent(i, i1));

                                } else if (op.equals("^2")) {
                                    Console.println("New Value is: " + f.square(i));
                                } else if (op.equals("sqrt")) {
                                    if (i < 0) {
                                        Console.println("Err");
                                    } else {
                                        Console.println("New Value is: " + f.root(i));
                                    }
                                } else if (op.equals("inverse")) {
                                    if (i == 0) {
                                        Console.println("Err");
                                    } else {
                                        Console.println("New Value is: " + f.inverse(i));
                                    }
                                } else if (op.equals("invert")) {
                                    Console.println("New Value is: " + f.invert(i));
                                } else if (op.equals("c")) {
                                    Console.println("New Value is: " + f.clear());
                                    i = 0.0;
                                } else if (op.equals("end")) {
                                    check = false;
                                    r = 2;
                                } else {
                                    Console.println("Err");
                                }

                            } catch (Exception e) {

                            }
                        } while (r == 1);
                    }
                } else if (calcDouble == 2) {
                    Console.println("The current modes are decimal and Degrees.");
                    Console.println("Current number is :" + display);

                    //Double i = Console.getDoubleInput("Please enter another number if you want:");

                    boolean check = true;
                    while (check) {
                        do {
                            try {
                                r = 1;
                                Double i = Console.getDoubleInput("Please enter another number if you want:");
                                String op = Console.getOperationInput("Enter an operation : +, - , *, /, ^2, ^y, inverse, sqrt, invert, display(), display, M+, MC, MRC, Sine, Cosine,\n" +
                                        " Tangent, invSine, invCosine, invTangent, units(), units, log, 10^x, Ln, e^x, !, c, end : ");
                                if (op.equals("+")) {
                                    Double i1 = Console.getDoubleInput("Please enter next number:");
                                    Console.println("New Value is: " + f.add(i, i1));
                                    i = f.add(i, i1);
                                } else if (op.equals("-")) {
                                    Double i1 = Console.getDoubleInput("Please enter next number:");
                                    Console.println("New Value is: " + f.subtract(i, i1));
                                    i = f.subtract(i,i1);
                                } else if (op.equals("*")) {
                                    Double i1 = Console.getDoubleInput("Please enter next number:");
                                    Console.println("New Value is: " + f.multiply(i, i1));
                                    i = f.multiply(i,i1);
                                } else if (op.equals("/")) {
                                    Double i1 = Console.getDoubleInput("Please enter next number:");
                                    if (i1 == 0) {
                                        Console.println("Err");
                                    } else {
                                        Console.println("New Value is: " + f.divide(i, i1));
                                        i = f.divide(i,i1);
                                    }
                                } else if (op.equals("^y")) {
                                    Double i1 = Console.getDoubleInput("Please enter next number:");
                                    Console.println("New Value is: " + f.exponent(i, i1));
                                    i = f.exponent(i,i1);
                                } else if (op.equals("^2")) {
                                    Console.println("New Value is: " + f.square(i));
                                    i = f.square(i)
                                } else if (op.equals("sqrt")) {
                                    if (i < 0) {
                                        Console.println("Err");
                                    } else {
                                        Console.println("New Value is: " + f.root(i));
                                        i = f.root(i);
                                    }
                                } else if (op.equals("inverse")) {
                                    if (i == 0) {
                                        Console.println("Err");
                                    } else {
                                        Console.println("New Value is: " + f.inverse(i));
                                        i = f.inverse(i);
                                    }
                                } else if (op.equals("invert")) {
                                    Console.println("New Value is: " + f.invert(i));
                                    i = f.invert(i);
                                } else if (op.equals("c")) {
                                    Console.println("New Value is: " + f.clear());
                                    i = 0.0;
                                } else if (op.equals("end")) {
                                    check = false;
                                    r = 2;
                                } else if (op.equals("switch()")) {
                                    int t = 1;
                                    do{
                                        try{
                                            String imp = Console.getStringInput("Type binary, octal, decimal, hexadecimal");
                                            if (imp.equalsIgnoreCase("binary")){
                                                sf.switchDisplayMode("binary");
                                            }
                                            else if (imp.equalsIgnoreCase("octal")){
                                                sf.switchDisplayMode("octal");
                                            }
                                            else if (imp.equalsIgnoreCase("decimal")){
                                                sf.switchDisplayMode("decimal");
                                            }
                                            else if (imp.equalsIgnoreCase("hexadecimal")){
                                                sf.switchDisplayMode("hexadecimal");
                                            }
                                            t++;
                                        } catch (Exception e){
                                            Console.println("Why are you the way that you are?");
                                        }
                                    } while (t == 1);
                                }
                                else if (op.equals("switch")){
                                    sf.switchDisplayMode();
                                }
                                else if (op.equals("M+")){
                                    sf.storeMemory(i);
                                }
                                else if (op.equals("MC")){
                                    sf.clearMemory();
                                }
                                else if (op.equals("MRC")){
                                    Console.println("" + sf.memoryRecall());
                                    i = sf.memoryRecall();
                                }
                                else if (op.equals("Sine")){
                                    if (sf.unitsMode == "Degrees"){
                                        Console.println("New Value is: " +sf.sine(i));
                                        i = sf.sine(i);
                                    }
                                    else {
                                        Console.println("New Value is: " +sf.sine(Math.toRadians(i)));
                                        i = sf.sine(Math.toRadians(i));
                                    }
                                }
                                else if (op.equals("Cosine")){
                                    if (sf.unitsMode == "Degrees"){
                                        Console.println("New Value is: " +sf.cosine(i));
                                        i = sf.cosine(i);
                                    }
                                    else {
                                        Console.println("New Value is: " +sf.cosine(Math.toRadians(i)));
                                        i = sf.cosine(Math.toRadians(i));
                                    }
                                }
                                else if (op.equals("Tangent")){
                                    if (sf.unitsMode == "Degrees"){
                                        Console.println("New Value is: " +sf.tangent(i));
                                        i = sf.tangent(i);
                                    }
                                    else {
                                        Console.println("New Value is: " +sf.tangent(Math.toRadians(i)));
                                        i = sf.tangent(Math.toRadians(i));
                                    }
                                }
                                else if (op.equals("invSine")){
                                    if (sf.unitsMode == "Degrees"){
                                        Console.println("New Value is: " +sf.sineInverse(i));
                                        i = sf.sineInverse(i);
                                    }
                                    else {
                                        Console.println("New Value is: " +sf.sineInverse(Math.toRadians(i)));
                                        i = sf.sineInverse(Math.toRadians(i));
                                    }
                                }
                                else if (op.equals("invCosine")){
                                    if (sf.unitsMode == "Degrees"){
                                        Console.println("New Value is: " +sf.cosineInverse(i));
                                        i = sf.cosineInverse(i);
                                    }
                                    else {
                                        Console.println("New Value is: " +sf.cosineInverse(Math.toRadians(i)));
                                        i = sf.cosineInverse(Math.toRadians(i));
                                    }
                                }
                                else if (op.equals("invTangent")){
                                    if (sf.unitsMode == "Degrees"){
                                        Console.println("New Value is: " +sf.tangentInverse(i));
                                        i = sf.tangentInverse(i);
                                    }
                                    else {
                                        Console.println("New Value is: " +sf.tangentInverse(Math.toRadians(i));
                                        i = sf.tangentInverse(Math.toRadians(i));
                                    }
                                }
                                else if (op.equals("log")){
                                    if (i <= 0){
                                        Console.println("Err");
                                    }
                                    else {
                                        Console.println("New Value is: " + sf.logarithm(i));
                                        i = sf.logarithm(i);
                                    }
                                }
                                else if (op.equals("10^x")){
                                    Console.println("New Value is: " + sf.inverseLog(i) );
                                    i = sf.inverseLog(i);
                                }
                                else if (op.equals("Ln")){
                                    if (i <= 0){
                                        Console.println("Err");
                                    }
                                    else {
                                        Console.println("New Value is: " + sf.naturalLog(i));
                                        i = sf.naturalLog(i);
                                    }
                                }
                                else if (op.equals("e^x")){
                                    Console.println("New Value is: " + sf.inverseNaturalLog(i) );
                                    i = sf.inverseNaturalLog(i);
                                }
                                else if (op.equals("!")){
                                    int factor = Math.toIntExact(Math.round(i));


                                    Console.println("New Value is: " + sf.factorial(factor));
                                    i = Double.valueOf(sf.factorial(factor));
                                }

                                else {
                                    Console.println("Err");
                                }

                            } catch (Exception e) {

                            }
                        } while (r == 1);
                    }
                }
            } catch (Exception e) {
                Console.println("Wrong input");
            }
        } while (r == 1) ;
    }
}
