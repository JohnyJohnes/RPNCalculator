package com.company;

import com.company.operations.Addition;
import com.company.operations.Multiplication;
import com.company.operations.Subtraction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ExpressionFormatException{
	    RPNCalculator calc = new RPNCalculator();

        calc.addOperation(new Addition());
        calc.addOperation(new Subtraction());
        calc.addOperation(new Multiplication());

        Parser parser = new Parser(calc.getOperators());

        List<String> tokens = parser.parse("3 4 + 7 * 9 - 11 +");

        System.out.println(calc.execute(tokens));
    }
}
