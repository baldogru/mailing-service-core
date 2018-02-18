package org.baldogru.mailingservice.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Adnotacja informacyjna, oznaczająca, że klasa powinna być projektowana jako niemodyfikowalna (Immutable).
 * Wynika m.in. z tego to, że pola powinny mieć modyfikator final, konstruktor powinien inicjalizować wartości
 * wszystkich pól, klasa nie powinna zawierać setterów.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Immutable {
}
