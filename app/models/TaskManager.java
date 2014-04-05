package models;

import java.util.ArrayList;

/**
 * Created by levelup on 3/22/14.
 */
public class TaskManager {


    ArrayList<Task> taskList;
    public TaskManager(ArrayList<Task> taskList){

        this.taskList = taskList;
    }


    public ArrayList<String> getListOfTaskNames() {
        ArrayList<String> listOfNames = new ArrayList<String>();

        for(int i=0;i<taskList.size();i++){
            listOfNames.add(taskList.get(i).getName());
        }
        return listOfNames;
    }
}
