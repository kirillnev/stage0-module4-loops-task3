package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        t = Math.abs(t);
        while(t > 9) {
            sum += t % 10;
            t /= 10;
        }
        sum += t;
        System.out.println(sum);
    }
}
