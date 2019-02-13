//В методе main создай объект Man, сохрани ссылку на него в переменную man.
//Создай также объект Woman и сохрани ссылку на него в переменную woman.
//Подсказка: для создания объекта Woman и занесения его ссылки в переменную woman используй конструкцию:
//ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта();
//В man.wife сохрани ссылку на ранее созданный объект Woman.
//В woman.husband сохрани ссылку на ранее созданный объект Man (подсказка: woman.husband = man;).

package com.mycompany.mavenproject1;

/**
 *
 * @author Hanna_Ismahilova
 */
public class Task8 {
    public static void main(String[] args) {
       Man man = new Man();
       Woman woman = new Woman();
       man.wife = woman;
       woman.husband = man;//напишите тут ваш код
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
