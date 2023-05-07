## Ámbito de Java
En Java, las variables solo son accesibles dentro de la región en la que se crean. Esto se llama alcance.

### Alcance del método
Las variables declaradas directamente dentro de un método están disponibles en cualquier parte del método siguiendo la línea de código en la que se declararon:

Ejemplo:
```
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    int x = 100;

    // Code here can use x
    System.out.println(x);
  }
}
```

### Alcance del bloque
Un bloque de código se refiere a todo el código entre llaves.{}

Variables Los bloques declarados dentro del código solo son accesibles por el código entre las llaves, que sigue la línea en la que se declaró la variable:

Ejemplo:
```
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

  // Code here CANNOT use x

  }
}
```


