#!/usr/bin/env java
import java.util.List;
import org.jspecify.Nullable;
import org.jspecify.NonNull;

public @Nullable T first( @NonNull List<T> container ) {
   return container.isEmpty() ? null : container.get(0);
}

void main() {
  var listOne = List.of("a", "b", "c");
  var listTwo = List.of(1, 2, 3);
      System.out.println(listOne.getFirst());
    System.out.println(listTwo.getFirst());
}
