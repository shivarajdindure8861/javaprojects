package com.axis.anotation;

import java.lang.reflect.Field;

public class GetSetProcessor {
    public static void GenerateAccessors(Object obj) {
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            String name = field.getName();
            String camelCaseFeildName = Character.toUpperCase(name.charAt(0)) + name.substring(1);

            System.out.println(camelCaseFeildName);

            String getterName = "get" + camelCaseFeildName;
            String setterName = "set" + camelCaseFeildName;
            System.out.println(getterName);
            System.out.println(setterName);
        }
    }
}
