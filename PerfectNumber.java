

public class PerfectNumber {
    
    public static boolean solution(int n) {
        int sum = 1;
        for(int i = 2; i*i <= n; i++) {
           if(n%i == 0){
              sum += i + n/i;
           }
        }
        return (sum == n) && (n != 1);
     }
    

    public static void main(String[] args) {
        int num = 28;  // sample input
    boolean isPerfect = solution(num);
    System.out.println(isPerfect);  // expected output: true

}
}