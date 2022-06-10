public class Problem1 {
    public static void main(String[] args) {
        {
            double G = 6.674e-11;
            double sinus = 0.0;
            double factorial = 1;
            int Formula_Number = Integer.parseInt(args[0]);
            if (Formula_Number != 1 && Formula_Number != 2) {
                System.out.println("PLease enter 1 or 2 as the Formula Number");
                return;
            }
            if (Formula_Number == 1) {
                if(args.length != 4) {
                    System.out.println("You should enter 4 parameters including formula number");
                    return;
                }
                double m1 = Double.parseDouble(args[1]);
                double m2 = Double.parseDouble(args[2]);
                double F = Double.parseDouble(args[3]);
                if (m1 <= 0.0 || m2 <= 0.0 || F <= 0.0) {
                    System.out.println("Please Enter Positive values for m1 , m2 and F");
                    return;
                }
                System.out.printf("%.3e\n", Math.sqrt(m1 * m2 * G / F));
            }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            if (Formula_Number == 2) {
                if(args.length != 3) {
                    System.out.println("You should enter 3 parameters including formula number");
                    return;
                }
                float x = Float.parseFloat(args[1]);
                int n = Integer.parseInt(args[2]);
                if (n <= 0) {
                    System.out.println("please enter positive value for n");
                    return;
                }
                double power = x;
                for (int i = 0; i < n; ) {
                    sinus = sinus + Math.pow(-1, i) * power / factorial;
                    power = power * (Math.pow(x, 2));
                    factorial = factorial * 2 * ++i * (2 * i + 1);
                }
                System.out.printf("%.3e", sinus);
            }
        }
    }
}
