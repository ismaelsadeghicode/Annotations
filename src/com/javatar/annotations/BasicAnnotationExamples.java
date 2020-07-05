package com.javatar.annotations;

@MyAnnotation
public class BasicAnnotationExamples {

    @MyAnnotation
    private String name = "MyName";

    @MyAnnotation
    public BasicAnnotationExamples(String name) {
    }

    @MyAnnotation
    public void doIt(String message){

    }

}
