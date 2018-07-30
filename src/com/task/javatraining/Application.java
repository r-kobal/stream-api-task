package com.task.javatraining;

import com.task.javatraining.model.Department;
import com.task.javatraining.model.Group;
import com.task.javatraining.model.Lesson;
import com.task.javatraining.model.Student;
import com.task.javatraining.service.ApplicationService;

import java.util.Collection;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        ApplicationService service = new ApplicationService();

        Collection<Lesson> allLessons = service.getAllLessons();

        int amountOfGroupsWithBadStudents = service.getAmountOfGroupsWithBadStudents();

        Map<Group, Integer> averageMarksInGroups = service.getAverageMarksInGroups();

        Map<Lesson, Double> averageMarksInLessons = service.getAverageMarksInLessons();

        Collection<Group> groupsWhereAtLeastThreeHighAchieverStudents = service.getGroupsWhereAtLeastThreeHighAchieverStudents();

        Collection<String> groupTitlesWhereStudentsAreWomen = service.getGroupTitlesWhereStudentsAreWomen();

        Department department = null; // TODO initialize your department
        Collection<String> studentFullNamesFromSpecifiedDepartment = service.getStudentFullNamesFromSpecifiedDepartment(department);

        Collection<Student> studentsSuitableForMarry = service.getStudentsSuitableForMarry();

    }

}
