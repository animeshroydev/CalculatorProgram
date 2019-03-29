package com.company;

public class Main {
    public static void main(String[] args) {

      String[] statements = {
              "add 25.0 92.0",
              "subtract 100.0 50.0",
              "power 5.0 2.0",
              "divide 40.0 13.0",
              "multiply 12.0 12.0"
      };

      DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
              new Adder(), new Subtract(), new PowerOf(), new Division(), new Multiply()
      });

      for (String statement : statements) {
          String output = helper.process(statement);
          System.out.println(output);
      }

    }
}

// Our Calculator program is work fine...
