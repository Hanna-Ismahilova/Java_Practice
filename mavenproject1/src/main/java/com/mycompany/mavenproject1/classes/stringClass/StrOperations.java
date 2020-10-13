package com.mycompany.mavenproject1.classes.stringClass;

import java.util.AbstractQueue;

public class StrOperations {
    public static void main(String[] args) {

        String str1 = new String("Java - лидер Интернета!");
        String str2 = new String(str1);
        String str3 = "Строки Java эффективны.";

        int result, idx;
        char ch;

        System.out.println("Длинa strl: " + str1.length());
//Отобразить строку strl посимвольно
        for (int i = 0; i < str1.length(); i++)
            System.out.println(str1.charAt(i));
        System.out.println();

        if (str1.equals(str2))
            System.out.println("strl эквивалентна str2");
        else
            System.out.println("strl не эквивалентна str2");

        if (str1.equals(str3))
            System.out.println("strl эквивалентна str3");
        else
            System.out.println("strl не эквивалентна str3");

        result = str1.compareTo(str3);
        if (result == 0 )
            System.out.println("strl и strЗ равны");
        else if (result < 0 )
            System.out.println("strl меньше str3");
        else
            System.out.println("strl больше strЗ");

        //Присвоить переменной str2 новую строку
        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("Индeкc первого вхождения One: " + idx);
        idx  = str2.lastIndexOf("One");
        System.out.println("Индeкc последнего вхождения One: " + idx);



    }
}