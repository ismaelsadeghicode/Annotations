package com.javatar.annotations.override;

public class B extends A {

    @Override
    void eatsomething() {
        System.out.println("eating foods");
    }//should be eatSomething
}
