package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import models.Task;
import play.libs.Json;
import  play.mvc.Controller;
import play.mvc.Result;


import java.util.List;

/**
 * Created by levelup on 4/5/14.
 */
public class TasksAPIcontroller extends Controller {

    public  static Result allTasks()
    {
        List<Task> tasks = Task.all();
        JsonNode tasksInJsonFormat = Json.toJson(tasks);
        return ok(tasksInJsonFormat);

    }
    public static Result oneTask(){
        List<Task> tasks = Task.all();
        JsonNode tasksInJsonFormat = Json.toJson(tasks.get(1));

        return ok(tasksInJsonFormat);




    }
}
