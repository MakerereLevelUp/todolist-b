package models;

import java.util.ArrayList;
import java.util.Date;


/**
 * Created by levelup on 3/15/14.
 */
public class Task {
    private String taskName;
    private String taskDescription;
    private boolean isDue;
    private Date dateCreated;
    private Date dateEnded;



    public Task(String taskName, String taskDescription,Date dateCreated){
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dateCreated = dateCreated;
        this.isDue = true;
    }

    public String getTaskName() {
        return taskName;
    }

}