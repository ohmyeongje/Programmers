class Solution {
    public int solution(int a, int b, int c) {
       int sum = a + b + c;
        int sumSq = a * a + b * b + c * c;
        int sumCube = a * a * a + b * b * b + c * c * c;

        if (a == b && b == c) {
            // 세 숫자가 모두 같음
            return sum * sumSq * sumCube;
        } else if (a == b || b == c || a == c) {
            // 두 숫자만 같음
            return sum * sumSq;
        } else {
            // 모두 다름
            return sum;
        }
    }
}