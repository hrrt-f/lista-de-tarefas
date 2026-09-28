# Task List CLI / Lista de Tarefas

A small Java console application for practicing collections, control flow, methods, and user input.

## Features

- Add a task.
- Mark a task as completed.
- List tasks.
- Remove a task.
- Exit and print the final list.

Tasks are stored in an `ArrayList<String>` during the current session. The interface is in Portuguese.

## Run locally

With a JDK installed, run these commands from the repository root:

```sh
mkdir -p out
javac -encoding UTF-8 -d out src/list/Main.java
java -cp out list.Main
```

Choose an option from the menu:

```text
1. Adicionar tarefa
2. Concluir tarefa
3. Visualizar a lista de tarefas
4. Remover tarefa
5. Finalizar
```

For completion and removal, enter the task number shown in the list.

## What this project demonstrates

- Dynamic collections with `ArrayList`.
- Reading console input with `Scanner`.
- Splitting operations into methods.
- Checking empty task names, empty lists, and task number ranges.

## Current scope

This is an early learning project. Data is not persisted after exit. Non-numeric task selections can raise an error, and completing a task twice appends the completion marker again. Input handling, a task model, persistence, and automated tests are possible next steps.

The compile/run commands match the package and source layout. They were not executed as part of this documentation update.

## Em português

Aplicação de terminal em Java que permite adicionar, concluir, visualizar e remover tarefas. Foi criada para praticar listas dinâmicas, métodos, estruturas de controle e entrada de dados com `Scanner`.

As tarefas ficam apenas na memória e são perdidas ao encerrar o programa. Para executar, compile `src/list/Main.java` com os comandos acima e inicie a classe `list.Main`.

Sugestões de melhoria e contribuições são bem-vindas por issues e pull requests.
