public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(findSymbolOccurance("Hello world!", 'o'));
        System.out.println(findWordPosition("Hello world!", "tello"));
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

}