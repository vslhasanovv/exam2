public class TextCleaner {


    private String manualTrim(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    private String manualLowerCase(String s) {
        String result = "";

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                // ASCII fərqi: 32
                result += (char) (c + 32);
            } else {
                result += c;
            }
        }

        return result;
    }

    private String removeDigits(String s) {
        String result = "";

        for (char c : s.toCharArray()) {
            if (!(c >= '0' && c <= '9')) {
                result += c;
            }
        }

        return result;
    }

    private String normalizeSpaces(String s) {
        String result = "";
        boolean lastWasSpace = false;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (!lastWasSpace) {  // yalnız 1 boşluq yaz
                    result += c;
                }
                lastWasSpace = true;
            } else {
                result += c;
                lastWasSpace = false;
            }
        }

        return result;
    }


    public String cleanText(String s) {
        s = manualTrim(s);
        s = manualLowerCase(s);
        s = removeDigits(s);
        s = normalizeSpaces(s);
        return s;
    }
}

