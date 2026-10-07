public class BaiTap {
    public static double withdraw(double balance, double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("So tien rut phai lon hon 0");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("So du khong du");
        } else {
            double newBalance = balance - amount;
            return newBalance;
        }
    }

    static void main(String[] args) {
        double balance = 100000;
        double amount = -30000;
        try {
            double newBalance = withdraw(balance, amount);
            System.out.println("So du con lai: " + newBalance);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
