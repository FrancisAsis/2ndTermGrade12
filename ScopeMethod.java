public class ScopeMethod {

    static void myMethod() {
    //     //  inside the braice this called codeblock
    //     int x = 10; 
    //     System.out.println("Value of x in main: " + x);
    //     myMethod(x);
    // }

    // public static void myMethod(int x) {
    //     System.out.println("Value of x in myMethod: " + x);



        String name = "John";
        int age = 25;

        System.out.println("Value of name in myMethod: " + name + ", age: " + age);

        String Number = "10";
        int x = 10;

        System.out.println("Value of Number in myMethod: " + Number + ", x: " + x);
    }

    public static void main(String[] args) {
        myMethod();
    }
}

