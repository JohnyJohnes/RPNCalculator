package com.company;

public interface Operation {

    public boolean isBinary();

    public String getOperator();

    public String getDescription();

//    public double execute(double val1, double val);

    public double execute(double... val) throws ExpressionFormatException;
}
