package Reflection.AdvancedLevel.GenerateaJSONRepresentation;

import java.lang.reflect.*;
import java.util.*;

class JsonConverter {
    public static String toJson(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        Map<String, Object> jsonMap = new HashMap<>();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            jsonMap.put(field.getName(), field.get(obj));
        }

        return jsonMap.toString();
    }
}

class Product {
    String name = "Laptop";
    double price = 799.99;
}

public class JsonTest {
    public static void main(String[] args) throws Exception {
        Product product = new Product();
        System.out.println(JsonConverter.toJson(product));
    }
}

