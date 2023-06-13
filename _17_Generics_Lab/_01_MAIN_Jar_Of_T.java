package _17_Generics_Lab;

public class _01_MAIN_Jar_Of_T {
    public static void main(String[] args) {
        _01_Jar <Integer> integerJar = new _01_Jar<>();
        _01_Jar <String> stringJar = new _01_Jar<>();

        integerJar.add(13);
        stringJar.add("myString");
    }
}
