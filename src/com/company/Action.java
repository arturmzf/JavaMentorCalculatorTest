package com.company;

public class Action {
    private Operand first;
    private Operand second;
    private String operationType; // На всякий случай...
    private byte result;
    private String unitsRank;
    private String printResult;

    public Action(){
    }

    public Action(Operand first, Operand second, String operationType){
        this.first = first;
        this.second = second;
        if(operationType.equals("+")){
            this.result = (byte)(first.getValue() + second.getValue());
        } else if (operationType.equals("-")){
            this.result = (byte)(first.getValue() - second.getValue());
        } else if (operationType.equals("*")){
            this.result = (byte)(first.getValue() * second.getValue());
        } else if (operationType.equals("/")){
            this.result = (byte)(first.getValue() / second.getValue());
        } else {
            this.result = -100; // Для сообщения об ошибке
        }
    }

    public Operand getFirst() {
        return first;
    }

    public void setFirst(Operand first) {
        this.first = first;
    }

    public Operand getSecond() {
        return second;
    }

    public void setSecond(Operand second) {
        this.second = second;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public byte getResult() {
        return result;
    }

    public void setResult(byte result) {
        this.result = result;
    }

    public void printResult(){
        if(first.getNumberNotation() == 1) {
            System.out.println("Результат действия:\n" + this.result);
        } else {
            switch (this.result % 10){
                case 0:
                    unitsRank = "";
                    break;
                case 1:
                case -1:
                    unitsRank = "I";
                    break;
                case 2:
                case -2:
                    unitsRank = "II";
                    break;
                case 3:
                case -3:
                    unitsRank = "III";
                    break;
                case 4:
                case -4:
                    unitsRank = "IV";
                    break;
                case 5:
                case -5:
                    unitsRank = "V";
                    break;
                case 6:
                case -6:
                    unitsRank = "VI";
                    break;
                case 7:
                case -7:
                    unitsRank = "VII";
                    break;
                case 8:
                case -8:
                    unitsRank = "VIII";
                    break;
                case 9:
                case -9:
                    unitsRank = "IX";
                    break;
                default:
                    unitsRank = "Ты чего? Совсем с ума сошёл?";
            }

            if((this.result > 0) && (this.result < 10)){
                printResult = unitsRank;
            } else if((this.result >= 10) && (this.result < 20)){
                printResult = "X" + unitsRank;
            } else if((this.result >= 20) && (this.result < 30)){
                printResult = "XX" + unitsRank;
            } else if((this.result >= 30) && (this.result < 40)){
                printResult = "XXX" + unitsRank;
            } else if((this.result >= 40) && (this.result < 50)){
                printResult = "XL" + unitsRank;
            } else if((this.result >= 50) && (this.result < 60)){
                printResult = "L" + unitsRank;
            } else if((this.result >= 60) && (this.result < 70)){
                printResult = "LX" + unitsRank;
            } else if((this.result >= 70) && (this.result < 80)){
                printResult = "LXX" + unitsRank;
            } else if((this.result >= 80) && (this.result < 90)){
                printResult = "LXXX" + unitsRank;
            } else if((this.result >= 90) && (this.result < 100)){
                printResult = "XC" + unitsRank;
            } else if(this.result == 100) {
                printResult = "C";
            } else if(this.result == 0) {
                printResult = "Zero";
            } else if((this.result >= -9) && (this.result < 0)) {
                printResult = "-" + unitsRank;
            } else{
                printResult = "OOPS!\nERROR: Wrong Numbers Range";
            }

            System.out.println("Результат действия:\n" + printResult);
        }
    }
}
