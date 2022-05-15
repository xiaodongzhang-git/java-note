public class SwitchDemo {
    public static void main(String[] args) {
        char level = 'C';

        switch (level) {
            case 'A': {
                System.out.println("等级很高了");
                break;
            }
            case 'B': {
                System.out.println("等级还不错");
                break;
            }
            case 'C': {
                System.out.println("等级有点低");
                break;
            }
            default: {
                System.out.println("等级太差了");
                break;
            }

        }
    }
}
