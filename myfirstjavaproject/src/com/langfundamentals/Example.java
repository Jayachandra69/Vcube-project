package com.langfundamentals;

public class Example {
    public static void main(String[] args) {
        // 1. Start with a primitive int
        int primitiveInt = 42;

        // 2. Autoboxing: Primitive int is automatically converted into an Integer object
        Integer boxedInteger = primitiveInt;

        // 3. Auto-unboxing: Integer object is automatically converted back into a primitive int
        int unboxedInt = boxedInteger;

        // 4. Display both values
        System.out.println("Autoboxed (Integer Object) Value: " + boxedInteger);
        System.out.println("Auto-unboxed (Primitive int) Value: " + unboxedInt);
    }
}