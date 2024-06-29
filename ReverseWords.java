import java.util.ArrayList;

/**
 * ReverseWords
 */
public class ReverseWords {

    public String reverseWords(String s) {
        ArrayList<String> sanitized = new ArrayList<String>();
        int wordStart = 0;
        int wordEnd = 0;
        while (wordEnd < s.length()) {
            while (wordStart < s.length() && ("" + s.charAt(wordStart)).equals(" ")) {
                wordStart++;
            }
            wordEnd = wordStart;
            while (wordEnd < s.length() && (!("" + s.charAt(wordEnd)).equals(" "))) {
                wordEnd++;
            }
            if(s.substring(wordStart, wordEnd) != ""){
                sanitized.add(s.substring(wordStart, wordEnd));
            }
            wordStart = wordEnd;
        }

        int p1 = 0;
        int p2 = sanitized.size() - 1;
        while (p1 < p2) {
            String temp = sanitized.get(p1);
            sanitized.set(p1, sanitized.get(p2));
            sanitized.set(p2, temp);
            p1++;
            p2--;
        }
        return String.join(" ", sanitized);
    }

    public static void main(String[] args) {
        ReverseWords app = new ReverseWords();
        System.out.println(app.reverseWords(" hello world "));
    }
}