// QUESTION 5:
// Given a string, insert alphabet or number between every two letters depending on their values.
// Rules:
//  - If both are letters: insert (val1+val2)%26 as char or 0 if result is 0
//  - Keep digits/spaces as they are
//  - Output string must be in lowercase

public class Question5_AlphaInsert {

    static int getCharValue(char c) {
        return Character.toLowerCase(c) - 'a' + 1;
    }

    static String processString(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); ) {
            if (Character.isLetter(input.charAt(i))) {
                result.append(Character.toLowerCase(input.charAt(i)));
                if (i + 1 < input.length() && Character.isLetter(input.charAt(i + 1))) {
                    int sum = getCharValue(input.charAt(i)) + getCharValue(input.charAt(i + 1));
                    if (sum % 26 == 0) result.append("0");
                    else result.append((char) ('a' + (sum % 26) - 1));
                }
                i++;
            } else {
                result.append(input.charAt(i));
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "ac 12a";
        String output = processString(input);
        System.out.println("Output: " + output); // Output: adc 12a
    }
}
