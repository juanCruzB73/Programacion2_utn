package TP3.Ejercicio5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class TaskList implements Iterable<Task> {
    private List<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        tasks.sort(Comparator.comparingInt(Task::getPriority).reversed());
    }

    public void removeTask(String description) {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getDescription().equals(description)) {
                iterator.remove();
                return;
            }
        }
    }

    public int getTotalTasks() {
        return tasks.size();
    }

    @Override
    public Iterator<Task> iterator() {
        return tasks.iterator();
    }
}
