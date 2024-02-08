public class calculateAverage {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments were passed.");
        } else {
            double sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum += Double.parseDouble(args[i]);
            }
            System.out.println("The average is: " + sum / args.length);
        }
    }
}
