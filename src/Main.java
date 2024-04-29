public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(findSymbolOccurance("Hello world!", 'o'));
        System.out.println(findWordPosition("Hello world!", "tello"));
        System.out.println(stringReverse("Hello world!"));
        System.out.println(isPalindrome("ollo"));
    }

    static public int findSymbolOccurance(String source, char symbol) {
        int counter = 0;
        for (int i = 0; i < source.length(); i ++) {
            if(source.charAt(i) == symbol) {
                counter++;
            }
        }
            return counter;
    }

    static public int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    static public String stringReverse(String source) {
        return new StringBuilder(source).reverse().toString();
    }

    static boolean isPalindrome(String source) {
        return source.equals(stringReverse(source));
    }

}