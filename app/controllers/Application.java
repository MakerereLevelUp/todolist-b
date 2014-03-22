package controllers;

import models.Task;
import models.TaskManager;
import play.*;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.Date;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result taskList(){
        ArrayList<Task> taskList = new ArrayList<Task>();
        Task task1 = new Task("Task1","Do task", new Date());
        Task task2 = new Task("Task2","Do task now", new Date());
        Task task3 = new Task("Task3","Do task anytime", new Date());
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        TaskManager taskManager = new TaskManager(taskList);

        ArrayList<String> listOfNames = taskManager.getListOfTaskNames();
        return ok(victor.render(listOfNames));
    }

}
