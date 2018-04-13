package com.company.operations;

import com.company.ExpressionFormatException;
import com.company.Operation;

import static java.lang.Math.log;


public class Log implements Operation{
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "log";
    }

    @Override
    public String getDescription() {
        return "performs log operation";
    }

    @Override
    public double execute(double... val) throws ExpressionFormatException {
        return log(val[0]);
    }
}
