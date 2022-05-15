
public class BreakeContinueDemo{
    public static void main(String[] args) {
        int sum = 0;

        for (int x=0; x < 11; x++) {
            if(x > 5){
                break;
            }else{
                System.out.println(x);
                sum += x;
            }
        }

        System.out.println(sum); // 15

        sum = 0;
        for (int x=0; x < 11; x++) {
            if(x % 2 == 0){
                continue;
            }else{
                System.out.println(x);
                sum += x;
            }
        }

        System.out.println(sum); // 25
    }
}