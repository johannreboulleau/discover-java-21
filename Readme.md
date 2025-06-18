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

## Java 9

### Modules
- To organize the code
- new level as package, class, method
- 

It declares:
- a name
- a list of dependencies on other modules
- a public API (with everything else being module internal and inaccessible)
- a list of services it uses and provides

## Java 10

### Local Variable Type Inference

**keyword: `var`**

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

### String templates (Deprecated)
**NOT USED: removed in Java 23**

### Pattern Matching for `switch` (Finalized)

### Virtual thread

Platform thread is a Java wrapper for OS thread.

Advantages:
- free a platform thread, and memory thread when we have a blocking process as I/O.
- useful with a web server with lot of request with I/O
- not faster than platform thread

Avoid to use Virtual thread with:
- heavy task with CPU
- synchronized 
- forgot to unmount virtual threads

### Preview

#### Structured Concurrency (Preview)
- Handles multiple tasks in parallel with intricate handling of task scope and lifecycle.

#### Foreign Function aand Memory API (Preview)
- handle native memory

#### Scoped Values (Preview)
A new API for safely sharing immutable values across threads.

# Garbage collector

4 types:
- Serial Garbage Collector (< JDK 5) => for mono-thread
- Parallel Garbage Collector (JDK 5 - JDK 8) => multi-thread 
- G1 Garbage Collector (> JDK 7) => large memory consumption
- Z Garbage Collector (default) (<= JDK 15 finalized)
  - ZGC performs all expensive work concurrently, without stopping the execution of application threads for more than 10 ms, which makes it suitable for applications that require low latency. 
