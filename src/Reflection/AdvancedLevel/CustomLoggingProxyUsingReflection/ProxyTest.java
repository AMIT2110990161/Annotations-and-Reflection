package Reflection.AdvancedLevel.CustomLoggingProxyUsingReflection;

import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}

class LoggingProxy {
    public static Object createProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("Method called: " + method.getName());
            return method.invoke(target, args);
        });
    }
}

public class ProxyTest {
    public static void main(String[] args) {
        Greeting greeting = (Greeting) LoggingProxy.createProxy(new GreetingImpl());
        greeting.sayHello();
    }
}

