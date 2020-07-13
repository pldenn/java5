public class Main {
    public static void main(String[] args) {
        int account =100;
        int payment =1001;
        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;
        }
        else {
            bonus = 0;
        }

        String smile;
        if (bonus == 0) {
            smile = " =(";
        }
        else {
            smile = " =)";
        }

        int balance = account + payment + bonus;
        System.out.println("Hello, thank you for your payment. Your balance is: " + balance + " RUB Your bonus is : " + bonus + " RUB." + smile);
    }
}