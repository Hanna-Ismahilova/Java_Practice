package com.mycompany.mavenproject1.classes.constructor;

public class MyClass {

    int x;

    //Конструктор класса MyClass. Конструкт должен иметь такое же название как и class.
    //Структура конструктора такая же как у метода. Название конструктора начинается с большой буквы как, так же как у class
    //Конструкт представленный ниже, является конструктором без параметров
//    MyClass() {
//        x = 10;
//    }


    //Конструктор с параметрами - определяется так же как метод с параметрами
    //i - это параметр, который используется для инициализации переменной экземпляра х
    MyClass (int i) {

        x = i;

    }
}