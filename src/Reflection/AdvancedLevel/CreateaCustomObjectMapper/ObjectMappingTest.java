package Reflection.AdvancedLevel.CreateaCustomObjectMapper;

import java.lang.reflect.*;
import java.util.*;

class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (properties.containsKey(field.getName())) {
                field.set(obj, properties.get(field.getName()));
            }
        }
        return obj;
    }
}

class User {
    String name;
    int age;
}

public class ObjectMappingTest {
    public static void main(String[] args) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Alice");
        data.put("age", 25);

        User user = ObjectMapper.toObject(User.class, data);
        System.out.println("User: " + user.name + ", Age: " + user.age);
    }
}

