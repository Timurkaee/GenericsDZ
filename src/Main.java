public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<>(4);

        stringMagicBox.add("123");
        stringMagicBox.add("321");
        stringMagicBox.add("789");
        stringMagicBox.add("teXt");

        String pick = stringMagicBox.pick();
        System.out.println(pick);
    }
}
