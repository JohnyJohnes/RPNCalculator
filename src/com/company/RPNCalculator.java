package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RPNCalculator implements Calculator {

    private ArrayList<Operation> operations;
    public RPNCalculator() {
        this.operations = new ArrayList<>();
    }

    public boolean addOperation(Operation operation){
        for (Operation op:operations) {
            if (op.getOperator().equals(operation.getOperator()))
                return false;
        }
        operations.add(operation);
        return true;
    }

    private boolean isNumber(String token){
        try{
            double dummy = Double.valueOf(token);
        }catch(NumberFormatException ex){
            return false;
        }
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
            if (isNumber(expression.get(0))){
                double number = Double.valueOf(expression.remove(0));
                String operator = expression.remove(0);
                for (Operation op : this.operations) {
                    if (op.getOperator().equals(operator)) {
                        value = op.execute(value, number);
                    }
                }
            }else{
                String operator = expression.remove(0);
                for (Operation op : this.operations) {
                    if (op.getOperator().equals(operator)) {
                        value = op.execute(value);
                    }
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
