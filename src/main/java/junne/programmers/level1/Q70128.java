package junne.programmers.level1;

public class Q70128 {

    public int solution(int[] a, int[] b) {
        var answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
