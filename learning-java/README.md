# Learning Java

Five earlier examples grouped into one learning folder.
The numbered directories keep similarly named classes separate.

| Directory | Main class | Concepts |
| --- | --- | --- |
| 01-methods | Moi | main, static methods and output |
| 02-output | PrintTest | System.out.println |
| 03-basics | S | Primitive types, if/else, switch, loops, arithmetic |
| 04-calculator | Mavenproject1 | Scanner input and arithmetic operations |
| 05-objects | Moi | A nested point class, fields, getters and setters |

## Run commands

Use PowerShell from the repository directory. A JDK is required.

```powershell
New-Item -ItemType Directory -Force build/methods, build/output, build/basics, build/calculator, build/objects | Out-Null

javac -encoding UTF-8 -d build/methods learning-java/01-methods/Moi.java
java -cp build/methods Moi

javac -encoding UTF-8 -d build/output learning-java/02-output/PrintTest.java
java -cp build/output PrintTest

javac -encoding UTF-8 -d build/basics learning-java/03-basics/S.java
java -cp build/basics S

javac -encoding UTF-8 -d build/calculator learning-java/04-calculator/Mavenproject1.java
java -cp build/calculator Mavenproject1

javac -encoding UTF-8 -d build/objects learning-java/05-objects/Moi.java
java -cp build/objects Moi
```

For the calculator, enter the first number, the operation (+, -, *, /),
then the second number. Unsupported operations and division by zero print
Error!. Invalid numeric text is not handled; this remains a basic exercise.

The basics example intentionally demonstrates int overflow and integer division.
The objects example prints 3 and 4 after moving a point initially at (1, 2)
by (2, 2).
