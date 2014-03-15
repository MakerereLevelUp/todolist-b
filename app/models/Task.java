package models;

import scala.annotation.meta.getter;

/**
 * Created by sagas on 3/15/14.
 */
public class Task {
    private String taskName;

    public Task(String taskName)
    {
        this.taskName = taskName;
    }

    public String getName(){
        return this.taskName;
    }
}
