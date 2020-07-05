package com.javatar.annotations;

import java.lang.annotation.*;

//@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String value() default "ali";

    int count() default 12;
}
