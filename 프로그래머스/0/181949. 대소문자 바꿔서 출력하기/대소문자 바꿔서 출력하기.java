import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); // 문자열 입력 받기
        StringBuilder result = new StringBuilder();

        for (char ch : a.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // 알파벳이 아닌 경우 그대로 추가
            }
        }

        System.out.println(result.toString());
    }
}
