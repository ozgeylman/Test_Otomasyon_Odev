package org.example;

public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        GenericClass<Integer> intInstance = new GenericClass<>(10);
        intInstance.printValue();

        GenericClass<String> stringInstance = new GenericClass<>("Merhaba Dünya");
        stringInstance.printValue();

        GenericClass<Double> doubleInstance = new GenericClass<>(3.14);
        doubleInstance.printValue();

        GenericClass<Boolean> boolInstance = new GenericClass<>(true);
        boolInstance.printValue();
    }
}

