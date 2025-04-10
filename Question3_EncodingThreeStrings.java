// QUESTION 3:
// Encode 3 strings as per the rules described:
// Step 1: Split each into 3 parts based on length
// Step 2: Output1 = FRONT1 + MIDDLE2 + END3
//         Output2 = MIDDLE1 + END2 + FRONT3
//         Output3 = END1 + FRONT2 + MIDDLE3 (toggle case)
// Final Output: Print all 3

public class Question3_EncodingThreeStrings {

    static String[] splitParts(String str) {
        int len = str.length();
        int rem = len % 3;
        int part = len / 3;

        int front = part, middle = part, end = part;
        if (rem == 1) middle += 1;
        else if (rem == 2) {
            front += 1;
            end += 1;
        }

        String[] parts = new String[3];
        parts[0] = str.substring(0, front);
        parts[1] = str.substring(front, front + middle);
        parts[2] = str.substring(front + middle);
        return parts;
    }

    static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else
                sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input1 = "John";
        String input2 = "Johny";
        String input3 = "Janardhan";

        String[] p1 = splitParts(input1);
        String[] p2 = splitParts(input2);
        String[] p3 = splitParts(input3);

        String out1 = p1[0] + p2[1] + p3[2];
        String out2 = p1[1] + p2[2] + p3[0];
        String out3 = toggleCase(p1[2] + p2[0] + p3[1]);

        System.out.println("Output1: " + out1);  // Output1: Jhhhan
        System.out.println("Output2: " + out2);  // Output2: ohnyJan
        System.out.println("Output3: " + out3);  // Output3: NJOARD
    }
}
