package loops;

public class Loop_02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i <= 30; i += 3) {
            sum += i;
        }
        System.out.println(sum);
    }
}