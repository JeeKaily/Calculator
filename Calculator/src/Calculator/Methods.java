package Calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Methods {

    public static void Summ(int a, int b){
        int summ;
        summ = a+b;
        System.out.println(a + " + " + b + " = " + summ);
    }

    public static void Difference(int a, int b){
        int diff;
        diff = a-b;
        System.out.println(a + " - " + b + " = " + diff);
    }

    public static int Product(int a, int b){
        int prod;
        prod = a*b;
        System.out.println(a+" * "+b+" = "+prod);
        return prod;
    }

    public static void Private(int a, int b){
        double priv;
        priv = a/b;
        System.out.println(a+" / "+b+" = "+priv);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Methods{}";
    }

    public static void Calculate(){
        double result;
//        Scanner in = new Scanner(System.in); //Создали объект класса сканнер
//        System.out.println("Please, enter your operation!");
//        String operate = in.nextLine(); //Создали строку, в которую считали данные с клавиатуры
////        System.out.println(operate);
//
//        String StringPattern = "[0-9]+"; //Объявили строковое регулярное выражение (из цифр от 0 до 9, любой длины)
//        Pattern pattern = Pattern.compile(StringPattern); // Создали объект класса Pattern и применили метод Compile
//        // берущий аргументом наше регулярное выражение
//
//        Matcher matcher = pattern.matcher(operate); //Класс Matcher интерпретирует рег. выраж. и сопоставляет его
//        // с входной строкой. Объект этого класса получаем через вызов метода "matcher" у объекта класса Pattern
//        int a = 0;
//        int b = 0;
//        while (matcher.find()){ // Цикл работает, пока выполняется условие (true). Оно выполняется, пока рег.выраж.
//            // совпадает с любой частью строки
//            System.out.println(operate.substring(matcher.start(),matcher.end()));
//            // Методы индекса Start - показывает, где совпадение было найдено в входной строке
//        }
//
//        String[] operands = operate.split("[+\-/*]"); //Разбили строку на массив строк по признаку
//        System.out.println(operands.length);

        Scanner in = new Scanner(System.in); //Создали объект класса сканнер
        System.out.println("Hello, enter first operator:");
        Integer a1 = in.nextInt();
        System.out.println("Enter second operator:");
        Integer b1 = in.nextInt();
        System.out.println("Now enter operation + , -,  *, /:");

        int a = a1;
        int b = b1;

        Scanner inn = new Scanner(System.in);
        String operation = inn.nextLine();
        System.out.println("Ok! You enter: " + a + operation + b);

        if (operation.equals("+")){
            Summ(a,b);
        }
        else
        if (operation.equals("-")){
            Difference(a,b);
        }
        else
        if (operation.equals("*")){
            Product(a,b);
        }
        else
        if (operation.equals("/")){
            Private(a,b);
        }
        else
            System.out.println("You made mistake! Try enter operation again!");
//        System.out.println("Result: "+ result);
//        a = Integer.parseInt(operate.substring(matcher.start()));
//        b = Integer.parseInt(operate.substring(matcher.end()));
//        System.out.println(a + " " + b);

    }
}

class Main{
    public static void main(String[] args) {
       Methods.Calculate();
    }
}
