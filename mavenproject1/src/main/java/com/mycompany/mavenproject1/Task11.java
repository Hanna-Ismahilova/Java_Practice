//Создай объект типа Cat (кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
//Присвой каждому животному владельца (owner).
//
//Требования:
//Программа не должна выводить текст на экран.
//В методе main создай объекты типа Cat, Dog, Fish, Woman занеси их ссылки в переменные.
//В методе main присвойте каждому животному владельца Woman.
//Класс Cat, Dog, Fish должен содержать только одну переменную Woman owner.
//Класс Woman не должен содержать переменных.
package com.mycompany.mavenproject1;

/**
 *
 * @author Hanna_Ismahilova
 */
public class Task11 {
    public static void main(String[] args) {
        Woman woman = new Woman();
        Cat cat = new Cat();
        cat.owner = woman;
        Dog dog = new Dog();
        dog.owner = woman;
        Fish fish = new Fish();
        fish.owner = woman;
      
      //напишите тут ваш код
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
