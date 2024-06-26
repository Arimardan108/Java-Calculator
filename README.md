# Calculator

This is a simple calculator using M.V.C. pattern. It's made to exemplify
the pattern.

## Build

### Requirements:

* JDK 1.8
* Ant Builder

```text
git clone https://github.com/lionelGoffaux/Calculator.git
cd Calculator
ant jar
```

After that the jar file is emerged.

## Working

### Run

To run the Calculator on linux and OS X, you just need to run this command.
```text
java -jar Calculator.jar
```
On  Windows, just double click on the jar file.

### Using

This calculator is a little bit different from the classic calculators.
It's using the RPM for Reverse Polish notation. That mean that
to do 1 + 1, you need to do 1, enter, 1, +.
This is working with other operations too.

For more details on RPN see https://en.wikipedia.org/wiki/Reverse_Polish_notation
