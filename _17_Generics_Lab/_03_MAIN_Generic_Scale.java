package _17_Generics_Lab;

public class _03_MAIN_Generic_Scale {
    public static void main(String[] args) {
        _03_Scale<Integer> scale = new _03_Scale<>(13, 42);
        System.out.println(scale.getHeavier());
        System.out.println(new _03_Scale<>("A", "Z").getHeavier());
        System.out.println(new _03_Scale<>(13.5, 14.5).getHeavier());
        System.out.println(new _03_Scale<>(15.5, 15.5).getHeavier());
    }
    public static <T extends Comparable<T>> T getGreater(T first, T second){
        int result = first.compareTo(second);
        return result >= 0 ? first : second;
    }
}
