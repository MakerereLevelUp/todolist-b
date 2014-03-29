package models;

<<<<<<< HEAD
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
=======
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
>>>>>>> 376c90ac39bbdfc8da82acdd3dad5a57558b4f55
