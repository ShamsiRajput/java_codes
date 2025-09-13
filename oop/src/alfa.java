 class CaseConversion {
    public static void main(String[] args) {
        String input = "Hello World!";
        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + toUpper(input));
        System.out.println("Lowercase: " + toLower(input));
    }

    public static String toUpper(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result.append((char) (c - 32));  // Convert lowercase to uppercase
            } else {
                result.append(c);  // Keep non-lowercase characters unchanged
            }
        }
        return result.toString();
    }

    public static String toLower(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));  // Convert uppercase to lowercase
            } else {
                result.append(c);  // Keep non-uppercase characters unchanged
            }
        }
        return result.toString();
    }
}
