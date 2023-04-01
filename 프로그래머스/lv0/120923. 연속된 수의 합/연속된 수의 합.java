class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = num * (num+1) / 2;
        int start =  (total - sum + num) / num;
        for (int i=0; i<num; i ++){
            answer[i] = start + i;
        }
        return answer;
    }
}