public class Main {
    public static void main(String[] args) {
        long account =100;
        long payment =1001;
        long bonus = 0;
        if (payment > 1000) {
            bonus = payment / 100;
        }
        String smile = " =)";
        if (bonus == 0) {
            smile = " =(";
        }

        System.out.println("Hello, thank you for your payment. Your balance is: " + (account + payment + bonus) + " RUB Your bonus is : " + bonus + " RUB." + smile);
    }
}
