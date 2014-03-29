<<<<<<< HEAD
=======

>>>>>>> 376c90ac39bbdfc8da82acdd3dad5a57558b4f55
import models.Task;
import org.junit.Test;

import java.util.ArrayList;

<<<<<<< HEAD
import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * Created by levelup on 3/15/14.
 */
public class TaskTest {


 
=======
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
>>>>>>> 376c90ac39bbdfc8da82acdd3dad5a57558b4f55

}
