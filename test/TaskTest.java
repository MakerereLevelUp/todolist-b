
import models.Task;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sagas on 3/15/14.
 */

public class TaskTest {

    @Test
    public void doesTaskHaveAName(){
        String taskName = "NewTask";
        Task task = new Task(taskName);
        assertThat(task.getName(), is(taskName));
    }
    @Test
    public void doTasksHaveAnID(){
        Task task = new Task("SomeTask");
        boolean taskHasID = (task.getId() > 0);
        assertThat(taskHasID, is(true));
    }

    @Test
    public void canGetTasks(){

    }

}
