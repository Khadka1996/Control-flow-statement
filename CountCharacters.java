public class CountCharacters {
    public static void main(String[] args) {
        String str = "HelloWorld";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println("Total characters: " + count);
    }
}
