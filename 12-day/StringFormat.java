
public class StringFormat {
    public static void main(String[] args) {
        String name = "新之助";
        int age = 5;
        double height = 50.341839;
        // 5.2f保留小数点前五位后2位
        String info = String.format("姓名：%s，年龄：%d，身高：%5.2f", name, age, height);
        System.out.println(info);
    }
}
