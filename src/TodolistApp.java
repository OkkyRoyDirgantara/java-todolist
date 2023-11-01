package src;

public class TodolistApp {
    public static void main(String[] args) {
        TodoModel[] todolist = new TodoModel[10];
        todolist[0] = new TodoModel("Title 1", "Description 1");
        todolist[1] = new TodoModel("Title 2", "Description 2");
        todolist[2] = new TodoModel("Title 3", "Description 3");
        todolist[3] = new TodoModel("Title 4", "Description 4");

        for (int i = 0; i < todolist.length; i++) {
            if (todolist[i] != null) {
                System.out.println(todolist[i].toString());
            }
        }
    }
}
