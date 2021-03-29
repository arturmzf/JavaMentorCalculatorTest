package com.company;

public class Operand {
    private String operand;
    private byte value;
    private byte numberNotation; // 1 - Arabic, 2 - Roman, 3 - unknown

    public Operand(){
    }

    public Operand(String operand) {
        if (operand.equals("1") || operand.equals("2") || operand.equals("3") ||
                operand.equals("4") || operand.equals("5") || operand.equals("6") ||
                operand.equals("7") || operand.equals("8") || operand.equals("9") ||
                operand.equals("10")) {
            this.numberNotation = 1;
        } else if(operand.equals("I") || operand.equals("II") || operand.equals("III") ||
                operand.equals("IV") || operand.equals("V") || operand.equals("VI") ||
                operand.equals("VII") || operand.equals("VIII") || operand.equals("IX") ||
                operand.equals("X")){
            this.numberNotation = 2;
        } else {
            this.numberNotation = 3; // Неверный формат записи числа либо выход за диапазон
        }
        // Например, здесь...
        if (operand.equals("1") || operand.equals("I")) {
            this.value = 1;
        } else if (operand.equals("2") || operand.equals("II")) {
            this.value = 2;
        } else if (operand.equals("3") || operand.equals("III")) {
            this.value = 3;
        } else if (operand.equals("4") || operand.equals("IV")) {
            this.value = 4;
        } else if (operand.equals("5") || operand.equals("V")) {
            this.value = 5;
        } else if (operand.equals("6") || operand.equals("VI")) {
            this.value = 6;
        } else if (operand.equals("7") || operand.equals("VII")) {
            this.value = 7;
        } else if (operand.equals("8") || operand.equals("VIII")) {
            this.value = 8;
        } else if (operand.equals("9") || operand.equals("IX")) {
            this.value = 9;
        } else if (operand.equals("10") || operand.equals("X")) {
            this.value = 10;
        } else {
            this.value = 0; // Будет индикатором ошибки
        }
//      } else if(operand.equals("I") || operand.equals("II") || operand.equals("III") ||
//          operand.equals("IV") || operand.equals("V") || operand.equals("VI") ||
//          operand.equals("VII") || operand.equals("VIII") || operand.equals("IX") ||
//          operand.equals("X")){
//        this.numberNotation = 2;
//      }
    }

    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    public byte getNumberNotation() {
        return numberNotation;
    }

    public void setNumberNotation(byte numberNotation) {
        this.numberNotation = numberNotation;
    }

}
