public class Main {

    public static void main(String[] args) {
        try {
            int x = -1;
            if (x < 0) {
                throw new MyCustomException("x cannot be negative!");
            }
            System.out.println("x is " + x);
        } catch (MyCustomException e) {

            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

}
