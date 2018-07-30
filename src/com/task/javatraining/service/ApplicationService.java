package com.task.javatraining.service;

import com.task.javatraining.model.Department;
import com.task.javatraining.model.Group;
import com.task.javatraining.model.Lesson;
import com.task.javatraining.model.Student;

import java.util.Collection;
import java.util.Map;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.emptySet;

public class ApplicationService {

    private final Collection<Department> data;

    public ApplicationService() {
        InitDataService initDataService = new InitDataService();
        this.data = initDataService.getInitData();
    }

    public int getAmountOfGroupsWithBadStudents() {

        // TODO

        return 0;
    }

    public Map<Group, Integer> getAverageMarksInGroups() {

        // TODO

        return emptyMap();
    }

    public Collection<String> getGroupTitlesWhereStudentsAreWomen() {

        // TODO

        return emptyList();
    }

    public Collection<String> getStudentFullNamesFromSpecifiedDepartment(Department department) {

        // TODO

        return emptyList();
    }

    public Map<Lesson, Double> getAverageMarksInLessons() {

        // TODO

        return emptyMap();
    }

    public Collection<Student> getStudentsSuitableForMarry() {

        // TODO

        return emptyList();
    }

    public Collection<Lesson> getAllLessons() {

        // TODO

        return emptySet();
    }

    public Collection<Group> getGroupsWhereAtLeastThreeHighAchieverStudents() {

        // TODO

        return emptyList();
    }
}
