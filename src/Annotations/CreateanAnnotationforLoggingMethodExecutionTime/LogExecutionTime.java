package Annotations.CreateanAnnotationforLoggingMethodExecutionTime;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

