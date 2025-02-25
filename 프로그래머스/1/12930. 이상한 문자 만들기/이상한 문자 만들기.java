class Solution {
    public String solution(String s) {
        String answer = "";  // 결과 문자열
        int count = 0;       // 단어 내 글자 인덱스 (공백을 만나면 초기화)
        String sub;          // 현재 문자 저장

        for (int i = 0; i < s.length(); i++) {  // 문자열 전체 순회
            sub = s.substring(i, i + 1);       // 현재 인덱스의 문자 가져오기

            if (sub.equals(" ")) {  // 공백이라면
                answer += " ";      // 그대로 추가
                count = 0;          // 새로운 단어 시작을 위해 초기화
            } else {
                if (count % 2 == 0) {  // 짝수 인덱스이면
                    answer += sub.toUpperCase();  // 대문자로 변환
                } else {                // 홀수 인덱스이면
                    answer += sub.toLowerCase();  // 소문자로 변환
                }
                count++;  // 단어 내 글자 인덱스 증가
            }
        }
        return answer;
    }
}