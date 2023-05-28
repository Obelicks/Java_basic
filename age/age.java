public class age{
    public static void main (String[] arg){
        //initialize an input variable
        java.util.Scanner tastatur = new java.util.Scanner(System.in);
        System.out.println("Enter you age here: ");
        int age;
        try {
            age = tastatur.nextInt();
         
            if (age < 18) {
                System.out.println("You are not an adult!");
            } else {
                System.out.println("You are an adult");
            }
        }
        catch (Exception u){
            System.err.println("Wrong format you must enter an whole number!");
        }

    }
}