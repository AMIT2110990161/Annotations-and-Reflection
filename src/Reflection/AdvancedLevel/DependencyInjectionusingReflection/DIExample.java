package Reflection.AdvancedLevel.DependencyInjectionusingReflection;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class Service {
    void serve() { System.out.println("Service is running..."); }
}

class Client {
    @Inject
    Service service;
}

class DependencyInjector {
    public static void injectDependencies(Object obj) throws Exception {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(obj, field.getType().getDeclaredConstructor().newInstance());
            }
        }
    }
}

public class DIExample {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        DependencyInjector.injectDependencies(client);
        client.service.serve();
    }
}

