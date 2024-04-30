# cont9 Project

## To Execute:

In the terminal, go to the project root folder.

Compile the project:

```javac -d bin src/com/sinerji/**/*.java```

Perform file comparison

```java -cp bin src/com/sinerji/main/Main.java sped-original.txt sped-alterado-contimatic.txt```

A .txt file will be generated at the root of the project containing the results of the comparisons.
