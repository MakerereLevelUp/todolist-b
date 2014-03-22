import models.Task;
import models.TaskManager;
import org.fest.assertions.Assertions;
import org.junit.Test;
import play.mvc.Content;

import java.util.ArrayList;
import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;

/**
 * Created by levelup on 3/15/14.
 */
public class ListTest {

    @Test
    public void testTheListToDisplay(){

        ArrayList<Task> taskList = new ArrayList<Task>();
        Task task1 = new Task("Homework","Complete daily assignments", new Date());
        Task task2 = new Task("Thoughtworks session","Running Tests", new Date());
        taskList.add(task1);
        taskList.add(task2);

        TaskManager taskManager = new TaskManager(taskList);

        ArrayList<String> result = taskManager.getListOfTaskNames();
        Content html = views.html.victor.render(result);
        Assertions.assertThat(contentType(html)).isEqualTo("text/html");


    }
}
