package com.company;

public class Subtract implements MathProcessing {
    @Override
    public String getKeyWord() {
        return "subtract";
    }

    @Override
    public char getSymbol() {
        return '-';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return leftVal - rightVal;
    }
}
