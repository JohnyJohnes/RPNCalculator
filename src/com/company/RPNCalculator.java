package com.company;

import com.company.operations.Addition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RPNCalculator implements Calculator {

    private ArrayList<Operation> operations;
    ArrayList<String> notBinary = new ArrayList<String>(Arrays.asList("cos","tan","sqrt","sin","log"));
    public RPNCalculator() {
        this.operations = new ArrayList<>();
    }

    public boolean addOperation(Operation operation){
        for (Operation op:operations) {
            if (op.equals(operation))
                return false;
        }
        operations.add(operation);
        return true;
    }

    public boolean removeOperation(String operator){
//        for (Operation op : operations) {
//            if (op.getOperator().equals(operator)) {
//                operations.remove(op);
//                return true;
//            }
//        }
//        return false;

        return operations.removeIf(operation -> operation.getOperator().equals(operator));
    }

    public double execute(List<String> expression){

        double value = Double.valueOf(expression.get(0));
        expression.remove(0);
        while (!expression.isEmpty()){
            double number = Double.valueOf(expression.remove(0));
            String operator = expression.remove(0);
            for (Operation op : this.operations){
                if (op.getOperator().equals(operator)){
                    value = op.execute(value, number);
                }
            }

        }

        return value;


    }

    public boolean supportsOperation(String operator){
        return operations.stream().anyMatch(o -> o.getOperator().equals(operator));
    }

    public List<String> getOperationsInfo() {
        return operations
                .stream()
                .map(operation -> operation.getOperator() + " - " + operation.getDescription())
                .collect(Collectors.toList());
    }

    public List<String> getOperators(){
        return operations
                .stream()
                .map(op -> op.getOperator())
                .distinct()
                .collect(Collectors.toList());
    }

}
