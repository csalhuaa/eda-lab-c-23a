## Recursión Java
La recursión es la técnica de hacer que una función se llame a sí misma.
La recursividad puede ser un poco difícil de entender. El La mejor manera de averiguar cómo funciona es experimentar con él.

### Ejemplo de recursividad
Sumar dos números juntos es fácil de hacer, pero agregar un rango de números es más complicado. En el ejemplo siguiente, la recursividad se usa para agregar un rango de números juntos dividiéndolo en la simple tarea de sumar dos números:
```
public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
```

### Ejemplo explicado
Cuando se llama a la función, agrega un parámetro a la suma de todos los números más pequeños y devuelve el resultado. Cuando k se convierte en 0, la función sólo devuelve 0. Cuando En ejecución, el programa sigue estos pasos:sum()kk
```
10 + suma(9) 10 + ( 9 + suma(8) ) 10 + ( 9 + ( 8 + suma(7) )
)

...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + suma(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
```
Dado que la función no se llama a sí misma cuando es 0, el programa se detiene allí y devuelve el resultado.k

### Condición de detención
Así como los bucles pueden encontrarse con el problema del bucle infinito, las funciones recursivas pueden encontrarse con El problema de la recursión infinita. La recursión infinita es cuando la función nunca deja de llamarse. Toda función recursiva debe tener una condición de detención, que es la condición donde la función deja de llamarse a sí misma. En el ejemplo anterior, la condición de detención es cuando el parámetro se convierte en 0.k

Es útil ver una variedad de ejemplos diferentes para comprender mejor el concepto. En este Por ejemplo, la función agrega un rango de números entre un inicio y un final. La detención La condición para esta función recursiva es cuando el fin no es mayor que el inicio:

```
public class Main {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}
```