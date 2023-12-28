import java.util.ArrayList;
import java.util.List;


class Logger {
    public void log(String message) {
        System.out.println(message);
    }
}


abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}


class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}


interface Worker {
    void work();
}

class Manager implements Worker {
    @Override
    public void work() {
        System.out.println("Manager is working");
    }
}

class Coder implements Worker {
    @Override
    public void work() {
        System.out.println("Coder is coding");
    }
}


interface Repository {
    void saveData(String data);
}

class DatabaseRepository implements Repository {
    @Override
    public void saveData(String data) {
        System.out.println("Data saved to the database: " + data);
    }
}

class UserService {
    private final Repository repository;

    public UserService(Repository repository) {
        this.repository = repository;
    }

    public void saveUserData(String userData) {

        repository.saveData(userData);
    }
}


class Task {
    private final String title;

    public Task(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class TaskView {
    public void displayTask(Task task) {
        System.out.println("Task: " + task.getTitle());
    }
}

class TaskController {
    private final List<Task> tasks = new ArrayList<>();
    private final TaskView taskView;

    public TaskController(TaskView taskView) {
        this.taskView = taskView;
    }


    public synchronized void addTask(String title) {
        Task newTask = new Task(title);
        tasks.add(newTask);
        taskView.displayTask(newTask);
    }
}

