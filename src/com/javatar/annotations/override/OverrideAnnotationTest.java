package com.javatar.annotations.override;

public class OverrideAnnotationTest {

    public static void main(String args[]) {
        System.out.println("@Override Example");
        BaseClass test = new ChildClass();
        test.display();
    }
}
