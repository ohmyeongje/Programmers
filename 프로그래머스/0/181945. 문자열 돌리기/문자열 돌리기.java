import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); // 문자열 입력

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i)); // 각 문자를 한 줄씩 출력
        }
    }
}
