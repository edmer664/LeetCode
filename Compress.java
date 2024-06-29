public class Compress {
    public int compress(char[] chars) {
        if(chars.length ==  1){
            return 2;
        }

        char currentChar = chars[0];
        int currentLength = 0;
        int pointer1 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1 && currentChar == chars[i] ) {
                currentLength++;
            } else {
                chars[pointer1] = currentChar;
                pointer1++;

                currentChar = chars[i];

                for (char character : String.valueOf(currentLength).toCharArray()) {
                    chars[pointer1] = character;
                    pointer1++;
                }
                currentLength = 0;

            }
        }
        return pointer1;
    }
    public static void main(String[] args) {
        Compress c = new Compress();
        System.out.println(c.compress(new char[]{'a','a','b','b','c','c'}));
    }
}
