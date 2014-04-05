package models;

import java.util.ArrayList;

/**
 * Created by sagas on 3/15/14.
 */

public class TaskList {
    private static ArrayList<Task> tasks = new ArrayList<Task>(0);
    private static int taskCounter = 0;

    public static void addTask(Task task){
        tasks.add((int)task.getId(), task);
    }

    public static Task getTask(int id){
        return tasks.get(id);
    }



}
