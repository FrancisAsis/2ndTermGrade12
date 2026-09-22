public class parameters {
    
    static void myMethod(int x) {
        System.out.println("Value of x in myMethod: " + x);
    }

    public static void main(String[] args) {
        int x = 10; 
        System.out.println("Value of x in main: " + x);
        myMethod(x);
    }
}
