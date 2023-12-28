
public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("Application started");


        Circle circle = new Circle(5.0);
        System.out.println("Area of the circle: " + circle.calculateArea());


        Penguin penguin = new Penguin();
        penguin.fly();


        Worker manager = new Manager();
        Worker coder = new Coder();
        manager.work();
        coder.work();


        Repository databaseRepository = new DatabaseRepository();
        UserService userService = new UserService(databaseRepository);
        userService.saveUserData("User data to save");


        TaskView taskView = new TaskView();
        TaskController taskController = new TaskController(taskView);
        taskController.addTask("Complete the project");

        logger.log("Application stopped");
    }
}
