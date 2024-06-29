import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class GCDOfString {
    public String gcdOfStrings(String str1, String str2) {
        // get longest
        int longestStrLen = Math.max(str1.length(), str2.length());
        String longer;
        String shorter;
        if (longestStrLen == str1.length()) {
            longer = str1;
            shorter = str2;
        } else {
            longer = str2;
            shorter = str1;
        }

        // get pattern
        int maxPatLen = shorter.length();
        StringBuilder pattern = new StringBuilder("");
        ArrayList<String> successfulPat = new ArrayList<String>();

        for (int i = 0; i < maxPatLen; i++) {
            pattern.append(shorter.charAt(i));
            if (shorter.length() % pattern.length() != 0) {
                continue;
            }
            boolean isSuccess = true;
            StringBuilder testStr = new StringBuilder(shorter);
            while (testStr.length() != 0) {

                if (testStr.toString().substring(0, pattern.toString().length()).equals(pattern.toString())) {
                    testStr.delete(0, 0 + pattern.toString().length());
                } else {
                    isSuccess = false;
                    break;
                }
            }
            if (isSuccess) {
                successfulPat.add(pattern.toString());
            }
        }

        if (successfulPat.size() == 0) {
            return "";
        }

        Collections.sort(successfulPat, (a, b) -> Integer.compare(a.length(), b.length()));
        Collections.reverse(successfulPat);

        for (String string : successfulPat) {

            // test pattern
            boolean isSuccess = true;
            StringBuilder testStr = new StringBuilder(longer);

            if (testStr.length() % string.length() != 0) {
                isSuccess = false;
                continue;
            }

            while (testStr.length() != 0) {

                if (testStr.toString().substring(0, string.length()).equals(string)) {
                    testStr.delete(0, 0 + string.length());
                } else {
                    isSuccess = false;
                    break;
                }
            }
            if (isSuccess) {
                return string;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        GCDOfString app = new GCDOfString();
        System.out.println(
                app.gcdOfStrings("ABCABC", "ABC"));
    }
}