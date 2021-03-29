package com.company;

import java.util.Scanner;

public class Main {
    public static String operand1;
    public static String operand2;
    public static String operationType;

    public static void main(String[] args) {
	    System.out.println("Зравствуйте!");
        System.out.println("Пожалуйста," +
                "введите арифметическое выражение, " +
                "значение которого хотите вычислить, " +
                "в формате \"5 + 5\" и нажмите ENTER:");
        Scanner scanner = new Scanner(System.in);
        operand1 = scanner.next();
        operationType = scanner.next();
        operand2 = scanner.next();

        try{
            Operand first = new Operand(operand1);
            Operand second = new Operand(operand2);
            if((first.getNumberNotation() != second.getNumberNotation()) &&
                    first.getNumberNotation() != 3 && second.getNumberNotation() != 3){
                throw new Exception("Формы записи чисел не совпадают...");
            } else if(first.getNumberNotation() == 3 || second.getNumberNotation() == 3) {
                throw new Exception("Неверный формат записи числа или выход за диапазон " +
                        "допустимых значений входных данных...");
            }

            Action action = new Action(first, second, operationType);
            if(action.getResult() == -100){
                throw new Exception("Вы ввели недопустимый тип действия...");
            }

            action.printResult();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Программа завершена с ошибками!");
        }


    // Tests
        //System.out.println(expression1 + "." + expression2 + "." + expression3);
        //System.out.println(first.getValue());
        //System.out.println(first.getNumberNotation());
    }
}
