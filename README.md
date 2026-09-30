# Java Learning Archive

Earlier Java learning examples, organized by topic. This repository records
basic programming practice and is separate from future standalone projects.

## Start here

All examples are in [learning-java](learning-java/README.md).

| Topic | Example |
| --- | --- |
| Methods | Splitting a greeting program into small methods |
| Console output | A minimal print example |
| Java basics | Types, conditions, loops, arithmetic and overflow |
| Console input | A four-operation calculator |
| Objects | A small point class with getters, setters and movement |

## Run an example

Requires a JDK. No external dependencies are needed.
From the repository directory in PowerShell:

```powershell
New-Item -ItemType Directory -Force build/methods | Out-Null
javac -encoding UTF-8 -d build/methods learning-java/01-methods/Moi.java
java -cp build/methods Moi
```

See [the example guide](learning-java/README.md) for the remaining commands.
Compile examples separately: two examples use the class name Moi.

## About this archive

These files are preserved learning examples, not finished products.
The reorganization keeps source contents unchanged. The calculator filename
was changed to match its public Java class: Mavenproject1.java.
Repository organization and documentation were prepared with a coding assistant.
