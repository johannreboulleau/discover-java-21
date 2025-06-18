# Java

## Java 7

### Fork/Join

Useful to calculate in parallel repetitive tasks

## Java 8

### Stream and Lambda
- Function
- Consumer
- Predicate
- ...

## Java 12 

### Switch

This new switch form uses the lambda-style syntax.

## Java 13

### Text block (Preview)
- Multiline string literals with `"""` for better handling of multiline strings.
- Reduces the need for ugly string concatenations or escape characters.

## Java 14

### Record (Preview)

Immutable data record that generates for us:
* Getter
* Equals, hashcode method
* toString method

**Key use case**: Simplifying boilerplate-heavy `DTOs`.

## Java 15

### Text Blocks (Finalized)
- Text blocks using `"""` were finalized as part of the language.

### Sealed Classes (Preview)
- Restrict the classes or interfaces that can extend or implement a certain class/interface.
- Useful for enforcing strict inheritance hierarchies.

## Java 16

### Record (Finalized)

### Steam enhancements
- New methods like `Stream.toList()`, offering an immutable list from a Stream.

## Java 17

### Sealed Classes (Finalized)

### Pattern Matching for `switch` (Preview)
- Cleaner integration of pattern matching with `switch` cases, making type checking and casting automatic.

## Java 21

### String templates (Removed)
**NOT USED: removed in Java 21**

### Pattern Matching for `switch` (Finalized)

### Structured Concurrency (Preview)
- Handles multiple tasks in parallel with intricate handling of task scope and lifecycle.
