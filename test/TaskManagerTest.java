import models.Task;
import models.TaskManager;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by levelup on 3/22/14.
 */
public class TaskManagerTest {

    //@Test
//    public void TestGetListOfTaskNames(){
//
//        ArrayList<Task> taskList = new ArrayList<Task>();
//        Task task1 = new Task("Homework","Complete daily assignments", new Date());
//        Task task2 = new Task("Thoughtworks session","Running Tests", new Date());
//
//        taskList.add(task1);
//        taskList.add(task2);
//
//        TaskManager taskManager = new TaskManager(taskList);
//        //when
//        ArrayList<String> result = taskManager.getListOfTaskNames();
//        //then
//        assertThat(result.size(),is(2));
//        assertThat(result.get(0), is("Homework"));
//        assertThat(result.get(1), is("Thoughtworks session"));
//
//    }

}
