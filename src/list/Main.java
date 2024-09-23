package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            // Exibir o menu ao usuário
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Concluir tarefa");
            System.out.println("3. Visualizar a lista de tarefas");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Finalizar");
            System.out.print("Escolha uma opção: ");

            // Leia a entrada do usuário
            String resposta = user.nextLine();

            // Processa a entrada do usuário
            if (resposta.equalsIgnoreCase("1")) {
                // Adicione uma tarefa
                addTask(tasks, user);
            } else if (resposta.equalsIgnoreCase("2")) {
                // Conclua uma tarefa
                completeTask(tasks, user);
            } else if (resposta.equalsIgnoreCase("3")) {
                // Visualize a lista de tarefas
                viewTaskList(tasks);
            } else if (resposta.equalsIgnoreCase("4")) {
                // Remova uma tarefa
                removeTask(tasks, user);
            } else if (resposta.equalsIgnoreCase("5")) {
                // Saia do programa
                break;
            } else {
                // Entrada inválida, peça ao usuário para tentar novamente
                System.out.println("Opção invalida. Tente novamente.");
            }
        }

        // Exibir a lista de tarefas final
        System.out.println("Lista:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }

    // Método para adicionar uma tarefa
    private static void addTask(ArrayList<String> tasks, Scanner user) {
        // Peça ao usuário para entrar com uma tarefa
        System.out.print("Adicione uma tarefa: ");
        String tarefa = user.nextLine();

        // Verifique se a entrada não está vazia
        if (!tarefa.trim().isEmpty()) {
            // Adicione a tarefa à lista
            tasks.add(tarefa);
            System.out.println("Tarefa adicionada!");
        } else {
            // Entrada inválida, peça ao usuário para tentar novamente
            System.out.println("Tarefa inválida.");
        }
    }

    // Método para concluir uma tarefa
    private static void completeTask(ArrayList<String> tasks, Scanner user) {
        // Verifique se a lista de tarefas está vazia
        if (tasks.isEmpty()) {
            System.out.println("Sem tarefas para concluir.");
        } else {
            // Exibir a lista de tarefas ao usuário
            System.out.println("Selecione uma tarefa para concluir:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }

            // Peça ao usuário para entrar com o número da tarefa a concluir
            System.out.print("Insira o número da tarefa: ");
            int taskNumber = Integer.parseInt(user.nextLine());

            // Verifique se a entrada é válida
            if (taskNumber > 0 && taskNumber <= tasks.size()) {
                // Atualize a lista de tarefas para marcar a tarefa como concluída
                tasks.set(taskNumber - 1, tasks.get(taskNumber - 1) +" (concluído)");
                System.out.println("Tarefa concluída!");
            } else {
                // Entrada inválida, peça ao usuário para tentar novamente
                System.out.println("Número de tarefa invalido. Por favor tente novamente.");
            }
        }
    }

    // Método para remover uma tarefa
    private static void removeTask(ArrayList<String> tasks, Scanner user) {
        // Verifique se a lista de tarefas está vazia
        if (tasks.isEmpty()) {
            System.out.println("Sem tarefas para remover.");
        } else {
            // Exibir a lista de tarefas ao usuário
            System.out.println("Selecione uma tarefa para remover:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }

            // Peça ao usuário para entrar com o número da tarefa a remover
            System.out.println("Insira o número da tarefa: ");
            int excluir = Integer.parseInt(user.nextLine());

            // Verifique se a entrada é válida
            if (excluir > 0 && excluir <= tasks.size()) {
                // Remova a tarefa da lista
                tasks.remove(excluir - 1);
                System.out.println("Tarefa removida!");
            } else {
                // Entrada inválida, peça ao usuário para tentar novamente
                System.out.println("Número de tarefa invalido. Por favor tente novamente.");
            }
        }
    }

    // Método para visualizar a lista de tarefas
    private static void viewTaskList(ArrayList<String> tasks) {
        // Verifique se a lista de tarefas está vazia
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            // Exibir a lista de tarefas ao usuário
            System.out.println("Lista de tarefas:");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }
}