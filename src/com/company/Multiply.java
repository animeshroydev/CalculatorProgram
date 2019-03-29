package com.company;

public class Multiply implements MathProcessing{
    @Override
    public String getKeyWord() {
        return "multiply";
    }

    @Override
    public char getSymbol() {
        return '*';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return leftVal * rightVal;
    }
}
