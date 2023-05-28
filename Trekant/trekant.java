public class trekant {
    
    private static double hypotenuse(double a, double b){
        return Math.sqrt(a*a + b*b);
    }
    public static void main (String[] arg){
        System.out.println(hypotenuse(3.0, 4.0));
    }
}
