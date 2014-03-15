
import models.Task;
import org.junit.Test;

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

}
