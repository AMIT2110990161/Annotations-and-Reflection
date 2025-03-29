package Reflection.IntermediateLevel.RetrieveAnnotationsatRuntime;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

