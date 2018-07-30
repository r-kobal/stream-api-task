package com.task.javatraining.service;

import com.task.javatraining.model.Department;

import java.util.Collection;

import static java.util.Collections.emptyList;

class InitDataService {

    /**
     * Build a collection of university department contain chains of groups and students within
     */
    Collection<Department> getInitData() {

        // TODO should produce at least two department.
        //  Each group should contain at least 4 students
        //  Each department should contain at least two groups
        //  Each student should contain at least 3 lessons with marks

        return emptyList();
    }
}
