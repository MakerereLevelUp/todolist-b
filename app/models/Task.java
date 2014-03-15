package models;

import scala.annotation.meta.getter;

import java.util.ArrayList;

/**
 * Created by sagas on 3/15/14.
 */
public class Task {
    private static int globalCount = 1;
    private String taskName;
    private int id;

    public Task(String taskName)
    {
        this.taskName = taskName;
        this.id = globalCount++;
    }

    public String getName(){
        return this.taskName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}
