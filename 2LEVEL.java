class LCMCalculator {
    public static void main(String[] args) {
        int num1 = 72, num2 = 120;
        int lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
                break;
            }
            lcm++;
        }
    }
}
