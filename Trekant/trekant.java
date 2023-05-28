public class trekant {  
    private static double hypotenuse(double a, double b){
        //takes to sides of a triangle and returns the hypotenuse
        return Math.sqrt(a*a + b*b);
    }
    public static void main (String[] arg){
        System.out.println(hypotenuse(3.0, 4.0));
    }
}
