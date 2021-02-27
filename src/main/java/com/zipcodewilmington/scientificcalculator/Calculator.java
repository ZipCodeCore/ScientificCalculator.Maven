package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    public Calculator() {
    }

    public void drawScreen(String d){

        Console.println("");
        Console.println("|------------------------------------------------|");
        Console.println("|Clear                                    Memory |");
        Console.println("|------------------------------------------------|");
        Console.println("| Current Number:                            %s  |",d);
        Console.println("|------------------------------------------------|");
        Console.println("| Add      Subtract      Multiply      Divide    |");
        Console.println("| Square   Square Root   Exponential   Inverse   |");
        Console.println("| Log      Log-1         Ln            Ln-1      |");
        Console.println("| Sine     Cosine        Tangent       Factorial |");
        Console.println("| Sine-1   Cosine-1      Tangent-1     Invert    |");
        Console.println("|------------------------------------------------|");
    }
    public double performOperation(String op, double num1, double num2){
        double returnAns;

        if(op.equalsIgnoreCase("add")){
            returnAns = this.addition(num1,num2);
        }
        else if(op.equalsIgnoreCase("subtract")){
            returnAns = this.subtraction(num1,num2);
        }
        else if(op.equalsIgnoreCase("multiply")){
            returnAns = this.multiply(num1, num2);
        }
        else if(op.equalsIgnoreCase("divide")){
            returnAns = this.divide(num1, num2);
        }
        else if(op.equalsIgnoreCase("exponential")){
            returnAns = this.exponential(num1, num2);
        }
        //below is placeholder
        else {
            returnAns = 69;
        }
        return returnAns;
    }

    public double performOperation(String op, double num){
        double returnAns;

        if(op.equalsIgnoreCase("square")){
            returnAns = this.square(num);
        }
        else if(op.equalsIgnoreCase("square root")){
            returnAns = this.squareRoot(num);
        }
        else if(op.equalsIgnoreCase("inverse")){
            returnAns = this.inverse(num);
        }
        else if(op.equalsIgnoreCase("invert")){
            returnAns = this.invert(num);
        }
        else if(op.equalsIgnoreCase("sine")){
            returnAns = this.sine(num);
        }
        else if(op.equalsIgnoreCase("cosine")){
            returnAns = this.cosine(num);
        }
        else if(op.equalsIgnoreCase("tangent")){
            returnAns = this.tangent(num);
        }
        else if(op.equalsIgnoreCase("sine-1")){
            returnAns = this.inverseSine(num);
        }
        else if(op.equalsIgnoreCase("cosine-1")){
            returnAns = this.inverseCosine(num);
        }
        else if(op.equalsIgnoreCase("tangent-1")){
            returnAns = this.inverseTangent(num);
        }
        else if(op.equalsIgnoreCase("factorial")){
            returnAns = this.factorial(num);
        }
        else if(op.equalsIgnoreCase("log")){
            returnAns = this.log(num);
        }
        else if(op.equalsIgnoreCase("log-1")){
            returnAns = this.inverseLog(num);
        }
        else if(op.equalsIgnoreCase("ln")){
            returnAns = this.naturalLog(num);
        }
        else if(op.equalsIgnoreCase("ln-1")){
            returnAns = this.inverseNaturalLog(num);
        }
        //below is placeholder
        else {
            returnAns = 69;
        }
        return returnAns;
    }

    //two variable operations
<<<<<<< HEAD
    private double addition(double x,double y){
=======
    public double addition(double x,double y){
>>>>>>> HazelBranch
        double ans = x + y;
        return ans;
    }

<<<<<<< HEAD
    private double subtraction(double x,double y){
=======
    public double subtraction(double x,double y){
>>>>>>> HazelBranch
        double ans = x - y;
        return ans;
    }

<<<<<<< HEAD
    private double multiply(double x,double y){
=======
    public double multiply(double x,double y){
>>>>>>> HazelBranch
        double ans = x * y;
        return ans;
    }

    //NEED TO FIX DIVIDE BY ZERO
<<<<<<< HEAD
    private double divide(double x,double y){
=======
    public double divide(double x,double y){
>>>>>>> HazelBranch
        double ans = x / y;
        return ans;
    }

<<<<<<< HEAD
    private double exponential(double x,double y){
=======
    public double exponential(double x,double y){
>>>>>>> HazelBranch
        double ans = Math.pow(x,y);
        return ans;
    }

    //one variable operations
<<<<<<< HEAD
    private double square(double x){
        double ans = Math.pow(x,2);
        return ans;
    }
    private double squareRoot(double x){
=======
    public double square(double x){
        double ans = Math.pow(x,2);
        return ans;
    }

    public double squareRoot(double x){
>>>>>>> HazelBranch
        double ans = Math.sqrt(x);
        return ans;
    }

<<<<<<< HEAD
    private double inverse(double x){
        double ans = (1 / x);
        return ans;
    }
    private double invert(double x){
=======
    public double inverse(double x){
        double ans = (1 / x);
        return ans;
    }

    public double invert(double x){
>>>>>>> HazelBranch
        double ans = (x * -1);
        return ans;
    }

<<<<<<< HEAD
    private double sine(double x){
=======
    public double sine(double x){
>>>>>>> HazelBranch
        double ans = Math.sin(x);
        return ans;
    }

    public double cosine(double x){
        double ans = Math.cos(x);
        return ans;
    }

    public double tangent(double x){
        double ans = Math.tan(x);
        return ans;
    }

    public double inverseSine(double x){
        double ans = Math.asin(x);
        return ans;
    }

    public double inverseCosine(double x){
        double ans = Math.acos(x);
        return ans;
    }

    public double inverseTangent(double x){
        double ans = Math.atan(x);
        return ans;
    }

    public double toRadians(double x){
        double ans = Math.toRadians(x);
        return ans;
    }

    public double toDegrees(double x){
        double ans = Math.toDegrees(x);
        return ans;
    }

    public double factorial(double x){
        double ans = 1;
        for(int i=1;i<=x;i++){
            ans *= i;
        }
        return ans;
    }

    public double log(double x){
        double ans = Math.log10(x);
        return ans;
    }

    public double inverseLog(double x){
        double ans = Math.pow(10,x);
        return ans;
    }

    public double naturalLog(double x){
        double ans = Math.log(x);
        return ans;
    }

    public double inverseNaturalLog(double x){
        double ans = Math.exp(x);
        return ans;
    }

    private String err(){
        return "Err";
    }

}