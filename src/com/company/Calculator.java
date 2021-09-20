package com.company;

import java.util.Scanner;

class Calc {
    int calculated(int number1, int number2, char oper) {           //метод - какую операцию при каком операторе
        int result = 0;
        switch (oper) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Ошибка : Допустимые знаки +-*/");
        }
        return result;
    }

    int romeToArab (String RomeNumb) {              //говно код, но время жмёт (((

        if (RomeNumb.equals("I")) {
            Rome rome = Rome.I;                     // римские достаем из енама
            return rome.getToArab();                // арабские просто ретёрном конкретного числа
        }
        else if (RomeNumb.equals("II")) {
            Rome rome = Rome.II;
            return rome.getToArab();
        }
        else if (RomeNumb.equals("III")) {
            Rome rome = Rome.III;
            return rome.getToArab();
        }
        else if (RomeNumb.equals("IV")) {
            Rome rome = Rome.IV;
            return rome.getToArab();
        }
        else if (RomeNumb.equals("V")) {
            Rome rome = Rome.V;
            return rome.getToArab();
        }
        else if (RomeNumb.equals("VI")) {
            Rome rome = Rome.VI;
            return rome.getToArab();
        }
        else if (RomeNumb.equals("VII")) {
            Rome rome = Rome.VII;
            return rome.getToArab();
        }
        else if (RomeNumb.equals("VIII")) {
            Rome rome = Rome.VIII;
            return rome.getToArab();
        }
        else if (RomeNumb.equals("IX")) {
            Rome rome = Rome.IX;
            return rome.getToArab();
        }
        else if (RomeNumb.equals("X")) {
            Rome rome = Rome.X;
            return rome.getToArab();
        }

        return -1;
    }


}

public class Calculator {

    static int num1; // не понял почему статик , но код ниже ругался без него, поставил и работает 0_0 ---> прочитать эту тему
    static int num2;
    static int result;
    static char oper;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String vvod = console.nextLine();

        char[] allChar = new char[10];                //создали массив (куда будем заполнять)
        for (int i = 0; i < vvod.length(); i++) {     //ищем знак
            allChar[i] = vvod.charAt(i);
            if (allChar[i] == '+') {
                oper = '+';
            }
            if (allChar[i] == '-') {
                oper = '-';
            }
            if (allChar[i] == '*') {
                oper = '*';
            }
            if (allChar[i] == '/') {
                oper = '/';
            }
        }

        String numBack = String.valueOf(allChar);                   // Возвращаем
        String[] splitNum = numBack.split("[-+/*]");          // Создаем массив с разделением операторами
        String firstN = splitNum[0];                                // Создаем строку из первого чара
        String secondN = splitNum[1];                               // Создаем строку из второго чара
        String thirdN = secondN.trim();                             // Удаляем пробелы
        Calc calc = new Calc();
        num1 = calc.romeToArab(firstN);                             // присваиваем значение переменным через метод
        num2 = calc.romeToArab(thirdN);
        if (num1 < 0 || num2 < 0) {
            result = 0;
        } else if (num1>0 && num1<=10 && num2>0 && num2<=10 ){
            result = calc.calculated(num1, num2, oper);             // вычисляем значение
            Rome Rresult = Rome.getById(result);                    // ищем имя в енаме(значение римским числом)
            System.out.println(Rresult);
        }
        num1 = Integer.parseInt(firstN);                            //парсим наши знаки в числа
        num2 = Integer.parseInt(thirdN);
        result = calc.calculated(num1, num2, oper);                 //вычисляем результат
        System.out.print(result);


    }

}

