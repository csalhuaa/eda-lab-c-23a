## Parámetros del método Java

### Parámetros y argumentos
La información se puede pasar a los métodos como parámetro. Los parámetros actúan como variables dentro del método. Puede agregar tantos parámetros como desee, simplemente sepárelos con una coma.

Ejemplo:

```
public class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Liam");   // Liam Refsnes
    myMethod("Jenny");  // Jenny Refsnes
    myMethod("Anja");   // Anja Refsnes
  }
}
```
### Múltiples parámetros
Puedes tener tantos parámetros como quieras:

```
public class Main {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);    // Liam is 5
    myMethod("Jenny", 8);   // Jenny is 8
    myMethod("Anja", 31);   // Anja is 31 
  }
}
```


### Valores devueltos
Si usted desea que el método devuelva un valor, puede utilizar la palabra clave dentro del método:void int char void return

```
public class Main {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));    // Outputs 8 (5 + 3)
  }
}
```

### Un método con if... else
Es común usar instrucciones dentro de los métodos:if...else

```
public class Main {

  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");

    // If age is greater than, or equal to, 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!");
    }

  }

  public static void main(String[] args) {
    checkAge(20); // Call the checkAge method and pass along an age of 20
  }
}

// Outputs "Access granted - You are old enough!"
```