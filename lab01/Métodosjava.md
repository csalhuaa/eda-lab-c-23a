## Métodos Java
Los metodos sirven para realizar ciertas acciones, generalmente usado para reutilizar codigo

### Crear un método
Un método debe declararse dentro de una clase. Se define con el nombre del método, seguido de paréntesis ().

```
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```
#### Ejemplo explicado
- **myMethod()** es el nombre del método
- **static** significa que el método pertenece a la Clase principal y no un objeto de la clase principal.
- **void** significa que este método no tiene un valor devuelto.

### Llamar a un método
Para llamar a un método en Java, escriba el nombre del método seguido de dos paréntesis () y punto y coma;

```
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}
```
