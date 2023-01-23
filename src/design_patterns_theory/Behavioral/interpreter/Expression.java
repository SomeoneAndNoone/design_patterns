package design_patterns_theory.Behavioral.interpreter;

// ** Interpreter pattern provides a way to evaluate language grammar or expression.
// This type of pattern comes under behavioral pattern. This pattern involves
// implementing an expression interface which tells to interpret a particular context.
// This pattern is used in SQL parsing, symbol processing engine etc.
public interface Expression {
   public boolean interpret(String context);
}