public class ParametrosDeMetodo {
    public static void main(String[] args) {
        
        // Ejercicio 3
        myMethod("John");

        // Ejercicio 4
        System.out.println(myMethod(3));

        // Ejercicio 5
        checkAge(20);
    }

    static void myMethod(String fname) {
        System.out.println(fname + " Doe");
    }

    static int myMethod(int x) {
        return 5 + x;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }
}