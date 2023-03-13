class Solution {
    public int solution(int age) {
        int year = 0;
        
    if(0 < age && age <= 120){
        year = 2022 - age + 1;
    }
        
        return year;
    }
}