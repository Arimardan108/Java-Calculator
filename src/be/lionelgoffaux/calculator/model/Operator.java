package be.lionelgoffaux.calculator.model;

/***
 * A functional interface who represent an operation that the calculator do.
 * @author Lionel Goffaux
 */
@FunctionalInterface
public interface Operator {

    Double function(Double a, Double b);
}
